# Learn common patterns with Java programming language
This repository contains my samples of usages design patterns
with Java programming language.
It combines different packages with good samples and approaches to
building scalable and flexible applications.

## Note:
This repository was created for storing some experimental solutions
and shows my learning curve.
Most of this samples you can meet in books from Resources section.

## 1. Strategy Pattern
Description:

Defines a family of algorithms, encapsulates each algorithm and
makes the algorithms interchangeable within that family.

Packages:
- com.technoboom.MiniDuckSimulator
- com.technoboom.AdventureGame

## 2. Observer
Description:

A subject maintains a list of observers and notifies them
automatically of any state changes (usually by calling
one of their methods).

Packages:
- com.technoboom.WeatherStation - uses custom Subject and Observer
- com.technoboom.WeatherStationStandard - uses Java Core Observable classes
- com.technoboom.SwingObserverSample - sample with Swing Action Listeners and GUI

## Resources:
1. Eric Freeman & Elisabeth Robson "Head First Design Patterns"
(https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124)
2. Erich Gamma, Richard Helm "Design Patterns: Elements of Reusable Object-Oriented Software"
(https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)