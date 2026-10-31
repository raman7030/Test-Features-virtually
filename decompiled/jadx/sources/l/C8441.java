package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8441 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f25838;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15495 f25839;

    public C8441(C15495 c15495, long j) {
        this.f25839 = c15495;
        this.f25838 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8441)) {
            return false;
        }
        C8441 c8441 = (C8441) obj;
        return this.f25838 == c8441.f25838 && C11003.equals(this.f25839, c8441.f25839);
    }

    public final int hashCode() {
        long j = this.f25838;
        return C11003.hashCode(this.f25839) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f25839, Long.valueOf(this.f25838)};
        String[] strArrSplit = "metadata;duration".length() == 0 ? new String[0] : "metadata;duration".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C8441.class, sb, "[");
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
    public final long m22118() {
        return this.f25838;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15495 m22119() {
        return this.f25839;
    }
}
