package com.Banco.HomeBanking.Entity;

public class cliente {
	private int ID;
	private int dni;
	private String User;
	private String clave;
	private String nombre;
	private String apellido;
	private String domicilio;
	private String email;
	private String estado;
	
	public cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public cliente(int iD, int dni, String user, String clave, String nombre, String apellido, String domicilio,
			String email, String estado) {
		super();
		this.ID = iD;
		this.dni = dni;
		this.User = user;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.email = email;
		this.estado = estado;
	}

    
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getUser() {
		return User;
	}


	public void setUser(String user) {
		User = user;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
