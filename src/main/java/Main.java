public class Main {
  public static void main(String[] args) {
    System.out.println("1_ Uma TV de 200 watts fica ligada aproximadamente 5h diariamente. Determine o consumo eléticro mensal da TV.");
    System.out.println("####");
    System.out.println("A potência dada em watts é:");
    int potência = 200;
    System.out.print(potência);
    System.out.println("watts");
    System.out.println("####");
    System.out.println("O tempo de uso em horas foi de:");
    int tempo = 5;
    System.out.print(tempo);
    System.out.println("h");
    System.out.println("####");
    System.out.println("Fórmula = Potência . Tempo ÷ 1000");
    int mês = 30;
    System.out.println("####");
    System.out.print(potência);
    System.out.print(" . ");
    System.out.println(mês);
    System.out.println("-----------");
    System.out.println("   1000");
    System.out.println("O resultado da fórmula será");
    int multiplicar = potência * tempo * mês;
    int dividir = multiplicar / 1000;
    System.out.print("O consumo da TV por mês será:");
    System.out.print(dividir);
    System.out.print("30kw"); 
   }
}