m-xhrio
=======

A jayq let-ajax style ClojureScript wrapper for goog.net.XhrIo.

## Usage

    (ns example
      (:require-macros [m-xhrio.macros :refer [let-xhr]])
      (:require [m-xhrio.xhr]))
  
    (let-xhr [a {:url "http://localhost:3000/" :method "GET"}]
      (.log js/console (.getResponseText a)))
