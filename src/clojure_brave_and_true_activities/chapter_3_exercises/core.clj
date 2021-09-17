(ns clojure-brave-and-true-activities.chapter-3-exercises.core)

; Exercise 1: Use the `str ``vector ``list ``hash-map `and `hash-set `functions.

(str "Hello" ", " "world")
(vector 1 2 3 4 5)
(list "a" "b" "c")
(hash-map :first "a" :second "b")
(hash-set 1 1 2 2)

; Exercise 2: Write a function that takes a number and adds 100 to it.

(defn add-100 [num] 
    (+ num 100))

; Exercise 3: Write a function, dec-maker, that works exactly like the function inc-maker except with subtratction. I.e. create a decrementer factory function that takes a value value by which to decrement by and saves it to a new function.

(defn dec-maker
  "Docstrings here for reference"
  [number-to-decrement]
  ())