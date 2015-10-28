(ns rick-and-morty.core
  (:require [clojure.string :as string]))

(def test-data (mapify (slurp "rick-and-morty.csv")))

(defn invert
  "Convert :wubba-lubba-dub-dub integer value to string"
  [mapped]
  (string/join "," (list
                      (:name mapped)
                      (:wubba-lubba-dub-dub mapped))))

(defn de-mapify 
  "Convert rick-and-morty-map to writeable string"
  [rick-and-morty-map]
  (string/join "\n" (map invert rick-and-morty-map)))
