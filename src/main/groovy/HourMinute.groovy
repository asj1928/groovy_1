import sun.util.resources.cldr.fr.CalendarData_fr_YT

class HourMinute {

    def hh
    def mm

    void incHh(){

        hh++


        check()

        println("TIME =$hh : $mm")

    }
    void incMm(){

        if(mm==59){
            hh++

        }
        mm++

        check()

        println("TIME =$hh : $mm")


    }
    void decHh(){

        hh--
        check()
        println("TIME =$hh : $mm")



    }
    void decMm(){

        if(mm==00){
            hh--
        }
        mm--


        check()
        println("TIME =$hh : $mm")



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

    }





}
