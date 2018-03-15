class Q7 {
     static void main(String[] args) {


         List l=[1,20,6,80,99,322,54]
         Closure contain={
             List a,b->
             if(a.contains(b)){print("${b} is in the list")}
             else {print("${b} is not in the list")}
         }

         println("list = ${l}")
         contain(l,6)

    }
}
