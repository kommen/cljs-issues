(require '[cljs.build.api :as cljs])

;; curl -L https://github.com/clojure/clojurescript/releases/download/r1.9.542/cljs.jar -o cljs.jar
;;java -cp cljs.jar:src clojure.main build.clj

(cljs/build
  "src"
  {:main 'foo.main
   :output-to "out/main.js"
   :verbose true
   :optimizations :none
   :language-in :ecmascript6
   :npm-deps {:react "15.5.4"}})
