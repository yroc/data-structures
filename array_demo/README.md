# Project Description
`ArrayDemo.java` is designed to show off some features of arrays and the `Random` class.

The application instantiates an integer array, fills it with random values, copies it, sorts the original, compares the two arrays (the original and the copy, before and after sorting) for equality, and outputs the results.

## About java.util.Random
A feature built into Java is the ability to generate pseudorandom numbers (i.e., numbers that appear to be, but aren&rsquo;t necessarily, truly random). In particular, Java has a built-in class, `java.util.Random`, whose instances are pseudorandom number generators, that is, objects that, upon request, compute and return, one at a time, a sequence of numbers that are statistically random. These sequences are not actually random, however, in that it is possible to predict the next number in the sequence given the past list of numbers. Indeed, a popular pseudorandom number generator is to generate the next number, `next`, from the current number, `cur`, according to the formula (in Java syntax):

`next = (a * cur + b) % n;`

where `a`, `b`, and `n` are appropriately chosen integers. Something along these lines is, in fact, the method used by `java.util.Random` objects, with <var>n</var> = 2<sup>48</sup>. It turns out that such a sequence can be proven to be statistically uniform, which is usually good enough for most applications requiring random numbers, such as games. For applications, such as computer security settings, where unpredictable random sequences are needed, this kind of formula should not be used. Instead, ideally a sample from a source that is actually random should be used, such as radio static coming from outer space.

Since the next number in a pseudorandom generator is determined by the previous number(s), such a generator always needs a place to start, which is called its seed. The sequence of numbers generated for a given seed will always be the same. The seed for an instance of the `java.util.Random` class can be set in its constructor or with its `setSeed()` method.

One common trick to get a different sequence each time a program is run is to use a seed that will be different for each run. For example, we could use some timed input from a user or we could set the seed to the current time in milliseconds since January 1, 1970 (provided by method `System.currentTimeMillis`).

By using a pseudorandom number generator (and varying its seed) to determine the array values, we get a different input to our program each time we run it. This feature is, in fact, what makes pseudorandom number generators useful for testing code, particularly when
dealing with arrays. Even so, we should not use random test runs as a replacement for reasoning about our code, as we might miss important special cases in test runs. Note, for example, that there is a slight chance that the orig and data arrays will be equal even after data is sorted, namely, if orig is already ordered. The odds of this occurring are less than 1 in 3 million, so it’s unlikely to happen during even a few thousand test runs; however, we need to reason that this is possible.

### About Random.nextInt()
`nextInt()` is a method of `java.util.Random` that calculates and returns the next pseudorandom `int` value. It returns all possible `int` values&mdash;both positive and negative&mdash;with equal probability (2<sup>32</sup> integer values in total).

To limit the possible return values, use `nextInt(n)` instead. This will return the next pseudorandom `int` value in the range from 0 up to but not including `n`.

## About java.util.Arrays
Because arrays are so important, Java provides a class, `java.util.Arrays`, with a number of built-in static methods for performing common tasks on arrays.
