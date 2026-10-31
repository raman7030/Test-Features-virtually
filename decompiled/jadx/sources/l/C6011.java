package l;

/* JADX INFO: renamed from: l.ۛۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9GZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6011 extends AbstractC22944 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f18454 = C11321.m27961(C6011.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21534 f18455;

    public C6011(C21534 c21534) {
        this.f18455 = c21534;
    }

    @Override // l.AbstractC22944
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16824(C18026 c18026) {
        int iM52213 = ((C23670) c18026.m21061()).m52213();
        C21534 c21534 = this.f18455;
        c21534.m48693(iM52213);
        f18454.mo7092("Server granted us {} credits for {}, now available: {} credits", Integer.valueOf(((C23670) c18026.m21061()).m52213()), c18026, Integer.valueOf(c21534.m48692()));
        this.f14665.m13513(c18026);
    }
}
