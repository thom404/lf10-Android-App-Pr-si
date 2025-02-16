# Die Elternklasse "View"


## Was versteht man überhaupt unter einer View? <!-- .element: class="fragment semi-fade-out shrink" style="" -->
- Grundbaustein der Benutzeroberfläche in Android <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Verantwortlich für: <!-- .element: class="fragment" style="" -->
  - Zeichnen von Inhalten auf dem Bildschirm <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
  - Behandlung von Benutzerinteraktionen (z.B. Berührungen) <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
  - Verwaltung eigener Größe und Position <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Basis für spezialisierte UI-Elemente wie Buttons, TextViews, etc. <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->


## Was genau ist die Elternklasse: View <!-- .element: class="fragment semi-fade-out shrink" style="" -->
- Basisklasse für alle UI-Komponenten in Android <!-- .element: class="fragment fade-in-then-semi-out fade-up" style="" -->
- Verantwortlich für das Zeichnen und Event-Handling <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Definiert grundlegende Eigenschaften wie Größe, Position und Layout <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Ermöglicht die Erstellung benutzerdefinierter UI-Komponenten <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->


## Wichtige Methoden der View-Klasse <!-- .element: class="fragment semi-fade-out shrink" style="" -->
<pre><code data-ln-start-from="1" data-line-numbers="1-2|4-5|7-8|10-11" data-trim >
  /*View zeichnen */
  onDraw(Canvas canvas)
  
  /*Größe bestimmen */
  onMeasure(int widthMeasureSpec, int heightMeasureSpec)
  
  /*Positioniert Kinder */
  onLayout(boolean changed, int left, int top, int right, int bottom)
  
  /*Verarbeitet Touch-Events */
  `onTouchEvent(MotionEvent event)`
</code></pre>
<!-- .element: class="fragment fade-in fade-up" style="" -->


## View-Klassen Übersicht <!-- .element: data-fragment-index="1" class="fragment semi-fade-out shrink" style="" -->
<pre class="mermaid fragment grow" style="box-shadow: none; text-align: center" data-fragment-index="1">
flowchart TD;
    A[View] --- B[ImageView]
    A --- C[TextView]
    A --- D[ViewGroup]

    C --- F[Button]
    
    D --- G[FrameLayout]
    D --- H[RelativeLayout]

    linkStyle default stroke:beige
</pre> 