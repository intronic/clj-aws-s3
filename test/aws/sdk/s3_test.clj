(ns aws.sdk.s3-test
  (require [clojure.test :refer :all]
           [aws.sdk.s3 :as s3 :refer :all]))

(deftest a-test
  (testing "maybe-int"
    (is (nil? (#'s3/maybe-int nil)))
    (is (= 1 (#'s3/maybe-int 1)))))
