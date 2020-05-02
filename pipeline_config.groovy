allow_scm_jenkinsfile = false
//skip_default_checkout = true
pipeline_template = "Jenkinsfile"

application_environments {
  global {
     A = "aval"
     B = env.buildParam ?: "default if not set"
  }
  
}

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
