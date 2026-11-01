package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۙۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6723 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence f17448;

    /* JADX INFO: renamed from: ۧ */
    public final C24408 f17449;

    /* JADX INFO: renamed from: ܳ */
    public final String f17450;

    /* JADX INFO: renamed from: ܽ */
    public final int f17451;

    /* JADX INFO: renamed from: ܿ */
    public final int f17452;

    /* JADX INFO: renamed from: ᩳ */
    public final String f17453;

    public C6723(C24408 c24408, int i, String str, String str2, String str3, int i2) {
        this.f17449 = c24408;
        this.f17452 = i;
        this.f17453 = str;
        this.f17450 = str2;
        this.f17448 = str3;
        this.f17451 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6723)) {
            return false;
        }
        C6723 c6723 = (C6723) obj;
        return this.f17452 == c6723.f17452 && this.f17451 == c6723.f17451 && C12826.equals(this.f17449, c6723.f17449) && C12826.equals(this.f17453, c6723.f17453) && C12826.equals(this.f17450, c6723.f17450) && C12826.equals(this.f17448, c6723.f17448);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f17448) + C21720.m49003(C21720.m49003((C12826.hashCode(this.f17449) + C6316.m14441(this.f17452, 31, this.f17451, 31)) * 31, 31, this.f17453), 31, this.f17450);
    }

    public final String toString() {
        Object[] objArr = {this.f17449, Integer.valueOf(this.f17452), this.f17453, this.f17450, this.f17448, Integer.valueOf(this.f17451)};
        String[] strArrSplit = "group;trackIndex;trackId;trackLabel;displayName;logicalIndex".length() == 0 ? new String[0] : "group;trackIndex;trackId;trackLabel;displayName;logicalIndex".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C6723.class, sb, "[");
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
    public final CharSequence m15363() {
        return this.f17448;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m15364() {
        return this.f17450;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m15365() {
        return this.f17453;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24408 m15366() {
        return this.f17449;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m15367() {
        return this.f17451;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m15368() {
        return this.f17452;
    }
}
