;;; A CLI application for generating 3D models.

(ns {{name}}.core
  (:require [clojure.tools.cli :refer [parse-opts]]
            [clojure.java.shell :refer [sh]]
            [clojure.java.io :refer [make-parents]]
            [environ.core :refer [env]]
            [scad-app.core :refer [filter-by-name build-all]]
            [{{name}}.models :as models])
  (:gen-class :main true))

(def cli-options
  "Define command-line interface flags."
  [["-V" "--version" "Print program version and exit"]
   ["-h" "--help" "Print this message and exit"]
   ["-r" "--render" "Render SCAD to STL"]
   [nil "--rendering-program PATH" "Path to OpenSCAD" :default "openscad"]
   ["-w" "--whitelist RE"
    "Limit output to files whose names match the regular expression RE"
    :default #"" :parse-fn re-pattern]])

(defn write-files
  [{:keys [whitelist] :as options}]
  (let [roster [{:name "{{name}}-base-model",
                 :model-main (models/base-model options)}]]
    (build-all (filter-by-name whitelist roster) options)))

(defn -main
  "Basic command-line interface logic."
  [& raw]
  (let [args (parse-opts raw cli-options)
        help-text (fn [] (println "{{name}} options:")
                         (println (:summary args)))
        version (fn [] (println "{{name}} version"
                         (env :{{name}}-version)))
        error (fn [] (run! println (:errors args)) (System/exit 1))]
   (cond
     (get-in args [:options :help]) (help-text)
     (get-in args [:options :version]) (version)
     (some? (:errors args)) (error)
     :else (write-files (:options args)))))
