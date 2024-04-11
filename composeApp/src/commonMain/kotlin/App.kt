import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Info
import androidx.compose.material.icons.twotone.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

val roundedIcons = Icons.TwoTone

@Preview
@Composable
fun App() {
    MaterialTheme {
        val background = Color(37,37,37)
        Box(modifier = Modifier
            .fillMaxSize()
            .background(background)
        ) {
            Home()
            Empty()
        }
    }
}

@Preview
@Composable
fun Home(){
    val buttonBackground = Color(59,59,59)
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 47.dp)
    ) {
        Text(
            text = "Notes",
            modifier = Modifier
                .padding(24.dp, 0.dp, 0.dp, 0.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 43.sp
        )
        Button(
            onClick = {},
            border = BorderStroke(1.dp, Color.Black),
            shape = RoundedCornerShape(15),
            colors = ButtonDefaults.buttonColors(buttonBackground),
            modifier = Modifier
                .size(width = 50.dp, height = 50.dp)
        ) {
            Icon(
                roundedIcons.Search,
                contentDescription = null,
                modifier = Modifier
                    .size(width = 24.dp, height = 24.dp)
            )
        }
        Button(
            onClick = {},
            border = BorderStroke(1.dp, Color.Black),
            shape = RoundedCornerShape(15),
            colors = ButtonDefaults.buttonColors(buttonBackground),
            modifier = Modifier
                .size(width = 50.dp, height = 50.dp)
        ) {
            Icon(
                roundedIcons.Info,
                contentDescription = "",
                modifier = Modifier
                    .size(width = 24.dp, height = 24.dp)
            )
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Preview
@Composable
fun Empty(){
    Image(
        painter = painterResource(R.drawable.emptyhome),
        contentDescription = "Forest Image",
    )

    Text(
        text = "Create your first note !",
        modifier = Modifier
            .padding(109.dp, 576.dp, 110.dp, 293.dp)
    )
}
