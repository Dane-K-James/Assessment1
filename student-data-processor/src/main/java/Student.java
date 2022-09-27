



public class Student {
	private String name;
	private int id;
	private int phymark;
	private int mathsmark;
	private int chemmark;
	
	private int totalmark ;
	private int percentage;
	private String phyGrade;
	private String mathsGrade;
	private String chemGrade;
	private double phyPoint;
	private double mathsPoint;
	private double chempoint;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhyMark() {
		return phymark;
	}
	public void setPhyMark(int phyMark) {
		phymark = phyMark;
	}
	public int getMathsMark() {
		return mathsmark;
	}
	public void setMathsMark(int mathsMark) {
		mathsmark = mathsMark;
	}
	public int getChemMark() {
		return chemmark;
	}
	public void setChemMark(int chemMark) {
		chemmark = chemMark;
	}
	public int getTotalMark() {
		return totalmark;
	}
	public void setTotalMark(int totalMark) {
		totalmark = totalMark;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public String getPhyGrade() {
		return phyGrade;
	}
	public void setPhyGrade(String phyGrade) {
		this.phyGrade = phyGrade;
	}
	public String getMathsGrade() {
		return mathsGrade;
	}
	public void setMathsGrade(String mathsGrade) {
		this.mathsGrade = mathsGrade;
	}
	public String getChemGrade() {
		return chemGrade;
	}
	public void setChemGrade(String chemGrade) {
		this.chemGrade = chemGrade;
	}
	public double getPhyPoint() {
		return phyPoint;
	}
	public void setPhyPoint(double phyPoint) {
		this.phyPoint = phyPoint;
	}
	public double getMathsPoint() {
		return mathsPoint;
	}
	public void setMathsPoint(double mathsPoint) {
		this.mathsPoint = mathsPoint;
	}
	public double getChempoint() {
		return chempoint;
	}
	public void setChempoint(double chempoint) {
		this.chempoint = chempoint;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", phymark=" + phymark + ", mathsmark=" + mathsmark
				+ ", chemmark=" + chemmark + ", totalmark=" + totalmark + ", percentage=" + percentage + ", phyGrade="
				+ phyGrade + ", mathsGrade=" + mathsGrade + ", chemGrade=" + chemGrade + ", phyPoint=" + phyPoint
				+ ", mathsPoint=" + mathsPoint + ", chempoint=" + chempoint + "]";
	}
	

}
