allow_scm_jenkinsfile = false
//skip_default_checkout = true
pipeline_template = "Jenkinsfile"

application_environments {
  global {
     A = "aval"
     B = env.buildParam ?: "default if not set"
  }
  
}

keywords{
    master  =  /^[Mm]aster$/
    develop =  /^[Dd]evelop(ment|er|)$/
    hotfix  =  /^[Hh]ot[Ff]ix-/
    release =  /^[Rr]elease-(\d+.)*\d$/
}

//keywords{
//    globalx = "GLOBAL"
//}

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
