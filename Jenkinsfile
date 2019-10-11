pipeline{
agent any 
 tools {
        maven "Maven"   
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
