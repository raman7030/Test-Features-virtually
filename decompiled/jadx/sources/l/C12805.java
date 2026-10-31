package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۬֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C12805 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f38431;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f38432;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f38433;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f38434;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f38435;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f38436;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f38437;

    public C12805(int i, int i2, boolean z, boolean z2, boolean z3, long j, long j2) {
        this.f38436 = i;
        this.f38433 = i2;
        this.f38431 = z;
        this.f38434 = z2;
        this.f38435 = z3;
        this.f38432 = j;
        this.f38437 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12805)) {
            return false;
        }
        C12805 c12805 = (C12805) obj;
        return this.f38431 == c12805.f38431 && this.f38434 == c12805.f38434 && this.f38435 == c12805.f38435 && this.f38436 == c12805.f38436 && this.f38433 == c12805.f38433 && this.f38432 == c12805.f38432 && this.f38437 == c12805.f38437;
    }

    public final int hashCode() {
        int i = (((((((((this.f38431 ? 1231 : 1237) * 31) + (this.f38434 ? 1231 : 1237)) * 31) + (this.f38435 ? 1231 : 1237)) * 31) + this.f38436) * 31) + this.f38433) * 31;
        long j = this.f38432;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f38437;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f38436), Integer.valueOf(this.f38433), Boolean.valueOf(this.f38431), Boolean.valueOf(this.f38434), Boolean.valueOf(this.f38435), Long.valueOf(this.f38432), Long.valueOf(this.f38437)};
        String[] strArrSplit = "height;length;any;firstValue;lastValue;bitmapBytes;retainedBytes".length() == 0 ? new String[0] : "height;length;any;firstValue;lastValue;bitmapBytes;retainedBytes".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C12805.class, sb, "[");
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
