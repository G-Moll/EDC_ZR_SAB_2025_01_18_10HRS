var h1 = document.getElementById( "h1Element" );
h1.innerHTML = "Hello DeepSeek";
h1.className = "highlight";

var h2 = document.getElementsByTagName( "h2" )[ 0 ];

h2.addEventListener( "click", function( e ) {
	// h2.innerHTML = "JS & DOM";
	// h2.className = "highlightTwo";
	// console.log( "Clicked..." );

	console.log( e.type );
	console.log( e.target );
});

// console.log( h2 );
