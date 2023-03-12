pipeline
{
    tools {
        // Install the Maven version configured as "M3" and add it to the path.
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