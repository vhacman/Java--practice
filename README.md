# Esercizi Java

Repository per esercitarsi con Java.

## Struttura Progetto

```
Practice/
├── src/
│   ├── ex00/    # Gioco Sasso, Carta, Forbice
│   ├── ex01/    # Finestra grafica con AWT
│   └── ex02/    # Palindrome checker
│   └── ex03/    # BeConcise 
└── out/         # File compilati
```

## Esercizi

### ex00 - Kata (Sasso, Carta, Forbice)
**File:** `Kata.java`

Gioco "Sasso, Carta, Forbice":
- Metodo `rps(String p1, String p2)` che determina il vincitore
- Gestione di vittoria, sconfitta e pareggio
- Input: "rock", "paper", "scissors"

### ex01 - Prima Finestra Grafica
**File:** `FirstWindow.java`, `WindowManager.java`

Finestra grafica con AWT:
- Sfondo rosa 800x700px
- Testo centrato con font Arial corsivo
- Gestione chiusura finestra con `WindowAdapter`
- Separazione della logica di gestione eventi

### ex02 - Palindrome
**File:** `Main.java`, `Palindrome.java`

Verifica palindromi:
- Controlla se una stringa è palindroma
- Ignora spazi e maiuscole/minuscole
- Implementazione con metodi separati

### ex03 - BeConcise
**File:** `Main.java`, `BeConcise.java`

Controlla età inserita

### ex04 - FirstNonRepeatingLetter
**File:** `Main.java`, `BeConcise.java`

 - Trova il primo carattere nella stringa che appare una sola volta.
 - Confronto case-insensitive, ma ritorna il carattere nel suo case originale.
 - 
## Esecuzione

```bash
# Compilazione
cd Practice/src
javac ex00/Kata.java
javac ex01/*.java
javac ex02/*.java
javac ex03/*.java
javac ex04/*.java

# Esecuzione
java ex00.Kata
java ex01.FirstWindow
java ex02.Main
java ex03.Main
java ex04.Main
```

## Requisiti

- JDK 8+
