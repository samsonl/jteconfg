allow_scm_jenkinsfile = false
skip_default_checkout = true
merge = true 
override = true 

pipeline_template = "Jenkinsfile"

application_environments {
  global {
     A = "aval"
     B = "B" ?: "default if not set"
  }
  
}

/*
keywords{
    master  =  /^[Mm]aster$/
    develop =  /^[Dd]evelop(ment|er|)$/
    hotfix  =  /^[Hh]ot[Ff]ix-/
    release =  /^[Rr]elease-(\d+.)*\d$/
}
*/

keywords {
    version = "V1.00"
}

libraries{
  merge = true 
}

template_methods{
}

stages{
    combo_stage {
    }
}

