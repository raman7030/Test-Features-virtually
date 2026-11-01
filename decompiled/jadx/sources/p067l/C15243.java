package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܰۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 778V */
/* JADX INFO: loaded from: classes4.dex */
public final class C15243 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final float f43505;

    /* JADX INFO: renamed from: ۧ */
    public final float f43506;

    public final int hashCode() {
        return Float.floatToIntBits(this.f43505) + (Float.floatToIntBits(this.f43506) * 31);
    }

    public C15243(float f, float f2) {
        this.f43506 = f;
        this.f43505 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15243)) {
            return false;
        }
        C15243 c15243 = (C15243) obj;
        return this.f43506 == c15243.f43506 && this.f43505 == c15243.f43505;
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f43506), Float.valueOf(this.f43505)};
        String[] strArrSplit = "width;height".length() == 0 ? new String[0] : "width;height".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C15243.class, sb, "[");
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
    public final float m34702() {
        return this.f43506 / this.f43505;
    }
}
