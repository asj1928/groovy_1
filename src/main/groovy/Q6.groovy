class Q6 {

    static void main(String[] args) {

        //method 1
        def a=1,p
        10.times {println((a++)*3)}

        //method2
        Closure closure={n->

            p=n
            10.times {

            print (n+"   ")
            n=n+p
        }

        }

        closure(3)
       //method3
        1.upto(10, {
            println it*3
        })


    }
}