def call(Closure closure){
  node('slave1'){
      timestamps{
        closure()
      }
      git 'https://github.com/whojayesh/jenkinsSharedLibrary.git'
      echo '---------'
  }
  
}
