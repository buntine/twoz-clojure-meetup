(defn fib-seq [x y]
  (cons a (lazy-seq (fib-seq b (+ a b)))))

(reduce + (filter even? (take-while #(< %1 4000000) (fib-seq 0 1))))
