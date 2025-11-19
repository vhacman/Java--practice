# Java Practice

A repository for practicing Java programming concepts and GUI development.

## Project Structure

```
Java--practice/
└── Practice/
    └── Java/
        └── src/
            └── PrimaFinestra.java
```

## Contents

### PrimaFinestra.java
A simple Java AWT GUI application that demonstrates:
- Creating a window using `Frame`
- Custom window appearance with colors and positioning
- Event handling with `WindowAdapter`
- Graphics rendering with custom fonts and text drawing

**Features:**
- Pink background window (800x700 pixels)
- Custom title: "Prima Finestra"
- Displays "La mia prima finestra in Java" text
- Window close event handling

## Running the Project

To compile and run the PrimaFinestra application:

```bash
# Navigate to the source directory
cd Practice/Java/src

# Compile
javac PrimaFinestra.java

# Run
java PrimaFinestra
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- Support for Java AWT (included in standard JDK)

## Notes

This project uses the older AWT (Abstract Window Toolkit) framework for GUI development. For modern Java applications, consider using JavaFX or Swing.
