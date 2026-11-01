package p067l;

/* JADX INFO: renamed from: l.ۤۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBDL */
/* JADX INFO: loaded from: classes4.dex */
public final class C12113 extends AbstractC25009 {

    /* JADX INFO: renamed from: ۧ */
    public final C8245 f33858;

    public C12113(C8245 c8245) {
        super("LineNumberTable");
        try {
            if (c8245.m46000()) {
                throw new C21047("lineNumbers.isMutable()", null);
            }
            this.f33858 = c8245;
        } catch (NullPointerException unused) {
            throw new NullPointerException("lineNumbers == null");
        }
    }

    @Override // p067l.InterfaceC14320
    /* JADX INFO: renamed from: ֫ */
    public final int mo11873() {
        return (this.f33858.size() * 4) + 8;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C8245 m28004() {
        return this.f33858;
    }
}
