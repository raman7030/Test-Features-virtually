package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C14110 implements InterfaceC2054 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16870 f42589;

    @Override // l.InterfaceC2054
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ String mo6739() {
        return null;
    }

    @Override // l.InterfaceC2054
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo6742() {
        return false;
    }

    public C14110(C16870 c16870) {
        this.f42589 = c16870;
    }

    @Override // l.InterfaceC2054
    public final String getName() {
        return C4925.m14327(R.string.MT_Protector);
    }

    @Override // l.InterfaceC2054
    /* JADX INFO: renamed from: ۧ */
    public final C11813 mo6741() {
        return this.f42589.f51767;
    }

    @Override // l.InterfaceC2054
    /* JADX INFO: renamed from: ֫ */
    public final void mo6740(Main main) {
        if (!C23196.m51460()) {
            C21374.m48457(R.string.MT_Protector);
            new ViewOnClickListenerC0059(main).m999();
        } else {
            ViewOnClickListenerC7042.m19011((AbstractActivityC3346) main, true);
        }
    }
}
