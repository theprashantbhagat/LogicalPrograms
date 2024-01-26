package randomInInterview;

class MyObject {
	
	private String user;
	private int id;
	private int amount;

	public MyObject(String user, int id, int amount) {
		this.user = user;
		this.id = id;
		this.amount = amount;
	}

	public String getUser() {
		return user;
	}

	public int getId() {
		return id;
	}

	public int getAmount() {
		return amount;
	}

//	public int compareByUser(MyObject other) {
//		return this.user.compareTo(other.user);
//	}

	@Override
	public String toString() {
		return "MyObject{" + "user='" + user + '\'' + ", id=" + id + ", amount=" + amount + '}';
	}
}
