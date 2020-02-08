import Small

class_SJ Test {
	int_sj i, j, k;
	float_sj float;
	string_ str;
    main_SJ {
        i := 1; j := 1; k := 4;
        Si (!(i < j) & !(k != j)) Alors {
            i := 0 + 1;
        } Sinon {
            j := 2 + 1;
        }
        Si (3 > 2) Alors {
            k := 7;
            Out_SJ("%s", j);
            In_SJ("%d", k);
        }
        /*Si (1 < "fff") Alors {
                    k := 7;
                    Out_SJ("%s", j);
                    In_SJ("%d", k);
                }
        k:= 2;*/
    }
}