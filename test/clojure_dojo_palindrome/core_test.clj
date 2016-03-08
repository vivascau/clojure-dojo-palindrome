(ns clojure-dojo-palindrome.core-test
  (:require [clojure.test :refer :all]
            [clojure-dojo-palindrome.core :refer :all]))

(deftest test-normalize-string
  (is (= (normalize "ASDfgh123") "asdfgh"))
  (is (= (normalize "aAb1b. c eFG\nh") "aabbcefgh")))

(deftest test-palindrome
  (is (true? (palindrome? "abcDcba")))
  (is (false? (palindrome? "abc")))
  (is (true? (palindrome? "abcCBA")))
  (is (true? (palindrome? "abc123CBA"))))

(deftest filter-palindrome-test
  (is (= ["aabaa","adfda"]
         (filter-palindrome ["Aabaa","sdffg","adFDA"]))))

(deftest get-longer-string-test
  (is (= (get-longer-string "123456" "123") "123456"))
  (is (= (get-longer-string "" "asd") "asd")))

#_(deftest three-longest-palindromes-test
  (is (= ["5555" "666666" "4444"]
         (three-longest
           ["55555" "1" "22" "666666" "333" "4444"]))))
