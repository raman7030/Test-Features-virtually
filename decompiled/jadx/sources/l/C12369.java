package l;

/* JADX INFO: renamed from: l.۫ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12369 extends AbstractC23822 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9006 f37099;

    public C12369(C9006 c9006) {
        super("InnerClasses");
        try {
            if (c9006.m43733()) {
                throw new C19653("innerClasses.isMutable()", null);
            }
            this.f37099 = c9006;
        } catch (NullPointerException unused) {
            throw new NullPointerException("innerClasses == null");
        }
    }

    @Override // l.InterfaceC12575
    /* JADX INFO: renamed from: ֫ */
    public final int mo9828() {
        return (this.f37099.size() * 8) + 8;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9006 m30084() {
        return this.f37099;
    }
}
