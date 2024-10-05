 class ClassandObject {
        private string modelname;
        private string owner;
        private int regNumber;
     
        public ClassandObject (String modelname,String owner,int regNumber){
            this.modelname=modelname;
            this.owner=owner;
            this.regNumber=regNumber;

        }
}
class car1{
public void startEngine()
{
    System.out.println("engine can be started.");

}
public void acceleration()
{
    System.out.println("engine can be accelerated");
}
public void stopped()
{
    System.out.println("engine can be stopped");
}
public void showCarInformation()
{
    System.out.println("the car is owned by" + owner);
    System.out.println("the car model is + ModelName");
    System.out.println("the regNumber is + regNumber");
}
public static void main(String[] arge){
    Car1 Car = new Car(ModelName:"Suzuki",owner:"xyz",regNumber:1234);
    myCar.startEngine();
    myCar.accelerate();
    myCar.stop();
 
}}