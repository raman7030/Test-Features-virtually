package l;

/* JADX INFO: renamed from: l.ܽܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BCD */
/* JADX INFO: loaded from: classes5.dex */
public final class C16787 extends AbstractC11144 implements InterfaceC11870 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23095 f51550;

    public C16787(C12512 c12512, int i, C20274 c20274, C13985 c13985) {
        super(c12512, i, c20274, c13985);
        String string = mo10273().getString();
        C7573 c7573M30696 = c12512.m30696();
        boolean z = (i & 8) != 0;
        boolean zM46531 = c20274.m46531();
        C23095 c23095M51255 = C23095.m51255(string);
        if (!z) {
            c23095M51255 = c23095M51255.m51258(zM46531 ? c7573M30696.m20303(Integer.MAX_VALUE) : c7573M30696);
        }
        this.f51550 = c23095M51255;
    }

    @Override // l.InterfaceC11870
    /* JADX INFO: renamed from: ֫ */
    public final C23095 mo10262() {
        return this.f51550;
    }
}
