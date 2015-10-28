(ns rick-and-morty.core)

(defn validate
  [map-of-data]
  (boolean 
    (and (:name map-of-data)
         (integer? 
           (:wubba-lubba-dub-dub map-of-data)))))

