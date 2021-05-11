plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.log-tools-plugin") version "0.6.1"
   id("us.ihmc.ihmc-ci") version "7.4"
   id("us.ihmc.ihmc-cd") version "1.20"
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
