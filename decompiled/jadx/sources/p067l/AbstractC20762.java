package p067l;

/* JADX INFO: renamed from: l.᩵ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20762 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ AbstractC2655 f65261;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC3326 f65262;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f65263;

    /* JADX INFO: renamed from: ᩹ */
    public int f65264 = -1;

    /* JADX INFO: renamed from: ֫ */
    public void mo45504() {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo13523();

    /* JADX INFO: renamed from: ᩻ */
    public boolean mo45505(InterfaceC24784 interfaceC24784) {
        return false;
    }

    public AbstractC20762(AbstractC2655 abstractC2655, InterfaceC3326 interfaceC3326) {
        this.f65261 = abstractC2655;
        this.f65262 = interfaceC3326;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46869(boolean z) {
        if (z == this.f65263) {
            return;
        }
        this.f65263 = z;
        int i = z ? 1 : -1;
        AbstractC2655 abstractC2655 = this.f65261;
        abstractC2655.m4061(i);
        if (this.f65263) {
            abstractC2655.m4064(this);
        }
    }
}
