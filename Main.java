class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("nice to meet you.");
    
    char parcentSign = '%';
    
    string formattedString = String.format("I am 100%c", parcentSign);
    System.out.println(formattedString);
  }
}