class Q8 {
    static void main(String[] args) {

        def src0 = new File("/home/ajay/groovy_1/src/main/groovy/file0.text")
        def src1 = new File("/home/ajay/groovy_1/src/main/groovy/file1.text")
        def src2 = new File("/home/ajay/groovy_1/src/main/groovy/file2.text")
        def dst = new File("/home/ajay/groovy_1/src/main/groovy/destination.text")
        dst << src0.text
        dst << src1.text
        dst << src2.text



    }
}
