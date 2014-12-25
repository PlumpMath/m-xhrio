(ns m-xhrio.core
  (:require-macros [m-xhrio.macros :refer [let-xhr]]))

(let-xhr [a {:url "/" :method "GET"}]
         (println a))
