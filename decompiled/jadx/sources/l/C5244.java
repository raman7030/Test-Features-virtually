package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۚۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77UP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5244 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f16430;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f16431;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f16432;

    public C5244(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C5244(byte[] bArr, int i, int i2) throws C1010 {
        this.f16430 = bArr;
        this.f16432 = i;
        this.f16431 = i2;
        if (i + i2 > bArr.length) {
            throw new C1010();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m15140() {
        return this.f16430[this.f16432] & 255;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m15141() {
        return m15140() == 48;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m15137() {
        return m15140() == 2;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m15142() {
        return m15140() == 6;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m15135() {
        return m15140() == 4;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m15139() {
        return m15140() == 3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15133(int i) {
        return m15140() == ((i | DHParameters.DEFAULT_MINIMUM_LENGTH) & 255);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m15132(int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        byte[] bArr = this.f16430;
        byte b = bArr[i];
        int i3 = b & 255;
        if ((b & GCMSIVBlockCipher.MASK) != 0) {
            int i4 = b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID;
            i3 = 0;
            while (true) {
                int i5 = i4 - 1;
                if (i4 <= 0) {
                    break;
                }
                int i6 = (i3 << 8) + (bArr[i2] & 255);
                i2++;
                i3 = i6;
                i4 = i5;
            }
        }
        iArr[0] = i2;
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m15134() {
        int[] iArr = {this.f16432 + 1};
        int iM15132 = m15132(iArr);
        byte[] bArr = new byte[iM15132];
        System.arraycopy(this.f16430, iArr[0], bArr, 0, iM15132);
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5244[] m15136() {
        byte[] bArr = this.f16430;
        int i = this.f16432;
        byte b = bArr[i];
        int[] iArr = {i + 1};
        int iM15132 = m15132(iArr);
        if (b == 5) {
            return new C5244[0];
        }
        int i2 = iArr[0];
        ArrayList arrayList = new ArrayList();
        while (iM15132 > 0) {
            int i3 = i2 + 1;
            iArr[0] = i3;
            int iM15133 = m15132(iArr);
            int i4 = iArr[0];
            int i5 = i4 - i3;
            arrayList.add(new C5244(bArr, i2, i5 + 1 + iM15133));
            i2 = i4 + iM15133;
            iM15132 = ((iM15132 - 1) - i5) - iM15133;
        }
        C5244[] c5244Arr = new C5244[arrayList.size()];
        arrayList.toArray(c5244Arr);
        return c5244Arr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m15138() {
        int i = this.f16431;
        int i2 = this.f16432;
        return Arrays.copyOfRange(this.f16430, i2, i + i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15131(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(bArr);
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }
}
