# abs-backend-docker

ABS Backend Powered which developed by RSE Lab, Faculty of Computer Science, University of Indonesia. This repo is a docker-image for the service.

## Installation

With the running `docker` engine, run the following commands:

```bash
# Clone the project
git clone https://github.com/affandhia/abs-backend-docker.git
cd abs-backend-docker

# Build the backend
chmod +x build.sh
./build.sh
```

### Customization

#### Email, Google Client ID, Port

Open `build.sh` in your beloved ~~vscode~~ text editor. Configure the environment variables to your own desire.

```bash
# Configuration
EMAIL='spicervolt@gmail.com'
GOOGLE_CLIENTID='588654354409-365mn3hbjvam5jp7ggnl7578ssp6otpi.apps.googleusercontent.com'
BACKEND_PORT=7776
...
```

#### Exposing XAMPP service

Uncomment line 80 in `Dockerfile`

```dockerfile
...
# expose the ports that will be used by xampp
# uncomment line below to expose port for XAMPP service
# EXPOSE 80 443 3306
...
```

## Usage

Server running in the background on:

```bash
localhost:7776 # by default
```

## Related Works

[affandhia/ifml-pwa](https://github.com/affandhia/ifml-pwa.git)

> App to generate companion client for accessing this repositry service.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT (?)](https://choosealicense.com/licenses/mit/)
