package co.grandcircus.springlab;

public class Grade {

	private Long id;
	private String name;
	private String type;
	private Double score;
	private Double total;

	public Grade() {
	}

	public Grade(Long id, String name, Double score, Double total ) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", name=" + name + ", score="
				+ score + ", total=" + total + "]";
	}

}
