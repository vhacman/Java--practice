# Esercizi Java

Repository per esercitarsi con la programmazione Java, sviluppo di interfacce grafiche e problem solving.

## Struttura del Progetto

```
Java--practice/
└── Practice/
    └── Java/
        └── src/
            ├── PrimaFinestra.java
            └── Kata.java
```

## Contenuti

### PrimaFinestra.java
Applicazione grafica Java che utilizza AWT per creare un'interfaccia utente:

**Caratteristiche:**
- Finestra con sfondo rosa (800x700 pixel)
- Titolo: "Prima Finestra"
- Testo centrato: "la mia prima finestra in Java"
- Font Arial corsivo di dimensione 20
- Gestione eventi con `WindowAdapter` per la chiusura della finestra
- Centraggio dinamico del testo utilizzando `FontMetrics`

**Concetti dimostrati:**
- Creazione di una finestra con `Frame`
- Personalizzazione grafica con colori e font
- Rendering personalizzato con il metodo `paint()`
- Gestione eventi della finestra

### Kata.java
Implementazione del gioco "Sasso, Carta, Forbice" (Rock, Paper, Scissors):

**Regole del gioco:**
- Sasso batte Forbice
- Forbice batte Carta
- Carta batte Sasso
- Mosse identiche risultano in un pareggio

**Funzionalità:**
- Metodo `rps(String p1, String p2)` che determina il vincitore
- Gestione di tutti i casi: vittoria giocatore 1, vittoria giocatore 2, pareggio
- Esempi di test nel metodo `main()`

## Eseguire il Progetto

### PrimaFinestra
```bash
# Navigare nella directory sorgente
cd Practice/Java/src

# Compilare
javac PrimaFinestra.java

# Eseguire
java PrimaFinestra
```

### Kata (Rock, Paper, Scissors)
```bash
# Navigare nella directory sorgente
cd Practice/Java/src

# Compilare
javac Kata.java

# Eseguire
java Kata
```

## Requisiti

- Java Development Kit (JDK) 8 o superiore
- Supporto per Java AWT (incluso nel JDK standard)


