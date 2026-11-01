package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.commonsdk.stateless.C0791b;
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
public final class C10669 implements Closeable {

    /* JADX INFO: renamed from: ۛ */
    public static final int[] f29511;

    /* JADX INFO: renamed from: ۤ */
    public static final int[] f29512;

    /* JADX INFO: renamed from: ۨ */
    public static final short[] f29513 = {96, 128, 160, 192, 224, 256, ColorResourcesTableCreator.PackageChunk.HEADER_SIZE, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};

    /* JADX INFO: renamed from: ۫ */
    public static final int[] f29514 = {16, 32, 48, 64, 81, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 146, 210, C0791b.f3325g, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* JADX INFO: renamed from: ۬ */
    public static final int[] f29515 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* JADX INFO: renamed from: ۗ */
    public AbstractC16032 f29516;

    /* JADX INFO: renamed from: ۙ */
    public C14866 f29517;

    /* JADX INFO: renamed from: ᩶ */
    public final C24750 f29518 = new C24750();

    /* JADX INFO: renamed from: ᩸ */
    public boolean f29519;

    /* JADX INFO: renamed from: ᩹ */
    public final InputStream f29520;

    static {
        int[] iArr = new int[288];
        f29511 = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        f29512 = iArr2;
        Arrays.fill(iArr2, 5);
    }

    public C10669(InputStream inputStream) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f29517 = new C14866(inputStream);
        this.f29520 = inputStream;
        this.f29516 = new C22069();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f29516 = new C22069();
        this.f29517 = null;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m24559(int i, int i2, byte[] bArr) throws IOException {
        long jM24550;
        while (true) {
            if (this.f29519 && !this.f29516.mo20101()) {
                return -1;
            }
            if (this.f29516.mo20102() == EnumC17373.INITIAL) {
                this.f29519 = m24550(this.f29517, 1) == 1;
                int iM24550 = (int) m24550(this.f29517, 2);
                int i3 = 16;
                if (iM24550 == 0) {
                    this.f29517.m33972();
                    long jM24551 = m24550(this.f29517, 16);
                    if ((65535 & (jM24551 ^ 65535)) != m24550(this.f29517, 16)) {
                        throw new IllegalStateException("Illegal LEN / NLEN values");
                    }
                    this.f29516 = new C11340(this, jM24551);
                } else if (iM24550 == 1) {
                    this.f29516 = new C8657(this, EnumC17373.FIXED_CODES, f29511, f29512);
                } else {
                    if (iM24550 != 2) {
                        throw new IllegalStateException(C20778.m46922(iM24550, "Unsupported compression: "));
                    }
                    int[][] iArr = {new int[(int) (m24550(this.f29517, 5) + 257)], new int[(int) (m24550(this.f29517, 5) + 1)]};
                    C14866 c14866 = this.f29517;
                    int[] iArr2 = iArr[0];
                    int[] iArr3 = iArr[1];
                    int iM24551 = (int) (m24550(c14866, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i4 = 0;
                    while (true) {
                        int i5 = 3;
                        if (i4 < iM24551) {
                            iArr4[f29515[i4]] = (int) m24550(c14866, 3);
                            i4++;
                        } else {
                            C18715 c18715M24557 = m24557(iArr4);
                            int length = iArr2.length + iArr3.length;
                            int[] iArr5 = new int[length];
                            int i6 = 0;
                            int iM24552 = 0;
                            int i7 = -1;
                            while (i6 < length) {
                                if (iM24552 > 0) {
                                    iArr5[i6] = i7;
                                    iM24552--;
                                    i6++;
                                } else {
                                    int iM24553 = m24553(c14866, c18715M24557);
                                    if (iM24553 < i3) {
                                        iArr5[i6] = iM24553;
                                        i7 = iM24553;
                                        i6++;
                                    } else {
                                        long j = 3;
                                        switch (iM24553) {
                                            case 16:
                                                iM24552 = (int) (m24550(c14866, 2) + 3);
                                                break;
                                            case 17:
                                                jM24550 = m24550(c14866, i5);
                                                iM24552 = (int) (jM24550 + j);
                                                i7 = 0;
                                                break;
                                            case 18:
                                                jM24550 = m24550(c14866, 7);
                                                j = 11;
                                                iM24552 = (int) (jM24550 + j);
                                                i7 = 0;
                                                break;
                                        }
                                        c18715M24557 = c18715M24557;
                                        i3 = 16;
                                        i5 = 3;
                                    }
                                    c18715M24557 = c18715M24557;
                                    i3 = 16;
                                    i5 = 3;
                                }
                            }
                            System.arraycopy(iArr5, 0, iArr2, 0, iArr2.length);
                            System.arraycopy(iArr5, iArr2.length, iArr3, 0, iArr3.length);
                            this.f29516 = new C8657(this, EnumC17373.DYNAMIC_CODES, iArr[0], iArr[1]);
                        }
                    }
                }
            } else {
                int iMo20100 = this.f29516.mo20100(bArr, i, i2);
                if (iMo20100 != 0) {
                    return iMo20100;
                }
            }
        }
    }

    public final int available() {
        return this.f29516.mo20099();
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m24553(C14866 c14866, C18715 c18715) {
        while (c18715 != null && c18715.f55924 == -1) {
            c18715 = m24550(c14866, 1) == 0 ? c18715.f55923 : c18715.f55925;
        }
        if (c18715 != null) {
            return c18715.f55924;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C18715 m24557(int[] iArr) {
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            if (i < 0 || i > 64) {
                throw new IllegalArgumentException(C19768.m44906(i, "Invalid code ", " in literal table"));
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
        C18715 c18715 = new C18715();
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                int i7 = i6 - 1;
                int i8 = iArr3[i7];
                C18715 c18715M42710 = c18715;
                for (int i9 = i7; i9 >= 0; i9--) {
                    c18715M42710 = ((1 << i9) & i8) == 0 ? c18715M42710.m42710() : c18715M42710.m42711();
                    if (c18715M42710 == null) {
                        throw new IllegalStateException("node doesn't exist in Huffman tree");
                    }
                }
                c18715M42710.f55924 = i5;
                c18715M42710.f55923 = null;
                c18715M42710.f55925 = null;
                iArr3[i7] = iArr3[i7] + 1;
            }
        }
        return c18715;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m24549(C10669 c10669, int i) {
        return m24550(c10669.f29517, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m24550(C14866 c14866, int i) throws IOException {
        long jM33971 = c14866.m33971(i);
        if (jM33971 != -1) {
            return jM33971;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }
}
