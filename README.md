# Автотесты на **Prooftech IT**, [**https://www.prooftechit.com**](https://www.prooftechit.com)

## Стек и инструменты
Тесты были написаны на Java + JUnit5 + Selenide + Gradle

| Java | Gradle | Junit5 | Selenide |
|:----:|:------:|:------:|:--------:|
| <img src="images/JAVA.svg" width="40" height="40"> | <img src="images/Gradle.svg" width="40" height="40"> | <img src="images/Junit5.svg" width="40" height="40"> | <img src="images/Selenide.svg" width="40" height="40"> |

Запускаются и прогоняются через Jenkins + Selenoid

| Jenkins | Selenoid | 
|:--------:|:-------------:|
| <img src="images/Jenkins.svg" width="40" height="40"> | <img src="images/Selenoid.svg" width="40" height="40"> | 

С отчетами в Allure + Telegram
| Allure Report | Telegram |
|:---------:|:--------:|
| <img src="images/Allure Report.svg" width="40" height="40"> | <img src="images/Telegram.svg" width="40" height="40"> |

## Запуск через [**Jenkins**](https://jenkins.autotests.cloud/job/prooftechit-qa-guru-lesson12/)

### С какими параметрами можно запустить тесты в Jenkins:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* SELENOID_URL (url address from selenoid)
* videoStorage (url address where you should get video)
* threads (number of threads)

### Пример странички с выбором параметров сборки
![alt "JenkinsBuildPage"](./src/test/resources/JenkinsBuildPage.png)

## Как запустить тесты из командной строки
Запустить тесты с дефолтными параметрами:
```bash
gradle clean test (для Windows)
```
```bash
./gradlew clean test (для MacOS)
```

Запустить тесты с нужными нам параметрами:
```bash
Для Windows:
gradle clean -DselenoidUrl=selenoid.autotests.cloud -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```
```bash
Для MacOS:
./gradlew clean -DselenoidUrl=selenoid.autotests.cloud -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Сформировать отчет в Allure:
```bash
allure serve build/allure-results
```

## Прогоняются тесты в [**Selenoid**](https://selenoid.autotests.cloud/#/)

## Контакты
:telegram: Telegram - @Leitirion