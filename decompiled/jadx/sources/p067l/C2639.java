package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.֡۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4748 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2639 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f4408;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f4409;

    public final int hashCode() {
        int i = this.f4409 ? 1231 : 1237;
        long j = this.f4408;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public C2639(long j, boolean z) {
        this.f4409 = z;
        this.f4408 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2639)) {
            return false;
        }
        C2639 c2639 = (C2639) obj;
        return this.f4409 == c2639.f4409 && this.f4408 == c2639.f4408;
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f4409), Long.valueOf(this.f4408)};
        String[] strArrSplit = "rangeSupported;documentLength".length() == 0 ? new String[0] : "rangeSupported;documentLength".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C2639.class, sb, "[");
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
    public final long m4026() {
        return this.f4408;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m4027() {
        return this.f4409;
    }
}
