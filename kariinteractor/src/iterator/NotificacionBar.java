package iterator;

public class NotificacionBar {
    NotificacionCollection notications;

    public NotificacionBar(){
        this.notications = new NotificacionCollection();
    }
    public void printNotication(){
        Iterator iterator = notications.createIterator();
        System.out.println("---------NOTIFICATION BAR---------");
        while(iterator.hasNext()){
            Notification n = (Notification)iterator.next();
            System.out.println(n.getNotification());
        }
    }

}
