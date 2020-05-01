allow_scm_jenkinsfile = false
pipeline_template = "Jenkinsfile"

libraries{
  merge = true 
  sonarqube
}

template_methods{
    unit_test
    static_code_analysis
    build
    xxx
}

stages{
    combo_stage {
        build
    }
}

keywords {
    version = "V1.00"
}
