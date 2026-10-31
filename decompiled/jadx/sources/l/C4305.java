package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙ֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4305 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19828 f13882;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC15592 f13883;

    public C4305(C19828 c19828, EnumC15592 enumC15592) {
        this.f13882 = c19828;
        this.f13883 = enumC15592;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4305)) {
            return false;
        }
        C4305 c4305 = (C4305) obj;
        return C11003.equals(this.f13882, c4305.f13882) && C11003.equals(this.f13883, c4305.f13883);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f13883) + (C11003.hashCode(this.f13882) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f13882, this.f13883};
        String[] strArrSplit = "context;state".length() == 0 ? new String[0] : "context;state".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C4305.class, sb, "[");
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
