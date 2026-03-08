package TaskManagerFinal;

public interface TaskInterface {
    public void createOrUpdate(String title,String description);
    public String getTitle();
    public void setTitle(String title);
    public String getDescription();
    public void setDescription(String description);
    public String getStatus();
    public void setStatus(String status);

}
