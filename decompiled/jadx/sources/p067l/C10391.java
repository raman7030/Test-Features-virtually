package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۠᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C10391 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final long f28751;

    /* JADX INFO: renamed from: ۧ */
    public final C17095 f28752;

    public C10391(C17095 c17095, long j) {
        this.f28752 = c17095;
        this.f28751 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10391)) {
            return false;
        }
        C10391 c10391 = (C10391) obj;
        return this.f28751 == c10391.f28751 && C12826.equals(this.f28752, c10391.f28752);
    }

    public final int hashCode() {
        long j = this.f28751;
        return C12826.hashCode(this.f28752) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f28752, Long.valueOf(this.f28751)};
        String[] strArrSplit = "metadata;duration".length() == 0 ? new String[0] : "metadata;duration".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C10391.class, sb, "[");
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
    public final long m24087() {
        return this.f28751;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17095 m24088() {
        return this.f28752;
    }
}
