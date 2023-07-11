	def compile() {
		bat 'compile is starting...'
		withMaven {
			bat 'mvn clean compile'
		}
		bat 'compile is finished.'
	}
	
	return this