package p067l;

/* JADX INFO: renamed from: l.ܳܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBDF */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16291 extends AbstractC25009 {

    /* JADX INFO: renamed from: ۧ */
    public final C24143 f47888;

    /* JADX INFO: renamed from: ܽ */
    public final int f47889;

    public AbstractC16291(String str, C24143 c24143, int i) {
        super(str);
        try {
            if (c24143.m46000()) {
                throw new C21047("annotations.isMutable()", null);
            }
            this.f47888 = c24143;
            this.f47889 = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override // p067l.InterfaceC14320
    /* JADX INFO: renamed from: ֫ */
    public final int mo11873() {
        return this.f47889 + 6;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24143 m37086() {
        return this.f47888;
    }
}
