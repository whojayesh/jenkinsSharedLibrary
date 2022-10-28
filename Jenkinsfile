pipeline{
    agent any
    triggers {
        // pollSCM('* * * * *')
        githubPush()
    }
    stages{
        stage('sdlc'){
            steps{
                timestamps{
                     git url: 'https://github.com/whojayesh/jenkinsSharedLibrary', branch: 'main' 
                     echo '-----------\n---------'
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



