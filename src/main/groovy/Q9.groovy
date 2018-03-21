class Q9 {
    static void main(String[] args) {
        def i=1
        def a=new File("/home/ajay/groovy_1/src/main/scrNew/fileQ9.text")
        new File("/home/ajay/groovy_1/src/main/groovy/fileForQ9.text").eachLine {



            line -> if(i%2!=0){a<<line
                a<<"\n"
            }
                i++



        }
    }
}
