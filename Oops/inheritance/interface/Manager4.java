interface dev3{

}
interface dev4 extends dev3{

}
class dev5{

}
class dev6{

}
interface dev7{

}
/*347 int 56cls  */
/*multiple inheritance */
interface dev8 extends dev1,dev4
{

}
//invalid
/*class dev9 implements dev7 extends dev5{

}*/
class dev9 extends dev5 implements dev7{

}

interface dev10 extends dev5{

}
public class Manager4 {
    public static void main(String[] args) {
        
    }
}
