(ns sicmutils-org.var-mechanics1
    (:require [uncomplicate.neanderthal
               [native :refer [dv dge]]
               [core :refer [mv mm nrm2 dot axpy]]] ;; => sicmutils.env conflict with :refer pi
              [sicmutils.env :as env]))
(env/bootstrap-repl!)

(def render (comp ->infix simplify))

(square (sin (+ 'a 3)))


(render (square (sin (+ 'a 3))))

(defn transformation-1 [x]
 (dv (* 2.0 (x 0)) (- (x 1) (x 2))))

(transformation-1 (dv 1 4 -2))

(defn m-transform [x f m n]
  (mv (dge m n [&f]) (&x)))

(defn decompose-f [f-list]
  )
