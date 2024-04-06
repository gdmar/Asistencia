package ar.edu.unju.fi.model;

public class RegistroNotas {
	private String codigo;
	private Alumno alumno;
	private Materia materia ;
	private float notafinal;
	
	
	
	public RegistroNotas(String codigo, Alumno alumno, Materia materia, float notafinal) {
		super();
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notafinal = notafinal;
	}
	
	
	@Override
	public String toString() {
		return "RegistroNotas [codigo=" + codigo + "  -   alumno=" + alumno + " -  materia=" + materia + "- notafinal="
				+ notafinal + "]";
	}


	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	public Materia getMateria() {
		return materia;
	}
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	public float getNotafinal() {
		return notafinal;
	}
	public void setNotafinal(float notafinal) {
		this.notafinal = notafinal;
	}
	
	

}
