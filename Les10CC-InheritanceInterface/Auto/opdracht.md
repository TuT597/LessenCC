## Autofabrikant
Een autofabrikant heeft een programma nodig voor het opslaan en ophalen van auto's

## Vereisten
# Interfaces
Maak een "VehicleInterface" interface die de volgende methodes implementeert (zonder body):
- public void setGewicht(int gewicht)
- public void setKleur(String kleur)
- public void getGewicht()
- public string getKleur()
Maak een "CarInterface" interface die de volgende methodes implementeert (zonder body):
- public void setLicense(String license)
- public void printInfo()

# Classes
Maak een abstracte "Vehicle" class die de VehicleInterface implementeert, de vehicle class 
slaat minimaal een kleur en gewicht op, en gebruikt de gedefinieerde methodes uit de 
VehicleInterface om deze variabelen te "setten" en "getten", maak de variabelen dus private

Maak een "Car" class die de abstracte Vehicle class erft en de CarInterface implementeert. De 
Car class slaat minimaal een maximumsnelheid, kenteken, merk, model en registratiedatum op. De 
car class gebruikt de setLicense methode gedefinieerd in de interface om het kenteken te "setten", maak de variabele waar het kenteken in wordt opgeslagen dus private. De printInfo methode print alle informatie van het voertuig. Maak ook twee constructors voor de Car class, 
één die alle informatie neemt (dus gewicht, kleur, maximumsnelheid, kenteken, merk, model en registratiedatum) en één die alles neemt behalve de registratiedatum. De tweede/laatstgenoemde constructor dient de huidige datum in te vullen en hoort gebruik te maken van constructor overloading (dit gebeurt per definitie bij meer dan één constructor) en constructor chaining

De Car class en Vehicle class dienen in aparte directories te staan respectievelijk aan de naam!
Dus car/Car.java en vehicle/Vehicle.java, maak gebruik van package en import statements. Plaats
de corresponderende interfaces ook in de bijbehorende directory.

# Bonus
Gebruik regex om de input voor het kenteken te verifiëren, het meest recente format voor Nederlandse kentekens is: X-111-XX. Gooi een custom exception met een logische naam als 
het kenteken dat ingevoerd is niet aan het format voldoet.