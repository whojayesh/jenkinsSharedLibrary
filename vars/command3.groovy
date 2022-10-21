def call(){
///
    pipeline{
    agent any
    stages{
      stage('first'){
        steps{
          echo '---first---'
        }
      }
    }
   }
///
}
