package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܽ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U998 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18210 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f54357;

    /* JADX INFO: renamed from: ۧ */
    public final String f54358;

    /* JADX INFO: renamed from: ܽ */
    public final int f54359;

    public C18210(String str, int i, int i2) {
        this.f54358 = str;
        this.f54357 = i;
        this.f54359 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18210)) {
            return false;
        }
        C18210 c18210 = (C18210) obj;
        return this.f54357 == c18210.f54357 && this.f54359 == c18210.f54359 && this.f54358.equals(c18210.f54358);
    }

    public final int hashCode() {
        return this.f54358.hashCode() + C6316.m14441(this.f54357, 31, this.f54359, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f54358, Integer.valueOf(this.f54357), Integer.valueOf(this.f54359)};
        String[] strArrSplit = "name;colorRes;styleRes".length() == 0 ? new String[0] : "name;colorRes;styleRes".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C18210.class, sb, "[");
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
    public final int m41419() {
        return this.f54357;
    }
}
