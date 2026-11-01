package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۚۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77UP */
/* JADX INFO: loaded from: classes2.dex */
public final class C7352 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f19269;

    /* JADX INFO: renamed from: ۧ */
    public int f19270;

    /* JADX INFO: renamed from: ܽ */
    public int f19271;

    public C7352(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public C7352(byte[] bArr, int i, int i2) throws C3328 {
        this.f19269 = bArr;
        this.f19271 = i;
        this.f19270 = i2;
        if (i + i2 > bArr.length) {
            throw new C3328();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m17043() {
        return this.f19269[this.f19271] & 255;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m17044() {
        return m17043() == 48;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m17040() {
        return m17043() == 2;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m17045() {
        return m17043() == 6;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m17038() {
        return m17043() == 4;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m17042() {
        return m17043() == 3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17036(int i) {
        return m17043() == ((i | DHParameters.DEFAULT_MINIMUM_LENGTH) & 255);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m17035(int[] iArr) {
        int i = iArr[0];
        int i2 = i + 1;
        byte[] bArr = this.f19269;
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

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m17037() {
        int[] iArr = {this.f19271 + 1};
        int iM17035 = m17035(iArr);
        byte[] bArr = new byte[iM17035];
        System.arraycopy(this.f19269, iArr[0], bArr, 0, iM17035);
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C7352[] m17039() {
        byte[] bArr = this.f19269;
        int i = this.f19271;
        byte b = bArr[i];
        int[] iArr = {i + 1};
        int iM17035 = m17035(iArr);
        if (b == 5) {
            return new C7352[0];
        }
        int i2 = iArr[0];
        ArrayList arrayList = new ArrayList();
        while (iM17035 > 0) {
            int i3 = i2 + 1;
            iArr[0] = i3;
            int iM17036 = m17035(iArr);
            int i4 = iArr[0];
            int i5 = i4 - i3;
            arrayList.add(new C7352(bArr, i2, i5 + 1 + iM17036));
            i2 = i4 + iM17036;
            iM17035 = ((iM17035 - 1) - i5) - iM17036;
        }
        C7352[] c7352Arr = new C7352[arrayList.size()];
        arrayList.toArray(c7352Arr);
        return c7352Arr;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m17041() {
        int i = this.f19270;
        int i2 = this.f19271;
        return Arrays.copyOfRange(this.f19269, i2, i + i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m17034(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(bArr);
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }
}
