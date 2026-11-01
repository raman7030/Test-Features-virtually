package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۗ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56R4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5666 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f13784;

    /* JADX INFO: renamed from: ۧ */
    public final String f13785;

    public C5666(String str, int i) {
        this.f13785 = str;
        this.f13784 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5666)) {
            return false;
        }
        C5666 c5666 = (C5666) obj;
        return this.f13784 == c5666.f13784 && C12826.equals(this.f13785, c5666.f13785);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f13785) + (this.f13784 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f13785, Integer.valueOf(this.f13784)};
        String[] strArrSplit = "text;restoredHash".length() == 0 ? new String[0] : "text;restoredHash".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C5666.class, sb, "[");
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
    public final int m12622() {
        return this.f13784;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m12623() {
        return this.f13785;
    }
}
