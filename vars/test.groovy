#!/usr/bin/env groovy

def call(Map params = [:]) {
    stage ('test library') {
        steps {
            script {
                'echo "hello word"'
            }
        }
    }
}