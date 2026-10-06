# AGENTS.md

## Projekt
Konsolenspiel Schere-Stein-Papier in Java (IntelliJ IDEA).
Übungsprojekt im 1. Semester Wirtschaftsinformatik.

## Starten
Klasse `SchereSteinPapier` in `src/` ausführen (Methode `main`).

## Spiellogik
- Eingabe: 0 = Schere, 1 = Stein, 2 = Papier
- Computer wählt zufällig mit `Random.nextInt(3)`
- Gewinner wird mit if / else if / else ermittelt

## Code-Stil
- Variablen- und Methodennamen auf Deutsch, in camelCase
- Kurze Kommentare auf Deutsch
- Nur Java-Konzepte verwenden, die im Kurs schon dran waren
  (Variablen, Scanner, Random, if/else, Schleifen). Keine Streams, Lambdas oder Klassen-Hierarchien.

## Regeln für die KI
- Das ist ein Lernprojekt: Änderungen kurz erklären, nicht nur Code liefern.
- Immer nur einen Schritt auf einmal umsetzen.
- Bestehenden Code nicht umschreiben, wenn es nicht verlangt wurde.
