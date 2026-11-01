package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۬֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C14538 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f41473;

    /* JADX INFO: renamed from: ۧ */
    public final long f41474;

    /* JADX INFO: renamed from: ܳ */
    public final int f41475;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f41476;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f41477;

    /* JADX INFO: renamed from: ᩳ */
    public final int f41478;

    /* JADX INFO: renamed from: ᩻ */
    public final long f41479;

    public C14538(int i, int i2, boolean z, boolean z2, boolean z3, long j, long j2) {
        this.f41478 = i;
        this.f41475 = i2;
        this.f41473 = z;
        this.f41476 = z2;
        this.f41477 = z3;
        this.f41474 = j;
        this.f41479 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14538)) {
            return false;
        }
        C14538 c14538 = (C14538) obj;
        return this.f41473 == c14538.f41473 && this.f41476 == c14538.f41476 && this.f41477 == c14538.f41477 && this.f41478 == c14538.f41478 && this.f41475 == c14538.f41475 && this.f41474 == c14538.f41474 && this.f41479 == c14538.f41479;
    }

    public final int hashCode() {
        int i = (((((((((this.f41473 ? 1231 : 1237) * 31) + (this.f41476 ? 1231 : 1237)) * 31) + (this.f41477 ? 1231 : 1237)) * 31) + this.f41478) * 31) + this.f41475) * 31;
        long j = this.f41474;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f41479;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f41478), Integer.valueOf(this.f41475), Boolean.valueOf(this.f41473), Boolean.valueOf(this.f41476), Boolean.valueOf(this.f41477), Long.valueOf(this.f41474), Long.valueOf(this.f41479)};
        String[] strArrSplit = "height;length;any;firstValue;lastValue;bitmapBytes;retainedBytes".length() == 0 ? new String[0] : "height;length;any;firstValue;lastValue;bitmapBytes;retainedBytes".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C14538.class, sb, "[");
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
