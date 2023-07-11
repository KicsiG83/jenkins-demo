	def cleanApp() {
		echo 'clean is started...'
		deleteDir()
		checkout scm
		echo 'clean is finished'
	}
	
	return this