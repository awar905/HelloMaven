# HelloMaven
Learning the Maven Build System for University projects 

# Introduction

As SOFTENG 281 at UoA is teaching programming with Java it became apparent to me that my knowledge of `javac` was not going to cut the cake for creating and testing my projects. 
Also, I refuse to use VS code or a standard hand-holding IDE.
However, the university suggested using Maven in their lecture slides, so after a long deliberation (5 seconds), I decided to install Maven. 
However, I don't know how to use Maven, thus this repository was created. 
It will serve as an introduction into using Maven and my journey of integrating Git testing (Hopefully). 
But for now, I will be going through the [Maven Introduction](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html) to get my head around the beginning. 
If you want to know the commands I used, they are the exact commands described in the Maven documentation.

# Pre-requisites

- Maven
- Java

For this, I am using Java 25 and Apache Maven 3.9.12. 
I assume it should work for most versions but I haven't tested

# Building and Running on Linux

```bash
cd hello-maven
mvn package
java -cp target/hello-maven-1.0-SNAPSHOT.jar com.awar905.hellomaven.App
```
