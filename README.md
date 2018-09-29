# CAP-CLS-SERVICE

## Fortify Scan

Standalone fortify scan: `https://jenkins-oc-0.dev.sys.cs.sgp.dbs.com/job/cap/job/CLS/job/Service/job/Fortify%20Scan/job/cap-cls-service`

Fortify Server: `https://x01chpfoapp01a.sgp.dbs.com:8443/ssc`

### Properties
We need to prepare environment specific properties file and commit it to below project in gitlab, so that config server fetch it during application start up.

`Git Url` = `https://gitlab.dev.apps.cs.sgp.dbs.com/cap/configurations/`


### Creating config server

Please follow the below steps to create config server

1. login to cloud foundry.
 
    ```
     cf login -a https://api.dev.sys.cs.sgp.dbs.com
    ```
 
2. Enter user credentials such as username and password
 
3. select ORG 
 
4. select Space
 
5. create the following file in the current directory and name it as config.json
 
    **config.json**

    ```
    { "git": { "uri": "ssh://git@gitlab.dev.apps.cs.sgp.dbs.com:2222/cap/configurations.git", "label": "feature/cap-cls-service", "privateKey": "-----BEGIN RSA PRIVATE KEY-----\nMIIEpAIBAAKCAQEApRq0Qq3f9rxkBJFfN5Y31AUd6uilLPpM+bAGjdIOh79MlBqt\nc0K2rxlvhMeA1hkVGBNy7wRDysWIjpdSvgZ+hxuzDdKZCBRF3ZVjqYAqGRcdT4Lx\nIYhKlXtwfQkRrV8Q3LGJ6t700DtKysFX7dz6R2yYG7GMGToho9k9QzwNNmjOwKqU\n7zgL10IDYJFNIWxLIGETzQGH6i0sI6DqND5flW7K3uBHkhbBU2s2rthpJrf8esB1\nDaDg0aETFZrEQA7FOo6GjoolOPOSQ+qebgyOFsAMgCIA8dewxmGTLltv4tPvr6dK\nM0j5J+ZKZCNdBajK5ATwZL23xUDYjuB/89E26wIDAQABAoIBACPNurGLCzpyeC4V\naFShmtG7mlVKxicO0IqFBabTmpsNfQnRDzQjj4JBPdHJgcLsBYsHDLGQdzMNyyNA\n5YyX0/BwrU+eD9mUq+H1d3tWc8qlHJIVjzz6VVI9RpOW1+KE7x8s0P/CAcz2Tq3R\nZ8QJW60Je6Llyb/ev1TM02A1MZhOoMnJIvHqgpoUKaUNVNc2djtugPL4nROqTWoI\nCO8ueLrzfZHpppqDGZaHtYDyD3r1IzfVruToQuKa3XH43pkMcCI6pLpiPxrP2gq2\nMy41FpBIQzydG/3VfL5mO2SPuU7x1NPGki79VKf9GuKNl1X46oVJhUsq5Ios0Aqp\nGAWwBSECgYEA28W6QNo62KXcw54gE8kNLaL68og96364rwervm/r1mZorNsitn1W\nd0HUKiKalmIUxJMSt2F+31/uebnzDq92ToIyCS27XZqlLcoNuMVaObEoZTM+MXJU\nyBoqSnKZh66Q3XaEcd78QjUfd8BMRSIIGrVbR9uXSGKoX6JLVDwq/y0CgYEAwFID\nxO6hnOHfYb8Akq37TCUxvc+B+JGnVnvCrmkwBk/gIvX+HaayhpAW8LlakHZOX83e\nLr895LdEpanvB73KFgz43GVdj0E77o2ZyGYLOkoW+knJEYQ9egDSvVW/fuNvdY28\nWiN1Ee0NhqGrij5DqRTeEMhDnxBupHPykthunXcCgYEArMHwmFwz1+wB7y/UrVjk\n6BPuykn4yq7RhJ02DzwxmlbkP8T+s48xMgvoOLr84+vzwVaPZuHX9sWVU9CtVMTu\n7eYAaSCu4XTYFXd4c9+G/kTZqTuvzvS92pJe3ijZsUOzErPAhzau+2iA9QSPr+SB\nlGUtfP4MHNWY35xXNL8bWX0CgYEAqQ7vdUv4ETqU7Q3D6Sy7fQItKZehvun62ZFN\nX5fjuYi5lMH9Mf95a8R6Bf5J2DfHSXxk1V8Tf1yDIcWx83IolR2uHb+VcPp9PoSH\nLJxXPlQmwrnd4GII0Jisp/casOYo8oM3kV0d6jYh77lqW8nEHHvVgZcpqkf9mt65\n29AZ3J0CgYBB5j5lH94MFLQqKWnhb9OezLS0DsaSPuvINJEYSeiXwm4dECxhF2BV\nhPxfAXQ06ZUFsIWUlREw2q6dgXPPb1WdRGKNlNIyZPe0RcVmDQAcEHhVPA9fvOp\njInE3csBOnmRMRV+KgplDFMAjGWwQ+fBPZ/tJU03ArtVbC+18HMG8Q==\n-----END RSA PRIVATE KEY-----"} }
    ```


    **explaning the contents of config.json**

    Uri – your configuration repo<br />
    Label – branch to pick up the properties from<br />
    Private-key – your private key from system or you can use the key above too.<br />
    
6. run below command to create the config server

    ```
    cf create-service p-config-server standard cls-configuration-server –c config.json
    ```
    *in case if the above command fails. please follow below two steps*
    
    ```
    cf create-service p-config-server standard cls-configuration-server
    cf update-service cls-configuration-server -c config.json
    ```

7. Binding config server (cls-configuration-server) to the app


    ```
    cf bind-service cap-cls-service cls-configuration-server
    
    ```


[Reference] ( https://docs.cloudfoundry.org/devguide/services/managing-services.html#app-binding )


###  SonarQube code coverage

*please check below url for code coverage*

[sonar analysis] (https://sonar.dev.sys.cs.sgp.dbs.com/dashboard?id=com.dbs.cap%3Acap-cls-service)



