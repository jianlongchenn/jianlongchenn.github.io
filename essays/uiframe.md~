---
layout: essay
type: essay
title: "Question 101"
# All dates must be YYYY-MM-DD format!
date: 2023-01-26
published: true
labels:
  - Engineering
  - Smart question
---

<img width="200px" class="rounded float-start pe-4" src="../img/question.jfif">

## How to ask

Asking questions is an important skill that everyone must acquire in life. This skill can efficiently fill the knowledge which you don't know. In China's inherent culture, interrupting others' speech is considered bad manners. In Western culture, it will be regarded as a manifestation of respect for the speaker, because you asked a question, it means you listened carefully to the speech. Good questions will help questionees develop their understanding, that is why asking smart questions is important.

## A Smart question

I found an example which I think is a smart question on StackOverflow. 

```cpp
Q: Why is processing a sorted array faster than processing an unsorted array?

Here is a piece of C++ code that shows some very peculiar behavior.

For some reason, sorting the data (before the timed region) miraculously makes the primary loop almost six times faster:

#include <algorithm>
#include <ctime>
#include <iostream>

int main()
{
    // Generate data
    const unsigned arraySize = 32768;
    int data[arraySize];

    for (unsigned c = 0; c < arraySize; ++c)
        data[c] = std::rand() % 256;

    // !!! With this, the next loop runs faster.
    std::sort(data, data + arraySize);

    // Test
    clock_t start = clock();
    long long sum = 0;
    for (unsigned i = 0; i < 100000; ++i)
    {
        for (unsigned c = 0; c < arraySize; ++c)
        {   // Primary loop.
            if (data[c] >= 128)
                sum += data[c];
        }
    }

    double elapsedTime = static_cast<double>(clock()-start) / CLOCKS_PER_SEC;

    std::cout << elapsedTime << '\n';
    std::cout << "sum = " << sum << '\n';
}
Without std::sort(data, data + arraySize);, the code runs in 11.54 seconds.
With the sorted data, the code runs in 1.93 seconds.
(Sorting itself takes more time than this one pass over the array, so it's not actually worth doing if we needed to calculate this for an unknown array.)
```
From this question, we can see the person is well prepared before asking the question and his problem is precise and informative. He did a lot of research by himself and tried it on C++ and Java.That is why the person got 26860 vote for his question and people are willing to help him with his problems.

You can see more detail at the [Sourse](https://stackoverflow.com/questions/11227809/why-is-processing-a-sorted-array-faster-than-processing-an-unsorted-array)

## A Stupid question 

The following is an example of the opposite.

```cpp
Q:Binary Search Homework

It's late, I'm tired and forgot I had java homework. Last question is to write a Java program to find the value 45.3 from this list {-3,10,5,24,45.3,10.5} using the binary search method.

Normally I'd be fine but I really don't want to have to rush this in the morning and I'm too tired to think straight so hopefully someone can help at least a little bit.

Here is the code:

public class questionTwelve
{
    public static int binarySearch(int x)
    {
        int low = 0;
        int high = a.length - 1;
        int mid;
        int foundindex;

        while (low <= high)
        {
            mid = (low + high) / 2;
            if (a[mid].compareTo (x) < 0)
                low = mid + 1;
            else if (a[mid].compareTo (x) > 0)
                high = mid - 1;
            else
                foundindex = mid.getIndex;
        }
    }

    public static void main(String[] args)
    {
        int a[];
        a[0] = -3;
        a[1] = 5;
        a[2] = 10;
        a[3] = 10.5;
        a[4] = 24;
        a[5] = 45.3;

        System.out.println("Value 45.3 found at index " + binarySearch(45.3));
    }
}
```
From the title XXX homework, we can see that this is a bad question. The first sentence at the beginning said that person forgot to do his homework because of the time is late. It can be seen from his statement that he has not tried and worked hard, what he wants is more like a result. Therefore, he got -3 vote for his question. 

You can see more detail at the [Sourse](https://stackoverflow.com/questions/5271563/binary-search-homework)
