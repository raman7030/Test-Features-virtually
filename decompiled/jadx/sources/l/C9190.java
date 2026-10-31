package l;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۡ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4GY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9190 implements Comparable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f27827;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f27828;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27829;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f27830;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f27831;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f27832;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f27833;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f27834;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f27835;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public byte[] f27836;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f27837;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f27838;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f27839;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f27840;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f27841;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f27842;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public String f27843;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public byte[] f27844;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f27845;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f27846;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f27847;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f27848;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f27849;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f27850;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f27843.compareTo(((C9190) obj).f27843);
    }

    public C9190(String str, Charset charset) {
        this.f27843 = str;
        this.f27844 = str.getBytes(charset);
        this.f27827 = charset.name().equalsIgnoreCase(StandardCharsets.UTF_8.name());
        byte[] bArr = new byte[0];
        this.f27848 = bArr;
        this.f27847 = bArr;
        this.f27836 = bArr;
        this.f27833 = (int) C2568.m8118(System.currentTimeMillis());
        this.f27840 = str.endsWith("/") || str.endsWith("\\");
        this.f27845 = -1L;
        this.f27846 = -1L;
        m23620(str);
    }

    public C9190(C3545 c3545, Charset charset) {
        String strM10813 = c3545.m10813();
        strM10813 = strM10813 == null ? c3545.getName() : strM10813;
        this.f27843 = strM10813;
        this.f27844 = strM10813.getBytes(charset);
        this.f27827 = charset.name().equalsIgnoreCase(StandardCharsets.UTF_8.name());
        this.f27833 = (int) C2568.m8118(c3545.getTime());
        this.f27842 = c3545.m10767();
        this.f27829 = c3545.m10782();
        this.f27845 = c3545.m10793();
        this.f27846 = c3545.getSize();
        this.f27836 = c3545.m10766() == null ? new byte[0] : c3545.m10766();
        this.f27847 = c3545.m10807() == null ? new byte[0] : c3545.m10807();
        this.f27848 = c3545.m10801() == null ? new byte[0] : c3545.m10801().getBytes(charset);
        this.f27850 = c3545.m10795();
        this.f27849 = c3545.m10809();
        this.f27839 = c3545.m10784();
        this.f27840 = c3545.isDirectory();
        m23620(strM10813);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23620(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) > 127) {
                CRC32 crc32 = new CRC32();
                crc32.update(this.f27844);
                int value = (int) crc32.getValue();
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                try {
                    int length2 = bytes.length + 5;
                    byte[] bArr = new byte[length2];
                    boolean z = C2568.f8121;
                    if (1 > length2) {
                        throw new EOFException();
                    }
                    bArr[0] = (byte) 1;
                    if (5 > length2) {
                        throw new EOFException();
                    }
                    C15972.m37746(1, value, bArr);
                    System.arraycopy(bytes, 0, bArr, 5, bytes.length);
                    if (Arrays.equals(this.f27836, this.f27847)) {
                        byte[] bArrM22153 = C8484.m22153(28789, this.f27836, bArr);
                        this.f27847 = bArrM22153;
                        this.f27836 = bArrM22153;
                        return;
                    } else {
                        this.f27836 = C8484.m22153(28789, this.f27836, bArr);
                        this.f27847 = C8484.m22153(28789, this.f27847, bArr);
                        return;
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
