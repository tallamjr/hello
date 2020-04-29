
```bash
$ :: sbt clean compile run
[info] Loading project definition from /Users/tallamjr/scratch/hello-java/project
[info] Loading settings for project hello-java from build.sbt ...
[info] Set current project to Tarek Allam Jr (in build file:/Users/tallamjr/scratch/hello-java/)
[info] Executing in batch mode. For better performance use sbt's shell
[success] Total time: 0 s, completed 29-Apr-2020 12:34:53
[info] Compiling 2 Java sources to /Users/tallamjr/scratch/hello-java/target/classes ...
[success] Total time: 2 s, completed 29-Apr-2020 12:34:54
[info] running org.aar.HelloWorld
Hello, World!
[success] Total time: 0 s, completed 29-Apr-2020 12:34:55

$ :: sbt test
[info] Loading project definition from /Users/tallamjr/scratch/hello-java/project
[info] Loading settings for project hello-java from build.sbt ...
[info] Set current project to Tarek Allam Jr (in build file:/Users/tallamjr/scratch/hello-java/)
[info] Compiling 1 Java source to /Users/tallamjr/scratch/hello-java/target/test-classes ...
Before Class
Before Test Case
Test
After Test Case
After Class
[debug] Test run started
[debug] Test junit.JUnitHelloWorldTest.isGreaterTest started
[debug] Test junit.JUnitHelloWorldTest.isGreaterTest finished, took 0.003 sec
[debug] Test run finished: 0 failed, 0 ignored, 1 total, 0.014s
[info] Passed: Total 1, Failed 0, Errors 0, Passed 1
[success] Total time: 2 s, completed 29-Apr-2020 12:35:12

```
