grammar Units;
import Actions, Triggers, Base;

unit: unitType+ '-' INT 'hp' unitBehaviour;

unitType: ID;
unitName: ID+;

unitDescription: unitType+;

unitBehaviour: instruction+;

instruction: trigger action '.';
