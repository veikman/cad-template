;;; Geometry.

(ns {{name}}.models
  (:require [scad-clj.model :exclude [use import] :refer :all]))

(defn base-model
  "Describe the geometry for {{name}}."
  [options]
  (cube 1 2 4))
