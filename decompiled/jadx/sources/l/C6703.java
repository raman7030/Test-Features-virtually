package l;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: renamed from: l.ۜۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAPP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6703 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f20811;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f20812;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f20813;

    public C6703(String str, String str2) {
        this.f20812 = str;
        this.f20811 = str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Spanned m18259() {
        boolean z = this.f20813;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "<font color=\"#11aa11\">" : "<font color=\"#bb1111\">");
        sb.append(this.f20812);
        sb.append("</font> > ");
        sb.append(z ? "<font color=\"#11aa11\">" : "<font color=\"#bb1111\">");
        sb.append(this.f20811);
        sb.append("</font>");
        return Html.fromHtml(sb.toString());
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m18264() {
        return this.f20813;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m18263() {
        return this.f20812;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m18262() {
        return this.f20811;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18260(String str) {
        String str2 = this.f20812;
        String str3 = this.f20811;
        if (str2.equals(str3)) {
            return true;
        }
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, str2);
        AbstractC15440 abstractC15440M39867 = C16999.m39866(str, str3);
        String strMo23554 = abstractC15440M39866.mo23554();
        EnumC16580 enumC16580M39083 = EnumC16580.m39083(abstractC15440M39866.mo23113());
        if (C16999.m39861(abstractC15440M39866, abstractC15440M39867) != null) {
            return false;
        }
        enumC16580M39083.m39085(strMo23554);
        C14463.m34554(abstractC15440M39867.mo23554(), true);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18261(AbstractC3163 abstractC3163, String str) {
        String str2 = this.f20812;
        String str3 = this.f20811;
        if (str2.equals(str3)) {
            return true;
        }
        String strM24393 = C9523.m24393(str, str2);
        String strM24394 = C9523.m24393(str, str3);
        if (abstractC3163.mo13919() && str3.equalsIgnoreCase(str2)) {
            String strM24395 = C9523.m24393(str, System.currentTimeMillis() + ".tmp");
            return abstractC3163.mo9696(strM24393, strM24395) && abstractC3163.mo9696(strM24395, strM24394);
        }
        return abstractC3163.mo9696(strM24393, strM24394);
    }
}
