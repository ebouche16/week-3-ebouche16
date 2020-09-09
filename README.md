# Week 3

In this lab we will have more practice with 2-Dimensional arrays as well as method design. 
At the end of this lab the students will be prepared to compbined the results from this and the previous lab to work on the comprehinsive Week 4 Lab. 

# The Task
The task will be to complete two methods in `extractAndTest.java` as well as the associated test cases in `tester.java`. 
**DO NOT** change any of the method signatures from those given in the assignment, and read the instructions carefully. 

## `extractAndSearch.java`
### 1. `extractSubArray`
The signiture of this method will be `public static int[][] extractSubArray(int[][] inArray, int rowMin, int rowMax, int colMin, int colMax)`;
This method will return a new 2-D integer array which contains a subset of the information in the given input array. 
The input array may be jagged. 
The output will:
* be of size `rowMax-rowMin+1` by `colMax-rowMin+1`, and 
* match the coresponding locations of the input, i.e. the values from the `0`th column of the output will correspond to the `colMin`th column of the input. 

If the requested array cannot be extracted, the method will return `null`. 
That is, it returns `null` if either of the following are true:
* the maximum index (row or column) is *less* than the minimum (note equal is okay). 
* the ranges given are invalid for the input array (i.e. `inputArray[i][j]` does not exist for some `rowMin ≤ i ≤ rowMax` and `colMin ≤ j ≤ colMax`).

#### Examples

**1.** 
`inputArray` is 
```
[[ 1, 2],
 [ 3, 4, 5],
 [ 6, 7]]
```
and `minRow`,`maxRow`,`minCol`,and `maxCol` are `0`,`2`,`0`,`1` respectively 
then the method would return 
```
[[ 1, 2],
 [ 3, 4],
 [ 5, 6]]
```

**2.**
if all of the inputs other than `maxCol` stay the same, and instead `maxCol` where `2` the method would return `null` 
since rows `0` and `2` do not contain enough columns. 

**3.** 
using the same `inputArray` if `minRow`,`maxRow`,`minCol`,and `maxCol` are `2`,`0`,`0`,`1` respectively 
the method would also return `null` since the row limits are in the wrong order. 

### 2. `noneTrue`
The signiture of this method will be `public static boolean noneTrue(boolean[][] boolArray)`.
This method searches the 2-dimensional boolean array (possibly jagged) to see if any of the values are `true`. 
If any of the values are `true` the method returns `false`, otherwise it returns `true`.
Notice that the previous sentence does not say that it returns `true` if all of the values are `false`, 
this will be useful in defining one of the corner case tests. 

#### Example
If `boolArray` is 
```
[[  true, false ],
 [ false],
 [ false, false, false, false]]
```
the method will return `false`.


## `tester.java`
You will need to make 10 `Junit` tests for your code.
Of these 7 should test various aspects of `extractSubArray` and 3 should test `noneTrue`.
Each test also needs to have a description in a comment just before the method in the tester file. 

# Grading
* `searchAndTest.java`
  * 50 points for `extractSubArray`
    * 30 points for the null return checks
    * 20 points for the array being returned
  * 20 points for `noneTrue`
* `tester.java`
  * 30 points 
    * 2 points for the explaination of the test
    * 1 point for the implementation
