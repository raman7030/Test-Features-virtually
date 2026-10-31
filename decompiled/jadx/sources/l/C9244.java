package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۢ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9244 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f28010;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC15592 f28011;

    public C9244(EnumC15592 enumC15592, boolean z) {
        this.f28011 = enumC15592;
        this.f28010 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9244)) {
            return false;
        }
        C9244 c9244 = (C9244) obj;
        return this.f28010 == c9244.f28010 && C11003.equals(this.f28011, c9244.f28011);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f28011) + ((this.f28010 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f28011, Boolean.valueOf(this.f28010)};
        String[] strArrSplit = "state;stale".length() == 0 ? new String[0] : "state;stale".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C9244.class, sb, "[");
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
    public final boolean m23712() {
        return this.f28010;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC15592 m23713() {
        return this.f28011;
    }
}
