grammar Rules;

// Spells Syntax
spell: imperative+ EOF;

// Imperatives
imperative
	: moveUnit
	| spawnUnit
	| summonCardInHand
	;

moveUnit: 'Move' targetUnit  UP_TO stepAmount directionOR ('and' directionOR)? '.';
spawnUnit: 'Summon' (INT | ONE) NAME '.';
summonCardInHand: 'Put' (INT | ONE) NAME 'into your hand.';

// Units
unit: type+ '-' stats behaviour;

stats: INT '/' INT;
NAME: '"' ID+ '"';
type
	: 'Knight'
	| 'Pawn'
	| 'Rook'
	| 'King'
	| 'Queen'
	| 'Bishop'
	;

behaviour: instruction+;

// Instructions
instruction: trigger action (', then' action)? '.';

// Actions
action
	: move
	| turn
	| damage
	;

move: 'move' UP_TO stepAmount direction;

UP_TO: 'up to';

turn: 'turn' (LEFT | RIGHT | AROUND);

damage: 'deal' INT 'damage';

// Directions
stepAmount: INT 'steps' | ONE 'step';
directionOR: direction ((',' direction)* 'or' direction)?;
direction
	: FORWARDS
	| BACKWARDS
	| LEFT
	| RIGHT
	| FORWARDS_LEFT
	| FORWARDS_RIGHT
	| BACKWARDS_LEFT
	| BACKWARDS_RIGHT
	;

FORWARDS: 'forwards';
BACKWARDS: 'backwards';
LEFT: 'left';
RIGHT: 'right';
AROUND: 'around';
FORWARDS_LEFT: 'forwards left';
FORWARDS_RIGHT: 'forwards right';
BACKWARDS_LEFT: 'backwards left';
BACKWARDS_RIGHT: 'forwards right';

targetUnit
	: 'target' unitDescription
	| IT
	;

IT: 'it';

unitDescription: type+;

// Triggers
trigger
	: START_COMBAT
	| ACTIVATE
	;

START_COMBAT: 'At the beginning of combat';
ACTIVATE: 'When this unit is activated';

FlOAT: INT '.' INT;
ONE: '1 ' | 'a';
INT: [0-9]+;
ID: [a-zA-Z]+;
WS: [ \t] -> skip;
NL: [\r\n]+ -> skip;
