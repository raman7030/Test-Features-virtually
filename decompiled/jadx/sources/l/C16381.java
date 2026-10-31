package l;

/* JADX INFO: renamed from: l.ܽۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S98Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C16381 implements InterfaceC6504 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f50398;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f50399 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17793 f50400;

    public C16381(C17793 c17793) {
        this.f50400 = c17793;
        this.f50398 = c17793.m41721();
    }

    @Override // l.InterfaceC6504
    public final int read() {
        int i = this.f50399;
        int i2 = this.f50398;
        if (i >= i2) {
            return -1;
        }
        this.f50399 = i + 1;
        int i3 = (i2 - 1) - i;
        return (this.f50400.mo40100(i3 >> 2) >>> ((i3 & 3) << 3)) & 255;
    }
}
