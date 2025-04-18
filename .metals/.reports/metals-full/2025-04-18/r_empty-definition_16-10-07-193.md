error id: scala/collection/immutable/List#exists().
file:///C:/Users/HP/Documents/TasteBud/scala3proj/src/main/scala/Chatbot.scala
empty definition using pc, found symbol in pc: scala/collection/immutable/List#exists().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -aliases/exists.
	 -aliases/exists#
	 -aliases/exists().
	 -scala/Predef.aliases.exists.
	 -scala/Predef.aliases.exists#
	 -scala/Predef.aliases.exists().
offset: 1254
uri: file:///C:/Users/HP/Documents/TasteBud/scala3proj/src/main/scala/Chatbot.scala
text:
```scala
import scala.io.StdIn
import scala.util.Try


def greetUser(): String = {
    "type cuisine names or bye to exit. (hnzawed hena)"
    //haga zy hello msh 3aref eh w instruction manual b3daha
}

def handleUserInput(input: String): Option[String] = {
  parseInput(input).flatMap {
    case "italian" => Some("Italian cuisine uses olive oil...")
    case "japanese" => Some("Japanese food emphasizes seasonality...")
    case "saffron" => Some("Saffron (the world's priciest spice)...")
    //case "quiz" => Some(runQuiz())

    case "thanks"|"thank" => Some("You're Welcome.")
    case _ => None
  }
}

// def parseInput(input: String): Option[String] = {
//   val keywords = List("italian", "japanese", "saffron", "quiz","thanks","thank") // List of keywords
//   keywords.find(keyword => input.toLowerCase.contains(keyword))
// }
def parseInput(input: String): Option[String] = {
  val normalized = input.toLowerCase
  val cuisineKeywords = Map(
    "italian" -> List("italy", "pasta", "pizza"),
    "japanese" -> List("japan", "sushi", "ramen"),
    "saffron" -> List("spice", "yellow spice"),
    "thanks"-> List("thank","thank you","shokran")
  )
  
  cuisineKeywords.find { case (mainKey, aliases) =>
    aliases.ex@@ists(normalized.contains) || normalized.contains(mainKey)
  }.map(_._1)
}

def generateResponse(input: String): String = {
  handleUserInput(input).getOrElse(
    "I don't understand. Try: 'italian', 'japanese', 'saffron', or 'quiz'."
  )
}
// case class QuizQuestion(question: String, options: List[String], answer: String)

// val foodQuiz = List(
//   QuizQuestion(
//     "Which country invented tempura?",
//     List("China", "Portugal", "Japan"),
//     "Portugal"
//   )
// )

// def runQuiz(): String = {
//   foodQuiz.map { q =>
//     println(s"Q: ${q.question}")
//     q.options.zipWithIndex.foreach { case (opt, i) => 
//       println(s"${i+1}. $opt") 
//     }
//     Try(StdIn.readLine("Your answer (number): ").toInt).toOption match {
//       case Some(n) if q.options.indices.contains(n-1) =>
//         if (q.options(n-1) == q.answer) "✅ Correct!" 
//         else s"❌ Correct answer: ${q.answer}"
//       case _ => "⚠️ Invalid input"
//     }
//   }.mkString("\n")
// }


def main(args: Array[String]): Unit = {  
println(greetUser())

  
  var running = true
  while (running) {
    println("\nYou: ")
    val input = StdIn.readLine()
    
    input.trim.toLowerCase match {
      case "bye" | "exit" | "goodbye" | "salam" =>
        running = false
        println("TasteBud: Goodbye... <3")
        
      case _ =>
        println(s"TasteBud: ${generateResponse(input)}")
    }
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/collection/immutable/List#exists().