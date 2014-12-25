m-xhrio
=======

A jayq let-ajax style ClojureScript wrapper for goog.net.XhrIo.

## Usage
Add it in leiningen

    [m-xhrio "1.1.0"]

Use it

    (ns example
      (:require-macros [m-xhrio.macros :refer [let-xhr]])
      (:require [m-xhrio.xhr]))
  
    (let-xhr [a {:url "http://localhost:3000/" :method :get}]
      (.log js/console (.getResponseText a)))

## Changes

### 1.1
- Add support for all the parameters of XhrIo
- Method as a keyword
