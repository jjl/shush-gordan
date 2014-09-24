(ns shush-gordan.core
  (:use [criterium.core]
        [clj-message-digest.core])
  (:gen-class))

(defn -main []
  (let [a (atom 0)]
    (with-progress-reporting (bench (sha-1-hex (str (swap! a inc))) :verbose))))
