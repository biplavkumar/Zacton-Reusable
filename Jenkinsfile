pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                echo 'checking it out from the SCM ...'
		    sh "rm -rf Zacton-Reusable"
		    sh "git clone https://github.com/biplavkumar/Zacton-Reusable.git"
                
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
