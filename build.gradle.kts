plugins {
   id("us.ihmc.ihmc-build") version "0.23.0"
   id("us.ihmc.log-tools-plugin") version "0.5.0"
   id("us.ihmc.ihmc-ci") version "7.3"
   id("us.ihmc.ihmc-cd") version "1.17"
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
