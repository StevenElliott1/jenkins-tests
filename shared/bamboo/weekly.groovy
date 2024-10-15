pipeline {
    agent any
    stages {
        stage('weekly') {
            steps {
                sh 'echo weekly stage'
            }
        }
    }
}
