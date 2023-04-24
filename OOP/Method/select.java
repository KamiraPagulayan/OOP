import java.util.Scanner;

public class COM221_Act3_RICO {
    public static void main(String[] args) {
        
        Selection();

    }

    public static void Selection() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Figures:");
        System.out.println("(A) Square");
        System.out.println("(B) Left Half Triangle");
        System.out.println("(C) Inverted Left Half Triangle");
        System.out.println("(D) Left Hollow Half Triangle");
        System.out.println("(E) Inverted Left Hollow Half Triangle");
        System.out.println("(F) Right Half Triangle");
        System.out.println("(G) Inverted Right Half Triangle");
        System.out.println("(H) Right Hollow Half Triangle");
        System.out.println("(I) Inverted Right Hollow Half Triangle");
        System.out.println("(J) Full Triangle");
        System.out.println("(K) Inverted Full Triangle");
        System.out.println("(L) Full Hollow Triangle");
        System.out.println("(M) Inverted Full Hollow Triangle");
        System.out.println("(N) Half Left Diamond");
        System.out.println("(O) Half Right Diamond");

        System.out.print("Enter the number of the figure to select:");
        char select = sc.next().charAt(0);
        
        System.out.print("Enter the size of the figure: ");
        int n = sc.nextInt();

        switch (select) {
            case 'a':
                System.out.print(Square(n));;
                break;
            case 'b':
                System.out.print(LeftHalfTriangle(n));
                break;
            case 'c':
                System.out.print(InvertedLeftHalfTriangle(n));
                break;
            case 'd':
                System.out.print(LeftHollowHalfTriangle(n));
                break;
            case 'e':
                System.out.print(InvertedLeftHollowHalfTriangle(n));
                break;
            case 'f':
                System.out.print(RightHalfTriangle(n));
                break;
            case 'g':
                System.out.print(InvertedRightHalfTriangle(n));
                break;
            case 'h':
                System.out.print(RightHollowHalfTriangle(n));
                break;
            case 'i':
                System.out.print(InvertedRightHollowHalfTriangle(n));
                break;
            case 'j':
                System.out.print(FullTriangle(n));
                break;
            case 'k':
                System.out.print(InvertedFullTriangle(n));
                break;
            case 'l':
                System.out.print(FullHollowTriangle(n));
                break;
            case 'm':
                System.out.print(InvertedFullHollowTriangle(n));
                break;
            case 'n':
                System.out.print(HalfLeftDiamond(n));
                break;
            case 'o':
                System.out.print(HalfRightDiamond(n));
                break;
        }
    }
    
    public static String Square(int n) {
        String figure = "";
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=n; c++) {
                figure += "* ";
            }
            figure += "\n";
        }
        return figure;
    }

    public static String LeftHalfTriangle(int n) {
        String figure = "";
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=r; c++) {
                figure += "* ";
            }
            figure += "\n";
        }
        return figure;
    }

    public static String InvertedLeftHalfTriangle(int n) {
        String figure = "";
        for (int r=n; r>=1; r--) {
            for (int c=1; c<=r; c++) {
                figure += "* ";
            }
            figure += "\n";
        }
        return figure;
    }

    public static String LeftHollowHalfTriangle(int n) {
        String figure = "";
        for (int r=1; r<=n; r++) {
            for (int c=1; c<=r; c++) {
                if (c==1||r==n||c==r) {
                    figure += "* ";
                } else {
                    figure += "  ";
                }
            }
            figure += "\n";
        }
        return figure;
    }

    public static String InvertedLeftHollowHalfTriangle(int n) {
        String figure = "";
        for (int r=n; r>=1; r--) {
            for (int c=1; c<=r; c++) {
                if (c==1||r==n||c==r) {
                    figure += "* ";
                } else {
                    figure += "  ";
                }
            }
            figure += "\n";
        }
        return figure;
    }

    public static String RightHalfTriangle(int n) {
        String figure = "";
        for (int r=1; r<=n; r++) {
            for (int s=n; s>=r; s--) {
                figure += "  ";
            }
            for (int o=1; o<=r; o++) {
                figure += "* ";
            }
            figure += "\n";
        }
        return figure;
    }

    public static String InvertedRightHalfTriangle(int n) {
        String figure = "";
        for (int r=n; r>=1; r--) {
            for (int s=n; s>=r; s--) {
                figure += "  ";
            }
            for (int o=1; o<=r; o++) {
                figure += "* ";
            }
            figure += "\n";
        }
        return figure;
    }

    public static String RightHollowHalfTriangle(int n) {
        String figure = "";
        for (int r=1; r<=n; r++) {
            for (int s=n; s>=r; s--) {
                figure += "  ";
            }
            for (int o=1; o<=r; o++) {
                figure += "* ";
            }
            figure += "\n";
        }
        return figure;
    }

    public static String InvertedRightHollowHalfTriangle(int n) {
        String figure = "";
        for (int r=n; r>=1; r--) {
            for (int s=n; s>=r; s--) {
                figure += "  ";
            }
            for (int o=1; o<=r; o++) {
                if (o==1||r==n||o==r) {
                    figure += "* ";
                } else {
                    figure += "  ";
                }
            }
            figure += "\n";
        }
        return figure;
    }

    public static String FullTriangle(int n) {
        String figure = "";
        for (int r=1; r<=n; r++) {
            for (int s=n; s>=r; s--) {
                figure += "  ";
            }
            for (int o=1; o<=r*2-1; o++) {
                figure += "* ";
            }
            figure += "\n";
        }
        return figure;
    }

    public static String InvertedFullTriangle(int n) {
        String figure = "";
        for (int r=n; r>=1; r--) {
            for (int s=n; s>=r; s--) {
                figure += "  ";
            }
            for (int o=1; o<=r*2-1; o++) {
                figure += "* ";
            }
            figure += "\n";
        }
        return figure;
    }

    public static String FullHollowTriangle(int n) {
        String figure = "";
        for (int r=1; r<=n; r++) {
            for (int s=n; s>=r; s--) {
                figure += "  ";
            }
            for (int o=1; o<=r*2-1; o++) {
                if (o==1||r==n||o==r*2-1) {
                    figure += "* ";
                } else {
                    figure += "  ";
                }
            }
            figure += "\n";
        }
        return figure;
    }

    public static String InvertedFullHollowTriangle(int n) {
        String figure = "";
        for (int r=n; r>=1; r--) {
            for (int s=n; s>=r; s--) {
                figure += "  ";
            }
            for (int o=1; o<=r*2-1; o++) {
                if (o==1||r==n||o==r*2-1) {
                    figure += "* ";
                } else {
                    figure += "  ";
                }
            }
            figure += "\n";
        }
        return figure;
    }

    public static String HalfLeftDiamond(int n) {
        String figure = "";
        for (int r=1; r<=n/2; r++) {
            for (int o=1; o<=r; o++) {
                figure += "* ";
            }
            figure += "\n";
        }
        for (int r=n/2+1; r>=1; r--) {
            for (int o=1; o<=r; o++) {
                figure += "* ";
            }
            figure += "\n";
        }
        return figure;
    }

    public static String HalfRightDiamond(int n) {
        String figure = "";
        for (int r=1; r<=n/2; r++) {
            for (int o=1; o<=r; o++) {
                if (o==1||o==r) {
                    figure += "* ";
                } else {
                    figure += "  ";
                }
                figure += "\n";
            }
        }
        for (int r=n/2+1; r>=1; r--) {
            for (int o=1; o<=r; o++) {
                if (o==1||o==r) {
                    figure += "* ";
                } else {
                    figure += "  ";
                }
            }
            figure += "\n";
        }
        return figure;
    }
}
