import  java.util.Scanner

fun main()
{
    pickQue()
}

fun pickQue()
{
    var pick = """
        
            KBC
            
       press 1 for Q1
       press 2 for Q2
       press 3 for Q3
       press 4 for Q4
       press 5 for Q5
       press 6 for Q6
       press 7 for Q7
       press 8 for Q8
       press 9 for Q9
       press 0 for Q10
       
"""

    print(pick)
    var choice:Int
    var sc = Scanner(System.`in`)

    print("Enter your choice : ")
    choice = sc.nextInt()


    when(choice)
    {
        1 -> Q1()
        2 -> Q2()
        3 -> Q3()
        4 -> Q4()
        5 -> Q5()
        6 -> Q6()
        7 -> Q7()
        8 -> Q8()
        9 -> Q9()
        0 -> Q10()
    }
}

fun Q1()
{
   println("Que : What is the colour of apple?")
   var options = """
      (A)Blue       (B)Black
      (C)Red        (D)Yellow
   """
   println(options)
   var ans:String
   var sc = Scanner(System.`in`)

    println("Your answer is : ")
    ans = sc.next()

    if(ans == "(C)")
   {
       print("Correct answer")
   }
    else
   {
       print("Wrong answer")
   }
}

fun Q2()
{
    println("Que : Capital of Goa is?")
    var options = """
      (A)Latur       (B)Pune
      (C)Surat       (D)Panji
   """
    println(options)
    var ans:String
    var sc = Scanner(System.`in`)

    println("Your answer is : ")
    ans = sc.next()

    if(ans == "(D)")
    {
        print("Correct answer")
    }
    else
    {
        print("Wrong answer")
    }
}

fun Q3()
{
    println("Que : what is use for print data in new line?")
    var options = """
      (A)Println()       (B)fun()
      (C)if()        (D)When()
   """
    println(options)
    var ans:String
    var sc = Scanner(System.`in`)

    println("Your answer is : ")
    ans = sc.next()

    if(ans == "(A)")
    {
        print("Correct answer")
    }
    else
    {
        print("Wrong answer")
    }
}

fun Q4()
{
    println("Que : how many catagories of function?")
    var options = """
      (A)1       (B)2
      (C)3       (D)4
   """
    println(options)
    var ans:String
    var sc = Scanner(System.`in`)

    println("Your answer is : ")
    ans = sc.next()

    if(ans == "(D)")
    {
        print("Correct answer")
    }
    else
    {
        print("Wrong answer")
    }
}

fun Q5()
{
    println("Que : 2 plus 2 is?")
    var options = """
      (A)1       (B)4
      (C)3       (D)7
   """
    println(options)
    var ans:String
    var sc = Scanner(System.`in`)

    println("Your answer is : ")
    ans = sc.next()

    if(ans == "(B)")
    {
        print("Correct answer")
    }
    else
    {
        print("Wrong answer")
    }
}

fun Q6()
{
    println("Que : dozen include?")
    var options = """
      (A)19 nos       (B)10 nos
      (C)12 nos       (D)8 nos
   """
    println(options)
    var ans:String
    var sc = Scanner(System.`in`)

    println("Your answer is : ")
    ans = sc.next()

    if(ans == "(C)")
    {
        print("Correct answer")
    }
    else
    {
        print("Wrong answer")
    }
}

fun Q7()
{
    println("Que : how you ...?")
    var options = """
      (A)living      (B)sleeping
      (C)being       (D)doing
   """
    println(options)
    var ans:String
    var sc = Scanner(System.`in`)

    println("Your answer is : ")
    ans = sc.next()

    if(ans == "(D)")
    {
        print("Correct answer")
    }
    else
    {
        print("Wrong answer")
    }
}

fun Q8()
{
    println("Que : colors in national flag are?")
    var options = """
      (A)1       (B)4
      (C)3       (D)7
   """
    println(options)
    var ans:String
    var sc = Scanner(System.`in`)

    println("Your answer is : ")
    ans = sc.next()

    if(ans == "(B)")
    {
        print("Correct answer")
    }
    else
    {
        print("Wrong answer")
    }
}

fun Q9()
{
    println("Que : what shows in twitter logo?")
    var options = """
      (A)bird      (B)fish
      (C)none       (D)camera
   """
    println(options)
    var ans:String
    var sc = Scanner(System.`in`)

    println("Your answer is : ")
    ans = sc.next()

    if(ans == "(A)")
    {
        print("Correct answer")
    }
    else
    {
        print("Wrong answer")
    }
}

fun Q10()
{
    println("Que : 1 GB = ...MB?")
    var options = """
      (A)1075       (B)1000
      (C)1024       (D)999
   """
    println(options)
    var ans:String
    var sc = Scanner(System.`in`)

    println("Your answer is : ")
    ans = sc.next()

    if(ans == "(C)")
    {
        print("Correct answer")
    }
    else
    {
        print("Wrong answer")
    }
}