;;; Geometry.

(ns {{name}}.models
  (:require [scad-clj.model :as model]
            [scad-tarmi.core :refer [π]]))

(defn base-model
  "Describe the geometry for {{name}}."
  [options]
  (model/cube 1 2 4))
