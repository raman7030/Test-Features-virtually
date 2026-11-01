package p067l;

/* JADX INFO: renamed from: l.֫᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes2.dex */
public final class C4403 extends AbstractC9097 {

    /* JADX INFO: renamed from: ۙ */
    public final int f9893;

    public C4403(int i, int i2, InterfaceC18588 interfaceC18588) {
        super((int) C11780.m27019(i, i2, 2), interfaceC18588);
        this.f9893 = i2;
    }

    @Override // p067l.AbstractC9097
    /* JADX INFO: renamed from: ֫ */
    public final void mo9162(int i) {
        int i2 = this.f24655;
        StringBuilder sb = this.f24653;
        if (i2 != 0 && i2 % this.f9893 == 0) {
            sb.append('\n');
        }
        for (int i3 = 7; i3 >= 0; i3--) {
            sb.append((char) (((i >>> i3) & 1) + 48));
        }
        sb.append(' ');
    }

    @Override // p067l.AbstractC9097
    public final String finish() {
        StringBuilder sb = this.f24653;
        C11780.m27021(sb);
        return sb.toString();
    }
}
