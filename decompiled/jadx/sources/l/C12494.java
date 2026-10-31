package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫ܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12494 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f37532;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6144 f37533;

    public C12494(C6144 c6144, int i) {
        this.f37533 = c6144;
        this.f37532 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12494)) {
            return false;
        }
        C12494 c12494 = (C12494) obj;
        return this.f37532 == c12494.f37532 && C11003.equals(this.f37533, c12494.f37533);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f37533) + (this.f37532 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f37533, Integer.valueOf(this.f37532)};
        String[] strArrSplit = "source;charset".length() == 0 ? new String[0] : "source;charset".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C12494.class, sb, "[");
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
