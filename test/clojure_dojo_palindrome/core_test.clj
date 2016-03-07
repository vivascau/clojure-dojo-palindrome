(ns clojure-dojo-palindrome.core-test
  (:require [clojure.test :refer :all]
            [clojure-dojo-palindrome.core :refer :all]))

(deftest test-normalize-string
  (is (= (normalize "ASDfgh123") "asdfgh"))
  (is (= (normalize "aAb1b. c eFG\nh") "aabbcefgh")))

(deftest test-palindrome
  (is (true? (palindrome? "abcDcba")))
  (is (false? (palindrome? "abc"))))
