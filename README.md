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
Import to IDE and deploy to GlassFish.


## License

Licensed under the Apache License, Version 2.0.
