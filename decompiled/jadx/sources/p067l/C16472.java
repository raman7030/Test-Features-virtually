package p067l;

/* JADX INFO: renamed from: l.ܳ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C16472 extends AbstractC9097 {

    /* JADX INFO: renamed from: ۙ */
    public final int f48372;

    public C16472(int i, int i2, InterfaceC18588 interfaceC18588) {
        super((int) C11780.m27019(i, i2, 1), interfaceC18588);
        this.f48372 = i2;
    }

    @Override // p067l.AbstractC9097
    /* JADX INFO: renamed from: ֫ */
    public final void mo9162(int i) {
        int i2 = this.f24655;
        StringBuilder sb = this.f24653;
        if (i2 != 0 && i2 % this.f48372 == 0) {
            sb.append('\n');
        }
        sb.append(i);
        if (i < 10) {
            sb.append("   ");
        } else if (i < 100) {
            sb.append(EnumC2483.f3919);
        } else {
            sb.append(' ');
        }
    }

    @Override // p067l.AbstractC9097
    public final String finish() {
        StringBuilder sb = this.f24653;
        C11780.m27021(sb);
        return sb.toString();
    }
}
