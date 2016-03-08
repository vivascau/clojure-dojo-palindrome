(ns clojure-dojo-palindrome.core)

(defn normalize [s]
  (-> s
      clojure.string/lower-case
      (clojure.string/replace #"[^a-z]" "")))

(defn palindrome?
  [s]
  (let [s-norm (normalize s)]
    (= (seq s-norm) (reverse s-norm))))

(defn filter-palindrome [lines]
  (->> lines
       (map normalize)
       (filter palindrome?)))

(defn get-longer-string [a b]
  (if (> (count a) (count b))
    a
    b))

#_(defn three-longest [current collection]
  (let [[head & tail] collection]
    (if (> (count )
    ))))


(defn get-input
  [input-file]
  (line-seq (java.io.BufferedReader. input-file)))

(defn -main
  [& args]
  (println (filter-palindrome (get-input *in*)))
  #_(println (palindrome? "asdsa")))
