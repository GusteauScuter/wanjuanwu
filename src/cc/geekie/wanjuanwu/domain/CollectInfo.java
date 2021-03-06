package cc.geekie.wanjuanwu.domain;

public class CollectInfo {
	
	public static final int BOTH_NOT = 0;
	public static final int BOTH_YES = 1;
	public static final int NORTH_ONLY = 3;
	public static final int SOUTH_ONLY = 4;
	public static final int UNKNOWN = 5;
	
	
	private String location;
	private String detailLocation;
	private String status;
	
	
	public CollectInfo(String location, String detailLocation, String status) {
		super();
		this.location = location;
		this.detailLocation = detailLocation;
		this.status = status;
	}
	public String getLocation() {
		return location;
	}
	public String getDetailLocation() {
		return detailLocation;
	}
	public String getStatus() {
		return status;
	}
	
	
}
