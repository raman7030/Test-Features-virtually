package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֨۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes2.dex */
public final class C1147 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18673 f4160;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3264 f4161;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f4162;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147(C3264 c3264, AbstractActivityC3346 abstractActivityC3346, C18673 c18673, DialogInterfaceC0206 dialogInterfaceC0206) {
        super(abstractActivityC3346, -1);
        this.f4161 = c3264;
        this.f4160 = c18673;
        this.f4162 = dialogInterfaceC0206;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.֡۬᩻] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۚ۬᩻] */
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        final String strTrim = m31260().trim();
        try {
            C5267.m15183(strTrim);
            C3264 c3264 = this.f4161;
            if (c3264.f10240) {
                return;
            }
            final C18673 c18673 = this.f4160;
            ?? r2 = new InterfaceC15257() { // from class: l.֡۬᩻
                @Override // l.InterfaceC15257
                public final C3856 run() {
                    C3264 c3265 = this.f1930.f4161;
                    C18673 c18674 = c18673;
                    String str = strTrim;
                    if (c18674 == null) {
                        return c3265.f10244.m15184(str);
                    }
                    c3265.f10244.m15187(c18674.f59011, str);
                    return null;
                }
            };
            final DialogInterfaceC0206 dialogInterfaceC0206 = this.f4162;
            c3264.m9991((InterfaceC15257) r2, (Runnable) new Runnable() { // from class: l.ۚ۬᩻
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceC0206 dialogInterfaceC0207 = dialogInterfaceC0206;
                    if (dialogInterfaceC0207 == null || !dialogInterfaceC0207.m1442()) {
                        return;
                    }
                    dialogInterfaceC0207.m1444(strTrim);
                }
            });
            m31262();
        } catch (IllegalArgumentException unused) {
            m31263(R.string.MT_Protector);
        }
    }
}
