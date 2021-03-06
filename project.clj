(defproject github-jobs "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :repositories {"my.datomic.com" {:url   "https://my.datomic.com/repo"
                                   :creds :gpg}}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.stuartsierra/component "1.0.0"]
                 [com.stuartsierra/component.repl "0.2.0"]
                 [prismatic/schema "1.1.12"]
                 [com.datomic/datomic-pro "0.9.6045"]
                 [io.pedestal/pedestal.service "0.5.8"]
                 [io.pedestal/pedestal.route "0.5.8"]
                 [io.pedestal/pedestal.jetty "0.5.8"]
                 [com.taoensso/timbre "4.10.0"]
                 [yogthos/config "1.1.7"]]
  :jvm-opts ["-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5010"]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"]
  :profiles {:dev     {:aliases      {"run-dev" ["trampoline" "run" "-m" "github-jobs.server/main"]}
                       :dependencies [[io.pedestal/pedestal.service-tools "0.5.8"]]}
             :uberjar {:aot [github-jobs.server]}}
  :main ^{:skip-aot true} github-jobs.server)
