package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۚۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6U5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7205 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f18809;

    /* JADX INFO: renamed from: ۧ */
    public final int f18810;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7205)) {
            return false;
        }
        C7205 c7205 = (C7205) obj;
        return this.f18810 == c7205.f18810 && this.f18809 == c7205.f18809;
    }

    public final int hashCode() {
        return (this.f18810 * 31) + this.f18809;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f18810), Integer.valueOf(this.f18809)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder("TextSelection[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16548() {
        return this.f18809;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m16550() {
        return this.f18810;
    }

    public C7205(int i, int i2) {
        if (i < -1 || i2 < -1) {
            throw new IllegalArgumentException("Invalid text selection");
        }
        this.f18810 = i;
        this.f18809 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7205 m16549(int i, int i2, int i3) {
        return new C7205(m16547(this.f18810, i, i2, i3), m16547(this.f18809, i, i2, i3));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m16547(int i, int i2, int i3, int i4) {
        if (i < i2) {
            return i;
        }
        if (i < i3) {
            return (i == i2 || i4 == 0) ? i2 : i2 + ((int) ((((long) (i - i2)) * ((long) i4)) / ((long) (i3 - i2))));
        }
        long j = (((long) i) - ((long) (i3 - i2))) + ((long) i4);
        int i5 = (int) j;
        if (j == i5) {
            return i5;
        }
        throw new ArithmeticException();
    }
}
