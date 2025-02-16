# Code Beispiele


## ImageView in XML
```xml
<ImageView
    android:id="@+id/imageView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:src="@drawable/example_image"
    android:contentDescription="Beispielbild"
    android:scaleType="centerCrop" />
```


## ImageView in Java
```java
ImageView imageView = findViewById(R.id.imageView);
imageView.setImageResource(R.drawable.example_image);
imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
imageView.setContentDescription("Beispielbild");
```


## ImageView in Kotlin
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