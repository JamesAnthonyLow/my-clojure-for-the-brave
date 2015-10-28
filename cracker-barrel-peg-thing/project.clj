(defproject cracker-barrel-peg-thing "0.1.0-SNAPSHOT"
  :description "Peg game challenge from Ch.5 of Clojure For The Brave"
  :url "https://github.com/JamesAnthonyLow/my-clojure-for-the-brave/tree/master/cracker-barrel-peg-thing"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot cracker-barrel-peg-thing.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
