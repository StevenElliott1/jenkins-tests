pipeline {
    agent any
    stages {
        stage('oob') {
            steps {
                sh 'echo oob stage'
            }
        }
    }
}
