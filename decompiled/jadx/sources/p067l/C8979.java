package p067l;

/* JADX INFO: renamed from: l.ۜᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8979 implements InterfaceC9988 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f24327;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f24328;

    public /* synthetic */ C8979(int i, Object obj) {
        this.f24327 = i;
        this.f24328 = obj;
    }

    @Override // p067l.InterfaceC9988
    /* JADX INFO: renamed from: ۧ */
    public final void mo6895(Object obj, Throwable th) {
        switch (this.f24327) {
            case 0:
                C21050 c21050 = (C21050) this.f24328;
                c21050.f66087.post(new Runnable() { // from class: l.᩷ᩴᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21050.m47477(this.f70651, th);
                    }
                });
                break;
            default:
                ((C6197) this.f24328).m14046();
                break;
        }
    }
}
