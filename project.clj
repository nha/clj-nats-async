(defproject clj-nats-async "1.2.0"
  :description "an async client for NATS, wrapping java-nats"
  :url "https://github.com/employeerepublic/clj-nats-async"
  :license {:name "Apache License, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}

  :dependencies [[employeerepublic/jnats "1.0.1"]
                 [manifold "0.1.5"]]

  :profiles {:provided {:dependencies [[org.clojure/clojure "1.8.0"]]}})
