package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩹ۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes.dex */
public final class C23489 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f74829;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f74830;

    /* JADX INFO: renamed from: ۡ */
    public final int f74831;

    /* JADX INFO: renamed from: ۢ */
    public final int f74832;

    /* JADX INFO: renamed from: ۧ */
    public final int f74833;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f74834;

    /* JADX INFO: renamed from: ܽ */
    public final int f74835;

    /* JADX INFO: renamed from: ܿ */
    public final int f74836;

    /* JADX INFO: renamed from: ᩳ */
    public final String f74837;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f74838;

    /* JADX INFO: renamed from: ᩻ */
    public final int f74839;

    public C23489(int i, int i2, int i3, int i4, int i5, String str, boolean z, boolean z2, boolean z3, boolean z4, int i6) {
        this.f74832 = i;
        this.f74833 = i2;
        this.f74831 = i3;
        this.f74839 = i4;
        this.f74836 = i5;
        this.f74837 = str;
        this.f74834 = z;
        this.f74830 = z2;
        this.f74838 = z3;
        this.f74829 = z4;
        this.f74835 = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23489)) {
            return false;
        }
        C23489 c23489 = (C23489) obj;
        return this.f74834 == c23489.f74834 && this.f74830 == c23489.f74830 && this.f74838 == c23489.f74838 && this.f74829 == c23489.f74829 && this.f74832 == c23489.f74832 && this.f74833 == c23489.f74833 && this.f74831 == c23489.f74831 && this.f74839 == c23489.f74839 && this.f74836 == c23489.f74836 && this.f74835 == c23489.f74835 && C12826.equals(this.f74837, c23489.f74837);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f74837) + ((((((((((((((((((((this.f74834 ? 1231 : 1237) * 31) + (this.f74830 ? 1231 : 1237)) * 31) + (this.f74838 ? 1231 : 1237)) * 31) + (this.f74829 ? 1231 : 1237)) * 31) + this.f74832) * 31) + this.f74833) * 31) + this.f74831) * 31) + this.f74839) * 31) + this.f74836) * 31) + this.f74835) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f74832), Integer.valueOf(this.f74833), Integer.valueOf(this.f74831), Integer.valueOf(this.f74839), Integer.valueOf(this.f74836), this.f74837, Boolean.valueOf(this.f74834), Boolean.valueOf(this.f74830), Boolean.valueOf(this.f74838), Boolean.valueOf(this.f74829), Integer.valueOf(this.f74835)};
        String[] strArrSplit = "start;end;type;indent;gapEnd;gap;hardBreak;protectedText;softBefore;continuation;functionEnd".length() == 0 ? new String[0] : "start;end;type;indent;gapEnd;gap;hardBreak;protectedText;softBefore;continuation;functionEnd".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C23489.class, sb, "[");
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
