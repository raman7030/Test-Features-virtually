package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۟ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9540 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f26226;

    /* JADX INFO: renamed from: ۧ */
    public final long f26227;

    /* JADX INFO: renamed from: ܽ */
    public final int f26228;

    /* JADX INFO: renamed from: ᩳ */
    public final C9680 f26229;

    public C9540(int i, long j, C9680 c9680, byte[] bArr) {
        this.f26226 = bArr;
        this.f26228 = i;
        this.f26227 = j;
        this.f26229 = c9680;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9540)) {
            return false;
        }
        C9540 c9540 = (C9540) obj;
        return this.f26228 == c9540.f26228 && this.f26227 == c9540.f26227 && C12826.equals(this.f26226, c9540.f26226) && C12826.equals(this.f26229, c9540.f26229);
    }

    public final int hashCode() {
        int i = this.f26228 * 31;
        long j = this.f26227;
        return C12826.hashCode(this.f26229) + ((C12826.hashCode(this.f26226) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f26226, Integer.valueOf(this.f26228), Long.valueOf(this.f26227), this.f26229};
        String[] strArrSplit = "data;length;keyframeTimeUs;reservation".length() == 0 ? new String[0] : "data;length;keyframeTimeUs;reservation".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C9540.class, sb, "[");
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
