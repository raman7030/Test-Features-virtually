package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܳۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15901 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f46004;

    /* JADX INFO: renamed from: ۧ */
    public final int f46005;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15901)) {
            return false;
        }
        C15901 c15901 = (C15901) obj;
        return this.f46005 == c15901.f46005 && this.f46004 == c15901.f46004;
    }

    public final int hashCode() {
        return (this.f46005 * 31) + this.f46004;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f46005), Integer.valueOf(this.f46004)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C15901.class, sb, "[");
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
    public final int m36019() {
        return this.f46004;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m36020() {
        return this.f46005;
    }

    public C15901(int i, int i2) {
        if (i < 0 || i2 <= i) {
            throw new IllegalArgumentException("Invalid syntax difference range");
        }
        this.f46005 = i;
        this.f46004 = i2;
    }
}
