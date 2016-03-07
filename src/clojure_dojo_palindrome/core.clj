(ns clojure-dojo-palindrome.core)

(defn normalize [s]
  (-> s
      clojure.string/lower-case
      (clojure.string/replace #"[^a-z]" "")))

(defn palindrome?
  [s]
  (= (seq s) (reverse s)))

(defn filter-palindrome [lines]
  (->> lines
   (map normalize)
   (filter palindrome?)))

(defn get-input
  [input-file]
  (line-seq (java.io.BufferedReader. input-file)))

(defn -main
  [& args]
  (println (filter-palindrome (get-input *in*)))
  #_(println (palindrome? "asdsa")))
