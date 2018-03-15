class Q10 {
    static void main(String[] args) {
        def i = 1
        new File("/home/ajay/groovy_1/src/main/groovy/fileForQ9.text").eachLine {


            line -> line= line.split(" ").join("").trim()
                println line


        }
    }
}