package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7546 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f23313;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f23314;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f23315;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7693 f23316;

    public C7546(int i, long j, C7693 c7693, byte[] bArr) {
        this.f23313 = bArr;
        this.f23315 = i;
        this.f23314 = j;
        this.f23316 = c7693;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7546)) {
            return false;
        }
        C7546 c7546 = (C7546) obj;
        return this.f23315 == c7546.f23315 && this.f23314 == c7546.f23314 && C11003.equals(this.f23313, c7546.f23313) && C11003.equals(this.f23316, c7546.f23316);
    }

    public final int hashCode() {
        int i = this.f23315 * 31;
        long j = this.f23314;
        return C11003.hashCode(this.f23316) + ((C11003.hashCode(this.f23313) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f23313, Integer.valueOf(this.f23315), Long.valueOf(this.f23314), this.f23316};
        String[] strArrSplit = "data;length;keyframeTimeUs;reservation".length() == 0 ? new String[0] : "data;length;keyframeTimeUs;reservation".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C7546.class, sb, "[");
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
