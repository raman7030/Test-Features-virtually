package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩹ۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes.dex */
public final class C23480 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f74812;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f74813;

    /* JADX INFO: renamed from: ܽ */
    public final long f74814;

    /* JADX INFO: renamed from: ᩳ */
    public final long f74815;

    public C23480(boolean z, long j, long j2, String str) {
        this.f74813 = z;
        this.f74815 = j;
        this.f74814 = j2;
        this.f74812 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23480)) {
            return false;
        }
        C23480 c23480 = (C23480) obj;
        return this.f74813 == c23480.f74813 && this.f74815 == c23480.f74815 && this.f74814 == c23480.f74814 && C12826.equals(this.f74812, c23480.f74812);
    }

    public final int hashCode() {
        int i = this.f74813 ? 1231 : 1237;
        long j = this.f74815;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f74814;
        return C12826.hashCode(this.f74812) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f74813), Long.valueOf(this.f74815), Long.valueOf(this.f74814), this.f74812};
        String[] strArrSplit = "lan;warmupMillis;splitTimeThresholdSeconds;downloadHost".length() == 0 ? new String[0] : "lan;warmupMillis;splitTimeThresholdSeconds;downloadHost".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C23480.class, sb, "[");
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
    public final long m52214() {
        return this.f74814;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m52215() {
        return this.f74815;
    }
}
