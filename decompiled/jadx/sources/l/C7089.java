package l;

/* JADX INFO: renamed from: l.ۜ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public final class C7089 implements InterfaceC15387 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f21790;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8333 f21791;

    public C7089(Class cls, AbstractC8333 abstractC8333) {
        this.f21790 = cls;
        this.f21791 = abstractC8333;
    }

    @Override // l.InterfaceC15387
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        if (c16469.m38778() == this.f21790) {
            return this.f21791;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f21790.getName() + ",adapter=" + this.f21791 + "]";
    }
}
