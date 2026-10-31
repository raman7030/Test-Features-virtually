package l;

/* JADX INFO: renamed from: l.᩸ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V702 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21503 implements InterfaceC4363 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12164 f69160;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f69161;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12514 f69162;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3158 f69163;

    public C21503(C3158 c3158, C12514 c12514, C12164 c12164, int i) {
        this.f69163 = c3158;
        this.f69162 = c12514;
        this.f69160 = c12164;
        this.f69161 = i;
    }

    @Override // l.InterfaceC4363
    /* JADX INFO: renamed from: ֫ */
    public final int mo13079() {
        C3158 c3158 = this.f69163;
        C1041 c1041 = c3158.f9895;
        c1041.f3804 = this.f69161;
        C12164 c12164 = this.f69160;
        c1041.f3798 = c12164.start();
        c1041.f3802 = c12164.end();
        c1041.f3810 = -1;
        c1041.f3848 = -1;
        c3158.m9608(c1041, this.f69162, c12164);
        return c1041.f3848;
    }
}
