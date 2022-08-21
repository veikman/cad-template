;;; Geometry.

(ns {{name}}.models
  (:require [scad-clj.model :as m]
            [scad-tarmi.core :refer [π]]
            [scad-tarmi.util :refer [loft]]))

(defn base-model
  "Describe the geometry for {{name}}."
  [options]
  (m/cube 1 2 4))
