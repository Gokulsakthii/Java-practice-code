class person{
    String name;
    person(){
        System.out.println("person constructor");
    }
}
class employee extends person{
    int employeeld;
    employee(){
        super();
        System.out.println("employee constructor");
    }
    
}