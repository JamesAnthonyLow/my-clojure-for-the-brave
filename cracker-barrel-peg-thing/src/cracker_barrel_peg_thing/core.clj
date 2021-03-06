(ns cracker-barrel-peg-thing.core
  (:require [clojure.set :as set])
  (:gen-class))

(declare successful-move prompt-move game-over query-rows)

(defn tri*
  "Generates lazy sequence of triangular numbers"
  ([] (tri* 0 1)) 
  ([sum n] (let [new-sum (+ sum n)]
             (cons new-sum (lazy-seq (tri* new-sum (inc n)))))))

(def tri (tri*))

(defn triangular?
  "Test if a number is triangular"
  [n]
  (= n (last (take-while #(>= n %) tri))))

(defn row-tri
  "Get the triangular number at the end of row n"
  [n]
  (last (take n tri)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
