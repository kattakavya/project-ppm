(ns ppmproject.core)

(def foo
  
  (let [f {:type      :p3
           :width     2
           :height    2
           :max-value 255
           :map [['(225 0 0) '(0 255 255)]
                 ['(0 0 225) '(225 0 255)]]
           }]
    "./first.ppm"))
