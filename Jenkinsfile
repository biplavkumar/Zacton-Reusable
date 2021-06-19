pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                echo 'checking it out from the SCM ...'
		    
		    sh "mvn clean"
                
                }
            }
			
	stage("build") {
            when{
                    expression{
                        BRANCH_NAME=='dev'
                    }
                }
            steps {
                echo 'Building the project......'
            }
        }
      stage("Test") {
            steps {
                echo 'Testing the project .....'
            }
        }
        }
      
    }
