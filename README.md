# TASimbirSoftTestTask
Hub
java -jar selenium-server-standalone-3.141.59.jar -role hub
Node (конфиги находятся в тестовых ресурсах)
java -Dwebdriver.chrome.driver=chromedriver.exe -jar selenium-server-standalone-3.141.59.jar -role node -nodeConfig nodeConfig.json
