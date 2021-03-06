plugins {
   id("us.ihmc.ihmc-build") version "0.19.7"
   id("us.ihmc.log-tools") version "0.3.1"
   id("us.ihmc.ihmc-ci") version "5.3"
   id("us.ihmc.ihmc-cd") version "1.8"
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
