def call(){
 ///
    node('slave2'){
    stage('process'){
      timestamps{
        git 'https://github.com/whojayesh/jenkinsSharedLibrary.git'
      }
    }
  }
///
}
