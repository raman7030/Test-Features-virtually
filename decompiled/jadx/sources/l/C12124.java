package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes4.dex */
public final class C12124 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f36211;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f36212;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21834 f36213;

    public C12124(int i, int i2, C21834 c21834) {
        this.f36212 = i;
        this.f36211 = i2;
        this.f36213 = c21834;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12124)) {
            return false;
        }
        C12124 c12124 = (C12124) obj;
        return this.f36212 == c12124.f36212 && this.f36211 == c12124.f36211 && C11003.equals(this.f36213, c12124.f36213);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f36213) + C4153.m12551(this.f36212, 31, this.f36211, 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f36212), Integer.valueOf(this.f36211), this.f36213};
        String[] strArrSplit = "start;end;style".length() == 0 ? new String[0] : "start;end;style".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C12124.class, sb, "[");
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
