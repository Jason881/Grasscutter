import os

if os.getenv('MITM_REMOTE_HOST') is None:
    REMOTE_HOST = "localhost"
else:
    REMOTE_HOST = os.getenv('MITM_REMOTE_HOST')
if os.getenv('MITM_REMOTE_PORT') is None:
    REMOTE_PORT = 443
else:
    REMOTE_PORT = int(os.getenv('MITM_REMOTE_PORT'))
if os.getenv('MITM_USE_SSL') is None:
    USE_SSL = True
else:
    USE_SSL = bool(os.getenv('MITM_USE_SSL'))
print(f'MITM Remote Host: {REMOTE_HOST}')
print(f'MITM Remote Port: {REMOTE_PORT}')
print(f'MITM Use SSL {USE_SSL}')
