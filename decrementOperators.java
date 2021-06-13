 class Example {
    
       public int data = 0; // Each instance of Example holds its internal data. This is a "field", or "member variable".
    
       public void Updatepostfix() // .. and manipulates it (This is a method by the way)
       {
          data++;
       }
       public void Updateprefix() // .. and manipulates it (This is a method by the way)
       {
          ++data;
       }
       public void Updatepostfixm() // .. and manipulates it (This is a method by the way)
       {
          data--;
       }
       public void Updateprefixm() // .. and manipulates it (This is a method by the way)
       {
          --data;
       }
       public void PrintData() // This is also a method
       {
          synchronized (System.out) {
             System.out.println(data);
         }
       }
}
    
    class decrementOperators
    {
       public static void main (String [] arh)
       {
           Example exampleObject1 = new Example();
           
    
           exampleObject1.Updatepostfix();
           exampleObject1.PrintData();
           exampleObject1.Updateprefix();
           exampleObject1.PrintData();
           exampleObject1.Updatepostfixm();
           exampleObject1.PrintData();
           exampleObject1.Updateprefixm();
           exampleObject1.PrintData();         
       }
    }
