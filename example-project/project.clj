(defproject jarohen/chord.example ""
  :description "An example project to show Chord in action"
  :url "https://github.com/james-henderson/chord/example-project"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [jarohen/chord "0.4.0"]

                 [ring/ring-core "1.2.0"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.4"]

                 [org.clojure/core.async "0.1.301.0-deb34a-alpha"]
                 [org.clojure/clojurescript "0.0-2202"]

                 [prismatic/dommy "0.1.2"]

                 [jarohen/clidget "0.2.0"]]

  :plugins [[lein-pdo "0.1.1"]
            [jarohen/lein-frodo "0.3.0-rc2"]
            [lein-cljsbuild "1.0.3"]
            [lein-shell "0.4.0"]]

  :frodo/config-resource "chord-example.edn"

  :aliases {"dev" ["do"
                   ["shell" "mkdir" "-p"
                    "target/resources"]
                   ["pdo"
                    ["cljsbuild" "auto"]
                    "frodo"]]}

  :source-paths ["src"]
  
  :resource-paths ["resources" "target/resources"]

  :cljsbuild {:builds [{:source-paths ["src"]
                        :compiler {:output-to "target/resources/js/chord-example.js"
                                   :optimizations :whitespace
                                   :pretty-print true}}]})
