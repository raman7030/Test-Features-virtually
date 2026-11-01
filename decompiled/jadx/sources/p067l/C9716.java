package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* JADX INFO: renamed from: l.۟᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H77X */
/* JADX INFO: loaded from: classes3.dex */
public final class C9716 {

    /* JADX INFO: renamed from: ֫ */
    public final int f26839;

    /* JADX INFO: renamed from: ܿ */
    public int f26843;

    /* JADX INFO: renamed from: ᩻ */
    public static final int[] f26838 = {0, 32, 64, 96, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 288, 320, 352, MLKEMEngine.KyberPolyBytes, 416, 448};

    /* JADX INFO: renamed from: ۜ */
    public static final int[] f26833 = {0, 32, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320, MLKEMEngine.KyberPolyBytes};

    /* JADX INFO: renamed from: ᩷ */
    public static final int[] f26837 = {0, 32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, DHParameters.DEFAULT_MINIMUM_LENGTH, 192, BERTags.FLAGS, 256, 320};

    /* JADX INFO: renamed from: ۡ */
    public static final int[] f26834 = {0, 32, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 144, DHParameters.DEFAULT_MINIMUM_LENGTH, PicnicEngine.MAX_AUX_BYTES, 192, BERTags.FLAGS, 256};

    /* JADX INFO: renamed from: ۢ */
    public static final int[] f26835 = {0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 128, 144, DHParameters.DEFAULT_MINIMUM_LENGTH};

    /* JADX INFO: renamed from: ܺ */
    public static final int[] f26836 = {44100, 48000, 32000};

    /* JADX INFO: renamed from: ۖ */
    public static final int[] f26831 = {22050, 24000, 16000};

    /* JADX INFO: renamed from: ۘ */
    public static final int[] f26832 = {11025, 12000, 8000};

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f26844 = new byte[4096];

    /* JADX INFO: renamed from: ܳ */
    public long f26841 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۧ */
    public long f26840 = -9223372036854775807L;

    /* JADX INFO: renamed from: ܽ */
    public ByteBuffer f26842 = ByteBuffer.allocateDirect(0);

    public C9716(int i) {
        this.f26839 = Math.max(0, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22688() {
        this.f26843 = 0;
        this.f26841 = -9223372036854775807L;
        this.f26840 = -9223372036854775807L;
        this.f26842.clear();
        this.f26842.limit(0);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX INFO: renamed from: ֫ */
    public final ByteBuffer m22687(long j, ByteBuffer byteBuffer) {
        long j2;
        int i;
        int i2;
        int i3;
        long j3 = j;
        this.f26840 = j3;
        if (this.f26843 == 0) {
            this.f26841 = j3;
        }
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(0);
        int iRemaining = byteBufferDuplicate.remaining();
        int i4 = this.f26843 + iRemaining;
        byte[] bArr = this.f26844;
        if (bArr.length < i4) {
            int length = bArr.length;
            while (length < i4) {
                length *= 2;
            }
            this.f26844 = Arrays.copyOf(this.f26844, length);
        }
        byteBufferDuplicate.get(this.f26844, this.f26843, iRemaining);
        int i5 = this.f26843 + iRemaining;
        this.f26843 = i5;
        long j4 = this.f26841;
        if (j4 != -9223372036854775807L) {
            j3 = j4;
        }
        int i6 = this.f26839;
        int i7 = i5 + i6;
        if (this.f26842.capacity() < i7) {
            this.f26842 = ByteBuffer.allocateDirect(i7);
        }
        this.f26842.clear();
        long j5 = 0;
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        while (i8 + 4 <= this.f26843) {
            C15750 c15750M22685 = m22685(i8, this.f26844);
            if (c15750M22685 == null || ((i2 = i8 + (i = c15750M22685.f45617)) <= (i3 = this.f26843) && i2 != i3 && i2 + 4 <= i3 && m22685(i2, this.f26844) == null)) {
                i8++;
            } else {
                if (i2 > this.f26843) {
                    break;
                }
                if (!z) {
                    j3 += j5;
                    z = true;
                }
                this.f26842.put(this.f26844, i8, i);
                i9 += i;
                j5 += (((long) c15750M22685.f45619) * 1000000) / ((long) c15750M22685.f45618);
                i8 = i2;
                i10 = i8;
            }
        }
        if (i9 != 0) {
            this.f26840 = j3;
            int iMin = Math.min(this.f26842.capacity(), i6 + i9);
            for (int i11 = i9; i11 < iMin; i11++) {
                this.f26842.put(i11, (byte) 0);
            }
            this.f26842.position(0);
            this.f26842.limit(i9);
            if (i10 > 0) {
                int i12 = this.f26843 - i10;
                if (i12 > 0) {
                    byte[] bArr2 = this.f26844;
                    System.arraycopy(bArr2, i10, bArr2, 0, i12);
                }
                this.f26843 = i12;
                if (i12 == 0) {
                    j2 = -9223372036854775807L;
                    this.f26841 = -9223372036854775807L;
                } else {
                    j2 = -9223372036854775807L;
                }
            } else {
                j2 = -9223372036854775807L;
            }
            if (this.f26843 != 0) {
                j2 = j3 + j5;
            }
            this.f26841 = j2;
            return this.f26842;
        }
        if (i8 > 0) {
            int i13 = this.f26843 - i8;
            if (i13 > 0) {
                byte[] bArr3 = this.f26844;
                System.arraycopy(bArr3, i8, bArr3, 0, i13);
            }
            this.f26843 = i13;
            if (i13 == 0) {
                this.f26841 = -9223372036854775807L;
            }
        }
        if (this.f26842.capacity() < i6) {
            this.f26842 = ByteBuffer.allocateDirect(i6);
        }
        this.f26842.clear();
        this.f26842.limit(0);
        return this.f26842;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m22686(long j) {
        long j2 = this.f26840;
        return j2 == -9223372036854775807L ? j : j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15750 m22685(int i, byte[] bArr) {
        int i2;
        int i3;
        int iM54989;
        int i4;
        int i5 = (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        if ((i5 & (-2097152)) != -2097152) {
            return null;
        }
        int i6 = (i5 >>> 19) & 3;
        int i7 = (i5 >>> 17) & 3;
        int i8 = (i5 >>> 12) & 15;
        int i9 = (i5 >>> 10) & 3;
        int i10 = (i5 >>> 9) & 1;
        if (i6 == 1 || i7 == 0 || i8 == 0 || i8 == 15 || i9 == 3) {
            return null;
        }
        if (i6 != 3) {
            i2 = i7 == 3 ? f26834[i8] : f26835[i8];
        } else if (i7 == 3) {
            i2 = f26838[i8];
        } else {
            i2 = i7 == 2 ? f26833[i8] : f26837[i8];
        }
        if (i6 == 3) {
            i3 = f26836[i9];
        } else {
            i3 = i6 == 2 ? f26831[i9] : f26832[i9];
        }
        if (i7 == 3) {
            iM54989 = (((i2 * 12000) / i3) + i10) * 4;
            i4 = MLKEMEngine.KyberPolyBytes;
        } else if (i7 != 1 || i6 == 3) {
            iM54989 = C25053.m54989(i2, 144000, i3, i10);
            i4 = 1152;
        } else {
            iM54989 = C25053.m54989(i2, 72000, i3, i10);
            i4 = 576;
        }
        if (iM54989 <= 4) {
            return null;
        }
        return new C15750(iM54989, i3, i4);
    }
}
