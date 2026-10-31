package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 778V */
/* JADX INFO: loaded from: classes3.dex */
public final class C7198 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f22041;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f22042;

    public C7198(int i, int i2) {
        this.f22042 = i;
        this.f22041 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7198)) {
            return false;
        }
        C7198 c7198 = (C7198) obj;
        return this.f22042 == c7198.f22042 && this.f22041 == c7198.f22041;
    }

    public final int hashCode() {
        return (this.f22042 * 31) + this.f22041;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f22042), Integer.valueOf(this.f22041)};
        String[] strArrSplit = "widthPx;heightPx".length() == 0 ? new String[0] : "widthPx;heightPx".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C7198.class, sb, "[");
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
    public final int m19280() {
        return this.f22041;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m19281() {
        return this.f22042;
    }
}
