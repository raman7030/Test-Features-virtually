package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩶ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes5.dex */
public final class C21673 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f68258;

    public C21673(int i) {
        this.f68258 = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C21673) && this.f68258 == ((C21673) obj).f68258;
    }

    public final int hashCode() {
        return this.f68258;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f68258)};
        String[] strArrSplit = "indent".length() == 0 ? new String[0] : "indent".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C21673.class, sb, "[");
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
