(ns rick-and-morty.core-test
  (:require [clojure.test :refer :all]
            [rick-and-morty.core :refer :all]))

(deftest mapify-test
  (is
    (= (rick-and-morty.core/mapify (parse "rick,2\nmorty,3"))
       '({:name "rick", :wubba-lubba-dub-dub 2} {:name "morty", :wubba-lubba-dub-dub 3}))))
