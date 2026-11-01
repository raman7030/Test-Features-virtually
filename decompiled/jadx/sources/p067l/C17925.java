package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܽۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C17925 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f53531;

    /* JADX INFO: renamed from: ۧ */
    public final int f53532;

    /* JADX INFO: renamed from: ܽ */
    public final String f53533;

    public C17925(int i, String str, String str2) {
        this.f53533 = str;
        this.f53531 = str2;
        this.f53532 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17925)) {
            return false;
        }
        C17925 c17925 = (C17925) obj;
        return this.f53532 == c17925.f53532 && C12826.equals(this.f53533, c17925.f53533) && C12826.equals(this.f53531, c17925.f53531);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f53531) + C21720.m49003(this.f53532 * 31, 31, this.f53533);
    }

    public final String toString() {
        Object[] objArr = {this.f53533, this.f53531, Integer.valueOf(this.f53532)};
        String[] strArrSplit = "suffix;mimeType;priority".length() == 0 ? new String[0] : "suffix;mimeType;priority".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C17925.class, sb, "[");
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
    public final String m40748() {
        return this.f53531;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m40749() {
        return this.f53532;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m40750() {
        return this.f53533;
    }

    public C17925(String str, String str2) {
        this(Integer.MAX_VALUE, str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17925 m40747(C17925 c17925, int i) {
        return c17925.f53532 == i ? c17925 : new C17925(i, c17925.f53533, c17925.f53531);
    }
}
