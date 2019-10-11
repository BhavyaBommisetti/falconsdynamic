pipeline{
agent any 
 tools {
        maven "maven"   
    }    
stages{

stage('clean and build'){
steps{
       sh 'mvn clean package'
}

}

stage("SonarQube analysis") {
       
            steps {
              withSonarQubeEnv('SonarQube') {
                sh 'mvn sonar:sonar'
              }
            }
          }

}
}
