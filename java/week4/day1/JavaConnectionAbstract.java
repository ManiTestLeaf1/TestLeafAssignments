package week4.day1;

public class JavaConnectionAbstract extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("DB connected");

	}

	@Override
	public void disconnect() {
		System.out.println("DB disconnected");

	}

	@Override
	public void executeUpdate() {
		System.out.println("DB executed");

	}

	public static void main(String[] args) {
		JavaConnectionAbstract Obj1 = new JavaConnectionAbstract();
		Obj1.connect();
		Obj1.disconnect();
		Obj1.executeUpdate();
		Obj1.executeQuery();
	}

}
