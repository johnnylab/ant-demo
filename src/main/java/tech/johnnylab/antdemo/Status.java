package tech.johnnylab.antdemo;

public enum Status {
    OK(200);
    int status;
    Status(int status){
        this.status=status;
    }
}
