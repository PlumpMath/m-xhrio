(ns m-xhrio.xhr
  (:require [goog.net.XhrIo :as xhr]
            [clojure.string :as string]))

(def xhr-m
  {:return identity
   :bind (fn [{:keys [:url :method :content :headers :timeoutInterval :withCredentials]} f]
             (let [cb (fn [e] (f (.-target e)))
                   method (-> method name string/upper-case)]
                  (xhr/send url cb method content headers timeoutInterval withCredentials)))
   :zero identity})
