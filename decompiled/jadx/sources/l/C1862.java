package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes2.dex */
public final class C1862 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f6349;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f6350;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f6351;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f6352;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f6353;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f6354;

    public C1862(long j, int i, long j2, long j3, boolean z, boolean z2) {
        this.f6354 = j;
        this.f6352 = i;
        this.f6350 = j2;
        this.f6353 = j3;
        this.f6351 = z;
        this.f6349 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1862)) {
            return false;
        }
        C1862 c1862 = (C1862) obj;
        return this.f6351 == c1862.f6351 && this.f6349 == c1862.f6349 && this.f6352 == c1862.f6352 && this.f6354 == c1862.f6354 && this.f6350 == c1862.f6350 && this.f6353 == c1862.f6353;
    }

    public final int hashCode() {
        int i = (((((this.f6351 ? 1231 : 1237) * 31) + (this.f6349 ? 1231 : 1237)) * 31) + this.f6352) * 31;
        long j = this.f6354;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f6350;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f6353;
        return i3 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f6354), Integer.valueOf(this.f6352), Long.valueOf(this.f6350), Long.valueOf(this.f6353), Boolean.valueOf(this.f6351), Boolean.valueOf(this.f6349)};
        String[] strArrSplit = "offset;crc;compressedSize;size;zip64Sizes;allow32BitSizes".length() == 0 ? new String[0] : "offset;crc;compressedSize;size;zip64Sizes;allow32BitSizes".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1862.class, sb, "[");
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
