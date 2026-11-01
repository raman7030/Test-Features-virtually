package p067l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩷᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC22509 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18588 f70976;

    /* JADX INFO: renamed from: ᩹ */
    public final byte[] f70977 = new byte[1];

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo35230(byte[] bArr, int i, int i2);

    public AbstractC22509(InterfaceC18588 interfaceC18588) {
        this.f70976 = interfaceC18588;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws C18484 {
        byte[] bArr = this.f70977;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C18484 {
        if (this.f70976.mo3924()) {
            throw new C18484();
        }
        mo35230(bArr, i, i2);
    }
}
