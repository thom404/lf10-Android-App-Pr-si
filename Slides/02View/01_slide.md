# 👨👩
## Die Elternklasse: 
# "View" 

## 🔎 Was genau ist die Elternklasse: View <!-- .element: class="fragment semi-fade-out shrink" style="" -->
- Grundbaustein der Benutzeroberfläche <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Verantwortlich für: <!-- .element: class="fragment" style="" -->
  - Zeichnen <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
  - Event Handling <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Eigenschaften wie Größe, Position <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->
- Basis für UI-Elemente <!-- .element: class="fragment fade-in-then-semi-out shrink fade-up" style="" -->


## 🧬 Vererbung der View-Klasse <!-- .element: class="fragment semi-fade-out shrink" style="" -->
<img data-src="./Slides/assets/Diagramm.svg"  height="500" width="1000"> <!-- .element: class="fragment fade-in" style="" -->


## ⚠️ Wichtige Methoden der View-Klasse <!-- .element: class="fragment semi-fade-out shrink" style="" -->
<pre>
    <code data-trim data-noescape data-line-numbers="1-2|4-5|7-12|14-15">
        <script type="text/template">
  /*View zeichnen */
  onDraw(Canvas canvas)
  
  /*Größe bestimmen */
  onMeasure(int widthMeasureSpec, int heightMeasureSpec)
  
  /*Größe und Position der Kinder setzen */
  onLayout(
    boolean changed, 
    int left, int top, 
    int right, int bottom
    )
  
  /*Verarbeitet Touch-Events */
  onTouchEvent(MotionEvent event)
  </script>
</code></pre>
<!-- .element: class="fragment r-frame" style="" -->