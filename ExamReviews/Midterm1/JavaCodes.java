//Practice Exam 1 Java Code:

//Q1
public static void main() {
  int a = 6;
  String s = "";
  for (int i = 0; i < a; i++) {
    for (int j = 0; j <= i; j++) {
      if (j == 0 || j == i) {
        s += "*";
      } else {
        s += " ";
      }
    }
    System.out.print(s + "\n");
    s = "";
  }
}

//Q2

int[] a = {1,2,3,4,5,6,7,8,9,10};
for (int i = 0; i < a.length / 2; i++) {
  System.out.println((a[i + 2] + a[i]));
}

//Q11

Queue<Integer> q = new LinkedQueue<Integer>();
//Assume that this Queue uses enqueue(), dequeue(), and peek()

for (int i = 5; i >= -5; i--) {
  q.enqueue(i);
}
for (int i = 3; i < 6; i++) {
  System.out.println(q.dequeue());
}
for (int i : q) {
  System.out.println(q);
}

//Q14

Stack<Integer> s = new LinkedStack<Integer>();
//Assume that this Stack uses pop(), push(), and peek()

for (int i = 5; i >= -5; i--) {
  s.enqueue(i);
}
for (int i = 3; i < 6; i++) {
  System.out.println(s.dequeue());
}
for (int i : s) {
  System.out.println(s);
}

//Q13

public static int f(int a) {
  if (a <= 1) return 1;
  return f(a - 1) + a;
}

//For Other Questions

//Q3
public static int findMin(int[] a) {}

//Q7
public boolean linearSearch(int toFind)

