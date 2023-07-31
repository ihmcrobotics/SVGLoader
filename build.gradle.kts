plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.log-tools-plugin") version "0.6.3"
   id("us.ihmc.ihmc-ci") version "8.3"
   id("us.ihmc.ihmc-cd") version "1.26"
}

ihmc {
   group = "us.ihmc"
   version = "0.0"
   vcsUrl = "https://github.com/ihmcrobotics/svgloader"
   openSource = true
   maintainer = "Sylvain Bertrand"

   configureDependencyResolution()
   configurePublications()
}

mainDependencies {
}

testDependencies {
}
