project `lviv-boot` depends on `demo`

Firstly you have to execute:

    mvn install 

for `demo` project

Second run `lviv-demo`

if your OS isn't Windows, you can edit configuration and set variable:

    OS=Windows

or for example:

    OS=MacOS
    

Also, you can set profile directly:

    spring.profiles.active=PROD

