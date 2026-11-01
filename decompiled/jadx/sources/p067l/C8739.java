package p067l;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: renamed from: l.ۜۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAPP */
/* JADX INFO: loaded from: classes2.dex */
public final class C8739 {

    /* JADX INFO: renamed from: ֫ */
    public final String f23686;

    /* JADX INFO: renamed from: ۧ */
    public final String f23687;

    /* JADX INFO: renamed from: ܽ */
    public boolean f23688;

    public C8739(String str, String str2) {
        this.f23687 = str;
        this.f23686 = str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Spanned m20207() {
        boolean z = this.f23688;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "<font color=\"#11aa11\">" : "<font color=\"#bb1111\">");
        sb.append(this.f23687);
        sb.append("</font> > ");
        sb.append(z ? "<font color=\"#11aa11\">" : "<font color=\"#bb1111\">");
        sb.append(this.f23686);
        sb.append("</font>");
        return Html.fromHtml(sb.toString());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m20212() {
        return this.f23688;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m20211() {
        return this.f23687;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m20210() {
        return this.f23686;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20208(String str) {
        String str2 = this.f23687;
        String str3 = this.f23686;
        if (str2.equals(str3)) {
            return true;
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, str2);
        AbstractC17043 abstractC17043M421010 = C18524.m42109(str, str3);
        String strMo25505 = abstractC17043M42109.mo25505();
        EnumC18126 enumC18126M41309 = EnumC18126.m41309(abstractC17043M42109.mo25087());
        if (C18524.m42104(abstractC17043M42109, abstractC17043M421010) != null) {
            return false;
        }
        enumC18126M41309.m41311(strMo25505);
        C16114.m36688(abstractC17043M421010.mo25505(), true);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20209(AbstractC5375 abstractC5375, String str) {
        String str2 = this.f23687;
        String str3 = this.f23686;
        if (str2.equals(str3)) {
            return true;
        }
        String strM26403 = C11419.m26403(str, str2);
        String strM26404 = C11419.m26403(str, str3);
        if (abstractC5375.mo15799() && str3.equalsIgnoreCase(str2)) {
            String strM26405 = C11419.m26403(str, System.currentTimeMillis() + ".tmp");
            return abstractC5375.mo11740(strM26403, strM26405) && abstractC5375.mo11740(strM26405, strM26404);
        }
        return abstractC5375.mo11740(strM26403, strM26404);
    }
}
