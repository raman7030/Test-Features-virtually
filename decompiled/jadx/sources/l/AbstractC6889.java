package l;

/* JADX INFO: renamed from: l.ۜܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NBDN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6889 extends AbstractC23822 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23116 f21284;

    public AbstractC6889(String str, C23116 c23116) {
        super(str);
        try {
            if (c23116.m43733()) {
                throw new C19653("localVariables.isMutable()", null);
            }
            this.f21284 = c23116;
        } catch (NullPointerException unused) {
            throw new NullPointerException("localVariables == null");
        }
    }

    @Override // l.InterfaceC12575
    /* JADX INFO: renamed from: ֫ */
    public final int mo9828() {
        return (this.f21284.size() * 10) + 8;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23116 m18659() {
        return this.f21284;
    }
}
