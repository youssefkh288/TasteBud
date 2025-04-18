file:///C:/Users/HP/Documents/TasteBud/scala3proj/src/main/scala/Chatbot.scala
### java.lang.AssertionError: NoDenotation.owner

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
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
  parseInput(input).flatap {
    case "italian" => 
      val facts = List(
        "Uses olive oil, tomatoes, and pasta",
        "Pizza Margherita was named after a queen",
        "Known for risotto and gelato"
      )
      s"Italian cuisine: ${facts(scala.util.Random.nextInt(facts.size))}"

    case "japanese" => 
      "Japanese food emphasizes seasonality. Did you know? " + 
      List(
        "Sushi originated as preserved fish",
        "Matcha powder comes from shade-grown tea leaves"
      ).head

    case "saffron" =>
      "Saffron: " + List(
        "World's most expensive spice by weight",
        "Takes 75,000 flowers to make 1 pound",
        "Imparts golden color to paella and biryani"
      ).mkString("\n- ")
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
    aliases.exists(normalized.contains) || normalized.contains(mainKey)
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



#### Error stacktrace:

```
dotty.tools.dotc.core.SymDenotations$NoDenotation$.owner(SymDenotations.scala:2607)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.isSelfSym(SymDenotations.scala:715)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse(ExtractSemanticDB.scala:322)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.fold$1(Trees.scala:1636)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.apply(Trees.scala:1638)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.foldOver(Trees.scala:1669)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.traverseChildren(Trees.scala:1771)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse(ExtractSemanticDB.scala:443)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.foldOver(Trees.scala:1677)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.traverseChildren(Trees.scala:1771)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse(ExtractSemanticDB.scala:443)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.fold$1(Trees.scala:1636)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.apply(Trees.scala:1638)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.foldOver(Trees.scala:1675)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.traverseChildren(Trees.scala:1771)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse(ExtractSemanticDB.scala:443)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse$$anonfun$13(ExtractSemanticDB.scala:383)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse(ExtractSemanticDB.scala:378)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.foldOver(Trees.scala:1669)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.traverseChildren(Trees.scala:1771)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse(ExtractSemanticDB.scala:443)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.foldOver(Trees.scala:1724)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.traverseChildren(Trees.scala:1771)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse(ExtractSemanticDB.scala:346)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse$$anonfun$11(ExtractSemanticDB.scala:369)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse(ExtractSemanticDB.scala:369)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.apply(Trees.scala:1770)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.foldOver(Trees.scala:1728)
	dotty.tools.dotc.ast.Trees$Instance$TreeAccumulator.foldOver(Trees.scala:1642)
	dotty.tools.dotc.ast.Trees$Instance$TreeTraverser.traverseChildren(Trees.scala:1771)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse(ExtractSemanticDB.scala:343)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse$$anonfun$1(ExtractSemanticDB.scala:307)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:334)
	dotty.tools.dotc.semanticdb.ExtractSemanticDB$Extractor.traverse(ExtractSemanticDB.scala:307)
	dotty.tools.pc.SemanticdbTextDocumentProvider.textDocument(SemanticdbTextDocumentProvider.scala:36)
	dotty.tools.pc.ScalaPresentationCompiler.semanticdbTextDocument$$anonfun$1(ScalaPresentationCompiler.scala:242)
```
#### Short summary: 

java.lang.AssertionError: NoDenotation.owner