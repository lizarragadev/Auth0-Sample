# Simple Authentication with Auth0

    This is an example to authentication using Auth0.
    
## Usage

    - Clone this repository
    
    > git clone https://github.com/Gusn8/Auth0-Sample.git
    
    - Import to Android Studio 3.x 

    
    - Requeriments
        
        > Gradle version: 3.4.0
        > SdkVersion: 28.0.0
        
## Changes

    - Replace your *CLIENT_ID* and *YOUR_DOMAIN* in *strings.xml* file.
    
        > <string name="com_auth0_client_id">{YOUR_CLIENT_ID}</string>
        > <string name="com_auth0_domain">{YOUR_DOMAIN}</string>
        
    - Replace *YOUR_SCHEME* in *build.gradle* (Module) file, in manifestPlaceholders line.
    
        > manifestPlaceholders = [auth0Domain: "@string/com_auth0_domain", auth0Scheme: "*{YOUR_SCHEME}*"]


##  