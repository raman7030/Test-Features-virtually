package l;

/* JADX INFO: renamed from: l.֫᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes2.dex */
public final class C2140 extends AbstractC7079 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7108;

    public C2140(int i, int i2, InterfaceC17066 interfaceC17066) {
        super((int) C9902.m25004(i, i2, 2), interfaceC17066);
        this.f7108 = i2;
    }

    @Override // l.AbstractC7079
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7067(int i) {
        int i2 = this.f21774;
        StringBuilder sb = this.f21772;
        if (i2 != 0 && i2 % this.f7108 == 0) {
            sb.append('\n');
        }
        for (int i3 = 7; i3 >= 0; i3--) {
            sb.append((char) (((i >>> i3) & 1) + 48));
        }
        sb.append(' ');
    }

    @Override // l.AbstractC7079
    public final String finish() {
        StringBuilder sb = this.f21772;
        C9902.m25006(sb);
        return sb.toString();
    }
}
