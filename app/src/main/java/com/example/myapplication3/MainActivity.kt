package com.example.myapplication3

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.time.chrono.HijrahChronology
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button_ok)
        button.setOnClickListener {
            Toast.makeText(this, getString(R.string.toastmessage), Toast.LENGTH_LONG).show()
        }
        val toast: TextView = findViewById(R.id.textview)
        toast.setOnClickListener {
            showtoast()
        }

        //simple message display
        Log.d("hello", "hello..")
        //variable declaration
        //var value we can change & val value can't change it is constant
        var name: String = "vishal"
        val age: Int = 21
        val xyz = """
             vishal   
                 To  
           prajapati  
                    """
        Log.d("variable", name + age + xyz)
        //Type Conversion
        var va = 10
        val n1: Long = va.toLong()
        Log.d("TypeCon", n1.toString())
        //Operator
        //Arithmetic Operator
        val x = 26
        val y = 96
        Log.d("Add", (x + y).toString())
        Log.d("Sub", (x - y).toString())
        Log.d("Mul", (x * y).toString())
        Log.d("Div", (x / y).toString())
        //relational Operator < ,>, = ,>= ,<=
        val v = 20
        val i = 55
        if (v > i) {
            Log.d("relation", "v is greater value")
        } else {
            Log.d("relation", "i is greater value")
        }
        //Assignment operator
        var q = 3
        val p = 2
        q *= p
        Log.d("Assign", q.toString())
        q += p
        Log.d("Assign", (+q).toString())
        q -= p
        Log.d("Assign", (-q).toString())
        // Unary operator
        Log.d("unary", q++.toString())
        Log.d("unary", q--.toString())
        //Logical Operator
        var a = 25
        var b = 20
        var c = 30
        var flag = false
        var result: Boolean = (a > b) && (a > c)
        Log.d("logical", result.toString())
        result = (a > b) || (a > c)
        Log.d("logical", result.toString())
        result = !flag
        Log.d("logical", result.toString())
        //Condition if,else,nested if else
        if (a > b) {
            Log.d("loop", "a is big value")
        }
        //if -else
        if (a > b) {
            Log.d("ifelse", "a is big value")
        } else {
            Log.d("ifelse", "b is big value")
        }
        //nested if else
        val n = 25
        val m = 20
        if (n == 25) {
            if (m == 20) {
                Log.d("nested", "$n and $m")
            }
        }
        //When is also same as Switch statement
        when (4) {
            1 -> Log.d("when", "one")
            2 -> Log.d("when", "two")
            3 -> Log.d("when", "three")
            4 -> Log.d("when", "four")
            5 -> Log.d("when", "five")
            else -> Log.d("when", "Invalid")
        }
        //Loop for , do-while
        val marks = arrayOf(80, 85, 60, 90, 70)
        for (item in marks) {
            Log.d("forloop", item.toString())
        }
        //dowhile
        var w = 0;
        do {
            Log.d("dowhile", w.toString())
            w++
        } while (w < 10)

        //break and continue
        var e = 0
        while (e < 10) {
            Log.d("break", e.toString())
            e++
            if (e == 4) {
                break
            }
        }
        while (e < 10) {
            Log.d("continuous", e.toString())
            e++
            if (e == 4) {
                continue
            }
        }
        //function
        fun addNumber(a: Int, b: Int) {
            val add = a + b
            Log.d("fun", add.toString())
        }
        addNumber(10, 2)
        //Array Concept
        var nam = arrayOf("parth", "anuj", "Vishal", "ram", "raj")
        Log.d("array", nam.size.toString())

        if ("Vishal" in nam) {
            Log.d("arrayif", "Data is Found")
        } else {
            Log.d("arrayif", "Data is Not-Found")
        }
        //class and object
        //class className(){..}       for creating class
        //var objName = className()   for creating the object
        class per_name() {
            var name: String = ""
            var age: Int = 0
        }

        var ob1 = per_name()
        ob1.name = "Vishal"
        ob1.age = 21
        var ob2 = per_name()
        ob2.name = "Parth"
        ob2.age = 21
        Log.d("classob", ob1.name)
        Log.d("classob", ob1.age.toString())
        Log.d("classob", ob2.name)
        Log.d("classob", ob2.age.toString())
        //Constructor
        class myClass(password: String) {
            constructor(name: String, id: Int, password: String) : this(password) {
                Log.d("cons", "Name=${name}")
                Log.d("cons", "Id=${id}")
                Log.d("cons", "password=${password}")

            }
        }

        val myclass = myClass("Vishal", 17, "Vishal123")

        //Inheritance (we used the uper calss data in lower class )
        //we used the : for extend
        open class uper() {
            var x = 25
        }

        class lower : uper() {
            fun display() {
                Log.d("inheritance", "value is= $x")
            }

        }

        var obj = lower()
        obj.display()
        //overriding in argument are Different
        open class Vishal {
            open fun name() {
                Log.d("overriding", "Hi Vishal")
            }
        }

        class Parth : Vishal() {
            override fun name() {
                Log.d("overriding", "Hi Parth")
            }
        }

        class Anuj : Vishal() {
            override fun name() {
                Log.d("overriding", "Hi Anuj")
            }
        }

        var pa = Parth()
        pa.name()
        var anu = Anuj()
        anu.name()
        //Abstract class
        abstract class Car {
            abstract fun run1()
        }

        class Honda : Car() {
            override fun run1() {
                Log.d("abstract", "Honda is running safely.")

            }
        }

        val obj11 = Honda()
        obj11.run1();

        //Exception Handling | try catch finally throw
        try {
            val data = 10 / 0
        } catch (e: Exception) {
            Log.d("exception", e.toString())
        } finally {
            Log.d("exception", "this finally")
        }
        //throw is used throw the Exception
        val ag = 26
        if (ag <= 18) {
            Log.d("throw", throw ArithmeticException("not eligible"))
        } else {
            Log.d("throw", "eligible ")
        }
        //Collection
        var arr = Array<Int>(5) { 0 }
        arr[1] = 66
        arr[4] = 44
        for (element in arr) {
            Log.d("collection", element.toString())
        }
        var arr1 = arrayOf<String>("Vishal", "Parth", "vaibhav", "Darshan")
        var arr2 = arrayOf<Int>(1, 2, 3, 4, 5, 6)
        //Immutable Collection -> Read only functionality-> Set,map,List
        //Mutable Collection->read and write->
        var list = listOf("Vishal", "Parth", "vaibhav", "Darshan", 1, 2, 3)
        for (element in list) {
            Log.d("list", element.toString())
        }
        //list type
        var intList: List<Int> = listOf<Int>(1, 8, 6)
        var strlist: List<String> = listOf<String>("Vishal", "Parth", "vaibhav", "Darshan")
        var anylist: List<Any> = listOf<Any>("vishal", "raj", 1, 6)
        for (element in intList) { //initlist
            Log.d("listtype", element.toString())
        }
        for (element in strlist) {//strtype
            Log.d("listtype", element.toString())
        }
        for (element in anylist) {//anylist
            Log.d("listtype", element.toString())
        }
        Log.d("listindex", intList.indexOf(8).toString())//index
        Log.d("listindex", strlist.indexOf("Darshan").toString())
        Log.d("listindex", anylist.indexOf(6).toString())
        //Mutable List we can change
        var mutable = mutableListOf("Vishal", "Raj", "Vikash")
        mutable.add("Prathmesh")
        mutable.add("Vinayak")
        Log.d("mutable", mutable.toString())
        var intmutable: MutableList<Int> = mutableListOf<Int>()
        intmutable.add(2)
        intmutable.add(5)
        intmutable.add(2, 8)//multiple value not allow
        var strmutable: MutableList<String> = mutableListOf<String>()
        strmutable.add("Vishal")
        strmutable.add("Darshan")
        strmutable.add(1, 6.toString())
        var anymutable: MutableList<Any> = mutableListOf<Any>()
        anymutable.add("Rakesh")
        anymutable.add(1)
        anymutable.add("Shivji")
        anymutable.add(1, 2)
        for (element in intmutable) {
            Log.d("inmutable", intmutable.toString())
        }
        for (element in strmutable) {
            Log.d("inmutable", strmutable.toString())
        }
        for (element in anymutable) {
            Log.d("inmutable", anymutable.toString())
        }
        //ArrayList
        var arraylist = arrayListOf<Int>()
        arraylist.add(1)
        arraylist.add(65)
        arraylist.add(21)
        for (element in arraylist) {
            Log.d("arraylist", arraylist.toString())
        }
        //arraylistOf
        var arraylistof = arrayListOf<Int>(200, 25, 36)
        for (element in arraylist) {
            Log.d("arraylistof", arraylistof.toString())
        }
        //Map -> it store the data in the 1.key & 2.value
        var map = mapOf<Int, String>(1 to "vishal", 2 to "parth", 4 to "Anuj", 3 to "Raj")
        Log.d("getmap", map.getValue(3).toString())//get the value of key
        for (key in map.keys) {
            Log.d("map", "key at  $key = ${map.get(key)}")
            Log.d("map", map[key].toString())
        }
        //Set
        var set = setOf<Int>(1, 25, 65, 45, 69)
        var anyset = setOf<Any>("Vishal", "Parth", 1, 8, 9, 20)
        Log.d("intset", set.toString())
        Log.d("anyset", anyset.toString())
        Log.d("drop", set.drop(1).toString())// drop(Delete)
        for (element in set) {

            Log.d("anyset", anyset.toString())
        }
        //IsEmpty and any
        if (set.isEmpty()) {
            Log.d("isempty", "Set is  empty")
        } else {
            Log.d("isempty", "Set not empty")
        }
        //any
        if (set.any()) {
            Log.d("any", "Set is Contain element")
        } else {
            Log.d("any", "Set no element")
        }
        //latent ->not work with int,float,double var
        lateinit var fname: String
        fname = "Vishal"
        Log.d("lateinit", "Name is $fname")
        //Lazy val when call that time it's work
        val lname: String by lazy { "Prajapti" }
        Log.d("lazy", "lname is $lname")
        //Data Class
        data class person(val name: String, val age: Int) {
        }

        val vishal = person("vishal", 21)
        Log.d("dataclass", "name=${vishal.name}")
        Log.d("dataclass", "age=${vishal.age}")
        //copy data class
        data class man(val name: String, val age: Int) {
            var height: Int = 0;
        }

        val man1 = man("vishal", 21)
        //copying  man1 with change in name of man
        val man2 = man1.copy(name = "raj")
        //copying  man1 to man3
        val man3 = man1.copy();
        //heights of individual men
        man1.height = 100
        man2.height = 90
        man3.height = 110
        //printing info all 3 men
        Log.d("copy", "${man1} it's ${man1.height}")
        Log.d("copy", "${man2} it's ${man2.height}")
        Log.d("copy", "${man3} it's ${man3.height}")
        data class people(val name: String, val age: Int)

        val m1 = people("manish", 18)
        val m2 = m1.copy(name = "rahul")
        val m3 = m1.copy();
        val hash1 = m1.hashCode();
        val hash2 = m2.hashCode();
        val hash3 = m3.hashCode();
        Log.d("hash", hash1.toString())
        Log.d("hash", hash2.toString())
        Log.d("hash", hash3.toString())
        //checking equality of  these hash codes
        Log.d("hash", "hash1 == hash 2 ${hash1.equals(hash2)}")// we also use the ==
        Log.d("hash", "hash2 == hash 3 ${hash2.equals(hash3)}")
        Log.d("hash", "hash1 == hash 3 ${hash1.equals(hash3)}")
        //sealed
        val objCar = MyClass.car()
        objCar.print()
        //interface ob
        var calcutore = Calcutore()
        calcutore.add()
    }

    private fun showtoast() {
        val inflater: LayoutInflater = layoutInflater
        val view: View = inflater.inflate(R.layout.custom_toast, findViewById(R.id.custom))
        val toast: Toast = Toast(this)
        toast.setGravity(Gravity.BOTTOM or Gravity.FILL_HORIZONTAL, ZERO, ZERO)
        toast.duration = Toast.LENGTH_LONG
        toast.view = view
        toast.show()
    }

    //sealed class ->third party can't access
//abstract & constructor is private
    sealed class MyClass {
        class car {
            fun print() {
                Log.d("sealed class", "car run fast")
            }
        }
    }

    class Calcutore : add, Sub {
        override fun add() {
            val x: Int = 10
            val y: Int = 12
            var c: Int = 0
            c = x + y
            val d = Log.d("interface", c.toString())
        }

        override fun sub() {
            Log.d("interface", "this is sub")
        }
    }

}