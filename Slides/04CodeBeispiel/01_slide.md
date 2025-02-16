# Code Beispiele


## ImageView in XML <!-- .element: class="fragment semi-fade-out shrink" style="" -->
<pre>
    <code data-trim data-noescape data-line-numbers="1|2|3|4|5|6|7">
        <script type="text/template">
<ImageView
    android:id="@+id/imageView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:src="@drawable/example_image"
    android:contentDescription="Beispielbild"
    android:scaleType="centerCrop" />
        </script>
    </code>
</pre> <!-- .element: class="fragment r-frame" style="" -->


## ImageView in Java <!-- .element: class="fragment semi-fade-out shrink" style="" -->
<pre>
    <code data-trim data-noescape data-line-numbers="1-1|2-2|3-3|4-4|">
        <script type="text/template">
ImageView imageView = findViewById(R.id.imageView);
imageView.setImageResource(R.drawable.example_image);
imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
imageView.setContentDescription("Beispielbild");
        </script>
    </code>
</pre> <!-- .element: class="fragment r-frame" style="" -->


## ImageView in Kotlin <!-- .element: class="fragment semi-fade-out shrink" style="" -->
<pre>
    <code data-trim data-noescape data-line-numbers="5|6-8|10-13|">
        <script type="text/template">
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.example_image)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.contentDescription = "Beispielbild"
    }
}
        </script>
    </code>
</pre> <!-- .element: class="fragment r-frame" style="" -->