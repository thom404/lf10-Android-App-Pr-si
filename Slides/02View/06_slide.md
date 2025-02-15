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
