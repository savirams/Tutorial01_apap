
public class Dosen {
	int Npm;
	String name;
	String Profesi;
	public Dosen(int npm, String name, String profesi) {
		Npm = npm;
		this.name = name;
		Profesi = profesi;
	}
	public int getNpm() {
		return Npm;
	}
	public void setNpm(int npm) {
		Npm = npm;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfesi() {
		return Profesi;
	}
	public void setProfesi(String profesi) {
		Profesi = profesi;
	}
	
	
}
