package p067l;

/* JADX INFO: renamed from: l.ۡ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes3.dex */
public final class C11016 {

    /* JADX INFO: renamed from: ֫ */
    public int f30510;

    /* JADX INFO: renamed from: ۧ */
    public int f30511;

    /* JADX INFO: renamed from: ܽ */
    public final C17720[] f30512;

    /* JADX INFO: renamed from: ᩳ */
    public int f30513;

    /* JADX INFO: renamed from: ֫ */
    public static void m25419(C11016 c11016, C3838 c3838) {
        c11016.getClass();
        C17720[] c17720Arr = c11016.f30512;
        int length = c17720Arr.length;
        int i = c11016.f30511;
        if (i > -1) {
            length *= -1;
        }
        c3838.m7532(length);
        for (C17720 c17720 : c17720Arr) {
            C17720.m40271(c17720, c3838);
        }
        if (i > -1) {
            c3838.m7530(i);
        }
    }

    public C11016(C17720[] c17720Arr, int i) {
        this.f30512 = c17720Arr;
        this.f30511 = i;
    }

    public C11016(C5651 c5651, C12556 c12556) {
        int iM28946 = c12556.m28946();
        if (iM28946 < 0) {
            this.f30512 = new C17720[iM28946 * (-1)];
        } else {
            this.f30512 = new C17720[iM28946];
        }
        int i = 0;
        while (true) {
            C17720[] c17720Arr = this.f30512;
            if (i >= c17720Arr.length) {
                break;
            }
            try {
                c17720Arr[i] = new C17720(c5651, c12556);
                i++;
            } catch (Exception e) {
                throw C17919.m40738("Error while reading EncodedTypeAddrPair at index " + i, e);
            }
        }
        if (iM28946 <= 0) {
            this.f30511 = c12556.m28943();
        } else {
            this.f30511 = -1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m25420() {
        return this.f30511;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25418(C11016 c11016) {
        return c11016.f30513 - c11016.f30510;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m25417(int i, int i2, C11016 c11016) {
        c11016.f30513 = i;
        c11016.f30510 = i2;
        C17720[] c17720Arr = c11016.f30512;
        int length = c17720Arr.length;
        int i3 = c11016.f30511;
        if (i3 > -1) {
            length *= -1;
            i += C12981.m29759(i3);
        }
        int iM29773 = C12981.m29773(length) + i;
        for (C17720 c17720 : c17720Arr) {
            iM29773 += C17720.m40270(c17720);
        }
        return iM29773;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (C17720 c17720 : this.f30512) {
            iHashCode = (iHashCode * 31) + c17720.hashCode();
        }
        return (iHashCode * 31) + this.f30511;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11016.class.equals(obj.getClass())) {
            C11016 c11016 = (C11016) obj;
            C17720[] c17720Arr = c11016.f30512;
            C17720[] c17720Arr2 = this.f30512;
            if (c17720Arr2.length == c17720Arr.length && this.f30511 == c11016.f30511) {
                for (int i = 0; i < c17720Arr2.length; i++) {
                    if (!c17720Arr2[i].equals(c17720Arr[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
