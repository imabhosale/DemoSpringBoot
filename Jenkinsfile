pipeline {
    agent any

    stages {

        stage('Trigger Check') {
            steps {
                echo 'Pipeline triggered due to a new GitHub commit'
            }
        }

        stage('Print Environment Info') {
            steps {
                sh '''
                  echo "Job Name      : $JOB_NAME"
                  echo "Build Number  : $BUILD_NUMBER"
                  echo "Workspace     : $WORKSPACE"
                '''
            }
        }

        stage('Simulated Build') {
            steps {
                echo 'Simulating build step'
                sh 'echo Build completed successfully'
            }
        }
    }

    post {
        success {
            echo 'Pipeline finished SUCCESSFULLY'
        }
        failure {
            echo 'Pipeline FAILED'
        }
    }
}
