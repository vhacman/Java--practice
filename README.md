# Java Practice Exercises

Repository contenente esercizi pratici.

## Struttura Progetto

```
Practice/
├── src/
│   ├── ex00/    # Game Logic - Sasso, Carta, Forbice
│   ├── ex01/    # GUI Programming - Finestra grafica con AWT
│   ├── ex02/    # String Algorithms - Palindrome checker
│   ├── ex03/    # Operators - Ternary operator practice
│   ├── ex04/    # String Manipulation - Character analysis
│   ├── ex05/    # Pattern Generation - ASCII art
│   └── ex06/    # Array Operations - Array sum calculation
└── docs/        # Javadoc documentation
```

## 📚 Esercizi

### ex00 - Rock Paper Scissors (Kata)
**File:** `Kata.java`

Implementazione del classico gioco "Sasso, Carta, Forbice":
- Metodo `rps(String p1, String p2)` che determina il vincitore
- Logica di confronto tra le mosse
- Gestione di vittoria, sconfitta e pareggio
- **Input validi:** `"rock"`, `"paper"`, `"scissors"`
- **Concetti:** Conditional logic, string comparison

### ex01 - First GUI Window
**File:** `FirstWindow.java`, `WindowManager.java`

Creazione di una finestra grafica con AWT (Abstract Window Toolkit):
- Finestra personalizzata con sfondo rosa (800x700px)
- Rendering di testo centrato con font Arial corsivo
- Gestione corretta della chiusura con `WindowAdapter`
- Pattern di separazione delle responsabilità (event handling separato)
- **Concetti:** GUI programming, event handling, AWT framework

### ex02 - Palindrome Checker
**File:** `Main.java`, `Palindrome.java`

Verifica se una stringa è palindroma:
- Algoritmo di confronto simmetrico
- Normalizzazione: ignora spazi e differenze maiuscole/minuscole
- Architettura modulare con metodi separati
- **Concetti:** String manipulation, algorithm design, case handling

### ex03 - BeConcise (Age Classifier)
**File:** `Main.java`, `BeConcise.java`

Classificazione dell'età usando operatori ternari:
- Metodo `describeAge(int age)` che categorizza l'età
- **Categorie:** kid (<13), teenager (13-17), adult (18-64), elderly (65+)
- Utilizzo avanzato di operatori ternari annidati
- **Concetti:** Ternary operators, conditional expressions, code conciseness

### ex04 - FirstNonRepeatingLetter
**File:** `Main.java`, `FirstNonRepeatingLetter.java`

Trova il primo carattere che appare una sola volta in una stringa:
- Algoritmo di conteggio caratteri (time complexity: O(n))
- Confronto case-insensitive ma preservazione del case originale
- Utilizzo di array per tracking dei caratteri
- **Concetti:** Character frequency analysis, array manipulation, Unicode handling

### ex05 - MakeSquare (ASCII Art Generator)
**File:** `Main.java`, `MakeSquare.java`

Generatore di quadrati ASCII:
- Input: numero intero `n`
- Output: quadrato `n×n` fatto di caratteri `+`
- Utilizzo di `StringBuilder` per efficienza
- **Concetti:** Nested loops, string building, pattern generation

### ex06 - SumArray
**File:** `Main.java`, `SumArray.java`

Calcolo della somma degli elementi di un array:
- Metodo `sum(double[] numbers)` che somma tutti gli elementi
- Utilizzo del ciclo for-each per iterazione elegante
- Gestione di numeri decimali (`double`)
- **Concetti:** Array iteration, for-each loop, accumulator pattern

## Esecuzione

### Compilazione ed esecuzione singolo esercizio

```bash
# Spostati nella directory src
cd Practice/src

# Compila un esercizio specifico
javac ex00/Kata.java

# Esegui
java ex00.Kata
```

### Compilazione di tutti gli esercizi

```bash
cd Practice/src

# Compila tutti gli esercizi
javac ex00/Kata.java
javac ex01/*.java
javac ex02/*.java
javac ex03/*.java
javac ex04/*.java
javac ex05/*.java
javac ex06/*.java
```

### Quick Reference - Esecuzione diretta

| Esercizio | Comando |
|-----------|---------|
| ex00 | `java ex00.Kata` |
| ex01 | `java ex01.FirstWindow` |
| ex02 | `java ex02.Main` |
| ex03 | `java ex03.Main` |
| ex04 | `java ex04.Main` |
| ex05 | `java ex05.Main` |
| ex06 | `java ex06.Main` |

## 🎓 Concetti Applicati

Questi esercizi coprono i seguenti concetti fondamentali di Java:

- **Logica condizionale** - if/else, switch, operatori ternari
- **Manipolazione stringhe** - confronti, parsing, trasformazioni
- **Array e collezioni** - utilizzo di array per algoritmi
- **GUI Programming** - AWT framework, event handling
- **OOP** - classi, metodi, package structure
- **Algoritmi** - pattern matching, frequency analysis, generation patterns
- **Best practices** - separazione delle responsabilità, codice modulare

## Documentazione

La documentazione completa del codice è disponibile in formato Javadoc nella cartella `docs/`.
Per visualizzare la documentazione, apri il file `docs/index.html` nel browser:

## Note

- Ogni esercizio è contenuto nel proprio package per evitare conflitti di namespace
- Il codice include Javadoc per documentazione delle classi e metodi principali
- La directory `docs/` contiene la documentazione HTML generata automaticamente
