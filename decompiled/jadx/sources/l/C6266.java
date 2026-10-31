package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C6266 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f19403;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Exception f19404;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC10647 f19405;

    public C6266(EnumC10647 enumC10647, String str, Exception exc) {
        this.f19405 = enumC10647;
        this.f19403 = str;
        this.f19404 = exc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6266)) {
            return false;
        }
        C6266 c6266 = (C6266) obj;
        return C11003.equals(this.f19405, c6266.f19405) && C11003.equals(this.f19403, c6266.f19403) && C11003.equals(this.f19404, c6266.f19404);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f19404) + C20361.m46680(C11003.hashCode(this.f19405) * 31, 31, this.f19403);
    }

    public final String toString() {
        Object[] objArr = {this.f19405, this.f19403, this.f19404};
        String[] strArrSplit = "status;entryName;error".length() == 0 ? new String[0] : "status;entryName;error".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C6266.class, sb, "[");
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
    public final String m17274() {
        return this.f19403;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Exception m17275() {
        return this.f19404;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC10647 m17276() {
        return this.f19405;
    }
}
