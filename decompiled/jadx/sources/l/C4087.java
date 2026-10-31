package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۘܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4087 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f13015;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f13016;

    public C4087(String str, String str2) {
        this.f13016 = str;
        this.f13015 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4087)) {
            return false;
        }
        C4087 c4087 = (C4087) obj;
        return C11003.equals(this.f13016, c4087.f13016) && C11003.equals(this.f13015, c4087.f13015);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f13015) + (C11003.hashCode(this.f13016) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f13016, this.f13015};
        String[] strArrSplit = "path;label".length() == 0 ? new String[0] : "path;label".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C4087.class, sb, "[");
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
    public final String m12287() {
        return this.f13015;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m12288() {
        return this.f13016;
    }
}
