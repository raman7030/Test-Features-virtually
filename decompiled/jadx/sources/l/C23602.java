package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes.dex */
public final class C23602 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f76509;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f76510;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f76511;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f76512;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f76513;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f76514;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f76515;

    public C23602(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.f76514 = str;
        this.f76509 = str2;
        this.f76510 = str3;
        this.f76511 = z;
        this.f76515 = str4;
        this.f76512 = str5;
        this.f76513 = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23602)) {
            return false;
        }
        C23602 c23602 = (C23602) obj;
        return this.f76511 == c23602.f76511 && C11003.equals(this.f76514, c23602.f76514) && C11003.equals(this.f76509, c23602.f76509) && C11003.equals(this.f76510, c23602.f76510) && C11003.equals(this.f76515, c23602.f76515) && C11003.equals(this.f76512, c23602.f76512) && C11003.equals(this.f76513, c23602.f76513);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f76513) + C20361.m46680(C20361.m46680(C20361.m46680(C20361.m46680(C20361.m46680((this.f76511 ? 1231 : 1237) * 31, 31, this.f76514), 31, this.f76509), 31, this.f76510), 31, this.f76515), 31, this.f76512);
    }

    public final String toString() {
        Object[] objArr = {this.f76514, this.f76509, this.f76510, Boolean.valueOf(this.f76511), this.f76515, this.f76512, this.f76513};
        String[] strArrSplit = "message;checkBox1;checkBox2;verifyEmail;verifyMessage;lastConfirmMessage;successMessage".length() == 0 ? new String[0] : "message;checkBox1;checkBox2;verifyEmail;verifyMessage;lastConfirmMessage;successMessage".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C23602.class, sb, "[");
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
