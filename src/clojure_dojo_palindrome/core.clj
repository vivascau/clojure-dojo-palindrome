(ns clojure-dojo-palindrome.core)

(defn get-input
  [input-file]
  (line-seq (java.io.BufferedReader. input-file)))

(defn -main
  [& args] (println (reverse (get-input *in*))))
