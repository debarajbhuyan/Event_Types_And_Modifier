package mata.devraj.eventtypesandmodifier

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CombineClickableModifier(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth().padding(top= 160.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
    ) {
        val normalClicks = remember { mutableStateOf(0) }
        val longClicks = remember { mutableStateOf(0) }

        Text(text = "2:- Here is the example of The Combine Clickable Modifier")
        Text(text = "Normal Click Here: " + normalClicks.value.toString() + "\n Long Press Here: " + longClicks.value.toString(),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .combinedClickable (
                    onClick = { normalClicks.value += 1 },
                    onLongClick = { longClicks.value += 1 } )
        )
        Spacer(modifier = Modifier.width(20.dp))
    }
}