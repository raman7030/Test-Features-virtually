package l;

/* JADX INFO: renamed from: l.ۖ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes2.dex */
public final class C2856 implements InterfaceC15387 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f9113;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8333 f9114;

    public C2856(Class cls, AbstractC8333 abstractC8333) {
        this.f9113 = cls;
        this.f9114 = abstractC8333;
    }

    @Override // l.InterfaceC15387
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Class<?> clsM38778 = c16469.m38778();
        if (this.f9113.isAssignableFrom(clsM38778)) {
            return new C16260(this, clsM38778);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f9113.getName() + ",adapter=" + this.f9114 + "]";
    }
}
