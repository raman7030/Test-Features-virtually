package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.commonsdk.stateless.b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: OAR3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8734 implements Closeable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int[] f26586;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f26587;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final short[] f26588 = {96, 128, 160, 192, 224, 256, ColorResourcesTableCreator.PackageChunk.HEADER_SIZE, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int[] f26589 = {16, 32, 48, 64, 81, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 146, 210, b.g, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int[] f26590 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC14377 f26591;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13150 f26592;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23550 f26593 = new C23550();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f26594;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InputStream f26595;

    static {
        int[] iArr = new int[288];
        f26586 = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        f26587 = iArr2;
        Arrays.fill(iArr2, 5);
    }

    public C8734(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f26592 = new C13150(inputStream);
        this.f26595 = inputStream;
        this.f26591 = new C20729();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26591 = new C20729();
        this.f26592 = null;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m22590(int i, int i2, byte[] bArr) throws IOException {
        long jM22581;
        while (true) {
            if (this.f26594 && !this.f26591.mo18149()) {
                return -1;
            }
            if (this.f26591.mo18150() == EnumC15788.INITIAL) {
                this.f26594 = m22581(this.f26592, 1) == 1;
                int iM22581 = (int) m22581(this.f26592, 2);
                int i3 = 16;
                if (iM22581 == 0) {
                    this.f26592.m31879();
                    long jM22582 = m22581(this.f26592, 16);
                    if ((65535 & (jM22582 ^ 65535)) != m22581(this.f26592, 16)) {
                        throw new IllegalStateException("Illegal LEN / NLEN values");
                    }
                    this.f26591 = new C9440(this, jM22582);
                } else if (iM22581 == 1) {
                    this.f26591 = new C6617(this, EnumC15788.FIXED_CODES, f26586, f26587);
                } else {
                    if (iM22581 != 2) {
                        throw new IllegalStateException(C19370.m44628(iM22581, "Unsupported compression: "));
                    }
                    int[][] iArr = {new int[(int) (m22581(this.f26592, 5) + 257)], new int[(int) (m22581(this.f26592, 5) + 1)]};
                    C13150 c13150 = this.f26592;
                    int[] iArr2 = iArr[0];
                    int[] iArr3 = iArr[1];
                    int iM22582 = (int) (m22581(c13150, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i4 = 0;
                    while (true) {
                        int i5 = 3;
                        if (i4 < iM22582) {
                            iArr4[f26590[i4]] = (int) m22581(c13150, 3);
                            i4++;
                        } else {
                            C17200 c17200M22588 = m22588(iArr4);
                            int length = iArr2.length + iArr3.length;
                            int[] iArr5 = new int[length];
                            int i6 = 0;
                            int iM22583 = 0;
                            int i7 = -1;
                            while (i6 < length) {
                                if (iM22583 > 0) {
                                    iArr5[i6] = i7;
                                    iM22583--;
                                    i6++;
                                } else {
                                    int iM22584 = m22584(c13150, c17200M22588);
                                    if (iM22584 < i3) {
                                        iArr5[i6] = iM22584;
                                        i7 = iM22584;
                                        i6++;
                                    } else {
                                        long j = 3;
                                        switch (iM22584) {
                                            case 16:
                                                iM22583 = (int) (m22581(c13150, 2) + 3);
                                                break;
                                            case 17:
                                                jM22581 = m22581(c13150, i5);
                                                iM22583 = (int) (jM22581 + j);
                                                i7 = 0;
                                                break;
                                            case 18:
                                                jM22581 = m22581(c13150, 7);
                                                j = 11;
                                                iM22583 = (int) (jM22581 + j);
                                                i7 = 0;
                                                break;
                                        }
                                        c17200M22588 = c17200M22588;
                                        i3 = 16;
                                        i5 = 3;
                                    }
                                    c17200M22588 = c17200M22588;
                                    i3 = 16;
                                    i5 = 3;
                                }
                            }
                            System.arraycopy(iArr5, 0, iArr2, 0, iArr2.length);
                            System.arraycopy(iArr5, iArr2.length, iArr3, 0, iArr3.length);
                            this.f26591 = new C6617(this, EnumC15788.DYNAMIC_CODES, iArr[0], iArr[1]);
                        }
                    }
                }
            } else {
                int iMo18148 = this.f26591.mo18148(bArr, i, i2);
                if (iMo18148 != 0) {
                    return iMo18148;
                }
            }
        }
    }

    public final int available() {
        return this.f26591.mo18147();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m22584(C13150 c13150, C17200 c17200) {
        while (c17200 != null && c17200.f52743 == -1) {
            c17200 = m22581(c13150, 1) == 0 ? c17200.f52742 : c17200.f52744;
        }
        if (c17200 != null) {
            return c17200.f52743;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C17200 m22588(int[] iArr) {
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            if (i < 0 || i > 64) {
                throw new IllegalArgumentException(C18307.m42645(i, "Invalid code ", " in literal table"));
            }
            iMax = Math.max(iMax, i);
            iArr2[i] = iArr2[i] + 1;
        }
        int i2 = iMax + 1;
        int[] iArrCopyOf = Arrays.copyOf(iArr2, i2);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 <= iMax; i4++) {
            i3 = (i3 + iArrCopyOf[i4]) << 1;
            iArr3[i4] = i3;
        }
        C17200 c17200 = new C17200();
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                int i7 = i6 - 1;
                int i8 = iArr3[i7];
                C17200 c17200M40463 = c17200;
                for (int i9 = i7; i9 >= 0; i9--) {
                    c17200M40463 = ((1 << i9) & i8) == 0 ? c17200M40463.m40463() : c17200M40463.m40464();
                    if (c17200M40463 == null) {
                        throw new IllegalStateException("node doesn't exist in Huffman tree");
                    }
                }
                c17200M40463.f52743 = i5;
                c17200M40463.f52742 = null;
                c17200M40463.f52744 = null;
                iArr3[i7] = iArr3[i7] + 1;
            }
        }
        return c17200;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m22580(C8734 c8734, int i) {
        return m22581(c8734.f26592, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m22581(C13150 c13150, int i) throws IOException {
        long jM31878 = c13150.m31878(i);
        if (jM31878 != -1) {
            return jM31878;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }
}
