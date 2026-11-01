package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1QW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17149 extends AbstractC8433 {

    /* JADX INFO: renamed from: ۗ */
    public final OutputStream f51076;

    /* JADX INFO: renamed from: ۙ */
    public final int f51077;

    /* JADX INFO: renamed from: ۤ */
    public long f51078 = 0;

    /* JADX INFO: renamed from: ۫ */
    public final byte[] f51079 = new byte[1];

    /* JADX INFO: renamed from: ۬ */
    public final C7092 f51080;

    /* JADX INFO: renamed from: ᩶ */
    public AbstractC8433 f51081;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC7290 f51082;

    /* JADX INFO: renamed from: ᩹ */
    public final long f51083;

    public C17149(OutputStream outputStream, C9774[] c9774Arr, AbstractC7290 abstractC7290, C6422 c6422) throws IOException {
        this.f51076 = outputStream;
        this.f51082 = abstractC7290;
        C7092 c7092 = new C7092(outputStream);
        this.f51080 = c7092;
        this.f51081 = c7092;
        for (int length = c9774Arr.length - 1; length >= 0; length--) {
            this.f51081 = c9774Arr[length].m22802(this.f51081, c6422);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(c9774Arr.length - 1);
        for (int i = 0; i < c9774Arr.length; i++) {
            c9774Arr[i].getClass();
            C22713.m50841(byteArrayOutputStream, 33L);
            byte[] bArrM22803 = c9774Arr[i].m22803();
            C22713.m50841(byteArrayOutputStream, bArrM22803.length);
            byteArrayOutputStream.write(bArrM22803);
        }
        while ((byteArrayOutputStream.size() & 3) != 0) {
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length2 = byteArray.length + 4;
        this.f51077 = length2;
        if (length2 > 1024) {
            throw new C11314();
        }
        byteArray[0] = (byte) (byteArray.length / 4);
        outputStream.write(byteArray);
        C22713.m50842(byteArray, outputStream);
        this.f51083 = (9223372036854775804L - ((long) length2)) - ((long) abstractC7290.m16746());
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f51079;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f51081.write(bArr, i, i2);
        this.f51082.mo3895(bArr, i, i2);
        this.f51078 += (long) i2;
        m38862();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f51081.flush();
        m38862();
    }

    @Override // p067l.AbstractC8433
    public final void finish() throws IOException {
        this.f51081.finish();
        m38862();
        long jM16330 = this.f51080.m16330();
        while (true) {
            long j = 3 & jM16330;
            OutputStream outputStream = this.f51076;
            if (j != 0) {
                outputStream.write(0);
                jM16330++;
            } else {
                outputStream.write(this.f51082.mo3896());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m38862() throws C4608 {
        long jM16330 = this.f51080.m16330();
        if (jM16330 < 0 || jM16330 > this.f51083 || this.f51078 < 0) {
            throw new C4608("XZ Stream has grown too big");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m38864() {
        return ((long) this.f51077) + this.f51080.m16330() + ((long) this.f51082.m16746());
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m38863() {
        return this.f51078;
    }
}
