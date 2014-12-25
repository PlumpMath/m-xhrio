(ns m-xhrio.xhr
  (:require [goog.net.XhrIo :as xhr]))

(def xhr-m
  {:return identity
   :bind (fn [{:keys [:url :method]} f]
           (xhr/send url (fn [e] (f (.-target e))) method))
   :zero identity})
