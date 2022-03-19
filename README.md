Magic Basket
⚠️ This project was created on March 18, 2022 and has been presented during the Hackathon "The future of Sales" by the team Intec Vision in Brussels ⚠️

Magic Basket is a program that helps you consolidate all your online baskets and wishlists in one convenient and easy tool. You are welcome to try and use it, as well.

Index

The goals of this program are to:

Consolidate all your shopping lists in one easy tool
Spare time and energy in searching and validating various baskets at diffent retailers
You no longer need to login each time you shop and validate your baskets store by store
Eradicate the risk of loosing information on your shopping list after session has timed out
Simplifies purchasing path for the user and improves clients' experience
Developing with Computer Vision
The tool is handsfree that is virus- and bacteria free and it's accessable for elderly and disabled users

Getting started without Computer Vision
Prerequisites
In order to work on Magic Basket, you need the following languages and tools installed:

Spring and Spring Boot
Basket Vision
MediaPipe
MapStruct
MySQL
JPA
Constraint validation
OpenCV
NumPy
Docker

Once you have the prerequisites installed and the code downloaded and expanded into a directory (which we will call "magic basket"),
Go to http://localhost:8080 and you should see the app running.
Before starting the API, you will want to start MySQL and load some data into it.

Setup Environment

installation:
git clone https://github.com/FILLIN-THE-LINK-HERE!
cd magic-basket
npm install

running the application:
cd magic-basket
npm run dev

project-structure:
magic-basket

* .run
* src\main
  *java
  *controllers
  *mappers
  *models
  *repositories
  App.java
  *resources
* target
  .dockerignore
  .github
  app.json
  docker-compose.yml
  Dockerfile
  pom.xml
  README.md


Technology-tool-Stack
It's build on MediaPipe with Java on the backend, for data the MySQL has been implemented with JPA tool to accomodate the storage of objects in it. Further we implemented JSON format to store and transmit data objects.
The tools used in development are described below:

*MediaPipe is a cross-platform and customized ML solution for live and streaming media. Build once, deploy anywhere: unified solution works across Android, iOS, desktop/cloud, web and IoT.
This demo is done for desktop version but of course van be expanded to all other formats. For more info (https://mediapipe.dev)

*MySQL provides a straight-forward database solution for SQL format. With integrated methods to manipulate the data it assists in coding and further integrate data in our database.

*MapStruct is a code generator that simplifies the implementation of mappings between Java bean types based on a convention over configuration aproach.

*Docker eliminates repetetive configuration tasks and is used throughout the development lifecycle for fast, easy and portable application development. Docker's comprehensive end-to-end platform includes UIs, CLIs, APIs and security that are engineered to work together across the entire application delivery lifecycle.

*OpenCV tools and library that consists of programming functions mainly aimed at real-time computer vision. For more info (https:/opencv.org)

*NumPy is a data analysis tool that offers comprehensive mathematical functions, random number generators, liniar algebra routines, and more. It supports a wide range of hardware and computing platforms, and plays well with distributed, GPU, and sparse array libraries. For more info, see (http:/numpy.org)





Contributing
You can contribute to Magic Basket project by opening an issue or sending a pull request. 