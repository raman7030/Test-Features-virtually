package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4GH */
/* JADX INFO: loaded from: classes5.dex */
public final class C19502 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f63026 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f63027;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream f63028;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f63029;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C0450 f63030;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f63031;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f63032;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C19502(final C18090 c18090, final C3545 c3545, C12445 c12445, String str) throws IOException {
        this.f63031 = new byte[16];
        this.f63027 = 0;
        this.f63032 = 0;
        this.f63028 = c12445;
        int iM10768 = c3545.m10768();
        int iM8113 = C2568.m8113(iM10768);
        long j = ((long) iM8113) + 12;
        if (c3545.m10793() < j) {
            throw new IOException("Invalid AES compressed size: " + c3545.m10793() + " < " + j + " (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        byte[] bArr = new byte[iM8113];
        byte[] bArr2 = new byte[2];
        C2568.m8119(c12445, bArr, iM8113);
        C2568.m8119(c12445, bArr2, 2);
        this.f63029 = c3545.m10793() - j;
        this.f63030 = new C0450(iM10768, str, bArr, bArr2, new InterfaceC6141() { // from class: l.ᩴܰۡ
            @Override // l.InterfaceC6141
            public final Object get() {
                c18090.m42192("");
                return new C3979(c3545.getName());
            }
        });
    }

    public C19502(AbstractC15440 abstractC15440, String str, InterfaceC6141 interfaceC6141) throws IOException {
        BufferedInputStream bufferedInputStreamM36518 = abstractC15440.m36518();
        long jMo23127 = abstractC15440.mo23127();
        this.f63031 = new byte[16];
        this.f63027 = 0;
        this.f63032 = 0;
        this.f63028 = bufferedInputStreamM36518;
        try {
            byte[] bArr = new byte[8];
            byte[] bArr2 = new byte[2];
            C2568.m8119(bufferedInputStreamM36518, bArr, 8);
            if (C15972.m37755(0, bArr) != 6436280820912968781L) {
                throw new IOException("Bad magic");
            }
            C2568.m8119(bufferedInputStreamM36518, bArr, 8);
            C2568.m8119(bufferedInputStreamM36518, bArr2, 2);
            this.f63029 = (((jMo23127 - 8) - ((long) 8)) - ((long) 2)) - 10;
            this.f63030 = new C0450(1, str, bArr, bArr2, interfaceC6141);
        } catch (IOException e) {
            C0349.m1793(bufferedInputStreamM36518);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f63032;
        if (i3 == -1) {
            return -1;
        }
        if (this.f63027 >= i3) {
            m44916();
            if (this.f63032 == -1) {
                return -1;
            }
        }
        int i4 = 0;
        do {
            int iMin = Math.min(this.f63032 - this.f63027, i2);
            System.arraycopy(this.f63031, this.f63027, bArr, i, iMin);
            i4 += iMin;
            this.f63027 += iMin;
            i += iMin;
            i2 -= iMin;
            if (i2 == 0) {
                break;
            }
            m44916();
        } while (this.f63032 != -1);
        return i4;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f63032;
        if (i == -1) {
            return -1;
        }
        if (this.f63027 >= i) {
            m44916();
            if (this.f63032 == -1) {
                return -1;
            }
        }
        int i2 = this.f63027;
        this.f63027 = i2 + 1;
        return this.f63031[i2] & 255;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m44916() throws IOException {
        if (this.f63032 == -1) {
            throw new IllegalStateException();
        }
        long j = this.f63029;
        InputStream inputStream = this.f63028;
        C0450 c0450 = this.f63030;
        if (j == 0) {
            this.f63032 = -1;
            byte[] bArrM2009 = c0450.m2009();
            byte[] bArr = new byte[10];
            C2568.m8119(inputStream, bArr, 10);
            for (int i = 0; i < 10; i++) {
                if (bArr[i] != bArrM2009[i]) {
                    throw new IOException("Reached end of data for this entry, but aes verification failed");
                }
            }
            return;
        }
        int iMin = (int) Math.min(16L, j);
        byte[] bArr2 = this.f63031;
        int iM8114 = C2568.m8114(inputStream, bArr2, iMin);
        this.f63032 = iM8114;
        if (iM8114 == 0) {
            this.f63032 = -1;
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
        c0450.m2008(iM8114, bArr2);
        this.f63027 = 0;
        this.f63029 -= (long) this.f63032;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f63028.close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m44917() {
        return this.f63029;
    }
}
