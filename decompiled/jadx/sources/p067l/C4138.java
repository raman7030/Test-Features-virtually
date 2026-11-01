package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֫ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4138 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f9130;

    /* JADX INFO: renamed from: ۧ */
    public final long f9131;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f9132;

    /* JADX INFO: renamed from: ܽ */
    public final int f9133;

    /* JADX INFO: renamed from: ܿ */
    public final long f9134;

    /* JADX INFO: renamed from: ᩳ */
    public final long f9135;

    public C4138(long j, int i, long j2, long j3, boolean z, boolean z2) {
        this.f9135 = j;
        this.f9133 = i;
        this.f9131 = j2;
        this.f9134 = j3;
        this.f9132 = z;
        this.f9130 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4138)) {
            return false;
        }
        C4138 c4138 = (C4138) obj;
        return this.f9132 == c4138.f9132 && this.f9130 == c4138.f9130 && this.f9133 == c4138.f9133 && this.f9135 == c4138.f9135 && this.f9131 == c4138.f9131 && this.f9134 == c4138.f9134;
    }

    public final int hashCode() {
        int i = (((((this.f9132 ? 1231 : 1237) * 31) + (this.f9130 ? 1231 : 1237)) * 31) + this.f9133) * 31;
        long j = this.f9135;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f9131;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f9134;
        return i3 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f9135), Integer.valueOf(this.f9133), Long.valueOf(this.f9131), Long.valueOf(this.f9134), Boolean.valueOf(this.f9132), Boolean.valueOf(this.f9130)};
        String[] strArrSplit = "offset;crc;compressedSize;size;zip64Sizes;allow32BitSizes".length() == 0 ? new String[0] : "offset;crc;compressedSize;size;zip64Sizes;allow32BitSizes".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C4138.class, sb, "[");
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
