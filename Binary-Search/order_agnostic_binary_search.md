#  Order Agnostic Binary Search (Java)

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![Time Complexity](https://img.shields.io/badge/Time-O(log%20n)-brightgreen)
![Space Complexity](https://img.shields.io/badge/Space-O(1)-orange)
![Status](https://img.shields.io/badge/Status-Complete-success)

---

##  Overview
This project implements an **Order Agnostic Binary Search** in Java.

Unlike standard binary search, this algorithm works on:
- **Ascending sorted arrays**
- **Descending sorted arrays**

It dynamically takes user input and efficiently searches for a target element.

---

##  Concepts Used
- Binary Search Algorithm  
- ArrayList (Dynamic Input Handling)  
- Order Detection Logic  
- Iterative Approach  

---

##  Approach
- Take input dynamically using `Scanner`
- Store elements in an `ArrayList`
- Stop input when `-1` is entered
- Determine array order:
  - `isAsc = first element < last element`
- Apply binary search based on detected order:
  - Ascending → normal comparison  
  - Descending → reverse comparison  
- Return index if found, else `-1`

---

##  Complexity Analysis
- **Time Complexity:** `O(log n)`  
- **Space Complexity:** `O(1)`  

---

##  Input Format
- Sorted integers (ascending or descending)  
- `-1` to stop input  
- Target value  

---

##  Output
- Index of the target if found  
- Otherwise: `"Element not found"`  

---

##  Constraints / Assumptions
- Input must be sorted  
- `-1` is only a termination signal (not part of array)  
- Works on integer values  

---

##  Edge Cases
- Empty input  
- Single element  
- Target not present  
- All elements identical  

---

##  Example

### Input
Enter elements (sorted). Type -1 to stop:
33
333
3444
-1
Enter target: 333


### Output

Element found at index: 1
