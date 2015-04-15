# MVC 1.0 Blank

Maven archetype to create a maven project for MVC 1.0 (JSR-371)

## How to use

with Bash

    mvn archetype:generate\
     -DarchetypeGroupId=am.ik.archetype\
     -DarchetypeArtifactId=mvc-1.0-blank-archetype\
     -DarchetypeVersion=1.0.0-m01

with CommandPrompt (Windows)

    mvn archetype:generate^
     -DarchetypeGroupId=am.ik.archetype^
     -DarchetypeArtifactId=mvc-1.0-blank-archetype^
     -DarchetypeVersion=1.0.0-m01

### Example

#### Create a project

```
$ mvn archetype:generate -B\
 -DarchetypeGroupId=am.ik.archetype\
 -DarchetypeArtifactId=mvc-1.0-blank-archetype\
 -DarchetypeVersion=1.0.0-m01\
 -DgroupId=com.example\
 -DartifactId=mvc-demo\
 -Dversion=1.0.0-SNAPSHOT
```
Open the project with NetBeans and run the application

![NB01](images/run-app.png)

Choose GlassFish 4.1

![NB02](images/select-server.png)

Access [http://localhost:8080/mvc-demo/app/hello](http://localhost:8080/mvc-demo/app/hello) (Context root is your artifactId).

![NB03](images/hello.png)


This project uses **Facelets** as a view technology. Currently Facelets view requires `web.xml`.

You can remove `web.xml` if you use other view (JSP, Thymeleaf, Handlebars and so on).

See also [this article](http://www.coppermine.jp/docs/programming/2015/04/ozark-facelet.html).

## License

Licensed under the Apache License, Version 2.0.
