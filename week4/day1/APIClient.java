//Home Assignment <2A>: Demonstrating Method Overloading in Java

package week4.day1;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("End point is " + endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("The request body " + requestBody + " is sent to the end point " + endpoint + " successfully");

	}

	public static void main(String[] args) {
		APIClient APIClientObj = new APIClient();
		APIClientObj.sendRequest("https://platform.testleaf.com");
		APIClientObj.sendRequest("https://platform.testleaf.com", "Ed Tech", true);
	}

}