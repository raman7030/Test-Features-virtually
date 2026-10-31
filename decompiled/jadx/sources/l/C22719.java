package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47EO */
/* JADX INFO: loaded from: classes.dex */
public final class C22719 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC21309 f73402;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f73403;

    public C22719(EnumC21309 enumC21309, String str) {
        this.f73402 = enumC21309;
        this.f73403 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22719)) {
            return false;
        }
        C22719 c22719 = (C22719) obj;
        return C11003.equals(this.f73402, c22719.f73402) && C11003.equals(this.f73403, c22719.f73403);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f73403) + (C11003.hashCode(this.f73402) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f73402, this.f73403};
        String[] strArrSplit = "kind;text".length() == 0 ? new String[0] : "kind;text".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C22719.class, sb, "[");
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
    public final EnumC21309 m50754() {
        return this.f73402;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m50756() {
        return this.f73403;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m50755() {
        return this.f73402 == EnumC21309.ERROR && this.f73403 == null;
    }
}
