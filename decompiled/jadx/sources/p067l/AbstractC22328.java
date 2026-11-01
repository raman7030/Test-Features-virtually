package p067l;

/* JADX INFO: renamed from: l.᩷ܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBH6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22328 extends AbstractC25009 {

    /* JADX INFO: renamed from: ۧ */
    public final int f70495;

    /* JADX INFO: renamed from: ܽ */
    public final C15425 f70496;

    public AbstractC22328(String str, C15425 c15425, int i) {
        super(str);
        try {
            if (c15425.m46000()) {
                throw new C21047("parameterAnnotations.isMutable()", null);
            }
            this.f70496 = c15425;
            this.f70495 = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }

    @Override // p067l.InterfaceC14320
    /* JADX INFO: renamed from: ֫ */
    public final int mo11873() {
        return this.f70495 + 6;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C15425 m50149() {
        return this.f70496;
    }
}
