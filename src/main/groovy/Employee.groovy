class Employee extends Person{
    //empId, company, salary
    Integer empId
    String company
    Double salary

//"Sachin is a man aged 24 who lives at Delhi. He works for Intelligrape with employee id 12 and draws $$$$$$$ lots of money !!!!.

    @Override
     String toString() {
        return """${name} is a man aged ${age} who lives at ${address}. He works for Intelligrape with employee id ${empId}
              and draws ${salary} lots of money !!!!.


                 """
    }
}
