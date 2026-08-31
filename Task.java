public class Task {
    Task(int taskid, String TaskCreatedBy , String TaskReportedby){
        this.taskid = 0;
        this.TaskCreatedBy = null;
        this.TaskReportedby = null;
    }

    

    public String[] findById(int taskid){
        if (Task.taskid == taskid) {
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Task t1 = new Task(1, teacher1, Student1);
        Task t2 = new Task(2, teacher2, student2);
    }
}
