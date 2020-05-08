# cuke-test
Test automation with cucumber-JVM BDD framework designed with Page Object Model pattern

# cuke-test Automation Framework features
WebDrivers :
- Chrome, IE, Firefox, Phantomjs
- The choice of WebDriver can be changed by changing 'browser' property value at - \src\main\resources\configuration\Config.properties

Headless Execution : For headless execution, use phantomjs WebDriver

WebDriverEventListener : WebDriverEventListener to track WebDriver events during execution

Log4j : To store execution logs

Execution :
- Execute maven test goal or 'mvn clean test' to trigger execution