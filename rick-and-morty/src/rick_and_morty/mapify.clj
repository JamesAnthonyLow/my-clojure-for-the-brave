(ns rick-and-morty.core
  (:require [clojure.string :as string]))

(def rick-and-morty-keys [:name :wubba-lubba-dub-dub])

(defn str->int
  "Converts string to integer"
  [str] 
  (Integer. str))

(def conversions {:name identity
                  :wubba-lubba-dub-dub str->int})

(defn convert
  "Convert :wubba-lubba-dub-dub string value to integer"
  [rick-and-morty-key value]
  ((get conversions rick-and-morty-key) value))

(defn parse
  "Convert a CSV into rows of columns"
  [string]
  (map #(string/split % #",")
       (string/split string #"\n")))

(defn make-mapable [unmapped-row]
  "Make a vector pair into a map of :name and :wubba-lubba-dub-dub"
  (reduce (fn [row-map [rick-and-morty-key value]]
            (assoc row-map rick-and-morty-key (convert rick-and-morty-key value)))
          {}
          (map vector rick-and-morty-keys unmapped-row)))

(defn mapify 
  [rows]
  (map make-mapable rows))


