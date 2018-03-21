class Q8 {
    static void main(String[] args) {

//        def src0 = new File("/home/ajay/groovy_1/src/main/groovy/file0.text")
//        def src1 = new File("/home/ajay/groovy_1/src/main/groovy/file1.text")
//        def src2 = new File("/home/ajay/groovy_1/src/main/groovy/file2.text")
//        def dst = new File("/home/ajay/groovy_1/src/main/groovy/destination.text")
//        dst << src0.text
//        dst << src1.text
//        dst << src2.text

//        def anchor=true
//        def fileNO=0
//        def noOfFile=3
//        while(anchor){
//            def src = new File("/home/ajay/groovy_1/src/main/groovy/file${fileNO}.text")
//            def dst = new File("/home/ajay/groovy_1/src/main/groovy/destination1.text")
//            dst << src.text
//            fileNO++
//
//
//            if(fileNO==(noOfFile)){
//                anchor=false
//            }
//        }
//        println("successful")
        def b= new File("/home/ajay/groovy_1/src/main/desNew/des.text")
        def a= new File("/home/ajay/groovy_1/src/main/scrNew").eachFile { file->
            b<<file.getText()
            b<<"\n"



        }
        println("chal rha hai ")


    }
}
