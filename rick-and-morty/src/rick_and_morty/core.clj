(ns rick-and-morty.core
  (load "mapify")
  (load "de_mapify")
  (:gen-class))

(def filename "rick-and-morty.csv")

(defn get-rick-and-morty-data
  [filename]
  (mapify 
    (slurp filename)))

(defn write-rick-and-morty-data
  [filename hashmap] 
  (spit filename 
        (de-mapify hashmap)))

(defn append
  [rick-and-morty-data rick-and-morty-map]
  (into rick-and-morty-data (list rick-and-morty-map)))

(defn -main
  "Slurp csv file and mapify"
  []
  (let 
    [rick-and-morty-data (get-rick-and-morty-data filename)]
    (write-rick-and-morty-data filename 
                               (append rick-and-morty-data 
                                       {:name "Mr.GoldenFold" :wubba-lubba-dub-dub 3}))))


