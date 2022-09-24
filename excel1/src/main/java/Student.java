

import org.apache.poi.xssf.usermodel.XSSFCell;

public class Student {
	private String name;
	private int id;
	private int PhyMark;
	private int MathsMark;
	private int ChemMark;
	
	private int TotalMark ;
	private int Percentage;
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
		return PhyMark;
	}
	public void setPhyMark(int phyMark) {
		PhyMark = phyMark;
	}
	public int getMathsMark() {
		return MathsMark;
	}
	public void setMathsMark(int mathsMark) {
		MathsMark = mathsMark;
	}
	public int getChemMark() {
		return ChemMark;
	}
	public void setChemMark(int chemMark) {
		ChemMark = chemMark;
	}
	public int getTotalMark() {
		return TotalMark;
	}
	public void setTotalMark(int totalMark) {
		TotalMark = totalMark;
	}
	public int getPercentage() {
		return Percentage;
	}
	public void setPercentage(int percentage) {
		Percentage = percentage;
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
		return "Student [name=" + name + ", id=" + id + ", PhyMark=" + PhyMark + ", MathsMark=" + MathsMark
				+ ", ChemMark=" + ChemMark + ", TotalMark=" + TotalMark + ", Percentage=" + Percentage + ", phyGrade="
				+ phyGrade + ", mathsGrade=" + mathsGrade + ", chemGrade=" + chemGrade + ", phyPoint=" + phyPoint
				+ ", mathsPoint=" + mathsPoint + ", chempoint=" + chempoint + "]";
	}
	

}
