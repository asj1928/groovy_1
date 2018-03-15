import sun.util.resources.cldr.fr.CalendarData_fr_YT

class HourMinute {

    def hh
    def mm

    void incHh(){

        hh++


        check()


    }
    void incMm(){

        if(mm==59){
            hh++

        }
        mm++

        check()



    }
    void decHh(){

        hh--
        check()



    }
    void decMm(){

        if(mm==00){
            hh--
        }
        mm--


        check()



    }
    void check(){
        if(hh>23){
            hh=00
        }
        if(mm>59){
            mm=00
        }
        if(mm<0){
            mm=59
        }
        if(hh<0){
            hh=23
        }
        println("TIME =$hh : $mm")


    }





}
