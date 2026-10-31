package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes.dex */
public final class C22223 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f72109;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f72110;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f72111;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f72112;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f72113;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f72114;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f72115;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f72116;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f72117;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f72118;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f72119;

    public C22223(int i, int i2, int i3, int i4, int i5, String str, boolean z, boolean z2, boolean z3, boolean z4, int i6) {
        this.f72112 = i;
        this.f72113 = i2;
        this.f72111 = i3;
        this.f72119 = i4;
        this.f72116 = i5;
        this.f72117 = str;
        this.f72114 = z;
        this.f72110 = z2;
        this.f72118 = z3;
        this.f72109 = z4;
        this.f72115 = i6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22223)) {
            return false;
        }
        C22223 c22223 = (C22223) obj;
        return this.f72114 == c22223.f72114 && this.f72110 == c22223.f72110 && this.f72118 == c22223.f72118 && this.f72109 == c22223.f72109 && this.f72112 == c22223.f72112 && this.f72113 == c22223.f72113 && this.f72111 == c22223.f72111 && this.f72119 == c22223.f72119 && this.f72116 == c22223.f72116 && this.f72115 == c22223.f72115 && C11003.equals(this.f72117, c22223.f72117);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f72117) + ((((((((((((((((((((this.f72114 ? 1231 : 1237) * 31) + (this.f72110 ? 1231 : 1237)) * 31) + (this.f72118 ? 1231 : 1237)) * 31) + (this.f72109 ? 1231 : 1237)) * 31) + this.f72112) * 31) + this.f72113) * 31) + this.f72111) * 31) + this.f72119) * 31) + this.f72116) * 31) + this.f72115) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f72112), Integer.valueOf(this.f72113), Integer.valueOf(this.f72111), Integer.valueOf(this.f72119), Integer.valueOf(this.f72116), this.f72117, Boolean.valueOf(this.f72114), Boolean.valueOf(this.f72110), Boolean.valueOf(this.f72118), Boolean.valueOf(this.f72109), Integer.valueOf(this.f72115)};
        String[] strArrSplit = "start;end;type;indent;gapEnd;gap;hardBreak;protectedText;softBefore;continuation;functionEnd".length() == 0 ? new String[0] : "start;end;type;indent;gapEnd;gap;hardBreak;protectedText;softBefore;continuation;functionEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C22223.class, sb, "[");
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
