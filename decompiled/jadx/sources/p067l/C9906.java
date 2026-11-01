package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۠ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: J703 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9906 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f27466;

    /* JADX INFO: renamed from: ۧ */
    public final int f27467;

    /* JADX INFO: renamed from: ܽ */
    public final int f27468;

    public C9906(int i, int i2, int i3) {
        this.f27468 = i;
        this.f27467 = i2;
        this.f27466 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9906)) {
            return false;
        }
        C9906 c9906 = (C9906) obj;
        return this.f27468 == c9906.f27468 && this.f27467 == c9906.f27467 && this.f27466 == c9906.f27466;
    }

    public final int hashCode() {
        return (((this.f27468 * 31) + this.f27467) * 31) + this.f27466;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f27468), Integer.valueOf(this.f27467), Integer.valueOf(this.f27466)};
        String[] strArrSplit = "oldStart;oldEnd;newLength".length() == 0 ? new String[0] : "oldStart;oldEnd;newLength".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C9906.class, sb, "[");
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
