package mata.devraj.eventtypesandmodifier

import android.util.Log
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DraggableModifier(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth().padding(top= 280.dp)
    ) {
        val state = rememberDraggableState{
        }

        Text(text = "3:- Here is the example of The Draggable Modifier")

        Box(modifier = Modifier.draggable(
            state = state,
            orientation = Orientation.Vertical,
            onDragStarted = { Log.d("Box", "Starting Drag") },
            onDragStopped = { Log.d("Box", "Finishing Drag") }
        ))
    }
}