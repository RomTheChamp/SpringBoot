package hello.beans;

public class InputHolder 
{
	private String inputText;

	/**
	 * @return the inputText
	 */
	public String getInputText() {
		return inputText;
	}

	/**
	 * @param inputText the inputText to set
	 */
	public void setInputText(String inputText) {
		this.inputText = inputText;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InputHolder [inputText=");
		builder.append(inputText);
		builder.append("]");
		return builder.toString();
	}
}
