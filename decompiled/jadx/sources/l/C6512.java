package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۜۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6512 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f20103;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f20104;

    public C6512(String str, int i) {
        this.f20104 = str;
        this.f20103 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6512)) {
            return false;
        }
        C6512 c6512 = (C6512) obj;
        return this.f20103 == c6512.f20103 && C11003.equals(this.f20104, c6512.f20104);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f20104) + (this.f20103 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f20104, Integer.valueOf(this.f20103)};
        String[] strArrSplit = "literal;group".length() == 0 ? new String[0] : "literal;group".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C6512.class, sb, "[");
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
