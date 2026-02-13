#!/usr/bin/env sh
#############################################################
##
##  Gradle start up script for UN*X
##
#############################################################

# Determine the location of the wrapper jar
DIR="$(cd "$(dirname "$0")" && pwd)"
exec java -cp "$DIR/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
