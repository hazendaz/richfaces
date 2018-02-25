// This file is deprecated in 1.12.0 to be removed in 1.13
( function() {
	if ( typeof define === "function" && define.amd ) {
		define( [
			"jquery",
			"./data",
			"./disable-selection",
			"./focusable",
			"./form",
			"./ie",
			"./keycode",
			"./labels",
			"./jquery-1-7",
			"./plugin",
			"./safe-active-element",
			"./safe-blur",
			"./scroll-parent",
			"./tabbable",
			"./unique-id",
			"./version"
		] );
	} else {
	}	
} )();
