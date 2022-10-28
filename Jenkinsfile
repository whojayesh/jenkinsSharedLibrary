pipeline{
    agent any
    stages{
        stage('sdlc'){
            steps{
                timestamps{
                     echo 'just after catchError' 
                }
            }
            post{
                success{
                    echo 'success'
                }
                failure{
                    echo 'failure' 
                }
            }
        }
    }
}
