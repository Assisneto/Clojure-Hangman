(ns forca.core
  (:gen-class))


(defn fib[x]
    (if (= x 0) 0 
    (if (= x 1) 1 
    (+ (fib (- x 1)) (fib (- x 2))))))

(def total-de-vidas 6)

(defn ganhou[] (println "Voce ganhou"))


(defn letras-faltantes [palavra acertos]
  (remove (fn [letra] (contains? acertos (str letra))) palavra)
)

(defn acertou-a-palavra-toda? [palavra acertos] 
  (empty? (letras-faltantes palavra acertos))
)

(defn le-letra! [] (read-line))

(defn acertou? [palavra chute] (contains? {:palavra nil} :chute) )

(defn avalia-chute [chute vidas palavra acertos]
    (if (acertou? palavra chute)
        (jogo vidas palavra (conj acertos chute))
        (jogo (dec vidas) palavra acertos)
    )
)

(defn perdeu[] (println "Voce perdeu"))

(defn jogo [vidas palavra acertos]
  (if (= vidas 0) 
      (perdeu)
      (if (acertou-a-palavra-toda? palavra acertos)
          (ganhou)
          (avalia-chute (le-letra!) vidas palavra acertos)
      )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
