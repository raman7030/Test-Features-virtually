package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۟ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 778V */
/* JADX INFO: loaded from: classes3.dex */
public final class C9209 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f24919;

    /* JADX INFO: renamed from: ۧ */
    public final int f24920;

    public C9209(int i, int i2) {
        this.f24920 = i;
        this.f24919 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9209)) {
            return false;
        }
        C9209 c9209 = (C9209) obj;
        return this.f24920 == c9209.f24920 && this.f24919 == c9209.f24919;
    }

    public final int hashCode() {
        return (this.f24920 * 31) + this.f24919;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f24920), Integer.valueOf(this.f24919)};
        String[] strArrSplit = "widthPx;heightPx".length() == 0 ? new String[0] : "widthPx;heightPx".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C9209.class, sb, "[");
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
    public final int m21227() {
        return this.f24919;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m21228() {
        return this.f24920;
    }
}
