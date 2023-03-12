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
                sh "ls"
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