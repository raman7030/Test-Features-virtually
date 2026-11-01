package p067l;

/* JADX INFO: renamed from: l.ܽܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BCD */
/* JADX INFO: loaded from: classes5.dex */
public final class C18323 extends AbstractC12960 implements InterfaceC13650 {

    /* JADX INFO: renamed from: ܿ */
    public final C24318 f54732;

    public C18323(C14260 c14260, int i, C21637 c21637, C15660 c15660) {
        super(c14260, i, c21637, c15660);
        String string = mo12310().getString();
        C9566 c9566M32771 = c14260.m32771();
        boolean z = (i & 8) != 0;
        boolean zM48853 = c21637.m48853();
        C24318 c24318M53649 = C24318.m53649(string);
        if (!z) {
            c24318M53649 = c24318M53649.m53652(zM48853 ? c9566M32771.m22280(Integer.MAX_VALUE) : c9566M32771);
        }
        this.f54732 = c24318M53649;
    }

    @Override // p067l.InterfaceC13650
    /* JADX INFO: renamed from: ֫ */
    public final C24318 mo12299() {
        return this.f54732;
    }
}
