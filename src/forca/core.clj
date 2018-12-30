(ns forca.core
  (:gen-class))


(defn fib[x]
    (if (= x 0) 0 
    (if (= x 1) 1 
    (+ (fib (- x 1)) (fib (- x 2))))))

(def total-de-vidas 6)

(defn perdeu[] (println "Voce perdeu"))

(defn jogo[vidas]
  (if (= vidas 0)
    (perdeu)
    (do
      (println vidas)
      (jogo(dec vidas))

    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
