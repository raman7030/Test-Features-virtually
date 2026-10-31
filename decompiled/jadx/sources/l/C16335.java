package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܽ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16335 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f50291;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f50292;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f50293;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f50294;

    public C16335(String str, int i, boolean z, boolean z2) {
        this.f50293 = str;
        this.f50294 = z;
        this.f50291 = z2;
        this.f50292 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16335)) {
            return false;
        }
        C16335 c16335 = (C16335) obj;
        return this.f50294 == c16335.f50294 && this.f50291 == c16335.f50291 && this.f50292 == c16335.f50292 && C11003.equals(this.f50293, c16335.f50293);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f50293) + ((((((this.f50294 ? 1231 : 1237) * 31) + (this.f50291 ? 1231 : 1237)) * 31) + this.f50292) * 31);
    }

    public final int size() {
        return this.f50292;
    }

    public final String toString() {
        Object[] objArr = {this.f50293, Boolean.valueOf(this.f50294), Boolean.valueOf(this.f50291), Integer.valueOf(this.f50292)};
        String[] strArrSplit = "text;warning;searching;size".length() == 0 ? new String[0] : "text;warning;searching;size".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C16335.class, sb, "[");
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
    public final boolean m38477() {
        return this.f50291;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m38478() {
        return this.f50293;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m38479() {
        return this.f50294;
    }
}
