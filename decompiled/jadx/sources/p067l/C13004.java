package p067l;

/* JADX INFO: renamed from: l.ۧᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1MI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13004 extends AbstractC7798 implements InterfaceC14185 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C18367 f36589;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13004(C18367 c18367, int i) {
        super(i);
        this.f36589 = c18367;
    }

    @Override // p067l.AbstractC11822
    /* JADX INFO: renamed from: ۧ */
    public final Object mo9280(int i) {
        C18367 c18367 = this.f36589;
        return c18367.f54864.get(c18367.f54863 + i);
    }

    @Override // p067l.AbstractC7798
    /* JADX INFO: renamed from: ֫ */
    public final void mo9279(int i, Object obj) {
        this.f36589.add(i, obj);
    }

    @Override // p067l.AbstractC7798
    /* JADX INFO: renamed from: ۧ */
    public final void mo9281(int i, Object obj) {
        this.f36589.set(i, obj);
    }

    @Override // p067l.AbstractC11822
    /* JADX INFO: renamed from: ܽ */
    public final void mo9282(int i) {
        this.f36589.remove(i);
    }

    @Override // p067l.AbstractC11822
    /* JADX INFO: renamed from: ֫ */
    public final int mo9278() {
        C18367 c18367 = this.f36589;
        return c18367.f54862 - c18367.f54863;
    }
}
