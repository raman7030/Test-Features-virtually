package l;

/* JADX INFO: renamed from: l.ۤ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10560 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31692;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31693;

    public /* synthetic */ RunnableC10560(int i, Object obj) {
        this.f31692 = i;
        this.f31693 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31692) {
            case 0:
                ((C3504) this.f31693).accept(Boolean.FALSE);
                break;
            default:
                ((InterfaceC17182) this.f31693).mo25028();
                break;
        }
    }
}
