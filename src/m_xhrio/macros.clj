(ns m-xhrio.macros)

; mostly copied from jayq

(defmacro do->
  [m-specs steps & body]
  (let [steps-pairs (partition 2 steps)
        bind (gensym)
        return (gensym)
        zero (gensym)]
    `(let [~bind (:bind ~m-specs)
           ~return (:return ~m-specs)
           ~zero (:zero ~m-specs)]
       ~(reduce (fn [m [x f]]
                  (case x
                    :let `(let ~f ~m)
                    :when `(if ~f ~m (~zero (~return nil)))
                    `(~bind ~f (fn [~x] ~m))))
                `(~return (do ~@body))
                (reverse steps-pairs)))))

(defmacro let-xhr [steps & body]
  `(do-> m-xhrio.xhr/xhr-m ~steps ~@body))
