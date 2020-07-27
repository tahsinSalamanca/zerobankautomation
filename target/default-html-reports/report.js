$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/summary.feature");
formatter.feature({
  "name": "Account\tsummary\tpage",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Pay Bills page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@try"
    }
  ]
});
formatter.step({
  "name": "navigate to \"Pay Bills\"",
  "keyword": "When "
});
formatter.step({
  "name": "page should have the title \"Zero - Pay Bills\"",
  "keyword": "And "
});
formatter.step({
  "name": "user completes Pay operation with \"\u003camount\u003e\" \"\u003cdate\u003e\" \"\u003cdescription\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "\"The payment was successfully submitted.\" should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "\"Please fill out this field message!\" wrong should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "amount",
        "date",
        "description"
      ]
    },
    {
      "cells": [
        "100",
        "2020-01-30",
        "hola"
      ]
    },
    {
      "cells": [
        "105",
        "2020-01-20",
        "hola2"
      ]
    },
    {
      "cells": [
        "200",
        "2020-01-26",
        "hola3"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs \"username\" \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepDefs.user_logs(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Pay Bills page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@try"
    }
  ]
});
formatter.step({
  "name": "navigate to \"Pay Bills\"",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityStepdefs.navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page should have the title \"Zero - Pay Bills\"",
  "keyword": "And "
});
formatter.match({
  "location": "SummaryStepDefs.page_should_have_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user completes Pay operation with \"100\" \"2020-01-30\" \"hola\"",
  "keyword": "And "
});
formatter.match({
  "location": "PayBillsSpetDefs.user_completes_Pay_operation_with(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"The payment was successfully submitted.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsSpetDefs.should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Please fill out this field message!\" wrong should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsSpetDefs.wrong_should_be_displayed(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoAlertPresentException: no such alert\n  (Session info: chrome\u003d80.0.3987.132)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-RUVMBPN\u0027, ip: \u0027192.168.0.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\Tahsin\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:63972}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: b91233b8dfc9d08cad719f19a00c7247\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.alert(RemoteWebDriver.java:932)\r\n\tat com.zerobank.step_definitions.PayBillsSpetDefs.wrong_should_be_displayed(PayBillsSpetDefs.java:49)\r\n\tat ✽.\"Please fill out this field message!\" wrong should be displayed(file:src/test/resources/features/summary.feature:30)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs \"username\" \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepDefs.user_logs(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Pay Bills page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@try"
    }
  ]
});
formatter.step({
  "name": "navigate to \"Pay Bills\"",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityStepdefs.navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page should have the title \"Zero - Pay Bills\"",
  "keyword": "And "
});
formatter.match({
  "location": "SummaryStepDefs.page_should_have_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user completes Pay operation with \"105\" \"2020-01-20\" \"hola2\"",
  "keyword": "And "
});
formatter.match({
  "location": "PayBillsSpetDefs.user_completes_Pay_operation_with(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"The payment was successfully submitted.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsSpetDefs.should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Please fill out this field message!\" wrong should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsSpetDefs.wrong_should_be_displayed(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoAlertPresentException: no such alert\n  (Session info: chrome\u003d80.0.3987.132)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-RUVMBPN\u0027, ip: \u0027192.168.0.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\Tahsin\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:64045}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: b16cbf73920e9e06b51d8f4290b7a9c9\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.alert(RemoteWebDriver.java:932)\r\n\tat com.zerobank.step_definitions.PayBillsSpetDefs.wrong_should_be_displayed(PayBillsSpetDefs.java:49)\r\n\tat ✽.\"Please fill out this field message!\" wrong should be displayed(file:src/test/resources/features/summary.feature:30)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs \"username\" \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepDefs.user_logs(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Pay Bills page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@try"
    }
  ]
});
formatter.step({
  "name": "navigate to \"Pay Bills\"",
  "keyword": "When "
});
formatter.match({
  "location": "ActivityStepdefs.navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page should have the title \"Zero - Pay Bills\"",
  "keyword": "And "
});
formatter.match({
  "location": "SummaryStepDefs.page_should_have_the_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user completes Pay operation with \"200\" \"2020-01-26\" \"hola3\"",
  "keyword": "And "
});
formatter.match({
  "location": "PayBillsSpetDefs.user_completes_Pay_operation_with(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"The payment was successfully submitted.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsSpetDefs.should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Please fill out this field message!\" wrong should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "PayBillsSpetDefs.wrong_should_be_displayed(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoAlertPresentException: no such alert\n  (Session info: chrome\u003d80.0.3987.132)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-RUVMBPN\u0027, ip: \u0027192.168.0.13\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\Tahsin\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:64119}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: f9696c0603254e3549779dd7697ca9b1\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.alert(RemoteWebDriver.java:932)\r\n\tat com.zerobank.step_definitions.PayBillsSpetDefs.wrong_should_be_displayed(PayBillsSpetDefs.java:49)\r\n\tat ✽.\"Please fill out this field message!\" wrong should be displayed(file:src/test/resources/features/summary.feature:30)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
});