class StringRotation {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) System.out.println(args[i]);
    if (args.length != 2) return;
    System.out.println(isRotation(args[0], args[1]));
  }

  public static boolean isRotation(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    int p1 = 0;
    int p2 = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(p1) == s2.charAt(p2)) {
        p2++;
      }
      p1++;
    }

    int p2s = p2;
    for (int i = 0; i < s1.length() - p2; i++) {
      if (s1.charAt(i) != s2.charAt(p2s)) return false;
      p2s++;
    }

    return true;
  }
}
