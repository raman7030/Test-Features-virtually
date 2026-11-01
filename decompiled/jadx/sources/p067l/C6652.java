package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۙ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46OI */
/* JADX INFO: loaded from: classes3.dex */
public final class C6652 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f17164;

    /* JADX INFO: renamed from: ۧ */
    public final int f17165;

    public C6652(int i, int i2) {
        this.f17165 = i;
        this.f17164 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6652)) {
            return false;
        }
        C6652 c6652 = (C6652) obj;
        return this.f17165 == c6652.f17165 && this.f17164 == c6652.f17164;
    }

    public final int hashCode() {
        return (this.f17165 * 31) + this.f17164;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f17165), Integer.valueOf(this.f17164)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C6652.class, sb, "[");
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
    public final int m15136() {
        return this.f17164;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m15137() {
        return this.f17165;
    }
}
