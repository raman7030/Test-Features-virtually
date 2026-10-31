package l;

import net.sf.sevenzipjbinding.ISequentialOutStream;

/* JADX INFO: renamed from: l.ۢۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C9402 extends AbstractC2162 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3569 f28538;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f28539;

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩷ */
    public final void mo14155(int i) {
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ᩹ */
    public final void mo14156() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9402(C2346 c2346, boolean z, InterfaceC3569 interfaceC3569) {
        super(c2346);
        this.f28539 = z;
        this.f28538 = interfaceC3569;
    }

    @Override // l.AbstractC2162, l.InterfaceC13883
    /* JADX INFO: renamed from: ᩻֫ */
    public final boolean mo7145() {
        return this.f28539;
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܳ */
    public final ISequentialOutStream mo14153() {
        return new C2184(4, this.f28538);
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ܽ */
    public final void mo14154() {
        this.f28538.mo10876();
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f28538.mo1526();
    }

    @Override // l.InterfaceC13883
    /* JADX INFO: renamed from: ֫ */
    public final void mo14152(int i) {
        this.f28538.mo10873(i);
    }
}
