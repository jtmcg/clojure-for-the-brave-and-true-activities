(ns clojure-brave-and-true-activities.chapter-3-exercises.slapping-hobbits.symmetrize
  (:require clojure.string))

(defn- matching-part 
  "Generates a matching body part by replacing the word 'left' with the word 'right'"
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-")
   :size (:size part)}) ;; our code goes here

(defn symmetrize-body-parts
  "Expects a sequence of maps that have a :name and :size to add the corresponding 'right sides' to the 'lefts'"
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts (set [part (matching-part part)])))
         []
         asym-body-parts)) ;; our code goes here