
import subprocess
import shutil

git_executable = shutil.which('git')

def git(command):
    print(f'git {command}')
    proc = subprocess.Popen(
        [ git_executable ] + command.split(),
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT
    )

    stdout, _ = proc.communicate()
    return stdout.decode().strip()

last_release = git('describe --tags --abbrev=0')
last_release_commit = git(f'rev-list -n 1 {last_release}')
commit_log = git(f'log {last_release_commit}..HEAD --no-merges --decorate=short --pretty=format:%s')

version_bump = 'SAME'
for commit in commit_log.splitlines():
    commit = commit.lower()

    if commit.startswith('Feature') or commit.startswith('Revert "Feature'):
        version_bump = 'MINOR'

    elif commit.startswith('Fix') or commit.startswith('Revert "Fix'):
        if version_bump != 'MINOR':
            version_bump = 'PATCH'
    
    elif commit.startswith('Tests') or commit.startswith('Revert "Tests'):
        pass

    elif commit.startswith('Build') or commit.startswith('Revert "Build'):
        pass

    elif commit.startswith('Docs') or commit.startswith('Revert "Docs'):
        pass

    else:
        version_bump = 'BADCOMMIT'
        break

print(version_bump)