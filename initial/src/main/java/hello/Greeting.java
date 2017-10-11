package hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting 
{
	private final long id;
	@JsonProperty("content")
	private final String testContent;
	
	public Greeting(long id, String content)
	{
		this.id = id;
		this.testContent = content;
	}

	/**
	 * @return the id
	 */
	public long getId() 
	{
		return id;
	}

	/**
	 * @return the testContext
	 */
	public String getTestContent() {
		return testContent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Greeting [id=");
		builder.append(id);
		builder.append(", testContext=");
		builder.append(testContent);
		builder.append("]");
		return builder.toString();
	}

}
