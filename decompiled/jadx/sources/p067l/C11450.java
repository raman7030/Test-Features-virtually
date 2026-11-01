package p067l;

import android.os.Build;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۢۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: K250 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11450 extends C17278 {

    /* JADX INFO: renamed from: ۡ֫ */
    public static final C18028 f31922;

    /* JADX INFO: renamed from: ۢ֫ */
    public static final C18028 f31923;

    /* JADX INFO: renamed from: ᩷֫ */
    public static final C18028 f31924;

    /* JADX INFO: renamed from: ۜ֫ */
    public C18028 f31925;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f31926;

    /* JADX INFO: renamed from: ܳ֫ */
    public C19136 f31927;

    /* JADX INFO: renamed from: ܽ֫ */
    public AbstractC17043 f31928;

    /* JADX INFO: renamed from: ܿ֫ */
    public boolean f31929;

    /* JADX INFO: renamed from: ᩳ֫ */
    public boolean f31930;

    /* JADX INFO: renamed from: ᩻֫ */
    public C6196 f31931;

    static {
        int i;
        for (C13176 c13176 : C23904.m52982()) {
            if (c13176.f37027.equals("everybody")) {
                i = c13176.f37029;
                f31924 = new C18028(16816, 0, i);
                f31923 = new C18028(33200, 0, i);
                f31922 = new C18028(41392, 0, i);
            }
        }
        i = 0;
        f31924 = new C18028(16816, 0, i);
        f31923 = new C18028(33200, 0, i);
        f31922 = new C18028(41392, 0, i);
    }

    public C11450(AbstractC17043 abstractC17043) {
        C13102 c13102M33654;
        C19136 c19136Mo29981;
        super(abstractC17043.getName(), abstractC17043.getParent(), abstractC17043.mo29996(), abstractC17043.mo25101(), abstractC17043.mo25091(), !abstractC17043.mo25087());
        this.f31928 = abstractC17043;
        if (abstractC17043.mo29978() && abstractC17043.mo25505().equals("/data/adb/ksu/modules.img")) {
            m39129(abstractC17043.mo29986().m29979());
        }
        boolean zMo25100 = abstractC17043.mo25100();
        C18028 c18028 = f31924;
        if (zMo25100) {
            C10890 c10890Mo25098 = abstractC17043.mo25098();
            if (c10890Mo25098.m25097()) {
                this.f31931 = c10890Mo25098.m25090();
                this.f31925 = c18028;
                return;
            }
        }
        boolean zMo29978 = abstractC17043.mo29978();
        this.f31929 = zMo29978;
        C18028 c18029 = f31923;
        if (zMo29978) {
            try {
                C19136 c19136M29989 = abstractC17043.mo29986().m29989();
                this.f31927 = c19136M29989;
                this.f31925 = new C18028(c19136M29989);
                return;
            } catch (IOException unused) {
                this.f31925 = isDirectory() ? c18028 : c18029;
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (abstractC17043 instanceof C14717) && (c13102M33654 = abstractC17043.mo33651().m33654()) != null && (c19136Mo29981 = c13102M33654.mo29981()) != null) {
            this.f31925 = new C18028(c19136Mo29981);
            return;
        }
        if (abstractC17043 instanceof C14912) {
            C14912 c14912Mo34134 = abstractC17043.mo34134();
            if (c14912Mo34134.m34131()) {
                this.f31930 = true;
                C5525 c5525M34133 = c14912Mo34134.m34133();
                this.f31925 = new C18028(c5525M34133.m12208(), c5525M34133.m12205(), c5525M34133.m12203());
            }
        }
        if (this.f31930) {
            return;
        }
        if (mo39144()) {
            this.f31925 = f31922;
        } else {
            this.f31925 = isDirectory() ? c18028 : c18029;
        }
    }

    public C11450(C6196 c6196) {
        super(c6196.f15598, "/storage", null, -1L, 0L, false);
        this.f31928 = C18524.m42109(getPath(), new String[0]);
        this.f31931 = c6196;
        this.f31925 = f31924;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m26447() {
        return this.f31931 != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C6196 m26446() {
        return this.f31931;
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ܶۧ */
    public final AbstractC17043 mo26445() {
        return this.f31928;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m26444() {
        this.f31928 = C18524.m42109(this.f31928.mo25505(), new String[0]);
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ۠ۧ */
    public final int mo26443() {
        if (m26447()) {
            return 6;
        }
        return super.mo26443();
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m26442() {
        C19136 c19136 = this.f31927;
        return c19136 == null || c19136.m43534() == '-' || c19136.m43533() == '-';
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩸֫ */
    public final boolean mo26449() {
        char cM43534;
        C19136 c19136 = this.f31927;
        return (c19136 == null || (cM43534 = c19136.m43534()) == '-' || (cM43534 == 'l' && c19136.m43533() == '-')) && super.mo26449() && !getParent().startsWith("/proc/");
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ᩸ */
    public final CharSequence mo23149() {
        C6196 c6196 = this.f31931;
        if (c6196 != null) {
            return c6196.f15596;
        }
        if (C21272.f66916 || isDirectory()) {
            return null;
        }
        boolean z = this.f31929;
        boolean z2 = this.f31930;
        if ((!z && !z2) || C18524.m42130(getPath()) || C21129.m47753(getPath()) != null) {
            return null;
        }
        if (z2 && getPath().charAt(19) != 'd') {
            return null;
        }
        SpannableString spannableString = new SpannableString(this.f31925.m41065());
        spannableString.setSpan(new TypefaceSpan("monospace"), 0, spannableString.length(), 18);
        return spannableString;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m26448() {
        return this.f31930;
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ֨ۧ */
    public final C18028 mo26440() {
        return this.f31925;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26441(C18028 c18028) {
        this.f31925 = c18028;
        this.f31926 = true;
    }

    @Override // p067l.C17278
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11450.class != obj.getClass() || this.f31926 || !super.equals(obj)) {
            return false;
        }
        C11450 c11450 = (C11450) obj;
        if (c11450.f31926) {
            return false;
        }
        return C12826.equals(this.f31925, c11450.f31925);
    }

    @Override // p067l.C17278
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        C18028 c18028 = this.f31925;
        return iHashCode + (c18028 != null ? c18028.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m26439(C18028 c18028) {
        return c18028 == f31924 || c18028 == f31923 || c18028 == f31922;
    }
}
