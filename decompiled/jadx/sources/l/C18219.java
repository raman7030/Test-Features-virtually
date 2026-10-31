package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩳᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes5.dex */
public final class C18219 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17513 f56619;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f56620;

    public C18219(C17513 c17513, boolean z) {
        this.f56619 = c17513;
        this.f56620 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18219)) {
            return false;
        }
        C18219 c18219 = (C18219) obj;
        return this.f56620 == c18219.f56620 && C11003.equals(this.f56619, c18219.f56619);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f56619) + ((this.f56620 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f56619, Boolean.valueOf(this.f56620)};
        String[] strArrSplit = "patches;removedPatternIdentity".length() == 0 ? new String[0] : "patches;removedPatternIdentity".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18219.class, sb, "[");
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
    public final C17513 m42440() {
        return this.f56619;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m42441() {
        return this.f56620;
    }
}
