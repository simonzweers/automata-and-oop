
# Dit is de readme voor week 4

In week 4 heb ik 2 verschillende soorten implementaties van het state design pattern gedaan.
Het state diagram ziet er als volgt uit:

![statediag](../../images/week4-statemachine.png)

## State Machine type 1

Het eerste type wat ik heb gemaakt, creëert met elke nieuwe staat een nieuw object.
Ik heb ook deze 2 keer gemaakt; een keer met een superklasse, en een keer met een interface.

Met superklasse ziet het het UML diagram er zo uit:

```plantuml
@startuml

skinparam linetype ortho

class State {
  + State(): 
  + b(): State
  + a(): State
}
class StateF {
  + StateF(): 
  + b(): State
  + a(): State
  + toString(): String
}
class StateQ {
  + StateQ(): 
  + b(): State
  + a(): State
  + toString(): String
}
class StateR {
  + StateR(): 
  + b(): State
  + a(): State
  + toString(): String
}
class StateS {
  + StateS(): 
  + a(): State
  + b(): State
  + toString(): String
}
class TestMachine {
  + TestMachine(): 
  + main(String[]): void
  + randomInputWord(int): String
}
class Machine {
  + Machine(): 
  + processB(): void
  + processA(): void
  + toString(): String
}

StateF       -[#000082,plain]-^  State       
StateQ       -[#000082,plain]-^  State       
StateR       -[#000082,plain]-^  State       
StateS       -[#000082,plain]-^  State       
@enduml

```

Met interface ziet het UML diagram er zo uit:

```plantuml
@startuml
skinparam linetype ortho

interface State << interface >> {
  + b(): State
  + a(): State
}

class StateF {
  + StateF(): 
  + b(): State
  + a(): State
  + toString(): String
}

class StateQ {
  + StateQ(): 
  + toString(): String
  + a(): State
  + b(): State
}

class StateR {
  + StateR(): 
  + a(): State
  + b(): State
  + toString(): String
}

class StateS {
  + StateS(): 
  + b(): State
  + a(): State
  + toString(): String
}

class TestMachine {
  + TestMachine(): 
  + main(String[]): void
  + randomInputWord(int): String
}

class Machine {
  + Machine(): 
  + processA(): void
  + processB(): void
  + toString(): String
}

StateF       -[#008200,dashed]-^  State       
StateQ       -[#008200,dashed]-^  State       
StateR       -[#008200,dashed]-^  State       
StateS       -[#008200,dashed]-^  State       

@enduml
```

Beide machine's geven bij elke overgang een nieuw object `State` terug.
Afhankelijk van de huidige staat zal er dus een nieuw object `StateQ`, `StateR`, `StateS` of `StateF` aangemaakt worden.
Door `currentstate.a()` of `currentstate.b()` aan te roepen binnen de `processA` en `processB` functies varanderd dus de staat.
