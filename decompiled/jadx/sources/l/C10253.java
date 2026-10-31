package l;

/* JADX INFO: renamed from: l.ۤۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBDL */
/* JADX INFO: loaded from: classes4.dex */
public final class C10253 extends AbstractC23822 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6183 f30897;

    public C10253(C6183 c6183) {
        super("LineNumberTable");
        try {
            if (c6183.m43733()) {
                throw new C19653("lineNumbers.isMutable()", null);
            }
            this.f30897 = c6183;
        } catch (NullPointerException unused) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    @Override // l.InterfaceC12575
    /* JADX INFO: renamed from: ֫ */
    public final int mo9828() {
        return (this.f30897.size() * 4) + 8;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6183 m25982() {
        return this.f30897;
    }
}
