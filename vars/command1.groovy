def call(Closure closure){
  node('slave1'){
    stage('library'){
      timestamps{
        closure()
      }
      git 'https://github.com/whojayesh/jenkinsSharedLibrary.git'
      echo '---------'
    }
  }
  
}
