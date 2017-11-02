package hello.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting 
{
	private final long id;
	@JsonProperty("content")
	private final String testContent;
	@JsonProperty("foundNumber")
	private int numberFromSort;
	@JsonProperty("isPrimeNumber")
	private boolean primeNumber;
	
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

	public int getResultOfSort() {
		return numberFromSort;
	}

	public void setResultOfSort(int resultOfSort) {
		this.numberFromSort = resultOfSort;
	}

	public int getNumberFromSort() {
		return numberFromSort;
	}

	public void setNumberFromSort(int numberFromSort) {
		this.numberFromSort = numberFromSort;
	}

	public boolean isPrimeNumber() {
		return primeNumber;
	}

	public void setPrimeNumber(boolean primeNumber) {
		this.primeNumber = primeNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Greeting [id=");
		builder.append(id);
		builder.append(", testContent=");
		builder.append(testContent);
		builder.append(", numberFromSort=");
		builder.append(numberFromSort);
		builder.append(", primeNumber=");
		builder.append(primeNumber);
		builder.append("]");
		return builder.toString();
	}

}
