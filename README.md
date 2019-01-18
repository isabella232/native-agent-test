# Test project to debug rollbar native agent

1. Compile project

        mvn clean compile assembly:single

2. Run app

        env ROLLBAR_LOG=trace;RB=*** java -agentpath:../rollbar-java/native-agent/target/release/librollbar_java_agent.so -jar target/samebug-test-app-1.0.0-SNAPSHOT-jar-with-dependencies.jar
