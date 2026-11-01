package p067l;

import bin.p000mt.plus.Features;

/* JADX INFO: renamed from: l.۟۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 713E */
/* JADX INFO: loaded from: classes3.dex */
public final class C9467 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f25907;

    /* JADX INFO: renamed from: ۜ */
    public final String f25908;

    /* JADX INFO: renamed from: ۡ */
    public String f25909;

    /* JADX INFO: renamed from: ۢ */
    public final long f25910;

    /* JADX INFO: renamed from: ۧ */
    public String f25911;

    /* JADX INFO: renamed from: ܳ */
    public final String f25912;

    /* JADX INFO: renamed from: ܽ */
    public boolean f25913;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f25914;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f25915;

    /* JADX INFO: renamed from: ᩷ */
    public final long f25916;

    /* JADX INFO: renamed from: ᩻ */
    public int f25917;

    public C9467(AbstractC17043 abstractC17043, String str) {
        this.f25907 = abstractC17043;
        this.f25908 = str;
        this.f25915 = abstractC17043.mo25087();
        this.f25916 = abstractC17043.mo25101();
        this.f25910 = abstractC17043.mo25091();
        this.f25914 = abstractC17043.m38691();
        this.f25912 = abstractC17043.mo29996();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21988() {
        AbstractC17043 abstractC17043 = this.f25907;
        try {
            if (abstractC17043.mo29978()) {
                C19136 c19136M29989 = abstractC17043.mo29986().m29989();
                this.f25917 = c19136M29989.m43537();
                this.f25909 = Features.m54(c19136M29989.m43529());
                this.f25911 = Features.m54(c19136M29989.m43527());
                this.f25913 = true;
                return;
            }
            if (abstractC17043 instanceof C14912) {
                C5525 c5525M34133 = ((C14912) abstractC17043).m34133();
                this.f25917 = c5525M34133.m12207();
                this.f25909 = Features.m54(c5525M34133.m12205());
                this.f25911 = Features.m54(c5525M34133.m12203());
                this.f25913 = true;
                return;
            }
            if (abstractC17043.mo37343()) {
                return;
            }
            C19136 c19136M49047 = C21759.m49047(abstractC17043.mo25505());
            this.f25917 = c19136M49047.m43537();
            this.f25909 = Features.m54(c19136M49047.m43529());
            this.f25911 = Features.m54(c19136M49047.m43527());
            this.f25913 = true;
        } catch (Exception unused) {
        }
    }
}
