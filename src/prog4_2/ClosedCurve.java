package prog4_2;

abstract public class ClosedCurve {
	abstract double computeArea();
	
	public String getClassName() {
        String className = this.getClass().getSimpleName(); 
		return className;
    }

}
