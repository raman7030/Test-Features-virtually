package l;

/* JADX INFO: renamed from: l.᩵ۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19354 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0302 f62648;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1008 f62649;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f62650;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f62651 = -1;

    /* JADX INFO: renamed from: ֫ */
    public void mo43238() {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo11587();

    /* JADX INFO: renamed from: ᩻ */
    public boolean mo43239(InterfaceC23586 interfaceC23586) {
        return false;
    }

    public AbstractC19354(AbstractC0302 abstractC0302, InterfaceC1008 interfaceC1008) {
        this.f62648 = abstractC0302;
        this.f62649 = interfaceC1008;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44575(boolean z) {
        if (z == this.f62650) {
            return;
        }
        this.f62650 = z;
        int i = z ? 1 : -1;
        AbstractC0302 abstractC0302 = this.f62648;
        abstractC0302.m1663(i);
        if (this.f62650) {
            abstractC0302.m1666(this);
        }
    }
}
