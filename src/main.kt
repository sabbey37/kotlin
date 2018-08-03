import com.rsk.Person

fun main(args: Array<String>) {
    var myvalues = 1..10

    for(i in 1..10) {
        println(i)
    }

    println("Hello, You!")

    val q:Question = Question()
    // safe operator(?) == tests if q is null before performing operation
    q.Answer = "42"
    q.display()

    // val === immutable
    val kevin = Person("Kevin")
    println("The answer is ${q.Answer}")

    kevin.Name = "Steve"

    println("Name is ${kevin.Name}")
    kevin.display()
    kevin.displayWithLambda(::printName)

    // You can do simple comparisons with equality operator (vs. ".equals")
    // You can use if statements as expressions, assign results back to val/var in code
    // Null cannot be a value of a non-null type string (unless we tell compiler something can take on null value)
    var message = if(q.Answer == q.CorrectAnswer) {
        "You were correct"
    } else {
        "Try again?"
    }

    println(message)

    q.printResult()

    val number:Int? = try {
        Integer.parseInt(q.Answer)
    } catch (e:NumberFormatException) {
        null
    }

    print("Number is $number")
}

class Question {
    // String? == answer could possibly be null
    var Answer: String? = ""
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to live, the universe, and everything?"

    fun display() {
        println("you said $Answer")
    }

    fun printResult() {
        when (Answer) {
            CorrectAnswer -> print("you were correct!")
            else -> print("Try again?")
        }
    }
}

fun printName(name: String) {
    println(name)
}