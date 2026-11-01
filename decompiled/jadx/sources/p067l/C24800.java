package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩻ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes.dex */
public final class C24800 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f79253;

    /* JADX INFO: renamed from: ۧ */
    public final String f79254;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f79255;

    /* JADX INFO: renamed from: ܽ */
    public final String f79256;

    /* JADX INFO: renamed from: ܿ */
    public final String f79257;

    /* JADX INFO: renamed from: ᩳ */
    public final String f79258;

    /* JADX INFO: renamed from: ᩻ */
    public final String f79259;

    public C24800(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.f79258 = str;
        this.f79253 = str2;
        this.f79254 = str3;
        this.f79255 = z;
        this.f79259 = str4;
        this.f79256 = str5;
        this.f79257 = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24800)) {
            return false;
        }
        C24800 c24800 = (C24800) obj;
        return this.f79255 == c24800.f79255 && C12826.equals(this.f79258, c24800.f79258) && C12826.equals(this.f79253, c24800.f79253) && C12826.equals(this.f79254, c24800.f79254) && C12826.equals(this.f79259, c24800.f79259) && C12826.equals(this.f79256, c24800.f79256) && C12826.equals(this.f79257, c24800.f79257);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f79257) + C21720.m49003(C21720.m49003(C21720.m49003(C21720.m49003(C21720.m49003((this.f79255 ? 1231 : 1237) * 31, 31, this.f79258), 31, this.f79253), 31, this.f79254), 31, this.f79259), 31, this.f79256);
    }

    public final String toString() {
        Object[] objArr = {this.f79258, this.f79253, this.f79254, Boolean.valueOf(this.f79255), this.f79259, this.f79256, this.f79257};
        String[] strArrSplit = "message;checkBox1;checkBox2;verifyEmail;verifyMessage;lastConfirmMessage;successMessage".length() == 0 ? new String[0] : "message;checkBox1;checkBox2;verifyEmail;verifyMessage;lastConfirmMessage;successMessage".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C24800.class, sb, "[");
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
