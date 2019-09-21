pipelineJob('example') {
    definition {
        cps {
            script(readFileFromWorkspace('stages.groovy'))
            sandbox()
        }
    }
}