(ns foo.main
  (:require foo.a))

(.log js/console "main loaded" ::main)

(defn ^:export entrypoint []
  (foo.a/draw-plot))
