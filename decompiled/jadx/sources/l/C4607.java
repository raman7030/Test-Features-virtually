package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C4607 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f14671;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f14672;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f14673;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f14674;

    public C4607(int i, int i2, boolean z, boolean z2) {
        this.f14674 = i;
        this.f14673 = i2;
        this.f14672 = z;
        this.f14671 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4607)) {
            return false;
        }
        C4607 c4607 = (C4607) obj;
        return this.f14672 == c4607.f14672 && this.f14671 == c4607.f14671 && this.f14674 == c4607.f14674 && this.f14673 == c4607.f14673;
    }

    public final int hashCode() {
        return ((((((this.f14672 ? 1231 : 1237) * 31) + (this.f14671 ? 1231 : 1237)) * 31) + this.f14674) * 31) + this.f14673;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f14674), Integer.valueOf(this.f14673), Boolean.valueOf(this.f14672), Boolean.valueOf(this.f14671)};
        String[] strArrSplit = "selectionStart;selectionEnd;selectHexFirstChar;multiSelect".length() == 0 ? new String[0] : "selectionStart;selectionEnd;selectHexFirstChar;multiSelect".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C4607.class, sb, "[");
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
    public final boolean m13517() {
        return this.f14671;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m13518() {
        return this.f14674;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m13519() {
        return this.f14672;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m13520() {
        return this.f14673;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13516(C4607 c4607, int i) {
        int i2 = c4607.f14673;
        int i3 = c4607.f14674;
        if (c4607.f14671) {
            if (i == 0 || i3 < 0 || i2 < i3 || i2 >= i) {
                throw new IllegalArgumentException("Invalid history range selection");
            }
            return;
        }
        if (i3 < 0 || i3 != i2 || i3 > i || (i3 == i && !c4607.f14672)) {
            throw new IllegalArgumentException("Invalid history cursor selection");
        }
    }
}
