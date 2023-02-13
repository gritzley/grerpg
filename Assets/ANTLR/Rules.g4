grammar Rules;

// Spells Syntax
spell: imperative+ EOF;

// Imperatives
imperative
	: moveUnit
	| spawnUnit
	| summonCardInHand
	| destroyUnits
	| chooseUnit
	| unitFightsUnit
	;

moveUnit: 'Move' targetUnit  UP_TO stepAmount directionOR ('and' directionOR)? '.';
spawnUnit: 'Summon' (INT | ONE) NAME '.';
summonCardInHand: 'Put' (INT | ONE) NAME 'into your hand.';
destroyUnits: 'Destroy each' unitSelector '.';
chooseUnit: 'Pick' targetUnit '.';
unitFightsUnit: targetUnit 'fights' targetUnit;

unitSelector: 'unit' | type;

// Units
unit: type+ '-' stats behaviour;

stats: INT '/' INT;
NAME: '"' [a-zA-Z ]+ '"';
type
	: 'Knight'
	| 'Rogue'
	;

behaviour: instruction*;

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


FORWARDS_LEFT: 'forwards left';
FORWARDS_RIGHT: 'forwards right';
BACKWARDS_LEFT: 'backwards left';
BACKWARDS_RIGHT: 'backwards right';
FORWARDS: 'forwards';
BACKWARDS: 'backwards';
LEFT: 'left';
RIGHT: 'right';
AROUND: 'around';

targetUnit
	: 'target' unitDescription
	| IT
	;

IT: 'it' | 'It';

unitDescription: type+ | 'unit';

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
WS: [ \t] -> skip;
NL: [\r\n]+ -> skip;
