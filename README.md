﻿# Automation-Framework-with-Playwright-and-Java
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
# choco install openjdk
# choco install maven
# choco install git
# https://www.jetbrains.com/idea/download/#section=windows

<!-- This option brings plawright to dev tools console -->
PWDEBUG=console 
playwright.$(selector)
playwright.$(selector).click()

# Viewing the trace
mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="show-trace trace.zip"

# Downloading the Selenium Grid
https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.10.0/selenium-server-4.10.0.jar

# Running the Selenium Server
java -jar .\selenium-server-4.10.0.jar hub --host localhost 

# Starting Selenium Grid
https://playwright.dev/java/docs/selenium-grid
$SE_NODE_GRID_URL="http://localhost:4444/wd/hub";java -jar .\selenium-server-4.10.0.jar node --selenium-manager true --port 5555

# Connecting Plawright to Selenium Grid
$SELENIUM_REMOTE_URL="http://localhost:4444";mvn test
