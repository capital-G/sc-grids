s.boot;

(
// some basic drum synths
SynthDef(\kick, {|out|
	var sig = SinOsc.ar(XLine.ar(start: 600, end: 50, dur: 0.1));
	var env = EnvGen.kr(Env.perc(releaseTime: 0.25, curve: 5.0), doneAction: Done.freeSelf);
	Out.ar(out, Pan2.ar(sig*env*\amp.kr(0.5)));
}).add;

SynthDef(\hh, {|out|
	var sig = WhiteNoise.ar*EnvGen.kr(Env.perc(releaseTime: \release.kr(0.2)), doneAction: Done.freeSelf)*\amp.kr(0.5);
	sig = LPF.ar(sig, freq: \ffreq.kr(4000));
	Out.ar(out, Pan2.ar(sig, \pos.kr(0.0)));
}).add;
)

(
// setup a clock
t = TempoClock.default;
t.tempo = 130/60.0;

// tdefs to play patterns
Tdef(\hh, {|env|
	inf.do({|i|
		var level = ScGrids.calculateLevel(
			instrument: \hihat,
			curBeat: i,
			x: env.x?0.5,
			y: env.y?0.5,
		);
		if(level>=(1-(env.density?0.5)), {
			(
				instrument: \hh,
				amp: level,
				release: level.linlin(0, 1.0, 0.0, 0.04),
				ffreq: 1000 + (exprand(1000, 6000) * level),
			).play;
		});
		(0.125).wait;
	});
}).clock_(t);

Tdef(\k, {|env|
	inf.do({|i|
		var level = ScGrids.calculateLevel(
			instrument: \kick,
			curBeat: i,
			x: env.x?0.5,
			y: env.y?0.5,
		);
		if(level>=(1-(env.density?0.5)), {
			(
				instrument: \kick,
				amp: level,
			).play;
		});
		(0.125).wait;
	});
}).clock_(t);

Tdef(\sd, {|env|
	inf.do({|i|
		var level = ScGrids.calculateLevel(
			instrument: \snare,
			curBeat: i,
			x: env.x?0.5,
			y: env.y?0.5,
		);
		if(level>=(1-(env.density?0.5)), {
			(
				instrument: \hh,
				amp: level,
				release: level.linlin(0, 1.0, 0.0, 0.2),
				ffreq: 4000 + (exprand(1000, 4000) * level),
			).play;
		});
		(0.125).wait;
	});
}).clock_(t);

// GUI for tdefs
w = Window("SC grids", Rect(100, 100, 400, 580));

[\hh, \k, \sd].do({|instrument, num|
	Slider2D(w, Rect(20, 20 + (180*num), 150, 150))
	.x_(0.5)
	.y_(0.5)
	.action_({|sl|
		Tdef(instrument).set(\x, sl.x);
		Tdef(instrument).set(\y, sl.y);
	});

	StaticText(w, Rect(200, 20 + (180*num), 100, 20)).string = instrument;
	StaticText(w, Rect(200, 60 + (180*num), 150, 20)).string = "density";
	
	a = Slider(w, Rect(200, 95 + (180*num), 150, 20));
	a.value = 0.5;
	a.action_({|sl|
		Tdef(instrument).set(\density, sl.value);
	});
	
	b = Button(w, Rect(200, 120 + (180*num), 100, 40))
	.states_([
		["play", Color.black, Color.green],
		["stop", Color.black, Color.red],
	])
	.action_({
		var tdef = Tdef(instrument);
		if(tdef.isPlaying, {tdef.stop}, {tdef.play});
	});
});

w.front;
)