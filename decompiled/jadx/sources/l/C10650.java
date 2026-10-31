package l;

/* JADX INFO: renamed from: l.ۧ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D18B */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10650 implements InterfaceC17066 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f32043;

    public /* synthetic */ C10650(int i) {
        this.f32043 = i;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        switch (this.f32043) {
            case 0:
                AbstractC15440 abstractC15440 = C16293.f50120;
                return false;
            default:
                return Thread.currentThread().isInterrupted();
        }
    }
}
