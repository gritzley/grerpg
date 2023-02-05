grammar Move;

import Base;

move
	: 'move' INT 'steps' direction
	| 'move' ONE 'step' direction
	;

direction
	: directionUp
	| directionDown
	| directionLeft
	| directionRight
	| directionRandom
	;

directionUp: 'up';
directionDown: 'down';
directionLeft: 'left';
directionRight: 'right';
directionRandom: 'in a random direction';