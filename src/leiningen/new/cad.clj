(ns leiningen.new.cad
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cad"))

;; The docstring of the following function shows up in ‘lein new --help’.
(defn cad
  "A template for CAD work using scad-clj."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' cad project.")
    (->files data
             [".gitignore" (render "gitignore" data)]
             ["README.md" (render "README.md" data)]
             ["LICENSE-EPL.txt" (render "LICENSE-EPL.txt" data)]
             ["LICENSE-GPL.txt" (render "LICENSE-GPL.txt" data)]
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["src/{{sanitized}}/models.clj" (render "models.clj" data)])))
