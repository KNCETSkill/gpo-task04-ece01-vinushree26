[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/7f9puQOP)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22631639)
# GPO_Task04

## Problem Title
Brew Size Advisor

## Objective
Develop a Java program that recommends a coffee size based on the volume of coffee consumed (in milliliters).

This assessment evaluates:
- Conditional logic
- Input handling using `Scanner`
- Output correctness
- Strict adherence to formatting instructions

---

## Input Specification
- A single integer representing coffee volume in milliliters (ml)

---

## Output Specification
Print **exactly one word** based on the rules below:

- `Small`
- `Medium`
- `Large`
- `Invalid Input`

⚠️ **Do not print any additional text, prompts, or symbols**

---

## Decision Rules

| Condition | Output |
|---------|--------|
| Volume > 350 | Large |
| 200 ≤ Volume ≤ 350 | Medium |
| Volume < 200 and ≥ 0 | Small |
| Volume < 0 | Invalid Input |

---

## Constraints
- Input must be a valid integer
- Only one input value
- Output is **case-sensitive**
- No extra spaces or new lines

---

## Sample Test Cases

| Input | Output |
|------|-------|
| 220 | Medium |
| 400 | Large |
| 150 | Small |
| 350 | Medium |
| 200 | Medium |
| 199 | Small |
| 351 | Large |
| 0 | Small |
| 500 | Large |
| -201 | Invalid Input |

---

## Instructions to Students
- Do **not** change the class name: `BrewSizeAdvisor`
- Write your logic **only** inside `BrewSizeAdvisor.java`
- Use `Scanner` for input
- Print output using `System.out.print()` or `System.out.println()`
- Do not add extra Java files

---

## Repository Structure (Do Not Modify)
