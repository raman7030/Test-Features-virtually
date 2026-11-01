package p067l;

/* JADX INFO: renamed from: l.᩷ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C22379 implements InterfaceC23977 {

    /* JADX INFO: renamed from: ֫ */
    public final C2479 f70605;

    public C22379(C19244 c19244, int i) {
        this.f70605 = (C2479) ((C16561) c19244.m43834().get(i)).getFields().get(0);
    }

    @Override // p067l.InterfaceC23977
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo34722(AbstractC6285 abstractC6285) {
        return abstractC6285.hasField(this.f70605);
    }

    @Override // p067l.InterfaceC23977
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo34723(AbstractC21296 abstractC21296) {
        return abstractC21296.hasField(this.f70605);
    }

    @Override // p067l.InterfaceC23977
    /* JADX INFO: renamed from: ֫ */
    public final C2479 mo34719(AbstractC6285 abstractC6285) {
        C2479 c2479 = this.f70605;
        if (abstractC6285.hasField(c2479)) {
            return c2479;
        }
        return null;
    }

    @Override // p067l.InterfaceC23977
    /* JADX INFO: renamed from: ۧ */
    public final C2479 mo34721(AbstractC21296 abstractC21296) {
        C2479 c2479 = this.f70605;
        if (abstractC21296.hasField(c2479)) {
            return c2479;
        }
        return null;
    }

    @Override // p067l.InterfaceC23977
    /* JADX INFO: renamed from: ֫ */
    public final void mo34720(AbstractC21296 abstractC21296) {
        abstractC21296.clearField(this.f70605);
    }
}
