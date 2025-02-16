# 👨👩 Die Elternklasse "View"


## 🏞️ Was versteht man überhaupt unter einer View? <!-- .element: class="fragment semi-fade-out shrink" style="" -->
- Grundbaustein der Benutzeroberfläche in Android <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Verantwortlich für: <!-- .element: class="fragment" style="" -->
  - Zeichnen von Inhalten auf dem Bildschirm <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
  - Behandlung von Benutzerinteraktionen (z.B. Berührungen) <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
  - Verwaltung eigener Größe und Position <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Basis für spezialisierte UI-Elemente wie Buttons, TextViews, etc. <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->


## 🔎 Was genau ist die Elternklasse: View <!-- .element: class="fragment semi-fade-out shrink" style="" -->
- Basisklasse für alle UI-Komponenten in Android <!-- .element: class="fragment fade-in-then-semi-out fade-up" style="" -->
- Verantwortlich für das Zeichnen und Event-Handling <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Definiert grundlegende Eigenschaften wie Größe, Position und Layout <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Ermöglicht die Erstellung benutzerdefinierter UI-Komponenten <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->


## ⚠️ Wichtige Methoden der View-Klasse <!-- .element: class="fragment semi-fade-out shrink" style="" -->
<pre>
    <code data-trim data-noescape data-line-numbers="1-2|4-5|7-12|14-15">
        <script type="text/template">
  /*View zeichnen */
  onDraw(Canvas canvas)
  
  /*Größe bestimmen */
  onMeasure(int widthMeasureSpec, int heightMeasureSpec)
  
  /*Positioniert Kinder */
  onLayout(
    boolean changed, 
    int left, int top, 
    int right, int bottom
    )
  
  /*Verarbeitet Touch-Events */
  `onTouchEvent(MotionEvent event)`
  </script>
</code></pre>
<!-- .element: class="fragment r-frame" style="" -->