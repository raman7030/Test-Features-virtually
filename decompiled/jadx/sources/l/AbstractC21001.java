package l;

/* JADX INFO: renamed from: l.᩷ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBH6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21001 extends AbstractC23822 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f67810;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13738 f67811;

    public AbstractC21001(String str, C13738 c13738, int i) {
        super(str);
        try {
            if (c13738.m43733()) {
                throw new C19653("parameterAnnotations.isMutable()", null);
            }
            this.f67811 = c13738;
            this.f67810 = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }

    @Override // l.InterfaceC12575
    /* JADX INFO: renamed from: ֫ */
    public final int mo9828() {
        return this.f67810 + 6;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13738 m47819() {
        return this.f67811;
    }
}
