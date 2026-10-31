package l;

/* JADX INFO: renamed from: l.ܳ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public final class C14839 extends AbstractC7079 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f45256;

    public C14839(int i, int i2, InterfaceC17066 interfaceC17066) {
        super((int) C9902.m25004(i, i2, 1), interfaceC17066);
        this.f45256 = i2;
    }

    @Override // l.AbstractC7079
    /* JADX INFO: renamed from: ֫ */
    public final void mo7067(int i) {
        int i2 = this.f21774;
        StringBuilder sb = this.f21772;
        if (i2 != 0 && i2 % this.f45256 == 0) {
            sb.append('\n');
        }
        sb.append(i);
        if (i < 10) {
            sb.append("   ");
        } else if (i < 100) {
            sb.append(EnumC0121.f1143);
        } else {
            sb.append(' ');
        }
    }

    @Override // l.AbstractC7079
    public final String finish() {
        StringBuilder sb = this.f21772;
        C9902.m25006(sb);
        return sb.toString();
    }
}
