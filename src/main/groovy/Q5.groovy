class Q5 {
     static void main(String[] args) {

         List list=[]
         List list1=new ArrayList()
         list=[null,null]
         def sample1="Test"
         def sample2='null'
         def sample3=null
         def sample4=100
         def sample5=list
         def sample6=list1
         def hourMinute=new HourMinute()
         hourMinute.hh=23
         hourMinute.mm=59



         if(sample1) { println "test evaluated to true inside if(${sample1})" }
         else {
             println "test evaluated to false inside if(${sample1})"

         }

         if(sample2) { println "test evaluated to true inside if(${sample2})" }
         else {
             println "test evaluated to false inside if(${sample2})"

         }
         if(sample3) { println "test evaluated to true inside if(${sample3})" }
         else {
             println "test evaluated to false inside if(${sample3})"

         }
         if(sample4) { println "test evaluated to true inside if(${sample4})" }
         else {
             println "test evaluated to false inside if(${sample4})"

         }
         if(sample5) { println "test evaluated to true inside if(${sample5})" }
         else {
             println "test evaluated to false inside if(${sample5})"

         }
         if(sample6) { println "test evaluated to true inside if(${sample6})" }
         else {
             println "test evaluated to false inside if(${sample6})"

         }

         hourMinute.incHh()
         hourMinute.decHh()
         hourMinute.incMm()
         hourMinute.decMm()



    }
}
