pipeline
{
    tools {
        maven "M2_HOME"
    }

    agent any
    stages
    {
        stage('Clone Git')
        {
            steps
            {
                git branch: 'main', url: 'https://github.com/architsangal/calculator.git'
            }
        }
        stage('Build Code')
        {
            steps
            {
                dir("src/calculator/")
                {
                    withMaven(options: [
                        openTasksPublisher(disabled: true), 
                        dependenciesFingerprintPublisher(disabled: true), 
                        artifactsPublisher(disabled: true), 
                        //junitPublisher(disabled: true), 
                        jgivenPublisher(disabled: true), 
                        invokerPublisher(disabled: true), 
                        findbugsPublisher(disabled: true),
                        concordionPublisher(disabled: true), 
                        pipelineGraphPublisher(disabled: true)
                        ]
                    )
                    {
                        // TODO uncomment this
                        //sh "mvn clean"
                        //sh "mvn validate"
                        //sh "mvn compile"
                    }                    
                }
            }
        }
        stage('Test Code')
        {
            steps
            {
                dir("src/calculator/")
                {
                    withMaven(options: [
                        openTasksPublisher(disabled: true), 
                        dependenciesFingerprintPublisher(disabled: true), 
                        artifactsPublisher(disabled: true), 
                        //junitPublisher(disabled: true), 
                        jgivenPublisher(disabled: true), 
                        invokerPublisher(disabled: true), 
                        findbugsPublisher(disabled: true),
                        concordionPublisher(disabled: true), 
                        pipelineGraphPublisher(disabled: true)
                        ]
                    )
                    {
                        // TODO uncomment this
                        //sh "mvn test"
                        //sh "mvn package"
                        //sh "mvn verify"
                    }                    
                }
            }
        }
        stage('Package Code')
        {
            steps
            {
                dir("src/calculator/")
                {
                    withMaven(options: [
                        openTasksPublisher(disabled: true), 
                        dependenciesFingerprintPublisher(disabled: true), 
                        artifactsPublisher(disabled: true), 
                        //junitPublisher(disabled: true), 
                        jgivenPublisher(disabled: true), 
                        invokerPublisher(disabled: true), 
                        findbugsPublisher(disabled: true),
                        concordionPublisher(disabled: true), 
                        pipelineGraphPublisher(disabled: true)
                        ]
                    )
                    {
                        // TODO uncomment this
                        sh "mvn package"
                        //sh "mvn verify"
                    }                    
                }
            }
        }
        stage('Containerization')
        {
            steps
            {
                dir("src/calculator/")
                {
                    sh "ls"
                }
            }
        }
    }
}