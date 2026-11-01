package p067l;

/* JADX INFO: renamed from: l.۫ۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8BG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14124 extends AbstractC25009 {

    /* JADX INFO: renamed from: ۧ */
    public final C10928 f40115;

    public C14124(C10928 c10928) {
        super("InnerClasses");
        try {
            if (c10928.m46000()) {
                throw new C21047("innerClasses.isMutable()", null);
            }
            this.f40115 = c10928;
        } catch (NullPointerException unused) {
            throw new NullPointerException("innerClasses == null");
        }
    }

    @Override // p067l.InterfaceC14320
    /* JADX INFO: renamed from: ֫ */
    public final int mo11873() {
        return (this.f40115.size() * 8) + 8;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10928 m32145() {
        return this.f40115;
    }
}
