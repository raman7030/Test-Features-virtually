package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۙۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes3.dex */
public final class C6731 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f17475;

    /* JADX INFO: renamed from: ۧ */
    public final int f17476;

    /* JADX INFO: renamed from: ܽ */
    public final int f17477;

    /* JADX INFO: renamed from: ᩳ */
    public final int f17478;

    public C6731(int i, int i2, int i3, int i4) {
        this.f17476 = i;
        this.f17477 = i2;
        this.f17478 = i3;
        this.f17475 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6731)) {
            return false;
        }
        C6731 c6731 = (C6731) obj;
        return this.f17476 == c6731.f17476 && this.f17477 == c6731.f17477 && this.f17478 == c6731.f17478 && this.f17475 == c6731.f17475;
    }

    public final int hashCode() {
        return (((((this.f17476 * 31) + this.f17477) * 31) + this.f17478) * 31) + this.f17475;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f17476), Integer.valueOf(this.f17477), Integer.valueOf(this.f17478), Integer.valueOf(this.f17475)};
        String[] strArrSplit = "left;top;width;height".length() == 0 ? new String[0] : "left;top;width;height".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C6731.class, sb, "[");
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
    public final int m15388() {
        return this.f17475;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m15389() {
        return this.f17478;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m15390() {
        return this.f17476;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m15391() {
        return this.f17477;
    }
}
