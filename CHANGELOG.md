# Change log
This log follows the conventions of
[keepachangelog.com](http://keepachangelog.com/).

## [Unreleased]
Nothing yet.

## [0.6.0] - 2022-08-21
### Changed
- `scad-clj.model` is now aliased as `m` rather than `model`.
  This reduces clutter.

### Added
- A reference to `loft` in generated code. Like π, this is used more often than
  not.
- `nohup.out` is now ignored by Git. This serves the workflow of opening
  OpenSCAD in the background under `nohup` (Linux).
- The current year in the copyright statement of a generated `README`.

## [0.5.0] - 2021-04-04
### Added
- Updated version of `scad-app`.

### Fixed
- Removed copyright name and year from generated boilerplate.

## [0.4.0] - 2020-09-07
### Added
- Updated versions of `scad-app` and `scad-tarmi`.

### Developer
- This version revises the project’s earlier stance on versioning. The project
  now follows semver in reserving the patch version ID for fixes, not feature
  upgrades to related libraries.

## [0.3.2] - 2020-03-14
### Added
- Updated version of `scad-tarmi`.

## [0.3.1] - 2019-08-04
### Added
- Updated version of `scad-tarmi`.

## [0.3.0] - 2019-03-25
### Changed
- Switched to `scad-app` for the build process, removing some of the
  boilerplate in `core.clj`.

## [0.2.1] - 2019-01-22
### Added
- Updated version of `scad-tarmi`.
- Added an explicit system exit call to cut short a lingering `pmap`.

## [0.2.0] - 2019-01-21
### Added
- Added `scad-tarmi` as a default dependency.

### Changed
- Stopped referring in all objects from `scad-clj.model`.
- Upgraded to Clojure 1.10.0 in new projects.
- Updated copyright years.

## [0.1.1] - 2018-11-10
### Fixed
- Removed the `eval-in-leiningen` tag for `clojure.spec.alpha` compatibility.

## [0.1.0] - 2018-10-14
### Added
- Basic CLI functions for new projects.
- GPL-under-EPL license for this and new projects.

[Unreleased]: https://github.com/veikman/cad-template/compare/v0.6.0...HEAD
[0.6.0]: https://github.com/veikman/cad-template/compare/v0.5.0...v0.6.0
[0.5.0]: https://github.com/veikman/cad-template/compare/v0.4.0...v0.5.0
[0.4.0]: https://github.com/veikman/cad-template/compare/v0.3.2...v0.4.0
[0.3.2]: https://github.com/veikman/cad-template/compare/v0.3.1...v0.3.2
[0.3.1]: https://github.com/veikman/cad-template/compare/v0.3.0...v0.3.1
[0.3.0]: https://github.com/veikman/cad-template/compare/v0.2.1...v0.3.0
[0.2.1]: https://github.com/veikman/cad-template/compare/v0.2.0...v0.2.1
[0.2.0]: https://github.com/veikman/cad-template/compare/v0.1.1...v0.2.0
[0.1.1]: https://github.com/veikman/cad-template/compare/v0.1.0...v0.1.1
[0.1.0]: https://github.com/veikman/cad-template/compare/55db80f...v0.1.0
