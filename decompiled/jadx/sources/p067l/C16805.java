package p067l;

/* JADX INFO: renamed from: l.ܶۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBG8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16805 extends AbstractC25009 {

    /* JADX INFO: renamed from: ۧ */
    public final int f49531;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15405 f49532;

    public C16805(int i, AbstractC15405 abstractC15405) {
        super("AnnotationDefault");
        if (abstractC15405 == null) {
            throw new NullPointerException("value == null");
        }
        this.f49532 = abstractC15405;
        this.f49531 = i;
    }

    @Override // p067l.InterfaceC14320
    /* JADX INFO: renamed from: ֫ */
    public final int mo11873() {
        return this.f49531 + 6;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15405 m38082() {
        return this.f49532;
    }
}
