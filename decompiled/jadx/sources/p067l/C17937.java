package p067l;

/* JADX INFO: renamed from: l.ܽۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S98Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C17937 implements InterfaceC8550 {

    /* JADX INFO: renamed from: ֫ */
    public int f53570;

    /* JADX INFO: renamed from: ۧ */
    public int f53571 = 0;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C19279 f53572;

    public C17937(C19279 c19279) {
        this.f53572 = c19279;
        this.f53570 = c19279.m43967();
    }

    @Override // p067l.InterfaceC8550
    public final int read() {
        int i = this.f53571;
        int i2 = this.f53570;
        if (i >= i2) {
            return -1;
        }
        this.f53571 = i + 1;
        int i3 = (i2 - 1) - i;
        return (this.f53572.mo42345(i3 >> 2) >>> ((i3 & 3) << 3)) & 255;
    }
}
