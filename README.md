# Interview Questions

##### Explain BDD?
BDD means Behavior Driven Development. In Behavior Driven Development, the tests are designed in plain English and are created from a more end-user perspective and describe the application characteristics.
<br/>
Behavior Driven Development framework increases collaboration and coordination among members in an agile team of developers, testers, business analysts, product owners, customers, and other stakeholders. It does not require any technical knowledge and is written in plain text and requires no technical clarity.
<br/>
Behavior Driven Development framework like Cucumber helps to bridge any understanding gap between business stakeholders and the developers. Some of the benefits of using Behavior Driven Development are listed below:
* Since all the team members and stakeholders contribute to the project development, it ensures maximum testing coverage.
* Since the tests are designed in plain text, there is proper understanding and knowledge over the business requirements.
* Test tools like Cucumber in Behavior Driven Development help to automate scenarios.
* Behavior Driven Development helps to achieve reusability of code to a large extent.
* Data parameterization can be easily implemented in Behavior Driven Development.
* Behavior Driven Development allows easy integration with continuous integration tools like Jenkins.
##### Advantages of Cucumber are?
* Its focus on end-user experience
* Cucumber tests are written in plain-text English so people with no or less technical skills can also write scenarios
* It allows us to involve business stakeholders who can’t easily read a code
* Allows quick and easy setup and execution
* High reusability of code in the tests
* It can be integrated with Selenium and other testing frameworks like JUnit & TestNG
##### What are the files needed in a Cucumber framework?
__Feature file__ – The feature file has an extension of .feature. It has single or multiple test scenarios described in plain text. The tests are written with keywords like Then, When, Background, Scenario Outline, Feature, And, But, and so on. Thus it is a file that maintains the features and their descriptions.
<br/>
__Step Definition file__ – This file has an extension of .java. It basically provides the mapping of the test scenario steps described in the feature file to the automation code. Thus when Cucumber runs a step described in the feature file, it searches the step definition file and executes the relevant functions that are mapped to that step.
<br/>
__TestRunner file__ – This file has an extension of .java. It links the step definition file and the feature file. It gives the user the option to execute one or more than one feature file. It has the path of the step definition file and the feature file.

##### What are the different keywords used in feature file?
* Feature
* Scenario
* Scenario Outline
* Given
* When
* Then
* And
* But
##### Explain Scenario Outline in the Cucumber framework?
A Scenario Outline is used to run a particular scenario with more than one data set in multiple combinations. A feature file can have fewer lines if we take the help of a Scenario Outline. The data to be passed at runtime need not be hardcoded in the feature file if we use Scenario Outline.
<br/>
With Scenario Outline the runtime values are passed as parameters enclosed in <> in the feature file. The data set is expressed in a tabular format separated with pipe delimiter starting with the Examples keyword.
Scenario will be executed for each data set given in Examples section.
##### Explain keyword Background in the Cucumber framework?
The keyword Background is used to describe a test step or a group of test steps that are common to every test inside the feature file. A test having a Background executes before all the test scenarios in the feature file.
<br/>
Thus a keyword Background is used to run a scenario as a precondition for other scenarios in the feature file.
<br/>
It's similar to ___@BeforeMethod___ of TestNG annotation
##### Explain keyword Examples in the Cucumber framework?
We can achieve a data-driven approach in Cucumber with the help of the Examples keyword. The Scenario Outline in a feature file should be accompanied by the Examples part which consists of the multiple data set to be passed at the runtime.
<br/>
The Examples section in the feature file should have headings that match with the variables in the Scenario Outline followed by (|) symbol. Each row below the heading represents a set of data. So if there are two rows after heading, the test scenario shall run two times with the two different sets of data.

##### Describe a feature file with an example?
A feature file is the starting of tests in Cucumber. All the test scenarios are elaborated here in plain simple text. It may contain single or multiple test scenarios at a time. It is recommended to create a separate feature file for each standalone feature.

##### Describe a step definition file?
First of all we have created a feature file with the test scenarios. But the Cucumber is still unaware of which code to be run for a particular scenario. This is determined by the step definition file which gives one to one mapping of each scenario in the feature file to the function to be executed.
<br/>
Thus a step definition file is a file with .java extension and contains all the methods in a class having annotations that map them to the scenarios in the feature file. All the keywords used in the Feature file is added to the step definition file in the form methods with cucumber annotations.

##### How to achieve parameterization in the Cucumber framework?
* Using quites in scenario steps for parameters
* Using cucumber Data Tables
* Using Scenario Outline with Examples keyword
##### How is the Options tag used in the Cucumber framework?
The Cucumber Options tag is a part of the TestRunner file and comes in the form of an annotation called @CucumberOptions. It contains parameters like feature and glue. The feature parameter has the path of the feature file and the glue parameter has the path of the step definition file.

##### Explain the purpose of keywords that are used for writing a scenario in Cucumber.
* “Given” keyword is used to specify a precondition for the scenario.
* “When” keyword is used to specify an operation to be performed.
* “Then” keyword is used to specify the expected result of a performed action.
* “And” keyword is used to join one or more statements together into a single statement.

##### What are hooks in the Cucumber framework?
A block of code tagged with hooks in Cucumber can run prior or post a scenario with the help of @Before and @After annotations. Thus hooks help to control the flow of the program and optimize lines of code.
<br/>
There may be scenarios that require certain preconditions to be executed like launching the application, establishing database connection, configuring the test data, and so on. Also, there are certain postconditions to be executed like terminating database connection, closing the browser, refreshing test data, application log out, and so on.
<br/>
All these conditions are handled in Cucumber with the help of the hooks. The @Before hook executes before the actual scenario and the @After hook executes after the actual scenario even if the test corresponding to the actual scenario fails.

##### How to run a selected test from a group of tests in Cucumber framework?
tags = {"@Dental", "@Car"}
##### How to exclude a scenario from execution?
tags = {"~Accidental" }
##### Why is the property glue used in the Cucumber Options tag?
The property glue is used with the Cucumber Options tag which is a part of the TestRunner file. It takes the location or path of the step definition file.
##### How to generate reports with Cucumber?
We can generate the output/report of the cucumber using Runner class with "pretty" keyword and giving a path where to save as an .html document.
##### How to run from command line?
* mvn test -Dcucumber.filter.tags="@ValidCredentials"
* mvn test -Dcucumber.options="--tags @ValidCredentials
* mvn test -Dcucumber.options="src/test/resources/features/CucumberTagsExample.feature"
* mvn test -Dcucumber.options="src/test/resources/features/CucumberTagsExample.feature:12"