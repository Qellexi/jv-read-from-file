package core.basesyntax;

public static void main(String[] args) {
    FileWork filework = new FileWork();
    String[] result = filework.readFromFile("File.txt");
    System.out.println(Arrays.toString(result));
}
