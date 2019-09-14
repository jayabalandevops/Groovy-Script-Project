pipelineJob('pljob') {
	description('First Pipeline job')
	displayName('First Pipeline Job')   
	node('master')
	stage('Prepare'){
		println('Prepare Stage...')
	}
	stage('Clone git'){
		println('Cloning git...')
	}
	stage('Build'){
		println('Building...')
	}
	stage('Deploy'){
		println('Deploy...')
	}
	stage('Notify'){
		println('Notifying...')
	}
}

