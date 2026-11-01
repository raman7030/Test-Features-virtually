package p067l;

/* JADX INFO: renamed from: l.ۢᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L3AO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11627 {

    /* JADX INFO: renamed from: ۧ */
    public final long f32449;

    /* JADX INFO: renamed from: ܳ */
    public boolean f32450;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f32453;

    /* JADX INFO: renamed from: ֫ */
    public final C14268 f32448 = new C14268();

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC7603 f32451 = new C8944(this);

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC3579 f32452 = new C22356(this);

    public C11627(long j) {
        if (j < 1) {
            throw new IllegalArgumentException(C17588.m40051(j, "maxBufferSize < 1: "));
        }
        this.f32449 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3579 m26743() {
        return this.f32452;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC7603 m26742() {
        return this.f32451;
    }
}
