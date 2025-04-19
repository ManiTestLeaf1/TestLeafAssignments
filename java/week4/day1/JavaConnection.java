package week4.day1;

public class JavaConnection implements DatabseConnection {

	@Override
	public void connect() {
		System.out.println("DB connect");

	}

	@Override
	public void disconnect() {
		System.out.println("DB disconnect");

	}

	@Override
	public void executeUpdate() {
		System.out.println("DB update");

	}

	public static void main(String[] args) {
		JavaConnection DBObj = new JavaConnection();

		DBObj.connect();
		DBObj.disconnect();
		DBObj.executeUpdate();
	}

}
