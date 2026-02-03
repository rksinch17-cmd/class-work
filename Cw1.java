class Student{
    String name;
    int age;
    float marks;
    Student( String name,int age,float marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public void display(){
        System.out.println("The name is: "+name);
        System.out.println("The name is: "+ age);
    }
}
    class Cw1{
        public static void main(String[]args){
            Student student1 = new Student("Pari",16,100);
            Student student2 = new Student("Sinchu",20,99);
            student1.display();
            student2.display();
        }
    }
    
    

