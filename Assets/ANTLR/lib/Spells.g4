grammar Spells;
import Units, Target, Base;

spell: imperative+ EOF;

imperative
	: moveUnit
	| spawnUnit
	;

moveUnit: 'Move a' targetUnit 'up to' INT 'spaces.';
spawnUnit: 'Summon' (INT|'a') unitName '.';