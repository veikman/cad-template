# Change log
This log follows the conventions of [keepachangelog.com](http://keepachangelog.com/).

## [0.3.0] (unreleased)
### Changed
- Switched to `scad-app` for the build process, removing some of the
  boilerplate in `core.clj`.

## [0.2.1]
### Changed
- Updated version of `scad-tarmi`.
- Added an explicit system exit call to cut short a lingering `pmap`.

## [0.2.0]
### Added
- Added `scad-tarmi` as a default dependency.

### Changed
- Stopped referring in all objects from `scad-clj.model`.
- Upgraded to Clojure 1.10.0 in new projects.
- Updated copyright years.

## [0.1.1]
### Fixed
- Removed the `eval-in-leiningen` tag for `clojure.spec.alpha` compatibility.

## [0.1.0]
### Added
- Basic CLI functions for new projects.
- GPL-under-EPL license for this and new projects.

[0.2.1]: https://github.com/veikman/cad-template/compare/v0.2.1...HEAD
[0.2.1]: https://github.com/veikman/cad-template/compare/v0.2.0...v0.2.1
[0.2.0]: https://github.com/veikman/cad-template/compare/v0.1.1...v0.2.0
[0.1.1]: https://github.com/veikman/cad-template/compare/v0.1.0...v0.1.1
[0.1.0]: https://github.com/veikman/cad-template/compare/55db80f...v0.1.0
