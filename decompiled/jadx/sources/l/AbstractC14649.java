package l;

/* JADX INFO: renamed from: l.ܳܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBDF */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14649 extends AbstractC23822 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22911 f44781;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f44782;

    public AbstractC14649(String str, C22911 c22911, int i) {
        super(str);
        try {
            if (c22911.m43733()) {
                throw new C19653("annotations.isMutable()", null);
            }
            this.f44781 = c22911;
            this.f44782 = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override // l.InterfaceC12575
    /* JADX INFO: renamed from: ֫ */
    public final int mo9828() {
        return this.f44782 + 6;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22911 m34939() {
        return this.f44781;
    }
}
