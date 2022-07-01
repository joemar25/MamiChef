# My CodeChef Programming Problems and Solution

```
The programming language used to solve the problems here in this Journey is Java.

Java is the first langauge I learned while was starting college. I had a lot of fun using it and solving problems with it.

Though I am using different other languages now for different purposes and school stuff's, I am back at using Java again.

Now, I am challenging myself to become much better using this language to become a better problem solver.
```

## Tables of Contents

1. [The Program's Behaviour and Feature](#the-programs-behaviour-and-features)
2. [The Program's Behaviour and Feature](#the-programs-behaviour-and-features)
3. [The Cheaper Cab](#the-cheaper-cab)

<br>

---

<br>

## The Cheaper Cab

```
Problem Code    : CABS
File Name       : CAB.java
Status          : Correct Answer
Submission ID   : 68012123
```

### Problem

Chef has to travel to another place. For this, he can avail any one of two cab services.

- The first cab service charges `X` rupees.
- The second cab service charges `Y` rupees.

Chef wants to spend the minimum amount of money. Which cab service should Chef take?

#### Input Format

- The first line will contain `T` - the number of test cases. Then the test cases follow.
- The first and only line of each test case contains two integers `X` and `Y` - the prices of first and second cab services respectively.

#### Output Format
For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.

You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).

#### Constraints

>- 1 ≤ T ≤ 100
>- 1 ≤ X, Y ≤ 100 

#### Sample 1:

| Input     | Output  | 
| :---------| :------ |
| 3         |         |
| 30 65     | FIRST   |
| 42 42     | ANY     |
| 90 50     | SECOND  |


#### Explanation:

``` 
Test case 1: The first cab service is cheaper than the second cab service.

Test case 2: Both the cab services have the same price.

Test case 3: The second cab service is cheaper than the first cab service.
``` 

### My Solution
```Java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static void check(int first, int second) {
        if (first < second)
            System.out.println("FIRST");
        else if (first > second)
            System.out.println("SECOND");
        else
            System.out.println("ANY");
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Scanner in = new Scanner(inputStream);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int first = in.nextInt();
            int second = in.nextInt();
            check(first, second);
        }
    }
}
```





<br>

---

<br>

# `Thank You For Reading This File`
---