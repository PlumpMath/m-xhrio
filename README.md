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
  
    ; the following is fully asynchronous
    ; the body will only be run once both a and b will have been completed
    (let-xhr [a {:url "http://localhost:3000/" :method :get}
              b {:url "http://localhost:3000/" :method :post :content "fooobaaar"}]
      (.log js/console (.getResponseText a)))

## Changes

### 1.1
- Add support for all the parameters of XhrIo
- Method as a keyword
