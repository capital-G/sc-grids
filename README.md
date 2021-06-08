# SuperCollider Grids

[SuperCollider](https://supercollider.github.io/) port of the Eurorack module [*Grids*](https://mutable-instruments.net/modules/grids/manual/) by [*Mutable Instruments*](https://mutable-instruments.net/).
This port was made possible because the [source code for *Grids*](https://github.com/pichenettes/eurorack/tree/master/grids) is open source.

## Installation

You can easily install this Quark by executing

```supercollider
Quarks.install("https://github.com/capital-G/sc-grids");
```

in *sclang* and recompile the class library (`Shift Command L`).

## Documentation

For documentation please check out the provided help files via ScIDE.
Type in `ScGrids` and hit `Command D` while hovering with the cursor over
`ScGrids` - this will show you the help files.

## GUI

To somehow mimic the haptic feedback of this module there is a GUI implementation which controls multiple `TDefs`.

![Screenshot of GUI](screenshot.png)

For the source code of this take a look at the `grids_gui.scd`.
