# Automation-Framework-with-Playwright-and-Java
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