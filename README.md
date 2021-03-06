# Simple Authentication with Auth0
[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://doge.mit-license.org)

This is an example to authentication using Auth0 to Android Application.

## Getting Started

Auth0 is a service that will facilitate the tedious process that entails performing authentication and secure authorization.

### Prerequisites

Clone this repository
    
    > git clone https://github.com/Gusn8/Auth0-Sample.git


### Installing

#### In Android Studio

- Import project to Android Studio 3.x 

- Requirements
        
    * Gradle version: 3.4.0
    * SdkVersion: 28.0.0
        
#### In Auth0 Dashboard

- Create an Application in [Auth0 dashboard](https://manage.auth0.com/dashboard/)

- Select the authentication type.

- Add the allowed callback in the next format:
    
    ```
    {YOUR_SCHEME}://{YOUR_AUTH0_DOMAIN}/android/{YOUR_APP_PACKAGE_NAME}/callback
    ```
        
    _YOUR_CHEME is the type of connection to Auth0 application, you can use **https** or **demo**_   
     
#### Changes in Android App

- Replace your **CLIENT_ID** and **YOUR_DOMAIN** in **strings.xml** file.
    
    ```xml
    <string name="com_auth0_client_id">{YOUR_CLIENT_ID}</string>
    <string name="com_auth0_domain">{YOUR_DOMAIN}</string>
    ```
        
- Replace **YOUR_SCHEME** in **build.gradle** (Module) file, in manifestPlaceholders line.
    ```gradle
    manifestPlaceholders = [auth0Domain: "@string/com_auth0_domain", auth0Scheme: "{YOUR_SCHEME}"]
    ```


## Running

Click on **Run as Android Application**

## Built With

* [Android Studio](https://developer.android.com/studio/) - The IDE used.
* [Kotlin](https://kotlinlang.org/) - The language programming used.
* [Auth0](https://auth0.com/) - The service used.

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Authors

* **Gustavo Lizárraga** - [Gusn8](https://github.com/Gusn8)

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/Gusn8/Auth0-Sample/blob/master/LICENSE.md) file for more details.