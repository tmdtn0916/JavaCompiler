package hello;

import javax.script.*;

public class ScriptCalculator {
	private static ScriptEngineManager manager;
	private static ScriptEngine engine;
	
	private static void init() {
		if(engine == null) {
			manager = new ScriptEngineManager();
			engine = manager.getEngineByName("JavaScript");
		}
	}
	
	public static Number calc(String exp) throws ExpError {
		if(engine == null) init();
		
		String expression = "eval('" + exp +"')";
		Object result;
		try {
			result = engine.eval(expression);
			if(result instanceof Number) {
				return (Number) result;
			} else {
				throw new ScriptException("");
			}
		} catch (ScriptException e) {
			throw new ExpError();
		}
	}
	
	public static void main(String[] args) throws Exception {
		Number value = ScriptCalculator.calc("-2*(2+5)+10.0");
		System.out.println(value);
	}
}

class ExpError extends RuntimeException {
	protected String reason;
	
	public ExpError() {
		reason = "수식 에러";
	}
	
	public String toString() {
		return reason;
	}
}