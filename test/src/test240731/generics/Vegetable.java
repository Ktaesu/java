package test240731.generics;

import java.util.Objects;

public class Vegetable extends Farm{
	private String name;

	public Vegetable() {
		super();
	}

	public Vegetable(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vegetable [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name, super.getKind());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vegetable) {
			Vegetable v = ((Vegetable)obj);
			if(v.getName().equals(this.getName()) && v.getKind().equals(this.getKind())) {
				return true;
			}
		}
		return false;
	}
	
	
	
	

}
