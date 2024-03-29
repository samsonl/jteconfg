allow_scm_jenkinsfile = true
skip_default_checkout = true
merge = true 
//override = true 

pipeline_template = "Jenkinsfile2"

application_environments {
  global {
     merge = true
     A = "jteconfg A"
     B = "jteconfg B"
     C {
       override = true
      C1="jteconfg C"
     }
     //B = "B" ?: "default if not set"
     //C = { p -> echo ">>> ${p}" }
  
    sets {
      setA {
        name = "A"
      }
      setB {
        name = "B"
      }
    }
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
  libsimple {
      override = true
      A = "jteconfg A from lib"
   }
  libA {
     C="config for liba"
  }
  helper
}

template_methods{
}

stages{
    combo_stage {
    }
}

