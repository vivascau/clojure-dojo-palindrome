(ns clojure-dojo-palindrome.core)

(defn normalize [s]
  (clojure.string/lower-case s))

(defn palindrome?
  [s]
  (= (seq s) (reverse s)))

(defn get-input
  [input-file]
  (line-seq (java.io.BufferedReader. input-file)))

(defn -main
  [& args]
  #_(println (reverse (get-input *in*)))
  (println (palindrome? "asdsa")))
