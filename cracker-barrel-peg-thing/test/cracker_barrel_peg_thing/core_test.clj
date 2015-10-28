(ns cracker-barrel-peg-thing.core-test
  (:require [clojure.test :refer :all]
            [cracker-barrel-peg-thing.core :as peg :refer :all]))

(deftest triangular-test
  (testing "tri"
    (is
      (= (take 4 tri)
         '(1 3 6 10)) "Should return n triangular numbers"))
  (testing "triangular?"
    (testing "with triangular number"
      (is
        (= (triangular? 3) true))))
  (testing "with non-triangular number"
    (is 
      (= (triangular? 4) false)))
  (testing "row-tri"
    (is
      (= (row-tri 1) 1))
    (is 
      (= (row-tri 2) 3))
    (is 
      (= (row-tri 3) 6))
    (is 
      (= (row-tri 4) 10))
    (is
      (= (row-tri 5) 15))
    (is 
      (= (row-tri 6) 21))))

