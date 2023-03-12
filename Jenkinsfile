pipeline
{
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
                    withMaven
                    {
                        sh "mvn clean verify"
                    }                    
                }
            }
        }
        stage('Test Code')
        {
            steps
            {
                echo "test"
            }
        }
    }
}