package hello;

public class GreetingsFormBean 
{
	private String name;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GreetingsFormBean [name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
