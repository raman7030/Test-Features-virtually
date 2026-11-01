package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩶۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21409 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f67544;

    /* JADX INFO: renamed from: ۧ */
    public final String f67545;

    public C21409(String str, String str2) {
        this.f67545 = str;
        this.f67544 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21409)) {
            return false;
        }
        C21409 c21409 = (C21409) obj;
        return C12826.equals(this.f67545, c21409.f67545) && C12826.equals(this.f67544, c21409.f67544);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f67544) + (C12826.hashCode(this.f67545) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f67545, this.f67544};
        String[] strArrSplit = "locator;entryName".length() == 0 ? new String[0] : "locator;entryName".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C21409.class, sb, "[");
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
