# PenCodex

This version models a pen around composition and capability interfaces instead of a deep inheritance tree.

- `Pen` owns the stable parts of the domain: metadata, nib, ink source, writing style, and optional features.
- `InkContainer` captures how ink is stored.
- `Refillable` and `InkFillable` capture what a pen can do.
- Concrete pens stay thin and only express true type differences.

```mermaid
classDiagram
    class Pen {
        <<abstract>>
        -PenMetadata metadata
        -Nib nib
        -InkContainer inkContainer
        -WritingStyle writingStyle
        -List~Feature~ features
        +String type()
        +String write(String text)
        +String describe()
        +String featureSummary()
    }

    class RefillPen {
        <<abstract>>
        +replaceRefill(Refill refill)
    }

    class BallPen
    class GelPen
    class FountainPen {
        +fillInk(Ink ink, double amount)
    }
    class DotPen
    class JamesBondPen

    class PenMetadata
    class Nib
    class Ink
    class Refill

    class InkContainer {
        <<interface>>
        +currentInk()
        +remainingInk()
        +hasInk(double amount)
        +consume(double amount)
        +sourceType()
    }

    class RefillBasedInkContainer
    class ReservoirInkContainer
    class DisposableInkUnit

    class WritingStyle {
        <<interface>>
        +name()
        +inkPerCharacter()
        +render(String text, Ink ink, Nib nib)
    }

    class FastWritingStyle
    class SmoothWritingStyle

    class Refillable {
        <<interface>>
        +replaceRefill(Refill refill)
    }

    class InkFillable {
        <<interface>>
        +fillInk(Ink ink, double amount)
    }

    class Feature {
        <<interface>>
        +name()
        +describe()
    }

    class CameraFeature
    class MicrophoneFeature

    Pen <|-- RefillPen
    Pen <|-- FountainPen
    Pen <|-- DotPen
    RefillPen <|-- BallPen
    RefillPen <|-- GelPen
    BallPen <|-- JamesBondPen

    RefillPen ..|> Refillable
    FountainPen ..|> InkFillable

    Pen o-- PenMetadata
    Pen o-- Nib
    Pen o-- InkContainer
    Pen o-- WritingStyle
    Pen o-- Feature

    RefillBasedInkContainer ..|> InkContainer
    ReservoirInkContainer ..|> InkContainer
    DisposableInkUnit ..|> InkContainer

    FastWritingStyle ..|> WritingStyle
    SmoothWritingStyle ..|> WritingStyle

    CameraFeature ..|> Feature
    MicrophoneFeature ..|> Feature

    RefillBasedInkContainer o-- Refill
    Refill o-- Ink
    ReservoirInkContainer o-- Ink
    DisposableInkUnit o-- Ink
```
