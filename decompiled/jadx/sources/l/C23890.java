package l;

/* JADX INFO: renamed from: l.᩻ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: NA1Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C23890 extends AbstractC17540 {

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f77250;

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8462(byte[] bArr) {
        return 0;
    }

    public C23890(InterfaceC1023 interfaceC1023, byte[] bArr) {
        super(interfaceC1023);
        this.f77250 = bArr;
    }

    @Override // l.AbstractC17540
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461(int i, int i2, byte[] bArr) throws C17771 {
        byte[] bArr2 = this.f77250;
        if (i2 > bArr2.length) {
            throw new C17771("Payload exceeds buffer size");
        }
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return i2;
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final int m52637() {
        return this.f53569;
    }

    @Override // l.AbstractC17540, l.AbstractC11422
    public final String toString() {
        return new String(C9045.m23341(new StringBuilder("TransCallNamedPipeResponse["), super.toString(), "]"));
    }
}
