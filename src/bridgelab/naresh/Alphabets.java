package bridgelab.naresh;
import java.util.Scanner;

//complet;
public class Alphabets {
	public static void main(String[] args) {
		System.out.println("main methos started");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of raw");
		int raw = s.nextInt();
		int column = raw;

		Alphabets a = new Alphabets();
//		a.A(raw, column);
		
		a.B(raw, column);
//		a.C(raw, column);
//		a.D(raw, column);
//		a.E(raw, column);
//		a.F(raw, column);
//		a.G1(raw, column);
//		a.G2(raw, column);
//		a.H(raw, column);
//		a.I(raw, column);
//		a.J(raw, column);
//		a.K(raw, column);
//		a.L(raw, column);
//		a.M(raw, column);
//		a.N(raw, column);
//		a.O(raw, column);
//		a.P(raw, column);
//		a.Q(raw, column);
//		a.R(raw, column);
//		a.S(raw, column);
//		a.T(raw, column);
//		a.U(raw, column);
//		a.V(raw, column);
//		a.W(raw, column);
//		a.X(raw, column);
//		a.Y(raw, column);
//		a.Z(raw, column);

		System.out.println("main method ended..");
	}

	void A(int raw, int column) {

		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((j == 0 && i > raw / 2) || (j == column - 1 && i > raw / 2) || (i + j == raw / 2)
						|| j == i + raw / 2 ) {
					System.out.print("**");
				} else if(i == raw / 2 + 1) { 
					System.out.print("**");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void B(int raw, int column) {
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

	void C(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || i == (raw - 1)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void D(int raw, int column) {
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

	void E(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || i == (raw - 1) || (i == (raw / 2) && j <= column / 2)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void F(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || (i == (raw / 2) && j <= column / 2)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void G1(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || i == (raw - 1) || (j == (column - 1) && i >= raw / 2)
						|| ((i == raw / 2) && j >= column / 2)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void G2(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == 0 || (i == raw - 1 && j <= column / 2) || (j == column / 2 && i >= raw / 2)
						|| (i == raw / 2 && j >= column / 2) || (j == i && i >= raw / 2)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}

	void H(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || j == column - 1 || i == (raw / 2)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void I(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == (column / 2) || i == (raw - 1)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void J(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == (column / 2) || (i == (raw - 1) && j <= column / 2)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void K(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 ) {
					System.out.print("**");
				} else if(((i == j || i + j == raw - 1) && j >= column / 2)) { 
					System.out.print(" *** ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void L(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || i == (raw - 1)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void M(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (j == 0 || j == (column - 1) || ((i == j || i + j == raw - 1) && i <= (column / 2))) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void N(int raw, int column) {
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

	void O(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (((i == 0 || j == 0 || i == (raw - 1) || j == (column - 1)) && i != j) && i + j != column - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void P(int raw, int column) {
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

	void Q(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((i == 0 && j != column - 1) || (j == 0 && i != raw - 1) || (i == (raw - 2) && j != column - 1)
						|| (j == (column - 2) && i != raw - 1) || (i == j && i >= raw / 2)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void R(int raw, int column) {
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

	void S(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((i == 0 && i != j) || ((i == raw / 2 && j != 0) && j != column - 1) || (i == (raw - 1) && i != j)
						|| ((j == 0 && i < raw / 2) && i != 0) || ((j == column - 1 && i > raw / 2) && i != raw - 1)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void T(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || j == column / 2) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void U(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((j == 0 && i + j != column - 1) || ((i == raw - 1 && i != j) && i + j != column - 1)
						|| (j == column - 1 && i != j)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void V(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (((j == 0 || j == column - 1) && i <= raw / 2) || i == j + raw / 2 || i + j == raw - 1 + raw / 2) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void W(int raw, int column) {
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

	void X(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == j || i + j == raw - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void Y(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if ((i == j && i <= raw / 2) || (j == column / 2 && i >= raw / 2)
						|| (i + j == raw - 1) && j >= column / 2) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	void Z(int raw, int column) {
		for (int i = 0; i < raw; i++) {
			for (int j = 0; j < column; j++) {
				if (i == 0 || i + j == raw - 1 || i == (raw - 1)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
