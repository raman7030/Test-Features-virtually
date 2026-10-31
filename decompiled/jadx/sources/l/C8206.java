package l;

/* JADX INFO: renamed from: l.۠ܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8206 implements InterfaceC6403 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3267 f25218;

    public final String toString() {
        return "mainCompleter";
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo7078() {
        return false;
    }

    public C8206(C3267 c3267) {
        this.f25218 = c3267;
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        C3267 c3267 = this.f25218;
        C0052 c0052 = (C0052) abstractC5698;
        c3267.f10281.m17171(c0052);
        if (c0052.f17559 == EnumC1296.f4581) {
            c0052.f920 = C2609.m8239();
            c0052.f921 = C2609.m8239();
            c0052.f925 = C2609.m8239();
            c0052.f929 = C2609.m8239();
            c0052.f917 = C2609.m8239();
        } else if ((c0052.f17563 & 4503599627370496L) != 0) {
            C3267.m10053(c3267, c0052);
        } else {
            try {
                c0052.f911.mo16101();
            } catch (C20515 e) {
                c0052.f17559 = EnumC1296.f4581;
                c0052.f920 = C2609.m8239();
                c0052.f921 = C2609.m8239();
                c0052.f925 = C2609.m8239();
                c0052.f929 = C2609.m8239();
                c0052.f917 = C2609.m8239();
                c3267.m10048(c0052);
                throw e;
            }
        }
        InterfaceC18278 interfaceC18278 = c0052.f911.f42766;
        if (interfaceC18278 == null || interfaceC18278.mo21321() == EnumC16866.CLASS) {
            c3267.m10048(c0052);
        }
    }
}
