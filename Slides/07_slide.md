## Beispiel: ImageView in Kotlin

```kotlin
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
```

---