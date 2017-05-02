(ns foo.a
  (:require [cljsjs.plotly]))

(defn draw-plot
  []
  (js/Plotly.newPlot
   "plot"
   (clj->js [{:x ["2013-10-04 22:23:00" "2013-11-04 22:23:00" "2013-12-04 22:23:00"]
              :y [4 5 6]
              :type "line"}])
   (clj->js {:margin {:t 0}})))

(.log js/console "A loaded" ::a)
