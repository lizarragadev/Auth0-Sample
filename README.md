# Simple Authentication with Auth0

    This is an example to authentication using Auth0.
    
## Usage

- Clone this repository
    
    > git clone https://github.com/Gusn8/Auth0-Sample.git
    
- Import to Android Studio 3.x 

- Requirements
        
    * Gradle version: 3.4.0
    * SdkVersion: 28.0.0
        
## Auth0 Dashboard

- Create an Application in [Auth0 dashboard](https://manage.auth0.com/dashboard/)

- Select the authentication type.

- Add the allowed callback in the next format:
    
    ```
    {YOUR_SCHEME}://{YOUR_AUTH0_DOMAIN}/android/{YOUR_APP_PACKAGE_NAME}/callback
    ```
        
    _YOUR_CHEME is the type of connection to Auth0 application, you can use **https** or **demo**_   
     
## Changes in Android App

- Replace your **CLIENT_ID** and **YOUR_DOMAIN** in **strings.xml** file.
    
    ```xml
    <string name="com_auth0_client_id">{YOUR_CLIENT_ID}</string>
    <string name="com_auth0_domain">{YOUR_DOMAIN}</string>
    ```
        
- Replace **YOUR_SCHEME** in **build.gradle** (Module) file, in manifestPlaceholders line.
    ```gradle
    manifestPlaceholders = [auth0Domain: "@string/com_auth0_domain", auth0Scheme: "{YOUR_SCHEME}"]
    ```

## Licence

MIT License

This project is licensed under the MIT license. See the [LICENSE](https://github.com/Gusn8/Auth0-Sample/blob/master/LICENSE.md) file for more info.