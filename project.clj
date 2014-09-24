(defproject shush-gordan "0.1.0-SNAPSHOT"
  :description "Shush Gordan"
  :url "http://github.com/jjl/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-message-digest "1.0.0"]
                 [criterium "0.4.3"]]
  :main shush-gordan.core
  :aot [shush-gordan.core])
