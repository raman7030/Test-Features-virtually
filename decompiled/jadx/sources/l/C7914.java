package l;

/* JADX INFO: renamed from: l.۠ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes3.dex */
public final class C7914 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f24501;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19910 f24502;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f24503;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7674 f24504;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7914(C19910 c19910, AbstractActivityC3346 abstractActivityC3346, C7674 c7674, AbstractActivityC3346 abstractActivityC3347, DialogInterfaceC0206 dialogInterfaceC0206) {
        super(abstractActivityC3346, -1);
        this.f24502 = c19910;
        this.f24504 = c7674;
        this.f24501 = abstractActivityC3347;
        this.f24503 = dialogInterfaceC0206;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        String strTrim = m31260().trim();
        if (strTrim.equals(this.f24504.m20528())) {
            m31262();
        } else {
            new C0858(this, strTrim).m20274();
        }
    }
}
