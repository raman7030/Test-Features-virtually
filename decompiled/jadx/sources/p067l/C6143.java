package p067l;

/* JADX INFO: renamed from: l.ۘܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 951O */
/* JADX INFO: loaded from: classes3.dex */
public final class C6143 implements InterfaceC19482 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C20225 f15418;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f15419;

    public C6143(C20225 c20225, int i) {
        this.f15418 = c20225;
        this.f15419 = i;
    }

    @Override // p067l.InterfaceC19482
    public final int getKey() {
        C20225 c20225 = this.f15418;
        return c20225.f62528.f32111.m33504().mo13857((this.f15419 * 4) + c20225.f62528.f32112 + 4);
    }

    @Override // p067l.InterfaceC19482
    /* JADX INFO: renamed from: ֫ */
    public final int mo13943() {
        C20896 c20896 = this.f15418.f62528;
        return c20896.f32111.m33504().mo13857((this.f15419 * 4) + (c20896.f65611 * 4) + c20896.f32112 + 4);
    }
}
