pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                echo 'checking it out from the SCM ...'
                script{
                    try{
                        scmCheckout(credentialsId:'79a25c15-ced7-4976-924d-e23fee5bc911',
                                   branch:"master",
                                   url:"https://github.com/biplavkumar/Zacton-Reusable.git"
                                   )}catch(Exception e)
                        {
                            echo 'Exception occured : '+e.toString()
                        }
                    }
                }
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

