package p067l;

/* JADX INFO: renamed from: l.ᩴ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 428G */
/* JADX INFO: loaded from: classes4.dex */
public final class C20072 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f61008;

    /* JADX INFO: renamed from: ۧ */
    public final C5990 f61009;

    public C20072(C5990 c5990, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f61009 = c5990;
        int length = iArr.length;
        int i = 1;
        if (length > 1 && iArr[0] == 0) {
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f61008 = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.f61008 = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        this.f61008 = iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m45451() {
        return this.f61008;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m45452() {
        return this.f61008.length - 1;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m45455() {
        return this.f61008[0] == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20072 m45450(C20072 c20072) {
        C5990 c5990 = c20072.f61009;
        C5990 c5991 = this.f61009;
        if (!c5991.equals(c5990)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m45455()) {
            return c20072;
        }
        if (c20072.m45455()) {
            return this;
        }
        int[] iArr = c20072.f61008;
        int[] iArr2 = this.f61008;
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
        return new C20072(c5991, iArr3);
    }

    /* JADX INFO: renamed from: ܽ */
    public final C20072 m45454(C20072 c20072) {
        C5990 c5990 = c20072.f61009;
        C5990 c5991 = this.f61009;
        if (!c5991.equals(c5990)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m45455() || c20072.m45455()) {
            return c5991.m13434();
        }
        int[] iArr = this.f61008;
        int length = iArr.length;
        int[] iArr2 = c20072.f61008;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = iArr3[i4] ^ c5991.m13433(i2, iArr2[i3]);
            }
        }
        return new C20072(c5991, iArr3);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20072 m45449(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        C5990 c5990 = this.f61009;
        if (i2 == 0) {
            return c5990.m13434();
        }
        int[] iArr = this.f61008;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = c5990.m13433(iArr[i3], i2);
        }
        return new C20072(c5990, iArr2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C20072[] m45453(C20072 c20072) {
        C5990 c5990 = c20072.f61009;
        C5990 c5991 = this.f61009;
        if (!c5991.equals(c5990)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c20072.m45455()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        C20072 c20072M13434 = c5991.m13434();
        int iM45452 = c20072.m45452();
        int[] iArr = c20072.f61008;
        int iM13432 = c5991.m13432(iArr[(iArr.length - 1) - iM45452]);
        C20072 c20072M45450 = this;
        while (c20072M45450.m45452() >= c20072.m45452() && !c20072M45450.m45455()) {
            int iM45453 = c20072M45450.m45452() - c20072.m45452();
            int iM45454 = c20072M45450.m45452();
            int[] iArr2 = c20072M45450.f61008;
            int iM13433 = c5991.m13433(iArr2[(iArr2.length - 1) - iM45454], iM13432);
            C20072 c20072M45449 = c20072.m45449(iM45453, iM13433);
            c20072M13434 = c20072M13434.m45450(c5991.m13431(iM45453, iM13433));
            c20072M45450 = c20072M45450.m45450(c20072M45449);
        }
        return new C20072[]{c20072M13434, c20072M45450};
    }

    public final String toString() {
        if (m45455()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(m45452() * 8);
        for (int iM45452 = m45452(); iM45452 >= 0; iM45452--) {
            int[] iArr = this.f61008;
            int i = iArr[(iArr.length - 1) - iM45452];
            if (i != 0) {
                if (i < 0) {
                    if (iM45452 == m45452()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM45452 == 0 || i != 1) {
                    int iM13435 = this.f61009.m13435(i);
                    if (iM13435 == 0) {
                        sb.append('1');
                    } else if (iM13435 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(iM13435);
                    }
                }
                if (iM45452 != 0) {
                    if (iM45452 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM45452);
                    }
                }
            }
        }
        return sb.toString();
    }
}
