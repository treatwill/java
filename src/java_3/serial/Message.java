package java_3.serial;

import java.io.Serializable;

public class Message implements Serializable {
	private int id;
	private String msg;

	public Message(int id, String msg) {
		this.id = id;
		this.msg = msg;
	}

	public String getMsg(int id) {

		return msg; //to get a message, the id must be passed in
	}

	@Override
	public String toString() {
		return "Message{" +
				"id=" + id +
				", msg='" + msg + '\'' +
				'}';
	}
}
