package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩳ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18290 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f56864;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f56865;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f56866;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f56867;

    public C18290(String str, String str2, boolean z, boolean z2) {
        this.f56867 = str;
        this.f56866 = str2;
        this.f56864 = z;
        this.f56865 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18290)) {
            return false;
        }
        C18290 c18290 = (C18290) obj;
        return this.f56864 == c18290.f56864 && this.f56865 == c18290.f56865 && C11003.equals(this.f56867, c18290.f56867) && C11003.equals(this.f56866, c18290.f56866);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f56866) + C20361.m46680((((this.f56864 ? 1231 : 1237) * 31) + (this.f56865 ? 1231 : 1237)) * 31, 31, this.f56867);
    }

    public final String toString() {
        Object[] objArr = {this.f56867, this.f56866, Boolean.valueOf(this.f56864), Boolean.valueOf(this.f56865)};
        String[] strArrSplit = "oldName;newName;isDirectory;needMark".length() == 0 ? new String[0] : "oldName;newName;isDirectory;needMark".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18290.class, sb, "[");
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
    public final String m42626() {
        if (!this.f56865) {
            return null;
        }
        String str = this.f56866;
        if (C11003.equals(C9523.m24406(str), C9523.m24406(this.f56867))) {
            return C9523.m24404(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42627(C3545 c3545) {
        String name = c3545.getName();
        boolean z = this.f56864;
        String str = this.f56866;
        String str2 = this.f56867;
        if (!z) {
            if (!name.equals(str2)) {
                return false;
            }
            c3545.m10788(str);
            return true;
        }
        if (name.length() <= str2.length() || !name.startsWith(str2) || name.charAt(str2.length()) != '/') {
            return false;
        }
        StringBuilder sbM15339 = C5368.m15339(str);
        sbM15339.append(name.substring(str2.length()));
        c3545.m10788(sbM15339.toString());
        return true;
    }
}
