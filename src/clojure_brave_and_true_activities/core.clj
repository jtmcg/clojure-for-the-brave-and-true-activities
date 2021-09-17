(ns clojure-brave-and-true-activities.core
  (:gen-class)
  (:require [clojure-brave-and-true-activities.chapter-3-exercises.slapping-hobbits.core :as hobbit-violence]))

(defn -main
  []
  (println (hobbit-violence/hit hobbit-violence/asym-hobbit-body-parts)))
