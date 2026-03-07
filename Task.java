package TaskManagerFinal;

public class Task implements TaskInterface{

    private String title;
    private String description;
    private String status;
    private  UserInterface user;


    public Task() {
        this.status="Todo";
    }

    public void createOrUpdate(String title,String description){
        this.title=title;
        this.description=description;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserInterface getUser() {
        return user;
    }

    public void setUser(UserInterface user) {
        this.user = user;
    }

}
