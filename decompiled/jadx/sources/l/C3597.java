package l;

/* JADX INFO: renamed from: l.ۘ֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C3597 extends AbstractC8536 {
    @Override // l.AbstractC8536
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo10994(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC8536
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo10995(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC8536
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo10996(int i, byte[] bArr) {
        C16296 c16296 = this.f26077;
        int i2 = c16296.f50124;
        c16296.f50124 = 0;
        int iM38333 = c16296.m38333(i, bArr) + i;
        AbstractC8536.m22217(this.f26071, iM38333, bArr);
        AbstractC8536.m22217(this.f26090, iM38333 + 2, bArr);
        int i3 = (iM38333 + 4) - i;
        this.f26077.f50124 = i2;
        return i3;
    }

    @Override // l.AbstractC8536
    public final String toString() {
        return new String(C9045.m23341(new StringBuilder("NodeStatusRequest["), super.toString(), "]"));
    }
}
