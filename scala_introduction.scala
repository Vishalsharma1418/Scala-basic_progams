// Databricks notebook source
//                                       First session Scala


println("Hello world")

// val is like a constant we cannot change
val a:Int =5

 val b:String="Vishal sharma"
println(b)


// var is like a variable we can change 
var c:String = "Hello World"
println(c)


c ="Hello Vishal"
// Data Types  in Scala

//Type inference means that scala compiler will infer automatically 
val numberOne : Int = 60
val numberTwo= 55

val d:Boolean =true
val e=true

val f: Char ='a'
val g='a'


val pi:Double =3.1415
val pia=3.9879

val piSinglePrecistion : Float =3.145f
val piSinglePrecistion1=2.97378f

val h: Long= 82828
val i=74764

val smalNumber : Byte =127

var df=1231232323
println(df)

println("Concatination result:"+ numberOne + d + f + pi + piSinglePrecistion + h + smalNumber)

// COMMAND ----------

val a="vishal"

// COMMAND ----------

// S interpolation , f interpolation , raw interpolation

var name:String ="Sumit"
println("hello $name how are you  ")
println(s"hello $name how are you  ")

// f interpolation is same as printf style
var pi=3.14767
println(f"Value of pi  $pi%.3f")


// raw interpolation
println("Hello how \n are you ")
println(raw"Hello how \n are you")


val abc =1 >2;
println(abc)

//String comparision , 
val x :String ="Vishal"
val y :String ="Vishal"
val z:Boolean =x == y


// COMMAND ----------

//If else

if(1>5){
  println("Hello")
}
else{
  println("There")
}

//If we one expression then we can reduce
if(1>5) println("Hello")else println("There")


//MATCH CASE (SWITCH )
val num=6
num match{
  case 1=> println("One")
  case 2 => println("Two")
  case 3 => println("three")
  case _ => println("Something else")
}

// COMMAND ----------

//For loop

for(x <- 1 to 10){
  val squared=x*x
  println(squared)
}


//While loop

var i=0
while(i<=10){
  println(i)
  i=i+1
}




//Do while


do{
  println(i)
  i=i+1
}while(i<=10)

// It will retrun last statement
{
  val r=10
  r+10
  40
}

// COMMAND ----------

// in a block last statement retrun
println({val x=10 ; x+20})

// COMMAND ----------

//In scala supports two types programming style
//1. functional programming
//2. object oriented programming

//def squared(x :Int):Int = { 
 // x*x
  //}

//we can write in this way
def squaredIt(x:Int)= x*x
println(squaredIt(4))

def cubeIt(x:Int):Int ={x*x*x}
 println(cubeIt(4))

//We can pass function in this parameter 
def tranformInt(x:Int ,f:Int =>Int): Int= {
  f(x) //squaredIt(3)
}
println(tranformInt(3,squaredIt))
println(tranformInt(3,cubeIt))

//Anonymous Function//Anonymous Function
//A Function wihtout any name.
// This one time use 
println(tranformInt(2, x => x*x*x*x))

// COMMAND ----------

def tranformInt(x:Int ,f:Int =>Int): Int= {
  f(x) //squaredIt(3)
}

def dividedbyTwo(x:Int)={
x/2
}
dividedbyTwo(80)

tranformInt(4,x=>x/2)


tranformInt(2, x=>{val y=x*2 ; y*y})


// COMMAND ----------

// DBTITLE 1,Scala Collections
//Scala Collections
//Collections means holds more than one values

//Array:-

//Array can be referenced by index and it is 0 based
//mutable means we can change the value of array 
//searching based on index is very fast
//adding a new element is tricky andis inefficient operation.
//we can not change existing array but we can change only index based values of array

val a=Array(1,2,3,4,5)
// println(a.mkString(" +"))
for(i<- a)
// println(i)
a(2)=200

//List:- It contains same data types of elements and varitey of system define function.
//internally holds the elements in a singly  linked list.
//searching is not efficient
//but adding a new element specially at the starting 

val b= List(1,2,3,4,5)
println(b.head)
println(b.tail)

for( i<-b){
  println(i)
}

println(b.reverse)
println(b.sum)
10::b //addded new element at the begnning of the list

//Tuple:- hold element different data types
// we can treat a tuple like a record in database\
//Very commonly used in scala and handy
//ARRAY AND LIST STAT FROM 0 BASED INDEX
//but in  case of tuple it start at 1 index




val x=("Vishal",20000, true)
x._1 //get the first element from tuple
x._2//get the second element from tuple

// if we have tuples of two element and this can be consider as a special case
//The first element can be treated key and second is values

val y=("Vishal" ,50000)
// both the statement are same but there are different type of style
val z=107-> "Vishal"

//Range:-
//we can specify a range of vales
val rng1 = 1 to 12  //12 is exclude
val rng = 'A' until 'Z'
for(i<- rng)
println(i)

//Set:- Holding only unique values.
// can not hold duplicates
// order is not mantained.

val bc =Set(1,1,2,2,2,2,3,4,5,6)
bc.min
bc.max



// only array are mutable and other are immutable 

// COMMAND ----------

// DBTITLE 1,scala 

what is scala?
scala is a hybird programming  language (oops + functional programming)
functional aspect is the we will be concentrating more on .

why scala?
functional programming
scripting approach
concise

what is functional programming language?
Any programming language which support pure function and immutable values

Note: functional programming is very good fit when we talk about library desgine and data crunching activities.

Spark developers used scala to create spark libaries.

What is a function?
a function relates an input to a output
a= sqrt(4)
a=2
 input is 4
output is 2

What is a pure function?
a. the input solely determines the output
b. the function does not change its input value
c. there are no side effects, this means the function only to whatever it is inteneded
for it. it does not do anything extra.

a.
var a=5;
def func1(i:Int):Int={retrun a+i } impure function because it is depended on external variavle 
def func1(i:Int, a:Int):Int ={retrun a+i} pure function 





b.
def func1(a:Int)={a=a+1; retrun a} //impure function 

def func1(a:Int) ={ return a+1 } //pure function 

c.

def func1(a:Int) = {println("Hello") retrun a} impure function we are doing unneccessary thing like print statment
def func1(a:Int) = {retrun a}pure function 

// COMMAND ----------

var a=5
def func1(i:Int) : Int={ return a+i}  // Impure function
func1(3)

def func2(i:Int):Int ={ return i+1} // pure function 


// COMMAND ----------

Is there any easy  way to test the purity of a function
referentail transparency
A function is referenetialy transparent if replacing the function with a value do not impact the result 


// COMMAND ----------

//First class function :-
//=================================
//whatever we were able to do with  values in traditional programming, same thing we should be able to do wiht the fucntion as well.

//we should be able to treat functions like values.
//It is support three charateritcis:

//1 . we should be able to assing a function to a variable
def doubler(i:Int):Int={ i*2}
var a=doubler(_)
a(2)


//2.we should be able to pass a function  as parameter to the functions
def trippler (i:Int): Int={i*3}
def func1(i:Int,f:Int=> Int)={f(i)}
println(func1(5, trippler))


//3. we should be able to return a function from a function.
def go={
  x:Int => x*x
}
go(4)

// COMMAND ----------

//Higher order function:-
================================

//A function which either take a function as input parameter or return another function as its output

//map :- if we have n input rows, then we will get n output rows also.

var ac = 1 to 10
def doubler (i:Int):Int = {i*2}
//Map has one to one co-relate 
ac.Map(doubler)

// COMMAND ----------

//5. Anonymous function
A function wihtout a name
var an= 1 to 10
 an.map(x=> x*2)

// COMMAND ----------

//6. Immutability 
we can not change the values
but immutability is more preferred.


// COMMAND ----------

//7. loop vs recursion vs tail recursion

//Loop
def fact(input:Int):Int={
  var result:Int = 1
  for(i<- 1 to input)
  {
    result=result *i
  }
  result
}
fact(5)


//recursion
def fact1(input:Int):Int={
  if(input==1) 1   // not efficient is purpose of memory 
  else input * fact1(input-1)
}
fact1(4)


//tail recurision 

def fact2(input:Int , result:Int):Int={
  if(input==1) result
  else fact2(input-1, result*input)
  }
//what tail recursion say is that the recurisve call should be the last statement in the function


//working 
//fact2(4,1)
//fact2(3,4)
//fact2(2,12)
//fact(1,24)


13. //statement vs expression
//each line in a code is a statement
//expression is a line of code that return something
//in scala we do not have statement and we have only expression
println("h")

// COMMAND ----------

println(" ")

val a =22
val x = if (a==5) 5 else 8

// COMMAND ----------

//session 3
//1. closure

//in functional progamming a function can return a function.
//in object oriented programming we could have return object.

def areaofcircle={val pi=3.14; (x:Int)=>pi*x*x}
val pi=8.9
areaofcircle(10)





// COMMAND ----------

//2. Scala type system
                  Any
 
Anyval :-             

Byte 
short
Int 
Long 
Float 
Double

Unit()
Booolean 
Char

AnyRef:-
 
List
seq
tuple

String

Null:- Null is valid for only AnyRef
Nothing:-




// COMMAND ----------

val a=5
val b:Int =20
val c=println("Hello")
val d= if(a==5)1 else 2.0
val e = if(a==5)1 else println("hello")
val f = if(a==5) println("hello")
val g = if(a==5) 'a' else 6000
val h = if(a==5) 3 else List(1,2,3,4)

// COMMAND ----------

//3.operators
//in scala do not have operator we have only method and function
val a=1
val b=5
a.compare(b)
a.+(b)
a.*(b)
a compare b

// COMMAND ----------

//Anoymnous Function
//A function without name
val a=10 to 20
a.map((x:Int)=>{x*x})

// COMMAND ----------

Last statement of expression block is the return statement 

// COMMAND ----------

//Place holder syntax
val a=1 to 100

//a.map((x:Int )=>x*2)
println(a.map( _*2))



//a.reduce((x:Int ,y:Int)=> x+y) reduce always takes two values input 
a.reduce(_+_)

// COMMAND ----------

//partially applied funcions
//This is an act of creating brand new fucntion by fixing one or more parameter in a function 
def div(x:Double ,y:Double)={x/y}
div(10,2)
val inv = div(1,_:Double) //fixed on parameter with constant


def sum(x:Int, y:Int)={x+y}
sum(10,20)
val sum1=sum(1,_:Int)
sum1(12)


// COMMAND ----------

//partailly applied 
def goe(x:Int, y:Int, f:Int=>Int)={
  f(x)+f(y)
}
goe(2,3,x=>x)
goe(2,3,x=>x*x)
goe(2,3, x=>x*x*x)


val sumofsquare=goe(_:Int,_:Int,x=>x*x)
sumofsquare(2,3)

// COMMAND ----------

//Currying function
Logic group of parameters
def genericsum(x:Int, y:Int) (f:Int=>Int)={
  f(x)+ f(y)
}

def genericsum (f:Int=>Int)(x:Int, y:Int)={
  f(x)+ f(y)
}
genericsum(2,3)(x=>x)

// COMMAND ----------

println("Enter the number of customer selected")
val a = 5
val b= List(22,36,49,66,77)
  

// COMMAND ----------

val a=("student",90,"DDDd","ffff")
a._2


// COMMAND ----------

import scala.io.stdin
def main(Agr:Array[String]){
  //taking number of customer as input
  val newCustomer=readInt()
  //second line as input 
  val biilAmount:String =readLine()
  val billAmt=biilAmount.split(" ").map(x=>x.toInt)
  var count=0
  for(i<- billAmt){
    val sqrt=Math.sqrt(i)
    if(sqrt.ceil - sqrt==0){
      count=count+1
    }
  }
  println(count)
}

// COMMAND ----------


