package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܰۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 778V */
/* JADX INFO: loaded from: classes4.dex */
public final class C13547 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float f40435;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f40436;

    public final int hashCode() {
        return Float.floatToIntBits(this.f40435) + (Float.floatToIntBits(this.f40436) * 31);
    }

    public C13547(float f, float f2) {
        this.f40436 = f;
        this.f40435 = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13547)) {
            return false;
        }
        C13547 c13547 = (C13547) obj;
        return this.f40436 == c13547.f40436 && this.f40435 == c13547.f40435;
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f40436), Float.valueOf(this.f40435)};
        String[] strArrSplit = "width;height".length() == 0 ? new String[0] : "width;height".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C13547.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m32599() {
        return this.f40436 / this.f40435;
    }
}
