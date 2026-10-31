package l;

/* JADX INFO: renamed from: l.ۧᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C11190 extends AbstractC5713 implements InterfaceC12433 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16833 f33589;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11190(C16833 c16833, int i) {
        super(i);
        this.f33589 = c16833;
    }

    @Override // l.AbstractC9947
    /* JADX INFO: renamed from: ۧ */
    public final Object mo7201(int i) {
        C16833 c16833 = this.f33589;
        return c16833.f51684.get(c16833.f51683 + i);
    }

    @Override // l.AbstractC5713
    /* JADX INFO: renamed from: ֫ */
    public final void mo7200(int i, Object obj) {
        this.f33589.add(i, obj);
    }

    @Override // l.AbstractC5713
    /* JADX INFO: renamed from: ۧ */
    public final void mo7202(int i, Object obj) {
        this.f33589.set(i, obj);
    }

    @Override // l.AbstractC9947
    /* JADX INFO: renamed from: ܽ */
    public final void mo7203(int i) {
        this.f33589.remove(i);
    }

    @Override // l.AbstractC9947
    /* JADX INFO: renamed from: ֫ */
    public final int mo7199() {
        C16833 c16833 = this.f33589;
        return c16833.f51682 - c16833.f51683;
    }
}
