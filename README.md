# Welcome to the Code Quality Project
The goal of this project is to experiment with three different maven plugins that are targeted toward improving code quality, reducing time it takes to do code reviews, and reduce amount of bugs.

The three plugins used in this project are:
* [PMD](https://pmd.github.io/)
* [Checkstyle](https://github.com/checkstyle/checkstyle)
* [SpotBugs](https://spotbugs.github.io/)

If any of these plugins finds a problem, it will automatically break the build, in theory, this should also stop Jenkins from building, and cause pull requests to fail.

Checkstyle has an eclipse plugin to configure it, highly recommended to install, if you will be editing the rules: https://checkstyle.org/eclipse-cs/#!/custom-config
Here is some more info on checkstyle: https://www.baeldung.com/checkstyle-java


SpotBugs has a GUI that you can run, and it will show you detailed information on the bugs it finds.  `mvn spotbugs:gui`
