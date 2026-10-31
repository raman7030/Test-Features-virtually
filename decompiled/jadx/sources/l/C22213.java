package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes.dex */
public final class C22213 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f72092;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f72093;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f72094;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f72095;

    public C22213(boolean z, long j, long j2, String str) {
        this.f72093 = z;
        this.f72095 = j;
        this.f72094 = j2;
        this.f72092 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22213)) {
            return false;
        }
        C22213 c22213 = (C22213) obj;
        return this.f72093 == c22213.f72093 && this.f72095 == c22213.f72095 && this.f72094 == c22213.f72094 && C11003.equals(this.f72092, c22213.f72092);
    }

    public final int hashCode() {
        int i = this.f72093 ? 1231 : 1237;
        long j = this.f72095;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f72094;
        return C11003.hashCode(this.f72092) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f72093), Long.valueOf(this.f72095), Long.valueOf(this.f72094), this.f72092};
        String[] strArrSplit = "lan;warmupMillis;splitTimeThresholdSeconds;downloadHost".length() == 0 ? new String[0] : "lan;warmupMillis;splitTimeThresholdSeconds;downloadHost".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C22213.class, sb, "[");
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
    public final long m49887() {
        return this.f72094;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m49888() {
        return this.f72095;
    }
}
