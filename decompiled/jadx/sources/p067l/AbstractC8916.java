package p067l;

/* JADX INFO: renamed from: l.ۜܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: NBDN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8916 extends AbstractC25009 {

    /* JADX INFO: renamed from: ۧ */
    public final C24338 f24161;

    public AbstractC8916(String str, C24338 c24338) {
        super(str);
        try {
            if (c24338.m46000()) {
                throw new C21047("localVariables.isMutable()", null);
            }
            this.f24161 = c24338;
        } catch (NullPointerException unused) {
            throw new NullPointerException("localVariables == null");
        }
    }

    @Override // p067l.InterfaceC14320
    /* JADX INFO: renamed from: ֫ */
    public final int mo11873() {
        return (this.f24161.size() * 10) + 8;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24338 m20608() {
        return this.f24161;
    }
}
