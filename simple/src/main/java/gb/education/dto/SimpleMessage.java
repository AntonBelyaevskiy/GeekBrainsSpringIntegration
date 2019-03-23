package gb.education.dto;

import java.util.Date;

public class SimpleMessage {

    private Date date = new Date();

    public SimpleMessage() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
