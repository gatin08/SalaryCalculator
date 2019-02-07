package salaryPackage;

public class SalaryPresenter {
		
	public static void main(String[] args) {
		//объявление классов, реализующих интерфейсы
		ISalaryView view = new SalaryView();
		ISalaryModel mdl = new SalaryModel();

		//передача данных из представления в модель
		double rawSalary = view.GetValue();
		double[] salaryValues = mdl.Calculate(rawSalary);
		
		//вывод полученных данных в представлении 
		view.DisplayValue(salaryValues);
	}
	
}
