class Q11 {
    static void main(String[] args) {
        File src = new File("/home/ajay/groovy_1/src/main/groovy/int4a.png" )
        new File("/home/ajay/groovy_1/src/main/groovy/empty.png" ).withOutputStream{ out ->
            out.write src.readBytes()
        }//from groovy chief
    }
}
