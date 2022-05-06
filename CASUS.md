# Casus

Verhuurbedrijf 'Rent-a-Thing' wil een systeem bouwen waarin alle producten staan die te huur zijn en waarin wordt bijgehouden welke van die producten op voorraad (ofwel niet verhuurd) zijn. Het bedrijf verhuurt de meest uiteenlopende producten, maar verhuurt vrijwel geen producten die identiek zijn. Zo heeft het bedrijf bijvoorbeeld wel meerdere boormachines te huur, maar allemaal van een ander merk of type.

Meerdere medewerkers van het bedrijf moeten het systeem tegelijkertijd kunnen bedienen. Om de (uitwerking van deze) casus niet te ingewikkeld te maken doen we net alsof het praktisch is dat alle medewerkers op dezelfde computer werken. Daartoe bestaat het systeem uit een 'inlogvenster', waarin elke medewerker kan inloggen met een username en een wachtwoord. Na succesvol inloggen wordt een 'menuvenster' geopend voor die medewerker. Het inlogvenster blijft geopend (of wordt opnieuw geopend) zodat ook een volgende medewerker kan inloggen, enzovoort.

Het menuvenster toont een menu met de volgende mogelijkheden:

- 'Overzicht', waarmee het 'overzichtvenster' wordt geopend,
- 'Beheer', waarmee het 'beheervenster' worden geopend en
- 'Uitloggen', waarmee het menuvenster wordt gesloten.

Het overzichtvenster toont een scrollbare lijst met (een korte omschrijving van) alle producten die het bedrijf verhuurt, met een indicatie of het product op voorraard is. Als op een product wordt geklikt wordt een 'detail' venster geopend.

In het detailvenster wordt alle bekende informatie over het product getoond. Daarnaast wordt getoond of het product is verhuurd. Als het product is verhuurd wordt getoond door welke medewerker en aan welke klant (een veld met voor- en achternaam). Ook wordt dan een knop 'Retour' getoond, waarmee de verhuur van het product kan worden beeindigd. Als het product op voorraad is wordt een totale huurprijs per dag getoond. Ook wordt dan een checkbox 'Verzekeren?' getoond, waarvan deze totale huurprijs afhankelijk is (alleen als de checkbox wordt aangevinkt is de huurprijs inclusief een bedrag voor de verzekering). Ook worden dan een invulveld voor een klantnaam en een knop 'Verhuur' getoond, waarmee het product kan worden verhuurd.

In het beheervenster wordt een lijst getoond van alle (bekende) soorten producten (zie hieronder). Als op een soort product wordt geklikt opent een 'toevoegen' venster.

In het toevoegenvenster kunnen gegevens over het product worden ingevuld en kan het product met een knop 'Toevoegen' worden toegevoegd aan het assortiment van het bedrijf.

Alle wijzigingen die plaatsvinden (het toevoegen van producten, het verhuren of retourneren van producten) zijn direct zichtbaar in alle openstaande schermen van alle medewerkers.

Een medewerker kan slechts in een venster tegelijk werken, andere vensters zijn niet actief. (Behalve het inlogvenster, dat is altijd actief. Een medewerker zou, terwijl hij of zij al is ingelogd, opnieuw kunnen proberen in te loggen. Zo'n poging is nooit succesvol.)

Elk venster bevat de mogelijkheid om het venster te sluiten en zonder iets te wijzigen terug te keren naar het voorgaande venster.

In elk venster wordt de username van de ingelogde medewerker getoond, zodat elke medewerker weet in welk venster hij of zij behoort te werken.

Er zijn minimaal de volgende soorten producten bekend in het systeem:

- Personenauto's, waarvan een merk en een gewicht (in kg) bekend zijn. De huurprijs bedraagt 50 euro per dag. De verzekering is afhankelijk van het gewicht van de auto en bedraagt 0,01 euro per kg per dag.

- Vrachtauto's, waarvan een laadvermogen (in kg) en een gewicht (in kg) bekend zijn. De huurprijs bedraagt 0,10 euro per kg laadvermogen per dag. De verzekering is afhankelijk van het gewicht van de auto en bedraagt 0,01 euro per kg per dag.

- Boormachines, waarvan een merk en een type bekend zijn. De huurprijs is 5 euro per dag, de verzekering is 1 euro per dag.

Van elke soort zijn minstens 3 (zelf te verzinnen) producten 'hardcoded' (bij het opstarten van het programma) aanwezig in het systeem. Verwacht wordt dat het aantal soorten uitgebreid zal worden, dus hiermee zal rekening gehouden moeten worden in het ontwerp.

Opdracht

De opdracht dient uitgevoerd te worden en wordt beoordeeld volgens de beschrijving van de opdracht van OPT3, met de volgende afwijking. In plaats van 2 patterns, dienen in de uitwerking de volgende 3 patterns op een nuttige wijze toegepast te worden: het observer pattern, het factory method pattern en het template method pattern.