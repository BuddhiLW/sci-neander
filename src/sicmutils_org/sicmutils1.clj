(ns sicmutils-org.sicmutils1
    (:require [sicmutils.env :as env]))
(env/bootstrap-repl!)

(def render (comp ->infix simplify))

(square (sin (+ 'a 3)))


(render (square (sin (+ 'a 3))))

(def render-tex (comp ->TeX simplify))
(render-tex
 (simplify ((D cube) 'x)))

(defn L-central-polar [m U]
  (fn [[_ [r] [rdot thetadot]]]
    (- (* 1/2 m
          (+ (square rdot)
             (square (* r thetadot))))
       (U r))))

(let [potential-fn (literal-function 'U)
      L     (L-central-polar 'm potential-fn)
      state (up (literal-function 'r)
                (literal-function 'theta))]
  (render-tex
   (((Lagrange-equations L) state) 't)))
