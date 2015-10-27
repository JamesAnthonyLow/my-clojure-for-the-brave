(ns rick-and-morty.core
  (load "mapify")
  (:gen-class))

(defn -main
  "Slurp csv file and mapify"
  [& args]
  (map println (mapify 
                   (parse 
                     (slurp "rick-and-morty.csv")))))
