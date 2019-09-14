freeStyleJob('fsj') {
    logRotator(-1, 10)
    jdk('localJDK')
    scm {
        github('jayabalandevops/Groovy-Script-Project', 'master')
    }
    displayName('GroovyScriptFSJ')
    description('Groovy Script Free Style Project')
}
