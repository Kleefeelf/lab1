import printers.*;

class Lab7{
    public static void main(String[] args){
        Printer dev = new Printer();
        System.out.println(dev.toString());

        Printer cannon = new Printer("Black and White", "A4", "Ukraine", "Printing");
        System.out.println(cannon.toString());

        Printer pixie = new Printer(10, 300, "Jombo", "Laser", "Any", "A5", "Ukraine", "Student work", "LG", true, true);
        System.out.println(pixie.toString());

        Printer.printPrintersQuantity();
    }
}


