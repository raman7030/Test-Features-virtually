package l;

/* JADX INFO: renamed from: l.ᩴ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 428G */
/* JADX INFO: loaded from: classes4.dex */
public final class C18628 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f57785;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3811 f57786;

    public C18628(C3811 c3811, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f57786 = c3811;
        int length = iArr.length;
        int i = 1;
        if (length > 1 && iArr[0] == 0) {
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f57785 = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.f57785 = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        this.f57785 = iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m43185() {
        return this.f57785;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m43186() {
        return this.f57785.length - 1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m43189() {
        return this.f57785[0] == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18628 m43184(C18628 c18628) {
        C3811 c3811 = c18628.f57786;
        C3811 c3812 = this.f57786;
        if (!c3812.equals(c3811)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m43189()) {
            return c18628;
        }
        if (c18628.m43189()) {
            return this;
        }
        int[] iArr = c18628.f57785;
        int[] iArr2 = this.f57785;
        if (iArr2.length > iArr.length) {
            iArr2 = iArr;
            iArr = iArr2;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new C18628(c3812, iArr3);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18628 m43188(C18628 c18628) {
        C3811 c3811 = c18628.f57786;
        C3811 c3812 = this.f57786;
        if (!c3812.equals(c3811)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m43189() || c18628.m43189()) {
            return c3812.m11498();
        }
        int[] iArr = this.f57785;
        int length = iArr.length;
        int[] iArr2 = c18628.f57785;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = iArr3[i4] ^ c3812.m11497(i2, iArr2[i3]);
            }
        }
        return new C18628(c3812, iArr3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18628 m43183(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        C3811 c3811 = this.f57786;
        if (i2 == 0) {
            return c3811.m11498();
        }
        int[] iArr = this.f57785;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = c3811.m11497(iArr[i3], i2);
        }
        return new C18628(c3811, iArr2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18628[] m43187(C18628 c18628) {
        C3811 c3811 = c18628.f57786;
        C3811 c3812 = this.f57786;
        if (!c3812.equals(c3811)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c18628.m43189()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        C18628 c18628M11498 = c3812.m11498();
        int iM43186 = c18628.m43186();
        int[] iArr = c18628.f57785;
        int iM11496 = c3812.m11496(iArr[(iArr.length - 1) - iM43186]);
        C18628 c18628M43184 = this;
        while (c18628M43184.m43186() >= c18628.m43186() && !c18628M43184.m43189()) {
            int iM43187 = c18628M43184.m43186() - c18628.m43186();
            int iM43188 = c18628M43184.m43186();
            int[] iArr2 = c18628M43184.f57785;
            int iM11497 = c3812.m11497(iArr2[(iArr2.length - 1) - iM43188], iM11496);
            C18628 c18628M43183 = c18628.m43183(iM43187, iM11497);
            c18628M11498 = c18628M11498.m43184(c3812.m11495(iM43187, iM11497));
            c18628M43184 = c18628M43184.m43184(c18628M43183);
        }
        return new C18628[]{c18628M11498, c18628M43184};
    }

    public final String toString() {
        if (m43189()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(m43186() * 8);
        for (int iM43186 = m43186(); iM43186 >= 0; iM43186--) {
            int[] iArr = this.f57785;
            int i = iArr[(iArr.length - 1) - iM43186];
            if (i != 0) {
                if (i < 0) {
                    if (iM43186 == m43186()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM43186 == 0 || i != 1) {
                    int iM11499 = this.f57786.m11499(i);
                    if (iM11499 == 0) {
                        sb.append('1');
                    } else if (iM11499 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iM11499);
                    }
                }
                if (iM43186 != 0) {
                    if (iM43186 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM43186);
                    }
                }
            }
        }
        return sb.toString();
    }
}
