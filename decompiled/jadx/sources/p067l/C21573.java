package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩶ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4HB */
/* JADX INFO: loaded from: classes5.dex */
public final class C21573 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public byte[] f68026 = new byte[1];

    /* JADX INFO: renamed from: ᩸ */
    public C6820 f68027;

    /* JADX INFO: renamed from: ᩹ */
    public C14196 f68028;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C21573(C19561 c19561, C5738 c5738, C14196 c14196, String str) throws IOException {
        this.f68028 = c14196;
        byte[] bArr = new byte[12];
        C4809.m10152(c14196, bArr, 12);
        this.f68027 = new C6820(c19561, c5738, str, bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f68028.read(bArr, i, i2);
        if (i3 > 0) {
            this.f68027.m15615(i, i3, bArr);
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f68026;
        if (read(bArr) <= 0) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
