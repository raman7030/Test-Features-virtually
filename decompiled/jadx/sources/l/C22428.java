package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes.dex */
public final class C22428 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f72666;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f72667;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f72668;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f72669;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f72670;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f72671;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f72672;

    public C22428(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f72667 = i;
        this.f72669 = i2;
        this.f72672 = i3;
        this.f72668 = i4;
        this.f72666 = i5;
        this.f72670 = i6;
        this.f72671 = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22428)) {
            return false;
        }
        C22428 c22428 = (C22428) obj;
        return this.f72667 == c22428.f72667 && this.f72669 == c22428.f72669 && this.f72672 == c22428.f72672 && this.f72668 == c22428.f72668 && this.f72666 == c22428.f72666 && this.f72670 == c22428.f72670 && this.f72671 == c22428.f72671;
    }

    public final int hashCode() {
        return (((((((((((this.f72667 * 31) + this.f72669) * 31) + this.f72672) * 31) + this.f72668) * 31) + this.f72666) * 31) + this.f72670) * 31) + this.f72671;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f72667), Integer.valueOf(this.f72669), Integer.valueOf(this.f72672), Integer.valueOf(this.f72668), Integer.valueOf(this.f72666), Integer.valueOf(this.f72670), Integer.valueOf(this.f72671)};
        String[] strArrSplit = "first;last;type;start;end;line;level".length() == 0 ? new String[0] : "first;last;type;start;end;line;level".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C22428.class, sb, "[");
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
