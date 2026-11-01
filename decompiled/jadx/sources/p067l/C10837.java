package p067l;

/* JADX INFO: renamed from: l.ۡܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 950L */
/* JADX INFO: loaded from: classes3.dex */
public final class C10837 implements InterfaceC19482 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C17541 f30022;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f30023;

    public C10837(C17541 c17541, int i) {
        this.f30022 = c17541;
        this.f30023 = i;
    }

    @Override // p067l.InterfaceC19482
    public final int getKey() {
        return this.f30022.f52432 + this.f30023;
    }

    @Override // p067l.InterfaceC19482
    /* JADX INFO: renamed from: ֫ */
    public final int mo13943() {
        C17541 c17541 = this.f30022;
        return c17541.f52431.f32111.m33504().mo13857((this.f30023 * 4) + c17541.f52431.f32112 + 8);
    }
}
