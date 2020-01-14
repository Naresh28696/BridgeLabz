package bridgelab.naresh;

import java.util.Scanner;

public class PrintInitials {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Name :");
		String str = scan.nextLine();

		String intials = initials(str);

		printPattern(intials);

	}

	public static String initials(String str) {
		int len = str.length();
		String returnStr = "";
		for (int i = 0; i < len; i++) {
			if (i == 0 && str.charAt(i) != ' ') {
				returnStr = returnStr + str.charAt(i);
			} else if (str.charAt(i) == ' ') {
				returnStr = returnStr + str.charAt(i + 1);
			}
		}
		return returnStr;
	}

	public static void printPattern(String str) {
		str = str.toUpperCase();

		int len = str.length();

		for (int i = 0; i < len; i++) {
			System.out.println(str.charAt(i));

			switch (str.charAt(i)) {
			case 'A':
				A(9, 9);
				break;
			case 'B':
				B(9, 9);
				break;
			case 'D':
				D(9, 9);
				break;
			case 'N':
				N(9, 9);
				break;
			case 'K':
				K(9, 9);
				break;
			case 'R':
				R(9, 9);
				break;
			case 'P':
				P(9, 9);
				break;
			case 'W':
				W(9, 9);
				break;
			default:
				System.out.println("initial not avilable");
				break;
			}

		}
	}

	static void A(int raw, int column) {

		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((j == 0 && i > raw / 2) || (j == column - 1 && i > raw / 2) || (i + j == raw / 2)
						|| j == i + raw / 2) {
					System.out.print("**");
				} else if (i == raw / 2 + 1) {
					System.out.print("**");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void B(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || (j == (column - 1) && i != (raw / 2)) || (i == (raw / 2) && j != (column - 1))
						|| i == (raw - 1)) {
					System.out.print("**");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void D(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 1 || (i == 0 && j != column - 1) || (i == raw - 1 && j != column - 1)
						|| (j == (column - 1) && i != j && i + j != column - 1)) {
					System.out.print("**");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void K(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0) {
					System.out.print("**");
				} else if (((i == j || i + j == raw - 1) && j >= column / 2)) {
					System.out.print(" *** ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void N(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || j == column - 1 || i == j) {
					System.out.print("**");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void P(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || (i == 0 && j != column - 1) || (i == (raw / 2) && j != column - 1)
						|| ((j == (column - 1) && i < raw / 2) && i != 0)) {
					System.out.print("**");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void R(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((i == 0 && j != column - 1) || j == 0 || ((j == (column - 1) && i < raw / 2) && i != 0)
						|| (i == raw / 2 && j != column - 1) || (i == j && j >= column / 2)) {
					System.out.print("**");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	static void W(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || j == column - 1 || (i == j && i >= raw / 2) || (i + j == raw - 1 && i >= raw / 2)) {
					System.out.print("**");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}
}
