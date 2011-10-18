(defn fib-seq [x y]
  (cons x (lazy-seq (fib-seq y (+ x y)))))

(reduce + (filter even? (take-while #(< %1 4000000) (fib-seq 0 1))))
