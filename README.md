# Generic-Interface-Android
# GENERIC INTERFACE ANDROID [![Build Status](https://travis-ci.org/nomensa/jquery.hide-show.svg)](https://travis-ci.org/nomensa/jquery.hide-show.svg?branch=master)

   ```It's awesome to use Generic Types in Android.```
   
## Generic Methods
- Look what I got old code:
```java
package upgrade;

@SuppressWarnings("all")
public class GenericJava {
	public static void main(String[] args) {
		Integer[] iray = {1, 2, 3, 4};
		Character[] cray = {'b', 'u', 'c', 'y'};
		Float[] fray = {1.0f, 2.4f, 0.5f, 11.7f};
		printMe(iray);
		printMe(cray);
		printMe(fray);
	}
	
	public static void printMe(Integer[] i) {
		for(Integer x : i) {
			System.out.printf("%s ",x);
		}
		System.out.println();
	}
	
	public static void printMe(Character[] i) {
		for(Character x : i) {
			System.out.printf("%s ",x);
		}
		System.out.println();
	}
	
	public static void printMe(Float[] i) {
		for(Float x : i) {
			System.out.printf("%s ",x);
		}
		System.out.println();
	}
}
```
- Improve Interface Method:
```java
// Generic Method
public static <T> void printMe(T[] x) {
   for (T b: x) {
      System.out.printf("%s ", b);
   }
   System.out.println();
}
```
- <b>Explain: In <T> List<T>, the first <T> denotes that T is a type parameter. If you hadn't specified it, then Java would think the T in T value referred to an actual class named T, and ask you to import it. See generic methods.</b>
See here: 
## Type Parameter Naming Conventions
By convention, type parameter names are single, uppercase letters. This stands in sharp contrast to the variable naming conventions that you already know about, and with good reason: Without this convention, it would be difficult to tell the difference between a type variable and an ordinary class or interface name.

### The most commonly used type parameter names are:

E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
S,U,V etc. - 2nd, 3rd, 4th types
You'll see these names used throughout the Java SE API and the rest of this lesson.

### Bounded Type Parameters
- Matter: There may be times when you'll want to restrict the kinds of types that are allowed to be passed to a type parameter. For example, a method that operates on numbers might only want to accept instances of Number or its subclasses. This is what bounded type parameters are for.
```java
package java.lang;
import java.util.*;

public interface Comparable<T> {
    public int compareTo(T o);
}
```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> We try to implement this interface for testing.
```java
public class Student implements Comparable<Student>{

	private int id;
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.id - student.id;
	}
}
```
<img src = "https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/x.png" width="75px" height="40px"/> Understand .
- We want to compare more object. For example Comparable<Student> => <b>Comparable<T></b> => Create mutiple objects and
   we will implement follow this way: T extends Comparable<T> and convert into TypeParamater<T>
   
```java
public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
   T max = x;   // assume x is initially the largest

   if(y.compareTo(max) > 0) {
      max = y;   // y is the largest so far
   }

   if(z.compareTo(max) > 0) {
      max = z;   // z is the largest now                 
   }
   return max;   // returns the largest object   
}

System.out.printf("Max of %d, %d and %d is %d\n\n", 
   3, 4, 5, maximum( 3, 4, 5 ));

System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
   6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));

System.out.printf("Max of %s, %s and %s is %s\n","pear",
   "apple", "orange", maximum("pear", "apple", "orange"));
```
### Generic Interface Android


![alt text](https://github.com/danisluis6/RxJava-Introduction/blob/level_research_reactive/Deeply/1.png)

