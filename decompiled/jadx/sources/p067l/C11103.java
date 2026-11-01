package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۡ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4GY */
/* JADX INFO: loaded from: classes3.dex */
public final class C11103 implements Comparable {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f30766;

    /* JADX INFO: renamed from: ۗ */
    public int f30767;

    /* JADX INFO: renamed from: ۙ */
    public int f30768;

    /* JADX INFO: renamed from: ۛ */
    public long f30769;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f30770;

    /* JADX INFO: renamed from: ۟ */
    public boolean f30771;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f30772;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f30773;

    /* JADX INFO: renamed from: ۤ */
    public long f30774;

    /* JADX INFO: renamed from: ۧ֫ */
    public byte[] f30775;

    /* JADX INFO: renamed from: ۨ */
    public long f30776;

    /* JADX INFO: renamed from: ۫ */
    public int f30777;

    /* JADX INFO: renamed from: ۬ */
    public int f30778;

    /* JADX INFO: renamed from: ܰ */
    public boolean f30779;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f30780;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f30781;

    /* JADX INFO: renamed from: ܿ֫ */
    public String f30782;

    /* JADX INFO: renamed from: ᩳ֫ */
    public byte[] f30783;

    /* JADX INFO: renamed from: ᩶ */
    public long f30784;

    /* JADX INFO: renamed from: ᩷֫ */
    public long f30785;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f30786;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f30787;

    /* JADX INFO: renamed from: ᩺ */
    public int f30788;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f30789;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f30782.compareTo(((C11103) obj).f30782);
    }

    public C11103(String str, Charset charset) {
        this.f30782 = str;
        this.f30783 = str.getBytes(charset);
        this.f30766 = charset.name().equalsIgnoreCase(StandardCharsets.UTF_8.name());
        byte[] bArr = new byte[0];
        this.f30787 = bArr;
        this.f30786 = bArr;
        this.f30775 = bArr;
        this.f30772 = (int) C4809.m10151(System.currentTimeMillis());
        this.f30779 = str.endsWith("/") || str.endsWith("\\");
        this.f30784 = -1L;
        this.f30785 = -1L;
        m25573(str);
    }

    public C11103(C5738 c5738, Charset charset) {
        String strM12794 = c5738.m12794();
        strM12794 = strM12794 == null ? c5738.getName() : strM12794;
        this.f30782 = strM12794;
        this.f30783 = strM12794.getBytes(charset);
        this.f30766 = charset.name().equalsIgnoreCase(StandardCharsets.UTF_8.name());
        this.f30772 = (int) C4809.m10151(c5738.getTime());
        this.f30781 = c5738.m12748();
        this.f30768 = c5738.m12763();
        this.f30784 = c5738.m12774();
        this.f30785 = c5738.getSize();
        this.f30775 = c5738.m12747() == null ? new byte[0] : c5738.m12747();
        this.f30786 = c5738.m12788() == null ? new byte[0] : c5738.m12788();
        this.f30787 = c5738.m12782() == null ? new byte[0] : c5738.m12782().getBytes(charset);
        this.f30789 = c5738.m12776();
        this.f30788 = c5738.m12790();
        this.f30778 = c5738.m12765();
        this.f30779 = c5738.isDirectory();
        m25573(strM12794);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m25573(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > 127) {
                CRC32 crc32 = new CRC32();
                crc32.update(this.f30783);
                int value = (int) crc32.getValue();
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                try {
                    int length2 = bytes.length + 5;
                    byte[] bArr = new byte[length2];
                    boolean z = C4809.f10911;
                    if (1 > length2) {
                        throw new EOFException();
                    }
                    bArr[0] = (byte) 1;
                    if (5 > length2) {
                        throw new EOFException();
                    }
                    C17548.m39930(1, value, bArr);
                    System.arraycopy(bytes, 0, bArr, 5, bytes.length);
                    if (Arrays.equals(this.f30775, this.f30786)) {
                        byte[] bArrM24122 = C10432.m24122(28789, this.f30775, bArr);
                        this.f30786 = bArrM24122;
                        this.f30775 = bArrM24122;
                        return;
                    } else {
                        this.f30775 = C10432.m24122(28789, this.f30775, bArr);
                        this.f30786 = C10432.m24122(28789, this.f30786, bArr);
                        return;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
