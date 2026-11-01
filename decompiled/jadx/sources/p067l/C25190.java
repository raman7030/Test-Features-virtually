package p067l;

/* JADX INFO: renamed from: l.᩻᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes.dex */
public final class C25190 extends AbstractC9097 {

    /* JADX INFO: renamed from: ۙ */
    public final int f80572;

    public C25190(int i, int i2, InterfaceC18588 interfaceC18588) {
        super((int) C11780.m27019(i, i2, 0), interfaceC18588);
        this.f80572 = i2;
    }

    @Override // p067l.AbstractC9097
    /* JADX INFO: renamed from: ֫ */
    public final void mo9162(int i) {
        int i2 = this.f24655;
        StringBuilder sb = this.f24653;
        if (i2 != 0 && i2 % this.f80572 == 0) {
            sb.append('\n');
        }
        sb.append(C11780.f32910[i >>> 4]);
        sb.append(C11780.f32910[i & 15]);
        sb.append(' ');
    }

    @Override // p067l.AbstractC9097
    public final String finish() {
        StringBuilder sb = this.f24653;
        C11780.m27021(sb);
        return sb.toString();
    }
}
