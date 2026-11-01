package p067l;

/* JADX INFO: renamed from: l.ܺᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F9Y1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17697 extends AbstractC19710 {
    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ۜ */
    public final int mo4839(int i, byte[] bArr) {
        return 0;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ܽ */
    public final int mo4840(byte[] bArr) {
        return 0;
    }

    public C17697(String str, InterfaceC3341 interfaceC3341) {
        super(interfaceC3341, (byte) 37, (byte) 83);
        this.f59919 = str;
        this.f59918 = -1;
        this.f59920 = 0;
        this.f59934 = 0;
        this.f59930 = 2;
    }

    @Override // p067l.AbstractC19710
    /* JADX INFO: renamed from: ᩷ */
    public final int mo4841(int i, byte[] bArr) {
        bArr[i] = m44787();
        bArr[i + 1] = 0;
        bArr[i + 2] = 0;
        bArr[i + 3] = 0;
        return 4;
    }

    @Override // p067l.AbstractC19710, p067l.AbstractC13224
    public final String toString() {
        StringBuilder sb = new StringBuilder("TransWaitNamedPipe[");
        sb.append(super.toString());
        sb.append(",pipeName=");
        return new String(C10965.m25286(sb, this.f59919, "]"));
    }
}
