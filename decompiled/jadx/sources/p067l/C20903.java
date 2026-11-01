package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4GH */
/* JADX INFO: loaded from: classes5.dex */
public final class C20903 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۫ */
    public static final /* synthetic */ int f65643 = 0;

    /* JADX INFO: renamed from: ۗ */
    public int f65644;

    /* JADX INFO: renamed from: ۙ */
    public final InputStream f65645;

    /* JADX INFO: renamed from: ۬ */
    public long f65646;

    /* JADX INFO: renamed from: ᩶ */
    public final C2796 f65647;

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f65648;

    /* JADX INFO: renamed from: ᩹ */
    public int f65649;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C20903(final C19561 c19561, final C5738 c5738, C14196 c14196, String str) throws IOException {
        this.f65648 = new byte[16];
        this.f65644 = 0;
        this.f65649 = 0;
        this.f65645 = c14196;
        int iM12749 = c5738.m12749();
        int iM10146 = C4809.m10146(iM12749);
        long j = ((long) iM10146) + 12;
        if (c5738.m12774() < j) {
            throw new IOException("Invalid AES compressed size: " + c5738.m12774() + " < " + j + " (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        byte[] bArr = new byte[iM10146];
        byte[] bArr2 = new byte[2];
        C4809.m10152(c14196, bArr, iM10146);
        C4809.m10152(c14196, bArr2, 2);
        this.f65646 = c5738.m12774() - j;
        this.f65647 = new C2796(iM12749, str, bArr, bArr2, new InterfaceC8205() { // from class: l.ᩴܰۡ
            @Override // p067l.InterfaceC8205
            public final Object get() {
                c19561.m44451("");
                return new C6150(c5738.getName());
            }
        });
    }

    public C20903(AbstractC17043 abstractC17043, String str, InterfaceC8205 interfaceC8205) throws IOException {
        BufferedInputStream bufferedInputStreamM38676 = abstractC17043.m38676();
        long jMo25101 = abstractC17043.mo25101();
        this.f65648 = new byte[16];
        this.f65644 = 0;
        this.f65649 = 0;
        this.f65645 = bufferedInputStreamM38676;
        try {
            byte[] bArr = new byte[8];
            byte[] bArr2 = new byte[2];
            C4809.m10152(bufferedInputStreamM38676, bArr, 8);
            if (C17548.m39939(0, bArr) != 6436280820912968781L) {
                throw new IOException("Bad magic");
            }
            C4809.m10152(bufferedInputStreamM38676, bArr, 8);
            C4809.m10152(bufferedInputStreamM38676, bArr2, 2);
            this.f65646 = (((jMo25101 - 8) - ((long) 8)) - ((long) 2)) - 10;
            this.f65647 = new C2796(1, str, bArr, bArr2, interfaceC8205);
        } catch (IOException e) {
            C2700.m4192(bufferedInputStreamM38676);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f65649;
        if (i3 == -1) {
            return -1;
        }
        if (this.f65644 >= i3) {
            m47214();
            if (this.f65649 == -1) {
                return -1;
            }
        }
        int i4 = 0;
        do {
            int iMin = Math.min(this.f65649 - this.f65644, i2);
            System.arraycopy(this.f65648, this.f65644, bArr, i, iMin);
            i4 += iMin;
            this.f65644 += iMin;
            i += iMin;
            i2 -= iMin;
            if (i2 == 0) {
                break;
            }
            m47214();
        } while (this.f65649 != -1);
        return i4;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f65649;
        if (i == -1) {
            return -1;
        }
        if (this.f65644 >= i) {
            m47214();
            if (this.f65649 == -1) {
                return -1;
            }
        }
        int i2 = this.f65644;
        this.f65644 = i2 + 1;
        return this.f65648[i2] & 255;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m47214() throws IOException {
        if (this.f65649 == -1) {
            throw new IllegalStateException();
        }
        long j = this.f65646;
        InputStream inputStream = this.f65645;
        C2796 c2796 = this.f65647;
        if (j == 0) {
            this.f65649 = -1;
            byte[] bArrM4386 = c2796.m4386();
            byte[] bArr = new byte[10];
            C4809.m10152(inputStream, bArr, 10);
            for (int i = 0; i < 10; i++) {
                if (bArr[i] != bArrM4386[i]) {
                    throw new IOException("Reached end of data for this entry, but aes verification failed");
                }
            }
            return;
        }
        int iMin = (int) Math.min(16L, j);
        byte[] bArr2 = this.f65648;
        int iM10147 = C4809.m10147(inputStream, bArr2, iMin);
        this.f65649 = iM10147;
        if (iM10147 == 0) {
            this.f65649 = -1;
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
        c2796.m4385(iM10147, bArr2);
        this.f65644 = 0;
        this.f65646 -= (long) this.f65649;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f65645.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m47215() {
        return this.f65646;
    }
}
