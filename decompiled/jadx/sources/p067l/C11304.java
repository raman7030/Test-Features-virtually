package p067l;

import net.p069sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۢۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C11304 extends AbstractC4424 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC5761 f31487;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f31488;

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16036(int i) {
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩹ */
    public final void mo16037() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11304(C4598 c4598, boolean z, InterfaceC5761 interfaceC5761) {
        super(c4598);
        this.f31488 = z;
        this.f31487 = interfaceC5761;
    }

    @Override // p067l.AbstractC4424, p067l.InterfaceC15563
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo9240() {
        return this.f31488;
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo16034() {
        return new C4444(4, this.f31487);
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ܽ */
    public final void mo16035() {
        this.f31487.mo12856();
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        return this.f31487.mo3924();
    }

    @Override // p067l.InterfaceC15563
    /* JADX INFO: renamed from: ֫ */
    public final void mo16033(int i) {
        this.f31487.mo12853(i);
    }
}
