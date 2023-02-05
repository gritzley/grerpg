grammar Rules;

// Spells Syntax
spell: imperative+ EOF;

// Imperatives
imperative
	: moveUnit
	| spawnUnit
	;

moveUnit: 'Move a' targetUnit 'up to' INT 'spaces.';
spawnUnit: 'Summon' (INT|'a') unitName '.';

// Units
unit: unitType+ '-' INT 'hp' unitBehaviour;

unitType: ID;
unitName: ID+;

unitDescription: unitType+;

unitBehaviour: instruction+;

// Instructions
instruction: trigger action '.';

// Actions
action
	: move
	;

move
	: 'move' INT 'steps' direction
	| 'move' ONE 'step' direction
	;

// Directions
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

// Targets
targetUnit
	: unitDescription
	;

// Triggers
trigger
	: startCombat
	;

startCombat
	: 'At the beginning of combat'
	;

FlOAT: INT '.' INT;
ONE: '1 ';
INT: [0-9]+;
ID: [a-zA-Z]+;
WS: [ \t] -> skip;
NL: [\r\n]+ -> skip;
