# Hepsiburada test automation

Cucumber-Java Skeleton kullanılarak hepsiburada test caseleri yazılmıştır.

Çalıştırmak için

Chrome driver dosya path ini değiştirmelisiniz.

```
/java/drivers/Driver.java 
```  

Maven:

    mvn test

yada ide yardımı ile çalıştırabilirsiniz.

Versions

```
java 1.8
junit 4.13.2
cucumber 6.10.4
maven compiler 3.8.1
maven surefire 2.22.2
selenium 3.141.5
```  

# Cucumber-Java Skeleton

[![Build Status](https://travis-ci.org/cucumber/cucumber-java-skeleton.svg?branch=main)](https://travis-ci.org/cucumber/cucumber-java-skeleton)

This is the simplest possible build script setup for Cucumber using Java.
There is nothing fancy like a webapp or browser testing. All this does is to show you how
to install and run Cucumber!

There is a single feature file with one scenario. The scenario has three steps, two of them pending. See if you can make them all pass!

## Get the code

Git:

    git clone https://github.com/cucumber/cucumber-java-skeleton.git
    cd cucumber-java-skeleton
