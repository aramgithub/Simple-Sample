package main;

public abstract class Command {
	protected String name;
	
	public final String getName() {
		return name;
	}
	
	public final void setName(String name) {
		this.name = name;
	}
	
	public abstract boolean parse();
	
	public abstract void execute(Robot robot);
}
