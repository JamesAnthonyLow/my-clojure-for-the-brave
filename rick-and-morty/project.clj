(defproject rick-and-morty "0.1.0-SNAPSHOT"
  :description "Clojure For The Brave Ch.4 Exercise"
  :url "https://github.com/JamesAnthonyLow/my-clojure-for-the-brave/tree/master/rick-and-morty"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot rick-and-morty.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
