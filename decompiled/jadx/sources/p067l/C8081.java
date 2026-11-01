package p067l;

/* JADX INFO: renamed from: l.ۛۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X9GZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8081 extends AbstractC24174 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC4410 f21309 = C13128.m30022(C8081.class);

    /* JADX INFO: renamed from: ۧ */
    public C22834 f21310;

    public C8081(C22834 c22834) {
        this.f21310 = c22834;
    }

    @Override // p067l.AbstractC24174
    /* JADX INFO: renamed from: ֫ */
    public final void mo18751(C19500 c19500) {
        int iM54616 = ((C24864) c19500.m23026()).m54616();
        C22834 c22834 = this.f21310;
        c22834.m51038(iM54616);
        f21309.mo9187("Server granted us {} credits for {}, now available: {} credits", Integer.valueOf(((C24864) c19500.m23026()).m54616()), c19500, Integer.valueOf(c22834.m51037()));
        this.f17493.m15402(c19500);
    }
}
