package DTO;

public class Request {
    private String name;
    private String job;

   /* @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }*/



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
