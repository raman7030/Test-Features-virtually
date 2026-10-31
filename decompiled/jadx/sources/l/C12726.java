package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V4E2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12726 implements InterfaceC17733 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7787 f38282;

    public C12726(C7787 c7787) {
        this.f38282 = c7787;
    }

    @Override // l.InterfaceC17733
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18621 mo31019(C8743 c8743) {
        C7787 c7787 = this.f38282;
        try {
            C1505 c1505M26800 = c7787.f24060.m26800(C11816.m28900(c8743.f26640.toString()).mo2334().mo2332());
            if (c1505M26800 != null) {
                try {
                    C14136 c14136 = new C14136(c1505M26800.m5185(0));
                    C18621 c18621M33746 = c14136.m33746(c1505M26800);
                    if (c14136.m33748(c8743, c18621M33746)) {
                        return c18621M33746;
                    }
                    C20032.m46179(c18621M33746.f57745);
                    return null;
                } catch (IOException unused) {
                    C20032.m46179(c1505M26800);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // l.InterfaceC17733
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31016(C8743 c8743) {
        this.f38282.f24060.m26804(C11816.m28900(c8743.f26640.toString()).mo2334().mo2332());
    }

    @Override // l.InterfaceC17733
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31015() {
        synchronized (this.f38282) {
        }
    }

    @Override // l.InterfaceC17733
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31017(C10154 c10154) {
        synchronized (this.f38282) {
        }
    }

    @Override // l.InterfaceC17733
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12975 mo31014(C18621 c18621) {
        C13680 c13680M26796;
        C7787 c7787 = this.f38282;
        C10678 c10678 = c7787.f24060;
        C8743 c8743 = c18621.f57743;
        String str = c8743.f26643;
        C11749 c11749 = c8743.f26640;
        try {
            if (!C3395.m10359(str)) {
                if (str.equals("GET")) {
                    int i = C0799.f2925;
                    if (!C0799.m3018(c18621.f57742).contains("*")) {
                        C14136 c14136 = new C14136(c18621);
                        try {
                            c13680M26796 = c10678.m26796(C11816.m28900(c11749.toString()).mo2334().mo2332());
                            if (c13680M26796 != null) {
                                try {
                                    c14136.m33747(c13680M26796);
                                    return new C6376(c7787, c13680M26796);
                                } catch (IOException unused) {
                                    if (c13680M26796 != null) {
                                        c13680M26796.m32918();
                                    }
                                    return null;
                                }
                            }
                        } catch (IOException unused2) {
                            c13680M26796 = null;
                        }
                    }
                }
                return null;
            }
            c10678.m26804(C11816.m28900(c11749.toString()).mo2334().mo2332());
            return null;
        } catch (IOException unused3) {
        }
    }

    @Override // l.InterfaceC17733
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31018(C18621 c18621, C18621 c18622) {
        C13680 c13680M5186;
        C14136 c14136 = new C14136(c18622);
        try {
            c13680M5186 = ((C23309) c18621.f57745).f74924.m5186();
            if (c13680M5186 != null) {
                try {
                    c14136.m33747(c13680M5186);
                    c13680M5186.m32919();
                } catch (IOException unused) {
                    if (c13680M5186 != null) {
                        try {
                            c13680M5186.m32918();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        } catch (IOException unused3) {
            c13680M5186 = null;
        }
    }
}
