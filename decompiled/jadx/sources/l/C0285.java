package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4748 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0285 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f1630;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f1631;

    public final int hashCode() {
        int i = this.f1631 ? 1231 : 1237;
        long j = this.f1630;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public C0285(long j, boolean z) {
        this.f1631 = z;
        this.f1630 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0285)) {
            return false;
        }
        C0285 c0285 = (C0285) obj;
        return this.f1631 == c0285.f1631 && this.f1630 == c0285.f1630;
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f1631), Long.valueOf(this.f1630)};
        String[] strArrSplit = "rangeSupported;documentLength".length() == 0 ? new String[0] : "rangeSupported;documentLength".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C0285.class, sb, "[");
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
    public final long m1626() {
        return this.f1630;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m1627() {
        return this.f1631;
    }
}
