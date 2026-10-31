package l;

/* JADX INFO: renamed from: l.ۖ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E6AF */
/* JADX INFO: loaded from: classes2.dex */
public final class C2213 implements InterfaceC19269 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0095 f7262;

    public C2213(C0095 c0095) {
        this.f7262 = c0095;
    }

    @Override // l.InterfaceC19269
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo7386(float f) {
        if (f == 0.0f) {
            return false;
        }
        mo7387();
        this.f7262.m1073((int) f);
        return true;
    }

    @Override // l.InterfaceC19269
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo7387() {
        this.f7262.f1039.abortAnimation();
    }

    @Override // l.InterfaceC19269
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float mo7385() {
        return -this.f7262.m1072();
    }
}
