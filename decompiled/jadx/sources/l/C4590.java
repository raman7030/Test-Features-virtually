package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes3.dex */
public final class C4590 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f14647;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f14648;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f14649;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f14650;

    public C4590(int i, int i2, int i3, int i4) {
        this.f14648 = i;
        this.f14649 = i2;
        this.f14650 = i3;
        this.f14647 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4590)) {
            return false;
        }
        C4590 c4590 = (C4590) obj;
        return this.f14648 == c4590.f14648 && this.f14649 == c4590.f14649 && this.f14650 == c4590.f14650 && this.f14647 == c4590.f14647;
    }

    public final int hashCode() {
        return (((((this.f14648 * 31) + this.f14649) * 31) + this.f14650) * 31) + this.f14647;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f14648), Integer.valueOf(this.f14649), Integer.valueOf(this.f14650), Integer.valueOf(this.f14647)};
        String[] strArrSplit = "left;top;width;height".length() == 0 ? new String[0] : "left;top;width;height".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C4590.class, sb, "[");
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
    public final int m13499() {
        return this.f14647;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m13500() {
        return this.f14650;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m13501() {
        return this.f14648;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m13502() {
        return this.f14649;
    }
}
