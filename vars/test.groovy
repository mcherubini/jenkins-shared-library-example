#!/usr/bin/env groovy

def call(Map params = [:]) {
    stage ('test library') {
        sh 'echo "hello word"'
    }
}