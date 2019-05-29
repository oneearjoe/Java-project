public class Main {

   public  static void main (String[] args) {
//      //В задании нужно создать 1 класс, и у него создать несколько методов, каждый из который принимает различное число аргументов
//      //и использует пред. метод (начиная с метода, который использует 3 аргумента)
//      
//      //Пример
//      public int methodOne(int arg1, int arg2) {
//         //find minimum
//      }
//      public int methodTwo(int arg1, int arg2, int arg3) {
//         int resultOfFirstMethod = nmethodOne(arg1, arg2);
//         //find minimum 
//         //ты также можешь использовать нахождение минимума через 1 метод 2 раза, т.е первый раз передаешь туда первые 2 аргумента, а 2 раз результат от работы 1 метода и 3 аргумент
//      }
//      //аналогично, 3 метод. Он должен использовать 2 метод и принимать 4 аргумента в кач-ве параметров. Можешь их вводить, можешь рандомить


      Min1 minNumb = new Min1();
      minNumb.getMinimum(15, 77, 24, 99);

      ArraySearch arraySearch = new ArraySearch();
      arraySearch.arraySearch();

      BubbleSort bubbleSort = new BubbleSort();
      bubbleSort.bubbleSort();

      InsertionSort insertionSort = new InsertionSort();
      insertionSort.insertionSort();

      SectionSort sectionSort = new SectionSort();
      sectionSort.sectionSort();



   }
}
