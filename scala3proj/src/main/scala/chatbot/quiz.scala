package chatbot

import scala.io.StdIn._

//italian quiz
object quiz{

def italianQuiz(): String = {
 var score = 0
 println("Starting Italian Quiz...\n")

 println("1. What type of cheese is traditionally used in lasagna?")
 println(
   """
   A) Cheddar
   B) Mozzarella
   C) Feta
   D) Gouda
   """
 )
 val q1 = readLine().trim.toLowerCase
 q1 match {
   case "b" | "mozzarella" =>
     println("Correct!")
     score += 1
   case "a" | "cheddar" | "c" | "feta" | "d" | "gouda" =>
     println("Incorrect. The correct answer is B) Mozzarella.")
   case _ =>
     println("Invalid input.")
 }


 println("2. What is the main difference between gelato and regular ice cream?")
 println(
   """
   A) Gelato uses less sugar
   B) Gelato has more air
   C) Gelato uses more egg yolks
   D) Gelato is served frozen solid
   """
 )
 val q2 = readLine().trim.toLowerCase
 q2 match {
   case "a" | "gelato uses less sugar" =>
     println("Correct!")
     score += 1
   case "b" | "c" | "d" =>
     println("Incorrect. The correct answer is A) Gelato uses less sugar.")
   case _ =>
     println("Invalid input.")
 }


 println("3. Which Italian flatbread resembles pizza and is often topped with olive oil and herbs?")
 println(
   """
   A) Bruschetta
   B) Panini
   C) Focaccia
   D) Ciabatta
   """
 )
 val q3 = readLine().trim.toLowerCase
 q3 match {
   case "c" | "focaccia" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Focaccia.")
   case _ =>
     println("Invalid input.")
 }


 println("4. What is a key ingredient in traditional pesto sauce?")
 println(
   """
   A) Thyme
   B) Cilantro
   C) Basil
   D) Oregano
   """
 )
 val q4 = readLine().trim.toLowerCase
 q4 match {
   case "c" | "basil" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Basil.")
   case _ =>
     println("Invalid input.")
 }


 println("5. Which pasta resembles small grains and is often used in soups?")
 println(
   """
   A) Penne
   B) Orzo
   C) Rigatoni
   D) Farfalle
   """
 )
 val q5 = readLine().trim.toLowerCase
 q5 match {
   case "b" | "orzo" =>
     println("Correct!")
     score += 1
   case "a" | "c" | "d" =>
     println("Incorrect. The correct answer is B) Orzo.")
   case _ =>
     println("Invalid input.")
 }


 s"\nYou scored $score out of 5."
}


///mexican///


def mexicanQuiz(): String = {
 var score = 0

 println("Starting Mexican Quiz...\n")
 println("1. What are chilaquiles?")
 println(
   """
   A) Fried tacos
   B) Tortilla chips simmered in salsa
   C) Stuffed peppers
   D) Sweet corn cakes
   """
 )
 val q1 = readLine().trim.toLowerCase
 q1 match {
   case "b" | "tortilla chips simmered in salsa" =>
     println("Correct!")
     score += 1
   case "a" | "c" | "d" =>
     println("Incorrect. The correct answer is B) Tortilla chips simmered in salsa.")
   case _ => println("Invalid input.")
 }


 println("2. What is the main ingredient in guacamole?")
 println(
   """
   A) Tomato
   B) Avocado
   C) Onion
   D) Corn
   """
 )
 val q2 = readLine().trim.toLowerCase
 q2 match {
   case "b" | "avocado" =>
     println("Correct!")
     score += 1
   case "a" | "c" | "d" =>
     println("Incorrect. The correct answer is B) Avocado.")
   case _ => println("Invalid input.")
 }


 println("3. Which dish features tortillas rolled with filling and topped with chili sauce?")
 println(
   """
   A) Tostadas
   B) Enchiladas
   C) Quesadillas
   D) Empanadas
   """
 )
 val q3 = readLine().trim.toLowerCase
 q3 match {
   case "b" | "enchiladas" =>
     println("Correct!")
     score += 1
   case "a" | "c" | "d" =>
     println("Incorrect. The correct answer is B) Enchiladas.")
   case _ => println("Invalid input.")
 }


 println("4. What is the difference between a taco and a burrito?")
 println(
   """
   A) Burrito has cheese, taco doesn’t
   B) Taco uses flour tortillas only
   C) Burrito is wrapped fully, taco is folded
   D) Taco has rice inside
   """
 )
 val q4 = readLine().trim.toLowerCase
 q4 match {
   case "c" | "burrito is wrapped fully, taco is folded" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Burrito is wrapped fully, taco is folded.")
   case _ => println("Invalid input.")
 }


 println("5. What is mole?")
 println(
   """
   A) A salsa made with beans
   B) A chocolate-based savory sauce
   C) A fried pastry
   D) A spicy tomato chutney
   """
 )
 val q5 = readLine().trim.toLowerCase
 q5 match {
   case "b" | "a chocolate-based savory sauce" =>
     println("Correct!")
     score += 1
   case "a" | "c" | "d" =>
     println("Incorrect. The correct answer is B) A chocolate-based savory sauce.")
   case _ => println("Invalid input.")
 }


 s"\nYou scored $score out of 5."
}


///japan///


def japaneseQuiz(): String = {
 var score = 0
 println("Starting Japanese Quiz...\n")

 println("1. What is miso made from?")
 println(
   """
   A) Fermented tofu
   B) Fermented seaweed
   C) Fermented soybeans
   D) Fermented rice
   """
 )
 val q1 = readLine().trim.toLowerCase
 q1 match {
   case "c" | "fermented soybeans" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Fermented soybeans.")
   case _ => println("Invalid input.")
 }


 println("2. What’s the difference between sushi and sashimi?")
 println(
   """
   A) Sashimi is cooked
   B) Sushi has seaweed, sashimi does not
   C) Sushi includes rice, sashimi does not
   D) Sashimi is vegetarian
   """
 )
 val q2 = readLine().trim.toLowerCase
 q2 match {
   case "c" | "sushi includes rice, sashimi does not" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Sushi includes rice, sashimi does not.")
   case _ => println("Invalid input.")
 }


 println("3. Which broth is commonly used in ramen?")
 println(
   """
   A) Chicken noodle
   B) Dashi
   C) Bone broth
   D) Clam broth
   """
 )
 val q3 = readLine().trim.toLowerCase
 q3 match {
   case "b" | "dashi" =>
     println("Correct!")
     score += 1
   case "a" | "c" | "d" =>
     println("Incorrect. The correct answer is B) Dashi.")
   case _ => println("Invalid input.")
 }


 println("4. What is a bento box?")
 println(
   """
   A) A traditional tea
   B) A rice-based dessert
   C) A compartmental lunchbox
   D) A pickled vegetable tray
   """
 )
 val q4 = readLine().trim.toLowerCase
 q4 match {
   case "c" | "a compartmental lunchbox" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) A compartmental lunchbox.")
   case _ => println("Invalid input.")
 }


 println("5. Which item is sushi wrapped in?")
 println(
   """
   A) Lettuce
   B) Soy paper
   C) Nori (seaweed)
   D) Egg roll skin
   """
 )
 val q5 = readLine().trim.toLowerCase
 q5 match {
   case "c" | "nori" | "nori (seaweed)" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Nori (seaweed).")
   case _ => println("Invalid input.")
 }


 s"\nYou scored $score out of 5."
}
////indian////


def indianQuiz(): String = {
 var score = 0
 println("Starting Indian Quiz...\n")

 println("1. What spice is NOT commonly found in masala chai?")
 println(
   """
   A) Cardamom
   B) Ginger
   C) Turmeric
   D) Cinnamon
   """
 )
 val q1 = readLine().trim.toLowerCase
 q1 match {
   case "c" | "turmeric" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Turmeric.")
   case _ => println("Invalid input.")
 }


 println("2. Which bread is cooked in a tandoor?")
 println(
   """
   A) Paratha
   B) Roti
   C) Naan
   D) Dosa
   """
 )
 val q2 = readLine().trim.toLowerCase
 q2 match {
   case "c" | "naan" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Naan.")
   case _ => println("Invalid input.")
 }


 println("3. What is dal made from?")
 println(
   """
   A) Rice
   B) Lentils
   C) Chickpeas
   D) Potatoes
   """
 )
 val q3 = readLine().trim.toLowerCase
 q3 match {
   case "b" | "lentils" =>
     println("Correct!")
     score += 1
   case "a" | "c" | "d" =>
     println("Incorrect. The correct answer is B) Lentils.")
   case _ => println("Invalid input.")
 }


 println("4. What is paneer?")
 println(
   """
   A) A meat substitute
   B) A sweet dessert
   C) An Indian hard cheese
   D) A fermented milk drink
   """
 )
 val q4 = readLine().trim.toLowerCase
 q4 match {
   case "c" | "paneer" | "an indian hard cheese" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) An Indian hard cheese.")
   case _ => println("Invalid input.")
 }


 println("5. What is korma typically made with?")
 println(
   """
   A) Yogurt and spices
   B) Butter and garlic
   C) Tomatoes and basil
   D) Pickles and onions
   """
 )
 val q5 = readLine().trim.toLowerCase
 q5 match {
   case "a" | "yogurt and spices" =>
     println("Correct!")
     score += 1
   case "b" | "c" | "d" =>
     println("Incorrect. The correct answer is A) Yogurt and spices.")
   case _ => println("Invalid input.")
 }


 s"\nYou scored $score out of 5."
}
//american//


def americanQuiz(): String = {
 var score = 0
 println("Starting American Quiz...\n")

 println("1. What is traditionally the main meat used in a classic American cheeseburger?")
 println(
   """
   A) Pork
   B) Chicken
   C) Beef
   D) Turkey
   """
 )
 val q1 = readLine().trim.toLowerCase
 q1 match {
   case "c" | "beef" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Beef.")
   case _ => println("Invalid input.")
 }


 println("2. Which American side dish is made from shredded cabbage and dressing?")
 println(
   """
   A) Mac and Cheese
   B) Coleslaw
   C) Baked Beans
   D) Mashed Potatoes
   """
 )
 val q2 = readLine().trim.toLowerCase
 q2 match {
   case "b" | "coleslaw" =>
     println("Correct!")
     score += 1
   case "a" | "c" | "d" =>
     println("Incorrect. The correct answer is B) Coleslaw.")
   case _ => println("Invalid input.")
 }


 println("3. What type of pie is famously associated with American Thanksgiving?")
 println(
   """
   A) Apple Pie
   B) Cherry Pie
   C) Pumpkin Pie
   D) Blueberry Pie
   """
 )
 val q3 = readLine().trim.toLowerCase
 q3 match {
   case "c" | "pumpkin pie" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Pumpkin Pie.")
   case _ => println("Invalid input.")
 }


 println("4. What is a 'corn dog'?")
 println(
   """
   A) Cornbread stuffed with sausage
   B) Fried cornmeal ball
   C) Hot dog wrapped in cornbread batter and deep-fried
   D) Corn chips shaped like hot dogs
   """
 )
 val q4 = readLine().trim.toLowerCase
 q4 match {
   case "c" | "hot dog wrapped in cornbread batter and deep-fried" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Hot dog wrapped in cornbread batter and deep-fried.")
   case _ => println("Invalid input.")
 }


 println("5. What beverage is often considered the classic American soda?")
 println(
   """
   A) Sprite
   B) Pepsi
   C) Cola
   D) Root Beer
   """
 )
 val q5 = readLine().trim.toLowerCase
 q5 match {
   case "c" | "cola" =>
     println("Correct!")
     score += 1
   case "a" | "b" | "d" =>
     println("Incorrect. The correct answer is C) Cola.")
   case _ => println("Invalid input.")
 }


 s"\nYou scored $score out of 5."
}



def found_and(input: String): String = {
  var matched = false
  var result = ""

  if (List("italy", "italian", "pasta", "pizza").exists(input.contains)) {
    result = italianQuiz()
    matched = true
  }
  if (List("mexico", "mexican", "taco", "burrito").exists(input.contains)) {
    result = mexicanQuiz()
    matched = true
  }
  if (List("japan", "japanese", "sushi", "ramen").exists(input.contains)) {
    result = japaneseQuiz()
    matched = true
  }
  if (List("india", "indian", "curry", "masala").exists(input.contains)) {
    result = indianQuiz()
    matched = true
  }
  if (List("america", "american", "burger", "bbq").exists(input.contains)) {
    result = americanQuiz()
    matched = true
  }

  if (!matched) "Sorry, I couldn't match any cuisine." else result
}

def found_or(input: String): String = {
  if (List("italy", "italian", "pasta", "pizza").exists(input.contains)) {
    italianQuiz()
  } else if (List("mexico", "mexican", "taco", "burrito").exists(input.contains)) {
    mexicanQuiz()
  } else if (List("japan", "japanese", "sushi", "ramen").exists(input.contains)) {
    japaneseQuiz()
  } else if (List("india", "indian", "curry", "masala").exists(input.contains)) {
    indianQuiz()
  } else if (List("america", "american", "burger", "bbq").exists(input.contains)) {
    americanQuiz()
  } else {
    "Sorry, I couldn't match any cuisine."
  }
}
def iwantquiz(): String = {
  println("Which cuisine(s) would you like to take a quiz on?")
  val input = readLine().toLowerCase

  if (input.contains(" and ")) {
    found_and(input)
  } else if (input.contains(" or ")) {
    found_or(input)
  } else {
    found_and(input)
  }
}
}
