package l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1QW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15552 extends AbstractC6381 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final OutputStream f47944;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f47945;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f47946 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] f47947 = new byte[1];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C4970 f47948;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC6381 f47949;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC5179 f47950;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f47951;

    public C15552(OutputStream outputStream, C7792[] c7792Arr, AbstractC5179 abstractC5179, C4265 c4265) throws IOException {
        this.f47944 = outputStream;
        this.f47950 = abstractC5179;
        C4970 c4970 = new C4970(outputStream);
        this.f47948 = c4970;
        this.f47949 = c4970;
        for (int length = c7792Arr.length - 1; length >= 0; length--) {
            this.f47949 = c7792Arr[length].m20821(this.f47949, c4265);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(c7792Arr.length - 1);
        for (int i = 0; i < c7792Arr.length; i++) {
            c7792Arr[i].getClass();
            C21407.m48505(byteArrayOutputStream, 33L);
            byte[] bArrM20822 = c7792Arr[i].m20822();
            C21407.m48505(byteArrayOutputStream, bArrM20822.length);
            byteArrayOutputStream.write(bArrM20822);
        }
        while ((byteArrayOutputStream.size() & 3) != 0) {
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length2 = byteArray.length + 4;
        this.f47945 = length2;
        if (length2 > 1024) {
            throw new C9413();
        }
        byteArray[0] = (byte) (byteArray.length / 4);
        outputStream.write(byteArray);
        C21407.m48506(byteArray, outputStream);
        this.f47951 = (9223372036854775804L - ((long) length2)) - ((long) abstractC5179.m14836());
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f47947;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f47949.write(bArr, i, i2);
        this.f47950.mo1497(bArr, i, i2);
        this.f47946 += (long) i2;
        m36701();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f47949.flush();
        m36701();
    }

    @Override // l.AbstractC6381
    public final void finish() throws IOException {
        this.f47949.finish();
        m36701();
        long jM14426 = this.f47948.m14426();
        while (true) {
            long j = 3 & jM14426;
            OutputStream outputStream = this.f47944;
            if (j != 0) {
                outputStream.write(0);
                jM14426++;
            } else {
                outputStream.write(this.f47950.mo1498());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m36701() throws C2357 {
        long jM14426 = this.f47948.m14426();
        if (jM14426 < 0 || jM14426 > this.f47951 || this.f47946 < 0) {
            throw new C2357("XZ Stream has grown too big");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m36703() {
        return ((long) this.f47945) + this.f47948.m14426() + ((long) this.f47950.m14836());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m36702() {
        return this.f47946;
    }
}
