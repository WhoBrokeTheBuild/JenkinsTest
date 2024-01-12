#!/usr/bin/env python3

import os
import requests
import argparse
import subprocess
import shutil

# API_URL = 'https://api.github.com/repos/MDSplus/mdsplus'
API_URL = 'https://api.github.com/repos/WhoBrokeTheBuild/JenkinsTest'

parser = argparse.ArgumentParser()

parser.add_argument(
    '--github-name',
    default='MDSplusBuilder'
)

parser.add_argument(
    '--github-email',
    default='mdsplusadmin@psfc.mit.edu'
)

parser.add_argument(
    '--tag',
    required=True
)

parser.add_argument(
    '--api-token',
    required=True
)

parser.add_argument(
    'files',
    nargs=argparse.REMAINDER
)

args = parser.parse_args()

git_executable = shutil.which('git')
result = subprocess.run(
    [ git_executable, 'rev-parse', 'HEAD'],
    stdout=subprocess.PIPE,
    stderr=subprocess.STDOUT
)

git_hash = result.stdout.decode().strip()

headers = {
    'Accept': 'application/vnd.github+json',
    'Authorization': f'Bearer {args.api_token}',
    'X-GitHub-Api-Version': '2022-11-28', # TODO: Is this needed?
}

print('Creating release')

create_release = {
    'tag_name': args.tag,
    'target_commitish': git_hash,
    # This will automatically generate the name and body of the release
    'generate_release_notes': True
}

create_release_response = requests.post(f'{API_URL}/releases', json=create_release, headers=headers)
if create_release_response.status_code != 201:
    print(create_release_response.content.decode())
    exit(1)

assets_url = create_release_response.json()['assets_url']

asset_headers = headers
asset_headers['Content-Type'] = 'application/octet-stream'

for file in args.files:

    file_name = os.path.basename(file)
    data = open(file, 'rb').read()

    upload_release_asset_response = requests.post(f'{assets_url}?name={file_name}', data=data)
    print(upload_release_asset_response.request.headers)
    print(upload_release_asset_response.request.url)
    if upload_release_asset_response.status_code != 201:
        print(upload_release_asset_response.content.decode())
        # attempt to upload the rest of the files
