freeStyleJob('fsj-folder') {
    logRotator(-1, 10)
    jdk('localJDK')
    scm {
        github('jayabalandevops/Groovy-Script-Project', 'master', 'ssh')
    }
    displayName('GroovyScriptFSJ-Folder')
    description('Groovy Script Free Style Project creates Folder')
    steps {
	  dsl{
	      external('projectjj.groovy')
	  }
    }
}

