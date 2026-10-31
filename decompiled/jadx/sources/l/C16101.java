package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes4.dex */
public final class C16101 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9047 f49617;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f49618;

    public C16101(C9047 c9047, boolean z) {
        this.f49617 = c9047;
        this.f49618 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16101)) {
            return false;
        }
        C16101 c16101 = (C16101) obj;
        return this.f49618 == c16101.f49618 && C11003.equals(this.f49617, c16101.f49617);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f49617) + ((this.f49618 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f49617, Boolean.valueOf(this.f49618)};
        String[] strArrSplit = "node;removedPatternIdentity".length() == 0 ? new String[0] : "node;removedPatternIdentity".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C16101.class, sb, "[");
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
    public final C9047 m37995() {
        return this.f49617;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m37996() {
        return this.f49618;
    }
}
