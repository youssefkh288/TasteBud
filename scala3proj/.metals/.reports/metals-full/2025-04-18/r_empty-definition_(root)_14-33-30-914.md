error id: `<none>`.
file:///C:/Users/HP/Documents/scalaproj/scala3proj/src/main/scala/Chatbot.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 117
uri: file:///C:/Users/HP/Documents/scalaproj/scala3proj/src/main/scala/Chatbot.scala
text:
```scala

def respond(input: String): String = input.trim.toLowerCase match {  
  // Greetings  
  case "hi" | "hello" => "@@Hello! Ask me about cuisines (e.g., Italian, Japanese)."  

  // Cuisine Facts  
  case "italian" => "Italian cuisine uses olive oil, tomatoes, and pasta. Fun fact: Pizza Margherita was named after a queen!"  
  case "japanese" => "Japanese food emphasizes seasonality. Sushi originally came from Southeast Asia!"  

  // Ingredients  
  case "saffron" => "Saffron (the world's priciest spice) comes from crocus flowers. Used in Spanish paella and Persian rice."  

  // Default  
  case _ => "Try: 'Italian', 'Japanese', or 'saffron'."  
}  



def main(args: Array[String]): Unit = {  
  println("Food Bot: Hi! Type 'cuisines' for options or 'bye' to exit.")  
  while (true) {  
    val input = scala.io.StdIn.readLine("You: ")  
    if (input == "bye") System.exit(0)  
    println(s"Bot: ${respond(input)}")  
  }  
}  
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.