(defproject include-dropbox-repl "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.jaydeesimon/dropbox-repl "0.1.1"]]
  :main ^:skip-aot include-dropbox-repl.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
