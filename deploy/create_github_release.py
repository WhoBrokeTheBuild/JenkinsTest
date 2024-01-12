#!/usr/bin/env python3

import jwt
import requests
import argparse

# API_URL = 'https://api.github.com/repos/MDSplus/mdsplus/'
API_URL = 'https://api.github.com/repos/WhoBrokeTheBuild/JenkinsTest/'

parser = argparse.ArgumentParser()

parser.add_argument(
    '--branch',
    required=True
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

headers = {
    'Accept': 'application/vnd.github+json',
    'Authorization': f'Bearer {args.api_token}',
    'X-GitHub-Api-Version': '2022-11-28', # TODO: Is this needed?
}

create_release = {
    'tag_name': args.tag,
    'target_commitish': args.branch,
    # This will automatically generate the name and body of the release
    'generate_release_notes': True
}

create_release_response = requests.post(f'{API_URL}/releases', json=create_release, headers=headers)
print(create_release_response.content)

for file in args.files:
    print(file)