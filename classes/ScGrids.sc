ScGrids {
	// a dict/event would be better but this is only available
	// with an init method making our class non-static
	classvar kickMap = #[
		[[145,   0,   0,   0,   0,   0, 109,   0,   0,   0,   0,   0, 255,   0, 109,   0,  72,   0, 218,   0,   0,   0,   0,   0,  36,   0,   0,   0, 182,   0,   0,   0],
			[255,   0,   0,   0, 218,   0,   0,   0,  36,   0,   0,   0, 218,   0,   0,   0, 182,   0, 109,   0, 255,   0,   0,   0,   0,   0,   0,   0, 145,   0,  72,   0],
			[255,   0,   0,   0,   0,   0, 145,   0,   0,   0,   0,   0, 218,   0,   0,   0,  72,   0,  36,   0, 182,   0,   0,   0, 109,   0,   0,   0,  72,   0,   0,   0],
			[226,   0,  28,   0,  28,   0, 141,   0,   8,   0,   8,   0, 255,   0,   8,   0, 113,   0,  28,   0, 198,   0,  85,   0,  56,   0, 198,   0, 170,   0,  28,   0],
			[255,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0, 255,   0,   0,   0, 218,   0,  72,  36,   0,   0, 182,   0,   0,   0, 145, 109]],

		[[255,   0,   0,   0,   0,   0,   0,   0,  36,   0,   0,   0, 182,   0,   0,   0, 218,   0,   0,   0,   0,   0,   0,   0,  72,   0,   0,   0, 145,   0, 109,   0],
			[223,   0,   0,   0,  63,   0,   0,   0,  95,   0,   0,   0, 223,   0,  31,   0, 255,   0,   0,   0, 159,   0,   0,   0, 127,   0,  31,   0, 191,   0,  31,   0],
			[255,   0,   0,   0,   0,   0,  63,   0, 191,   0,  95,   0,  31,   0, 223,   0, 255,   0,  63,   0,  95,   0,  63,   0, 159,   0,   0,   0,   0,   0, 127,   0],
			[255,   0,   0,   0, 255,   0, 191,   0,   0,   0,   0,   0,  95,   0,  63,   0,  31,   0,   0,   0, 223,   0, 223,   0,   0,   0,   8,   0, 159,   0, 127,   0],
			[255,   0,   0,   0, 223,   0,   0,   0,  31,   0,   8,   0, 127,   0,   0,   0,  95,   0,   0,   0, 159,   0,   0,   0,  95,   0,  63,   0, 191,   0,   0,   0]],

		[[255,   0,   8,   0,  28,   0,  28,   0, 198,   0,  56,   0,  56,   0,  85,   0, 255,   0,  85,   0, 113,   0, 113,   0, 226,   0, 141,   0, 170,   0, 141,   0],
			[255,   0,   0,   0,  51,   0,   0,   0,   0,   0,   0,   0, 102,   0,   0,   0, 204,   0,   0,   0, 153,   0,   0,   0,   0,   0,   0,   0,  51,   0,   0,   0],
			[255,   0,  31,   0,  63,   0,  63,   0, 127,   0,  95,   0, 191,   0,  63,   0, 223,   0,  31,   0, 159,   0,  63,   0,  31,   0,  63,   0,  95,   0,  31,   0],
			[255,   0,  51,   0,  25,   0,  76,   0,   0,   0,   0,   0, 102,   0,   0,   0, 204,   0, 229,   0,   0,   0, 178,   0,   0,   0, 153,   0, 127,   0,   8,   0],
			[255,   0, 212,   0,  63,   0,   0,   0, 106,   0, 148,   0,  85,   0, 127,   0, 191,   0,  21,   0, 233,   0,   0,   0,  21,   0, 170,   0,   0,   0,  42,   0]],

		[[255,   0,   0,   0, 229,   0,   0,   0, 204,   0, 204,   0,   0,   0,  76,   0, 178,   0, 153,   0,  51,   0, 178,   0, 178,   0, 127,   0, 102,  51,  51,  25],
			[255,   0,   0,   0,   0,   0,  95,   0,   0,   0, 127,   0,   0,   0,   0,   0, 223,   0,  95,   0,  63,   0,  31,   0, 191,   0,   0,   0, 159,   0,   0,   0],
			[255,   0,   0,   0, 218,   0,   0,   0, 145,   0,   0,   0,  36,   0,   0,   0, 218,   0,   0,   0,  36,   0,   0,   0, 182,   0,  72,   0,   0,   0, 109,   0],
			[229,   0,  25,   0, 102,   0,  25,   0, 204,   0,  25,   0,  76,   0,   8,   0, 255,   0,   8,   0,  51,   0,  25,   0, 178,   0,  25,   0, 153,   0, 127,   0],
			[255,   0,   0,   0, 127,   0,   0,   0,   0,   0, 102,   0,   0,   0, 229,   0,   0,   0, 178,   0, 204,   0,   0,   0,  76,   0,  51,   0, 153,   0,  25,   0]],

		[[170,   0,   0,   0,   0, 255,   0,   0, 198,   0,   0,   0,   0,  28,   0,   0, 141,   0,   0,   0,   0, 226,   0,   0,  56,   0,   0, 113,   0,  85,   0,   0],
			[255,   0,   0,   0,   0,   0, 218,   0, 182,   0,   0,   0,   0,   0, 145,   0, 145,   0,  36,   0,   0,   0, 109,   0, 109,   0,   0,   0,  72,   0,  36,   0],
			[255,   0,   0,   0,   8,   0,   0,   0, 182,   0,   0,   0,  72,   0,   0,   0, 218,   0,   0,   0,  36,   0,   0,   0, 145,   0,   0,   0, 109,   0,   0,   0],
			[255,   0,   0,   0, 113,   0,   0,   0, 198,   0,  56,   0,  85,   0,  28,   0, 255,   0,   0,   0, 226,   0,   0,   0, 170,   0,   0,   0, 141,   0,   0,   0],
			[255,   0,   0,   0,  42,   0,   0,   0, 212,   0,   0,   0,   8,   0, 212,   0, 170,   0,   0,   0,  85,   0,   0,   0, 212,   0,   8,   0, 127,   0,   8,   0]]
	];

	classvar snareMap = #[
		[[  0,   0, 127,   0, 159,   0, 127,   0, 159,   0, 191,   0, 223,   0,  63,   0, 255,   0,  95,   0,  31,   0,  95,   0,  31,   0,   8,   0,  63,   0,   8,   0],
			[159,   0,   0,   0,  31,   0, 127,   0, 255,   0,  31,   0,   0,   0,  95,   0,   8,   0,   0,   0, 191,   0,  31,   0, 255,   0,  31,   0, 223,   0,  63,   0],
			[ 36,   0, 109,   0,   0,   0,   8,   0, 255,   0,   0,   0,   0,   0,  72,   0,   0,   0, 182,   0,   0,   0,  36,   0, 218,   0,   0,   0, 145,   0,   0,   0],
			[  8,   0,  95,   0,   8,   0,   8,   0, 255,   0,  63,   0,  31,   0, 223,   0,   8,   0,  31,   0, 191,   0,   8,   0, 255,   0, 127,   0, 127,   0, 159,   0],
			[  0,   0, 127,   0,   0,   0,  42,   0, 212,   0,   0, 212,   0,   0, 212,   0,   0,   0,   0,   0,  42,   0,   0,   0, 255,   0,   0,   0, 170, 170, 127,  85]],

		[[ 36,   0,  36,   0,   0,   0,   0,   0, 255,   0,   0,   0, 182,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0, 109, 218,   0,   0,   0, 145,   0,  72,  72],
			[  0,   0,   0,   0, 109,   0,   0,   0, 218,   0,   0,   0, 182,   0,  72,   0,   8,   0,  36,   0, 145,   0,  36,   0, 255,   0,   8,   0, 182,   0,  72,   0],
			[ 72,   0,   0,   0,   0,   0,   0,   0, 255,   0,   0,   0,   0,   0,   0,   0,  72,   0,  72,   0,  36,   0,   8,   0, 218,   0, 182,   0, 145,   0, 109,   0],
			[  0,   0,  85,   0,  56,   0,  28,   0, 255,   0,  28,   0,   0,   0, 226,   0,   0,   0, 170,   0,  56,   0, 113,   0, 198,   0,   0,   0, 113,   0, 141,   0],
			[ 51,   0, 204,   0,   0,   0, 102,   0, 255,   0, 127,   0,   8,   0, 178,   0,  25,   0, 229,   0,   0,   0,  76,   0, 204,   0, 153,   0,  51,   0,  25,   0]],

		[[  0,   0,   0,   0,   0,   0,   0,   0, 255,   0,   0,   0, 127,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  63,   0,   0,   0, 191,   0,   0,   0],
			[  0,   0,   0,   0,   8,   0,  36,   0, 255,   0,   0,   0, 182,   0,   8,   0,   0,   0,   0,   0,  72,   0, 109,   0, 145,   0,   0,   0, 255,   0, 218,   0],
			[  8,   0,   0,   0,  95,   0,  63,   0, 255,   0,   0,   0, 127,   0,   0,   0,   8,   0,   0,   0, 159,   0,  63,   0, 255,   0, 223,   0, 191,   0,  31,   0],
			[178,   0, 127,   0, 153,   0, 204,   0, 255,   0,   0,   0,  25,   0,  76,   0, 102,   0,  51,   0,   0,   0,   0,   0, 229,   0,  25,   0,  25,   0, 204,   0],
			[  0,   0,   0,   0, 141,   0, 113,   0, 255,   0, 198,   0,   0,   0,  56,   0,   0,   0,  85,   0,  56,   0,  28,   0, 226,   0,  28,   0, 170,   0,  56,   0]],

		[[  0,   0,   0,   0,   0,   0,   0,  31,   0,   0,   0,   0, 255,   0,   0,  31,   0,   0,   8,   0,   0,   0, 191, 159, 127,  95,  95,   0, 223,   0,  63,   0],
			[  0,   0,  31,   0, 255,   0,   0,   0,   0,   0,  95,   0, 223,   0,   0,   0,   0,   0,  63,   0, 191,   0,   0,   0,   0,   0,   0,   0, 159,   0, 127,   0],
			[  0,   0,   0,   0,   8,   0,   0,   0, 255,   0,  85,   0, 212,   0,  42,   0,   0,   0,   0,   0,   8,   0,   0,   0,  85,   0, 170,   0, 127,   0,  42,   0],
			[ 28,   0, 198,   0,  56,   0,  56,   0, 226,   0,  28,   0, 141,   0,  28,   0,  28,   0, 170,   0,  28,   0,  28,   0, 255,   0, 113,   0,  85,   0,  85,   0],
			[  0,   0, 127,   0,   0,   0,   0,   0, 255,   0, 191,   0,  31,   0,  63,   0,   0,   0,  95,   0,   0,   0,   0,   0, 223,   0,   0,   0,  31,   0, 159,   0]],

		[[255,   0,   0,   0,   0, 113,   0,   0,  85,   0,   0,   0,   0, 226,   0,   0, 141,   0,   0,   8,   0, 170,  56,  56, 198,   0,   0,  56,   0, 141,  28,   0],
			[  0,   0,   0,   0, 109,   0,   8,   0,  72,   0,   0,   0, 255,   0, 182,   0,   0,   0,   0,   0, 145,   0,   8,   0,  36,   0,   8,   0, 218,   0, 182,   0],
			[  0,   0,  51,  25,  76,  25,  25,   0, 153,   0,   0,   0, 127, 102, 178,   0, 204,   0,   0,   0,   0,   0, 255,   0,   0,   0, 102,   0, 229,   0,  76,   0],
			[  0,   0,   0,   0,   0,   0,   0,   0, 255,   0, 145,   0, 109,   0, 218,   0,  36,   0, 182,   0,  72,   0,  72,   0, 255,   0,   0,   0,   0,   0, 109,   0],
			[255,   0,  85,   0,   0,   0,   0,   0, 226,   0,  85,   0,   0,   0, 198,   0,   0,   0, 141,   0,  56,   0,   0,   0, 170,   0,  28,   0,   0,   0, 113,   0]]
	];

	classvar hihatMap = #[
		[[255,   0,   0,   0, 145,   0,   0,   0, 182,   0, 109,   0, 109,   0, 109,   0, 218,   0,   0,   0,  72,   0,   0,   0, 182,   0,  72,   0, 182,   0,  36,   0],
			[255,   0,  31,   0,  63,   0,  31,   0,  95,   0,  31,   0,  63,   0, 127,   0, 159,   0,  31,   0,  63,   0,  31,   0, 223,   0, 223,   0, 191,   0, 191,   0],
			[170,   0, 113,   0, 255,   0,  56,   0, 170,   0, 141,   0, 198,   0,  56,   0, 170,   0, 113,   0, 226,   0,  28,   0, 170,   0, 113,   0, 198,   0,  85,   0],
			[115,   0,  46,   0, 255,   0, 185,   0, 139,   0,  23,   0, 208,   0, 115,   0, 231,   0,  69,   0, 255,   0, 162,   0, 139,   0, 115,   0, 231,   0,  92,   0],
			[145,   0, 109, 109, 218, 109,  72,   0, 145,   0,  72,   0, 218,   0, 109,   0, 182,   0, 109,   0, 255,   0,  72,   0, 182, 109,  36, 109, 255, 109, 109,   0]],

		[[255,   0,  28,   0, 226,   0,  56,   0, 198,   0,   0,   0,   0,   0,  28,  28, 170,   0,   0,   0, 141,   0,   0,   0, 113,   0,   0,   0,  85,  85,  85,  85],
			[255,   0,  72,   0, 218,   0,  36,   0, 218,   0,   0,   0, 145,   0,   0,   0, 255,   0,  36,   0, 182,   0,  36,   0, 182,   0,   0,   0, 109,   0,   0,   0],
			[255,   0, 162,   0, 231,   0, 162,   0, 231,   0, 115,   0, 208,   0, 139,   0, 185,   0,  92,   0, 185,   0,  46,   0, 162,   0,  69,   0, 162,   0,  23,   0],
			[255,   0,  42,   0, 233,   0,  63,   0, 212,   0,  85,   0, 191,   0, 106,   0, 191,   0,  21,   0, 170,   0,   8,   0, 170,   0, 127,   0, 148,   0, 148,   0],
			[255,   0, 226,   0, 255,   0, 255,   0, 198,   0,  28,   0, 141,   0,  56,   0, 170,   0,  56,   0,  85,   0,  28,   0, 170,   0,  28,   0, 113,   0,  56,   0]],

		[[255,   0,   0,   0, 255,   0, 127,   0,   0,   0,  85,   0,   0,   0, 212,   0,   0,   0, 212,   0,  42,   0, 170,   0,   0,   0, 127,   0,   0,   0,   0,   0],
			[212,   0,   8,   0, 170,   0,   0,   0, 127,   0,   0,   0,  85,   0,   8,   0, 255,   0,   8,   0, 170,   0,   0,   0, 127,   0,   0,   0,  42,   0,   8,   0],
			[ 76,   0,  25,   0, 255,   0, 127,   0, 153,   0,  51,   0, 204,   0, 102,   0,  76,   0,  51,   0, 229,   0, 127,   0, 153,   0,  51,   0, 178,   0, 102,   0],
			[178,   0, 102,   0, 255,   0,  76,   0, 127,   0,  76,   0, 229,   0,  76,   0, 153,   0, 102,   0, 255,   0,  25,   0, 127,   0,  51,   0, 204,   0,  51,   0],
			[255,   0, 231,   0, 255,   0, 208,   0, 139,   0,  92,   0, 115,   0,  92,   0, 185,   0,  69,   0,  46,   0,  46,   0, 162,   0,  23,   0, 208,   0,  46,   0]],

		[[255,   0, 255,   0, 204, 204, 204, 204,   0,   0,  51,  51,  51,  51,   0,   0, 204,   0, 204,   0, 153, 153, 153, 153, 153,   0,   0,   0, 102, 102, 102, 102],
			[141,   0,  28,   0,  28,   0,  28,   0, 113,   0,   8,   0,   8,   0,   8,   0, 255,   0,   0,   0, 226,   0,   0,   0, 198,   0,  56,   0, 170,   0,  85,   0],
			[109,   0, 109,   0, 255,   0,   0,   0,  72,   0,  72,   0, 218,   0,   0,   0, 145,   0, 182,   0, 255,   0,   0,   0,  36,   0,  36,   0, 218,   0,   8,   0],
			[159,   0, 159,   0, 255,   0,  63,   0, 159,   0, 159,   0, 191,   0,  31,   0, 159,   0, 127,   0, 255,   0,  31,   0, 159,   0, 127,   0, 223,   0,  95,   0],
			[255,   0,  85,   0, 148,   0,  85,   0, 127,   0,  85,   0, 106,   0,  63,   0, 212,   0, 170,   0, 191,   0, 170,   0,  85,   0,  42,   0, 233,   0,  21,   0]],

		[[255,   0,   0,   0,   0, 191,   0,   0, 159,   0,   0,   0,   0, 223,   0,   0,  95,   0,   0,   0,   0,  63,   0,   0, 127,   0,   0,   0,   0,  31,   0,   0],
			[255,   0,   0,   0,   0,   0, 226,   0,  85,   0,   0,   0, 141,   0,   0,   0,   0,   0,   0,   0, 170,   0,  56,   0, 198,   0,   0,   0, 113,   0,  28,   0],
			[113,   0,   0,   0, 141,   0,  85,   0,   0,   0,   0,   0, 170,   0,   0,   0,  56,  28, 255,   0,   0,   0,   0,   0, 198,   0,   0,   0, 226,   0,   0,   0],
			[ 36,   0,  36,   0, 145,   0,   0,   0,  72,   0,  72,   0, 182,   0,   0,   0,  72,   0,  72,   0, 218,   0,   0,   0, 109,   0, 109,   0, 255,   0,   0,   0],
			[113,   0,  56,   0, 255,   0,   0,   0,  85,   0,  56,   0, 226,   0,   0,   0,   0,   0, 170,   0,   0,   0, 141,   0,  28,   0,  28,   0, 198,   0,  28,   0]]
	];

	*calculateLevel {|instrument, curBeat=0, x=0.0, y=0.0, bias=0.0|
		var iBetween, jBetween, level, drumMap;
		var a, b, c, d, i, j;

		drumMap = switch (instrument.asSymbol,
			\hihat, {hihatMap},
			\kick, {kickMap},
			\snare, {snareMap},
			{"% is an unknown instrument, fallback to kick".format(instrument).postln; kickMap}
		);

		// make sure we stick in 0..31
		curBeat = curBeat.asInteger%32;

		x = x.clip(0, 1);
		y = y.clip(0, 1);

		// get relevant map indices so 0..1 gets mapped to 0..3
		// b/c drum map is 5x5 and we have a window of 2x2 so
		// we need to respect the offset
		i = x.div(0.25).clip(0, 3);
		j = y.div(0.25).clip(0, 3);

		// get values from the 4 (2x2) maps
		a = drumMap[i][j][curBeat];
		b = drumMap[i+1][j][curBeat];
		c = drumMap[i][j+1][curBeat];
		d = drumMap[i+1][j+1][curBeat];

		// calc the position between the two maps
		iBetween = (x/0.25)%1;
		jBetween = (y/0.25)%1;

		// calc the mix of the map according to the between positions
		level = (iBetween*a)+((1-iBetween)*b)+(jBetween*c)+((1-jBetween)*d)/2;

		// return the level
		// bias can be seen as adding randomness
		^(level/256+(bias));
	}
}

Pgrids : Pattern {
	var <>instrument, <>density=0.5, <>x=0.0, <>y=0.0, <>bias=0.0, <>length=inf;

	*new {|instrument, density=0.5, x=0.0, y=0.0, bias=0.0, length=inf|
		^super.newCopyArgs(instrument, density, x, y, bias, length);
	}

	storeArgs {^[instrument, density, x, y, bias, length] }

	embedInStream {|inval|
		var instrumentStream = instrument.asStream;
		var xStream = x.asStream;
		var yStream = y.asStream;
		var densityStream = density.asStream;
		var biasStream = bias.asStream;

		var xVal, yVal, instrumentVal, densityVal, biasVal;
		length.value(inval).do({
			var outval, b, durations, indices, levels;

			xVal = xStream.next(inval);
			yVal = yStream.next(inval);
			instrumentVal = instrumentStream.next(inval);
			densityVal = densityStream.next(inval);
			biasVal = biasStream.next(inval);

			if(xVal.notNil and: {yVal.notNil and: {instrumentVal.notNil and: {densityVal.notNil and: {biasVal.notNil}}}},
				{
					levels = 32.collect({|i|
						ScGrids.calculateLevel(instrumentVal.asSymbol, curBeat: i, x: xVal, y: yVal, bias: biasVal);
					});
					indices = levels.selectIndices({|level| level>(1-densityVal)});
					if(indices.isEmpty, {
						// yield silence
						Rest().yield;
					}, {
						durations = (indices.shift(-1, 32) - indices)*1/16;
						b = Pseq(durations).asStream;
						while({outval = b.next; outval.notNil}, {
							inval = outval.yield;
						});
					});
				}, {
					inval=nil.yield
			});
		});
		^inval;
	}
}

PgridsValue : Pattern {
	var <>instrument, <>density=0.5, <>x=0.0, <>y=0.0, <>bias=0.0, <>length=inf;

	*new {|instrument, density=0.5, x=0.0, y=0.0, bias=0.0, length=inf|
		^super.newCopyArgs(instrument, density, x, y, bias, length);
	}

	storeArgs {^[instrument, density, x, y, bias, length] }

	embedInStream {|inval|
		var instrumentStream = instrument.asStream;
		var xStream = x.asStream;
		var yStream = y.asStream;
		var densityStream = density.asStream;
		var biasStream = bias.asStream;

		var xVal, yVal, instrumentVal, densityVal, biasVal;
		length.value(inval).do({
			var outval, b, values, indices, levels;

			xVal = xStream.next(inval);
			yVal = yStream.next(inval);
			instrumentVal = instrumentStream.next(inval);
			densityVal = densityStream.next(inval);
			biasVal = biasStream.next(inval);

			if(xVal.notNil and: {yVal.notNil and: {instrumentVal.notNil and: {densityVal.notNil and: {biasVal.notNil}}}},
				{
					levels = 32.collect({|i|
						ScGrids.calculateLevel(instrumentVal.asSymbol, curBeat: i, x: xVal, y: yVal, bias: biasVal);
					});
					indices = levels.selectIndices({|level| level>(1-densityVal)});
					if(indices.isEmpty, {
						Rest().yield;
					}, {
						values = indices.collect({|i| levels[i]});
						b = Pseq(values).asStream;
						while({outval = b.next; outval.notNil}, {
							inval = outval.yield;
						});
					});
				}, {
					inval=nil.yield
			});
		});
		^inval;
	}
}

PgridsValue2 : Pattern {
	var <>instrument, <>density=0.5, <>x=0.0, <>y=0.0, <>bias=0.0, <>length=inf;

	*new {|instrument, density=0.5, x=0.0, y=0.0, bias=0.0, length=inf|
		^super.newCopyArgs(instrument, density, x, y, bias, length);
	}

	storeArgs {^[instrument, density, x, y, bias, length] }

	embedInStream {|inval|
		var instrumentStream = instrument.asStream;
		var xStream = x.asStream;
		var yStream = y.asStream;
		var densityStream = density.asStream;
		var biasStream = bias.asStream;

		var xVal, yVal, instrumentVal, densityVal, biasVal;
		length.value(inval).do({
			var outval, b, values, indices, levels;

			xVal = xStream.next(inval);
			yVal = yStream.next(inval);
			instrumentVal = instrumentStream.next(inval);
			densityVal = densityStream.next(inval);
			biasVal = biasStream.next(inval);

			if(xVal.notNil and: {yVal.notNil and: {instrumentVal.notNil and: {densityVal.notNil and: {biasVal.notNil}}}},
				{
					levels = 32.collect({|i|
						ScGrids.calculateLevel(instrumentVal.asSymbol, curBeat: i, x: xVal, y: yVal, bias: biasVal);
					});
					values = levels.collect({|lev|
						if ((lev > (1-densityVal)), { lev }, { 0 });
					});
					b = Pseq(values).asStream;
					while({outval = b.next; outval.notNil}, {
						inval = outval.yield;
					});
				}, {
					inval=nil.yield
			});
		});
		^inval;
	}
}
