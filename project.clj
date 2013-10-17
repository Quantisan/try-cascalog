(defproject trycascalog "0.1.0-SNAPSHOT"
  :description "A simple web-based Cascalog REPL for trying out Cascalog without having to install it."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [noir "1.3.0-beta10"]
                 [commons-lang/commons-lang "2.5"]
                 [clojail "1.0.6"]
                 [cascalog "2.0.0-SNAPSHOT"]
                 [org.apache.hadoop/hadoop-core "1.0.3"]]
  :jvm-opts ["-Djava.security.policy=example.policy" "-Xmx512M"]
  :min-lein-version "2.0.0"
  :uberjar-name "trycascalog-standalone.jar"
  :main trycascalog.server)
