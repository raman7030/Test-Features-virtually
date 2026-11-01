package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۢۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C11240 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f31262;

    /* JADX INFO: renamed from: ۧ */
    public final String f31263;

    public C11240(String str, int i) {
        this.f31263 = str;
        this.f31262 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11240)) {
            return false;
        }
        C11240 c11240 = (C11240) obj;
        return this.f31262 == c11240.f31262 && C12826.equals(this.f31263, c11240.f31263);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f31263) + (this.f31262 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f31263, Integer.valueOf(this.f31262)};
        String[] strArrSplit = "text;replacements".length() == 0 ? new String[0] : "text;replacements".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C11240.class, sb, "[");
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
    public final int m26036() {
        return this.f31262;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m26037() {
        return this.f31263;
    }
}
