package salaryPackage;

import java.util.Scanner;

public class SalaryView implements ISalaryView {
	
	@Override
	public double GetValue() {
		try {
		Scanner input = new Scanner(System.in);
		System.out.print("Введите размер зарплаты до вычета налогов: ");		
		//ввод данных
		double number = input.nextDouble();		
		input.close();		
		return number;
		}
		catch (Exception ex)	//закрытие при ошибке
		{
			System.out.print("Ошибка ввода");
			System.exit(1);
			return -1;
		}
	}

	@Override
	public void DisplayValue(double[] output) {
		//вывод данных
		System.out.println("Размер зарплаты после вычета налогов: " + output[0]);
		System.out.println("НДФЛ 13%, уплоченный работником: " + output[1]);
		System.out.println("Взносы в фонды, уплоченные работодателем: "+ output[2]);
		
	}

}
