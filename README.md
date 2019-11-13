# Fuzzy Java

## AST Transformations

*Note*: The designation [Code Block] stands for an arbitrary block of code, which can be fuzzed further depending on its contents.

### If-Else Statement

In a simple if-else statement, we can negate the condition and flip the if and the else statements to fuzz the code.

Original
```
if (condition) {
  [Code Block 1]
}
else {
  [Code Block 2]
}
```
Fuzzed
```
if (!condition) {
  [Code Block 2]
}
else {
  [Code Block 1]
}
```

### If-Elif-Else Statement

If an if-else statement has one or more else if statement, things get a little fuzzier...

Original
```
if (condition) {
  [Code Block 1]
}
else if (condition1) {
  [Code Block 2]
}
else {
  [Code Block 3]
}
```
Fuzzed
```
if (condition1) {
  [Code Block 2]
}
else if (condition) {
  [Code Block 1]
}
else {
  [Code Block 3]
}
```
OR
```
if (!condition && !condition1 ⟺ !(condition || condition1)) {
  [Code Block 3]
}
else if (condition1) {
  [Code Block 2]
}
else {
  [Code Block 1]
}

```
