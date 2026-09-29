/**
 * Java operators perform operations on values (operands).
 *
 * Main operator categories:
 * - Arithmetic: +, -, *, /, %. Integer division removes the decimal part.
 *   The + operator also joins strings.
 * - Unary: +, -, ++, --, !, ~. Prefix changes a value before it is used;
 *   postfix changes it after it is used.
 * - Relational: <, >, <=, >=, ==, !=. They return true or false.
 * - Logical: &&, ||, !. && and || use short-circuit evaluation.
 * - Bitwise: &, |, ^, ~. They operate on individual bits.
 * - Shift: <<, >>, >>>. They shift bits left, signed right, or unsigned right.
 * - Assignment: =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=.
 * - Ternary: condition ? valueIfTrue : valueIfFalse.
 * - Type checking: instanceof checks whether an object belongs to a type.
 *
 * Parentheses can be used to control evaluation order. In general, unary,
 * multiplication/division, addition/subtraction, comparison, logical,
 * ternary, and assignment operators are evaluated in that order.
 */
public class Opreators {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;

		System.out.println(a + b);       // 13: arithmetic
		System.out.println(a / b);       // 3: integer division
		System.out.println(a % b);       // 1: remainder
		System.out.println(a > b);       // true: relational
		System.out.println(a > 0 && b > 0); // true: logical

		a += 2;                          // assignment: a becomes 12
		int larger = a > b ? a : b;      // ternary operator
		System.out.println(larger);
		System.out.println("Java" + " operators"); // string concatenation
	}
}
