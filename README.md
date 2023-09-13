
<h1 >Проект автоматизации тестирования API для сайта <a href="https://reqres.in/ ">reqres.in</a></h1>

![reqres_logo.png](media/logo/reqres_logo.png)

## :books: Содержание

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Реализованные проверки</a>

* <a href="#console">Запуск тестов из терминала</a>

* <a href="#jenkins">Запуск тестов в Jenkins</a>

* <a href="#allure">Отчеты в Allure Report</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомления в Telegram с использованием бота</a>

<a id="tools"></a>
## :gear: Технологии и инструменты



<div align="center">
<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="media/logo/Intelij_IDEA.svg" width="50"/></a>
<a href="https://github.com/"><img alt="GitHub" height="50" src="media/logo/GitHub.png" width="50"/></a>  
<a href="https://www.java.com/"><img alt="Java" height="50" src="media/logo/Java.svg" width="50"/></a>
<a href="https://gradle.org/"><img alt="Gradle" height="50" src="media/logo/Gradle.svg" width="50"/></a>  
<a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="media/logo/JUnit5.svg" width="50"/></a>
<a href="https://selenide.org/"><img alt="Selenide" height="50" src="media/logo/Selenide.png" width="50"/></a>
<a href="https://rest-assured.io/"><img alt="RestAssured" height="50" src="media/logo/RestAssured.svg" width="50"/></a>
<a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="media/logo/Jenkins.svg" width="50"/></a>
<a href="https://github.com/allure-framework/"><img alt="Allure Report" height="50" src="media/logo/Allure_Reports.svg" width="50"/></a>
<a href="https://qameta.io/"><img alt="Allure TestOps" height="50" src="media/logo/Allure_TO.svg" width="50"/></a>
<a href="https://www.atlassian.com/software/jira"><img alt="Jira" height="50" src="media/logo/Jira.svg" width="50"/></a>  
<a href="https://telegram.org/"><img alt="Telegram" height="50" src="media/logo/Telegram.svg" width="50"/></a>
</div>







| Java                                                                                                    | IntelliJ Idea                                                                                                                | GitHub                                                                                                    | JUnit 5                                                                                                          | Gradle                                                                                                    |
|:--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| <a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="Java"/></a> | <a id ="tech" href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a> | <a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a> | <a href="https://junit.org/junit5/"><img src="media/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a> | <a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a> |


| Jira                                                                                                                         | Allure                                                                                                                    | Allure TestOps                                                                                                             | REST Assured                                                                                                             |                                                                                                         Jenkins |
|:-----------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------:|
| <a href="https://www.atlassian.com/ru/software/jira"><img src="media/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a> | <a href="https://github.com/allure-framework"><img src="media/logo/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a> | <a href="https://qameta.io/"><img src="media/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a> | <a href="https://rest-assured.io/"><img src="media/logo/RestAssured.svg" width="50" height="50"  alt="RestAssured"/></a> |<a href="https://www.jenkins.io/"><img src="media/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> |

<a id="cases"></a>
## :ballot_box_with_check: Реализованные проверки

-  Получение списка пользователей
-  Создание пользователя
-  Обновление данных пользователя
-  Неуспешная регистрация
-  Удаление пользователя

<a id="console"></a>
## :computer: Запуск тестов из терминала

```bash
./gradlew clean test
```

<a id="jenkins"></a>
## <img src="media/logo/Jenkins.svg" width="25" height="25"/></a> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/final_project_api/)

<p align="center">
<a><img title="Jenkins Job" src="media/screenshots/JenkinsScreenMain.png" alt="Jenkins"/></a>
</p>

<a id="allure"></a>
## <img src="media/logo/Allure_Report.svg" width="25" height="25"/></a> Отчеты в [Allure Report](https://jenkins.autotests.cloud/job/final_project_api/allure/)

### Главная страница

<p align="center">
<img title="Allure Overview Dashboard" src="media/screenshots/AllureScreenMain.png">
</p>

### Тест-кейсы

В отчетах отображена информация по запросам и ответам.

<p align="center">
<img title="Allure Tests" src="media/screenshots/AllureScreenTestCases.png">
</p>

<a id="allure-testops"></a>
## <img src="media/logo/Allure_TO.svg" width="25" height="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/3663/dashboards)


### Главная страница

<p align="center">
<img title="Allure TestOps" src="media/screenshots/TestOpsDashboard.png">
</p>


### Тест-кейсы

<p align="center">
<img title="Allure TestOps" src="media/screenshots/TestOpsTestCases.png">
</p>


<a id="jira"></a>
## <img src="media/logo/Jira.svg" width="25" height="25"/></a> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-879)

### Интеграция Jira и Allure TestOps
<p align="center">
<img title="Jira" src="media/screenshots/JiraScreen.png">
</p>


<a id="telegram"></a>
## <img src="media/logo/Telegram.svg" width="25" height="25"/></a> Уведомления в Telegram с использованием бота

<p >
<img title="telegram bot" src="media/screenshots/TelegramScreen.png">
</p>