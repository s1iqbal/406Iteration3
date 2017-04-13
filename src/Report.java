
public class Report {

	private String address, reportText, type , user;
	private int rank;
	public Report(String address, String reportText, String type, String user,
			int rank) {
		super();
		this.address = address;
		this.reportText = reportText;
		this.type = type;
		this.user = user;
		this.rank = rank;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReportText() {
		return reportText;
	}
	public void setReportText(String reportText) {
		this.reportText = reportText;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Report [address=" + address + ", reportText=" + reportText
				+ ", type=" + type + ", user=" + user + ", rank=" + rank + "]";
	}
	
	
	
}
