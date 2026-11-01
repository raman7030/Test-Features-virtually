package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܰ۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15505 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f44306;

    /* JADX INFO: renamed from: ۜ */
    public final int f44307;

    /* JADX INFO: renamed from: ۧ */
    public final int f44308;

    /* JADX INFO: renamed from: ܳ */
    public final int f44309;

    /* JADX INFO: renamed from: ܽ */
    public final int f44310;

    /* JADX INFO: renamed from: ܿ */
    public final int f44311;

    /* JADX INFO: renamed from: ᩳ */
    public final int f44312;

    /* JADX INFO: renamed from: ᩻ */
    public final int f44313;

    public C15505(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f44307 = i;
        this.f44306 = i2;
        this.f44312 = i3;
        this.f44308 = i4;
        this.f44313 = i5;
        this.f44311 = i6;
        this.f44310 = i7;
        this.f44309 = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15505)) {
            return false;
        }
        C15505 c15505 = (C15505) obj;
        return this.f44307 == c15505.f44307 && this.f44306 == c15505.f44306 && this.f44312 == c15505.f44312 && this.f44308 == c15505.f44308 && this.f44313 == c15505.f44313 && this.f44311 == c15505.f44311 && this.f44310 == c15505.f44310 && this.f44309 == c15505.f44309;
    }

    public final int hashCode() {
        return (((((((((((((this.f44307 * 31) + this.f44306) * 31) + this.f44312) * 31) + this.f44308) * 31) + this.f44313) * 31) + this.f44311) * 31) + this.f44310) * 31) + this.f44309;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f44307), Integer.valueOf(this.f44306), Integer.valueOf(this.f44312), Integer.valueOf(this.f44308), Integer.valueOf(this.f44313), Integer.valueOf(this.f44311), Integer.valueOf(this.f44310), Integer.valueOf(this.f44309)};
        String[] strArrSplit = "startIndex;endIndex;leftStart;leftEnd;rightStart;rightEnd;leftLine;rightLine".length() == 0 ? new String[0] : "startIndex;endIndex;leftStart;leftEnd;rightStart;rightEnd;leftLine;rightLine".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C15505.class, sb, "[");
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
}
