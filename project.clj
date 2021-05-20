(defproject sicmutils-org "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [sicmutils/sicmutils "0.18.0"]
                 [uncomplicate/neanderthal "0.41.0"]
                 [org.bytedeco/mkl-platform-redist "2021.1-1.5.5"]]
  :exclusions [[org.jcuda/jcuda-natives :classifier "apple-x86_64"]
               [org.jcuda/jcublas-natives :classifier "apple-x86_64"]]
  :main ^:skip-aot sicmutils-org.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ^:replace [#_"--add-opens=java.base/jdk.internal.ref=ALL-UNNAMED"]}})
