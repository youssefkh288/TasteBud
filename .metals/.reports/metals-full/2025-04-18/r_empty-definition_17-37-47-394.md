error id: scala/package.List.
file:///C:/Users/HP/Documents/TasteBud/scala3proj/src/main/scala/Chatbot.scala
empty definition using pc, found symbol in pc: scala/package.List.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -List.
	 -List#
	 -List().
	 -scala/Predef.List.
	 -scala/Predef.List#
	 -scala/Predef.List().
offset: 4454
uri: file:///C:/Users/HP/Documents/TasteBud/scala3proj/src/main/scala/Chatbot.scala
text:
```scala
import scala.io.StdIn
import scala.util.Try


def greetUser(): String = {
    "type cuisine names(ex. italian, japanese,saffron) or bye to exit. (hnzawed hena)"
    //haga zy hello msh 3aref eh w instruction manual b3daha
}

def handleUserInput(input: String): Option[String] = {
  parseInput(input).flatMap {
    case "italian" => 
      val facts = List(                                               //NEZAWED OPTIONS HENA
        "Uses olive oil, tomatoes, and pasta",
        "Pizza Margherita was named after a queen",
        "Known for risotto and gelato"
      )
      Some(s"Italian cuisine: ${facts(scala.util.Random.nextInt(facts.size))}")

    case "japanese" => 
      Some("Japanese food emphasizes seasonality. Did you know? " + //W HENA
      List(
        "Sushi originated as preserved fish",
        "Matcha powder comes from shade-grown tea leaves"
      ).head)

    case "saffron" =>                                                 // W HENA
      Some("Saffron: " + List(
        "World's most expensive spice by weight",
        "Takes 75,000 flowers to make 1 pound",
        "Imparts golden color to paella and biryani"
      ).mkString("\n- "))

    case "indian" =>
        val facts = List(
          "Turmeric in curry has anti-inflammatory properties",
          "Biryani was created for Mughal emperors",
          "Chai means 'tea' in Hindi - what we call 'chai tea' is redundant",
          "Naan bread is traditionally cooked in a tandoor oven"
        )
        Some(s"Indian food: ${facts(scala.util.Random.nextInt(facts.size))}")
    
    case "truffle" =>
        Some("""Truffle trivia:
- Grow underground near tree roots
- Hunted with trained pigs or dogs
- White truffles can cost $3,000 per pound
- The aroma fades quickly after harvesting""".stripMargin)

    case "miso" =>
        Some("""Miso information:
- Fermented soybean paste aged months to years
- White miso is sweeter, red miso is saltier
- Contains probiotics for gut health
- Base for miso soup and marinades""".stripMargin)

    case "etiquette" =>
        val tips = List(
          "Japan: Never pass food chopstick-to-chopstick",
          "Italy: Don't cut pasta - twirl it with a fork",
          "India: Eat with your right hand only",
          "Mexico: Tacos are finger food - no utensils!"
        )
        Some(s"Dining etiquette: ${tips(scala.util.Random.nextInt(tips.size))}")

    case "recipe" =>
       recipes()

    case "health" =>
        val facts = List(
          "Olive oil contains heart-healthy monounsaturated fats",
          "Fermented foods like miso support gut microbiome",
          "Turmeric has anti-inflammatory compound curcumin",
          "Wasabi has antimicrobial properties"
        )
        Some(s"Health benefit: ${facts(scala.util.Random.nextInt(facts.size))}")
    //case "quiz" => Some(runQuiz())

    case "thanks"|"thank" => Some("You're welcome.") // W HENA
    // W HENA NEZAWED HAGAT KTEER 
    case _ => None
  }
}

//prototype func bs msh pure
def recipes(): Option[String] = {
var input2 = StdIn.readLine("Enter 'options' to show you the available recipes or 'R' for a random one.\n")

if(input2=="options" ){
  println("\n 1.Carbonara\n 2.Guacamole\n 3.Chai\n 4.Sushi rice\n")
  input2 = StdIn.readLine()}

input2.trim.toLowerCase match{
 
  case "carbonara" | "1" => Some("Eggs, pecorino, guanciale, black pepper.\n")
  case "guacamole" | "2"=> Some("Mash avocados with lime, onion, cilantro\n")
  case "chai" | "3" =>Some("Simmer black tea with ginger, cardamom, milk\n")
  case "sushi rice" | "4" =>Some("Short-grain rice with rice vinegar and sugar\n")
  case "r" => 
    val recipes = List(
          "Carbonara: Eggs, pecorino, guanciale, black pepper",
          "Guacamole: Mash avocados with lime, onion, cilantro",
          "Chai: Simmer black tea with ginger, cardamom, milk",
          "Sushi rice: Short-grain rice with rice vinegar and sugar"
        )
       Some(s"Try this recipe: ${recipes(scala.util.Random.nextInt(recipes.size))}")
  case _ => None
}
}

def parseInput(input: String): Option[String] = {
  val normalized = input.toLowerCase
  val Keywords = Map(
    "italian" -> List("italy", "pasta", "pizza"),
    "japanese" -> Li@@st("japan", "sushi", "ramen"),
    "saffron" -> List("spice", "yellow spice"),
    "mexican" -> List("taco","mole","tequila","churros"),
    "indian"-> List("curry","biryani","masala","chai"),
    "truffle"->List("fungus","white truffle"),
    "etiquette" -> List("manners", "dining customs"),
    "recipe" -> List("how to make", "cook", "prepare","recipes"),
    "health" -> List("healthy", "nutrition", "benefits"),
    "thanks"-> List("thank","thank you","shokran")
  )
  
  Keywords.find { case (mainKey, aliases) =>
    aliases.exists(normalized.contains) || normalized.contains(mainKey)
  }.map(_._1)
}

def generateResponse(input: String): String = {
  handleUserInput(input).getOrElse(
    "I don't understand. Say help if you want me to show you the available options."
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
      case "hi"|"hello"|"hey" => println("Hello! What can I help you with? \n")
      case "help" => println("current options: italian, japanese, saffron, indian, truffle, mexican, and meso. " +
        "\n You can also ask for random recipes, random etiquette tips or nutrition facts.")
      case "bye" | "exit" | "goodbye" | "salam" =>
        running = false
        println("TasteBud: Goodbye... <3")
        
      case _ =>
        println(s"\nTasteBud: ${generateResponse(input)}")
    }
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/package.List.