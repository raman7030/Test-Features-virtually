package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6U5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5089 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f15974;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f15975;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5089)) {
            return false;
        }
        C5089 c5089 = (C5089) obj;
        return this.f15975 == c5089.f15975 && this.f15974 == c5089.f15974;
    }

    public final int hashCode() {
        return (this.f15975 * 31) + this.f15974;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f15975), Integer.valueOf(this.f15974)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14640() {
        return this.f15974;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m14642() {
        return this.f15975;
    }

    public C5089(int i, int i2) {
        if (i < -1 || i2 < -1) {
            throw new IllegalArgumentException("Invalid text selection");
        }
        this.f15975 = i;
        this.f15974 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5089 m14641(int i, int i2, int i3) {
        return new C5089(m14639(this.f15975, i, i2, i3), m14639(this.f15974, i, i2, i3));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m14639(int i, int i2, int i3, int i4) {
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
