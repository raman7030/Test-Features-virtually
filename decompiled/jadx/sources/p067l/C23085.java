package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩸᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes.dex */
public final class C23085 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f72526;

    /* JADX INFO: renamed from: ۧ */
    public final C15612 f72527;

    public C23085(C15612 c15612, String str) {
        this.f72527 = c15612;
        this.f72526 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23085)) {
            return false;
        }
        C23085 c23085 = (C23085) obj;
        return C12826.equals(this.f72527, c23085.f72527) && C12826.equals(this.f72526, c23085.f72526);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f72526) + (C12826.hashCode(this.f72527) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f72527, this.f72526};
        String[] strArrSplit = "share;path".length() == 0 ? new String[0] : "share;path".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C23085.class, sb, "[");
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
