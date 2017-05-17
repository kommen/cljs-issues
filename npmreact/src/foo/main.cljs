(ns foo.main
  (:require react))

(def title
  (react/DOM.div nil
    (react/createElement "h1" nil "Page title")))
