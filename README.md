# TeachAway-Automation

<b>Strategy:</b><br/>
•	TestNG has been used as the test framework as this provides flexibility for parallel testing, reporting, grouping of test cases and several additional features.<br/>
•	Page object model has been followed for defining web elements. As it makes the code re-usable, more readable.<br/>
•	Global parameters have been written in property file to provide flexibility in terms of configuration.<br/>
•	Constants class is used for defining the resources and menu/submenu constants to increase the maintainability so that if the value of a constant changes, we have to make that change only to one place.<br/>
•	Created utility class which dynamically forms Xpath for each menu & sub menu items as this helps in re-using same xpath of menu/sub-menu for all the options listed in main/sub menu.<br/>
<br/>
<b>Considerations:</b><br/>
•	Technical stack: Eclipse IDE, Chrome, Maven, TestNG, Java.<br/>
•	Handling scripts and data separately.<br/>
•	Follow coding standards across the project.<br/>
•	Readable code.<br/>
•	Avoid hard coding of X-paths of web elements across the application.<br/>

<b>Assumptions:</b><br/>
•	Tested only on chrome web browser. Assuming these test cases would apply’ same for all the web browsers.<br/>
•	Tested on laptop. Assuming, this applies for all the types of devices.<br/>







