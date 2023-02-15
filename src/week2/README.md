# Week 2

In week 2 begonnen we met Object-georiënteerd programmeren.
De eerste opdracht was om een [Auto klasse](Auto.java) te maken, en hem variabelen en methodes te geven.


```java
public class Auto{
    public String merk;
    public String model;
    public int bouwjaar;

    public void wiebenik() {
        System.out.printf("Mijn merk: %s \nMijn model: %s \nMijn bouwjaar: %d\n\n", merk, model, bouwjaar);
    }

    public void gassen() {
        System.out.println("Vroommmm!");
    }
    public void knipperlicht() {
        System.out.println("Knipper");
    }
}
```

Hieronder zie je het UML en het IntelliJ diagram:

```plantuml
@startuml
class Auto {
+ String merk
+ String model
+ int bouwjaar
+ void wiebenik()
+ void gassen()
+ void knipperlicht()
}
```

![autoklasse](../../images/autoclass.jpeg)

Een belangrijk verschil tussen de twee is dat je in UML wel alle eigenschappen kan verwerken, maar in IntelliJ diagrams niet.

De volgende opdracht was om een huisdier klassenstructuur te maken.
Hieronder zie je de in UML nagebouwde klassenstructuur:

```plantuml
@startuml

skinparam linetype ortho

class Huisdier {
naam: String
Huisdier(nieuweNaam: String)
maakGeluid(): void
watIsMijnNaam(): void
}

class Kat {
Kat(nieuweNaam: String)
maakGeluid(): void
}

class Hond {
Hond(nieuweNaam: String)
maakGeluid(): void
}

class Poedel {
Poedel(nieuweNaam: String): 
maakGeluid(): void
}

class Tijger {
Tijger(nieuweNaam: String)
maakGeluid(): void 
}

Huisdier <|-- Kat : Implements
Huisdier <|-- Hond : Implements
Hond <|-- Poedel : Implements
Kat <|-- Tijger : Implements
```

Kat en Hond zijn subklassen van Huisdier.
Tijger en Poedel zijn subclasses van Kat en Hond.
Dit heb ik zo gedaan zodat er eventueel meer subclasses aan Kat en Hond toegevoegd kunnen worden, zoals Terrier of luipaard.
