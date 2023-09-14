package iterator;

public class Notificationterator implements Iterator{
Notification[] notificationsList;
int pos = 0;

public NotificationIterator(Notification[] notificationsList){
this.notificationsList = notificationsList;
}

public boolean hasNetx(){
if (pos >= notificationsList.length || notificationsList[pos] == null){
return false;
} else{
    return true;
}


}
@Override
public Object next() {
Notification notification = notificationsList[pos];
pos = 1;
return notification;
}
}


