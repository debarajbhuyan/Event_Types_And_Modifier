Some examples of interaction events in Jetpack Compose include clicks, long presses, and drag-and-drop.  A concepts in application development is user interaction.  Interaction events are triggered when a user interacts with a UI element. These events can be handled by the developer to provide a response to the user's actions.

1 (The clickable modifier):- Most commonly used event modifiers is the "clickable" modifier. A function to be executed when a user clicks or touches on a specific composable 
e.g:- modifier = Modifier.clickable {  })

2 (The combine clickable modifier):- This event modifier for providing additional options or actions for a composable. by one function to normal click and another function to Long Press.
e.g:- modifier = Modifier.combinedClickable ( onClick = {  }, onLongClick = {  } )

3 (The draggable modifier):- This modifier allows for the detection of drag gestures, allowing for the implementation of drag-and-drop functionality within a UI.
