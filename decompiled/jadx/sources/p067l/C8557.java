package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۜۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8557 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f22981;

    /* JADX INFO: renamed from: ۧ */
    public final String f22982;

    public C8557(String str, int i) {
        this.f22982 = str;
        this.f22981 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8557)) {
            return false;
        }
        C8557 c8557 = (C8557) obj;
        return this.f22981 == c8557.f22981 && C12826.equals(this.f22982, c8557.f22982);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f22982) + (this.f22981 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f22982, Integer.valueOf(this.f22981)};
        String[] strArrSplit = "literal;group".length() == 0 ? new String[0] : "literal;group".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C8557.class, sb, "[");
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
