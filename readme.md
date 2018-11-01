TestNG Testing
---
This is just a simple example of a few TestNG features. This is using version 6.9.4, it may not be the latest, but it's 
what I've used at work.

TestNG Documentation: [click here](https://testng.org/doc/documentation-main.html) 

Features demonstrated include:  
* BeforeClass annotation  
* Parameterized Tests
* Grouped Tests

### BeforeClass annotation
Using @BeforeClass insures that an initializer function is called before each class in a test suite is initialized. 
If we use @BeforeTest, then the initializer is only called once and some classes may not be fully initialized.

### Parameterized Tests
Test function annotations include a dataProvider parameter. This is the name of a function that will provide multiple
groups of parameters. Each parameter group will be an individual test.

The function providing parameters needs to be annotated with @DataProvider and should return Object[][].

Each entry in the outer-most array is a separate test.

Each entry in the inner array is a parameter to the function being tested.

### Grouped Tests
We can define a list of groups that each @Test function belongs to. Then we can enable IntelliJ IDEA to create a 
Run/Debug Configuration that is set to only run a single group.

Individual test functions can be in multiple groups, or in none.

All annotated functions that are going to be called need to be given a group. Initializer functions (those annotated as
@BeforeTest, @BeforeClass, etc) need to be included in groups. If they need to be called for all groups, then the 
"alwaysRun" parameter can be used.