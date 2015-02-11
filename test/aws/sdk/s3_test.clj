(ns aws.sdk.s3-test
  (require [clojure.test :refer :all]
           [aws.sdk.s3 :as s3 :refer :all]
           [clj-time.core :as t]
           [clj-time.coerce :as coerce]))

(deftest a-test
  (testing "maybe-int"
    (is (nil? (#'s3/maybe-int nil)))
    (is (= 1 (#'s3/maybe-int 1)))))

(deftest time-test
  (testing "from-now"
    (is (t/from-now nil))))
