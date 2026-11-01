package org.bouncycastle.crypto.engines;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import p067l.C21545;

/* JADX INFO: loaded from: classes.dex */
public class GOST28147Engine implements BlockCipher {
    public static final int BLOCK_SIZE = 8;
    public boolean forEncryption;
    public static byte[] Sbox_Default = {4, 10, 9, 2, C0698cb.f2569k, 8, 0, C0698cb.f2570l, 6, 11, 1, 12, 7, 15, 5, 3, C0698cb.f2570l, 11, 4, 12, 6, C0698cb.f2569k, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, C0698cb.f2569k, 10, 3, 4, 2, C0698cb.f2570l, 15, 12, 7, 6, 0, 9, 11, 7, C0698cb.f2569k, 10, 1, 0, 8, 9, 15, C0698cb.f2570l, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, C0698cb.f2569k, 8, 4, 10, 9, C0698cb.f2570l, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, C0698cb.f2569k, 3, 6, 8, 5, 9, 12, 15, C0698cb.f2570l, C0698cb.f2569k, 11, 4, 1, 3, 15, 5, 9, 0, 10, C0698cb.f2570l, 7, 6, 8, 2, 12, 1, 15, C0698cb.f2569k, 0, 5, 7, 10, 4, 9, 2, 3, C0698cb.f2570l, 6, 11, 8, 12};
    public static byte[] ESbox_Test = {4, 2, 15, 5, 9, 1, 0, 8, C0698cb.f2570l, 3, 11, 12, C0698cb.f2569k, 7, 10, 6, 12, 9, 15, C0698cb.f2570l, 8, 1, 3, 10, 2, 7, 4, C0698cb.f2569k, 6, 0, 11, 5, C0698cb.f2569k, 8, C0698cb.f2570l, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, C0698cb.f2570l, 9, 11, 2, 5, 15, 7, 1, 0, C0698cb.f2569k, 12, 6, 10, 4, 3, 8, 3, C0698cb.f2570l, 5, 9, 6, 8, 0, C0698cb.f2569k, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, C0698cb.f2569k, 3, 7, 10, 0, C0698cb.f2570l, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, C0698cb.f2570l, 15, 1, 10, 2, C0698cb.f2569k, 12, 6, 5, 2, 11, 0, 9, C0698cb.f2569k, 3, C0698cb.f2570l, 7, 10, 15, 4, 1, 8};
    public static byte[] ESbox_A = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, C0698cb.f2570l, 15, 12, 0, C0698cb.f2569k, 5, 3, 7, C0698cb.f2570l, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, C0698cb.f2569k, 1, C0698cb.f2570l, 4, 6, 2, 11, 3, C0698cb.f2569k, 8, 12, 15, 5, 10, 0, 7, 1, 9, C0698cb.f2570l, 7, 10, 12, C0698cb.f2569k, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, C0698cb.f2569k, 15, 0, C0698cb.f2570l, 4, 2, 3, 12, 7, 10, 6, 3, 10, C0698cb.f2569k, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, C0698cb.f2570l, 6, 1, C0698cb.f2569k, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, C0698cb.f2570l, 11, 10, 15, 5, 0, 12, C0698cb.f2570l, 8, 6, 2, 3, 9, 1, 7, C0698cb.f2569k, 4};
    public static byte[] ESbox_B = {8, 4, 11, 1, 3, 5, 0, 9, 2, C0698cb.f2570l, 10, 12, C0698cb.f2569k, 6, 7, 15, 0, 1, 2, 10, 4, C0698cb.f2569k, 5, 12, 9, 7, 3, 15, 11, 8, 6, C0698cb.f2570l, C0698cb.f2570l, 12, 0, 10, 9, 2, C0698cb.f2569k, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, C0698cb.f2569k, 11, 6, 1, 2, 3, 10, 12, 15, 4, C0698cb.f2570l, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, C0698cb.f2569k, 6, 8, C0698cb.f2570l, 3, 8, 3, 2, 6, 4, C0698cb.f2569k, C0698cb.f2570l, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, C0698cb.f2569k, 0, 6, 15, 8, C0698cb.f2570l, 0, 4, 11, C0698cb.f2570l, 8, 3, 7, 1, 10, 2, 9, 6, 15, C0698cb.f2569k, 5, 12};
    public static byte[] ESbox_C = {1, 11, 12, 2, 9, C0698cb.f2569k, 0, 15, 4, 5, 8, C0698cb.f2570l, 10, 7, 6, 3, 0, 1, 7, C0698cb.f2569k, 11, 4, 5, 2, 8, C0698cb.f2570l, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, C0698cb.f2569k, 6, C0698cb.f2570l, 1, 11, 3, 6, 0, 1, 5, C0698cb.f2569k, 10, 8, 11, 2, 9, 7, C0698cb.f2570l, 15, 12, 4, 8, C0698cb.f2569k, 11, 0, 4, 5, 1, 2, 9, 3, 12, C0698cb.f2570l, 6, 15, 10, 7, 12, 9, 11, 1, 8, C0698cb.f2570l, 2, 4, 7, 3, 6, 5, 10, 0, 15, C0698cb.f2569k, 10, 9, 6, 8, C0698cb.f2569k, C0698cb.f2570l, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, C0698cb.f2570l, 12, 6, 1, 11, C0698cb.f2569k, 9, 3, 8};
    public static byte[] ESbox_D = {15, 12, 2, 10, 6, 4, 5, 0, 7, 9, C0698cb.f2570l, C0698cb.f2569k, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, C0698cb.f2570l, 2, 7, C0698cb.f2569k, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, C0698cb.f2570l, 6, 5, 10, C0698cb.f2569k, 4, 8, 9, 3, 7, 2, 1, 5, C0698cb.f2570l, 12, 10, 7, 0, C0698cb.f2569k, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, C0698cb.f2569k, 2, 10, 11, 7, 3, 6, 5, 4, C0698cb.f2570l, 15, 1, 8, 0, 15, 3, 2, 5, C0698cb.f2570l, 11, 1, 10, 4, 7, 12, 9, C0698cb.f2569k, 6, 3, 0, 6, 15, 1, C0698cb.f2570l, 9, 2, C0698cb.f2569k, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, C0698cb.f2569k, 2, C0698cb.f2570l};
    public static byte[] Param_Z = {12, 4, 6, 2, 10, 5, 11, 9, C0698cb.f2570l, 8, C0698cb.f2569k, 7, 0, 3, 15, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, C0698cb.f2570l, 4, 7, 11, C0698cb.f2569k, 0, 15, 11, 3, 5, 8, 2, 15, 10, C0698cb.f2569k, C0698cb.f2570l, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, C0698cb.f2569k, 4, 15, 6, 7, 0, 10, 5, 3, C0698cb.f2570l, 9, 11, 7, 15, 5, 10, 8, 1, 6, C0698cb.f2569k, 0, 9, 3, C0698cb.f2570l, 11, 4, 2, 12, 5, C0698cb.f2569k, 15, 6, 9, 2, 12, 10, 11, 7, 8, 1, 4, 3, C0698cb.f2570l, 0, 8, C0698cb.f2570l, 2, 5, 6, 9, 1, 12, 15, 4, 11, 0, C0698cb.f2569k, 10, 3, 7, 1, 7, C0698cb.f2570l, C0698cb.f2569k, 0, 5, 8, 3, 4, 15, 10, 6, 9, 12, 11, 2};
    public static byte[] DSbox_Test = {4, 10, 9, 2, C0698cb.f2569k, 8, 0, C0698cb.f2570l, 6, 11, 1, 12, 7, 15, 5, 3, C0698cb.f2570l, 11, 4, 12, 6, C0698cb.f2569k, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, C0698cb.f2569k, 10, 3, 4, 2, C0698cb.f2570l, 15, 12, 7, 6, 0, 9, 11, 7, C0698cb.f2569k, 10, 1, 0, 8, 9, 15, C0698cb.f2570l, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, C0698cb.f2569k, 8, 4, 10, 9, C0698cb.f2570l, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, C0698cb.f2569k, 3, 6, 8, 5, 9, 12, 15, C0698cb.f2570l, C0698cb.f2569k, 11, 4, 1, 3, 15, 5, 9, 0, 10, C0698cb.f2570l, 7, 6, 8, 2, 12, 1, 15, C0698cb.f2569k, 0, 5, 7, 10, 4, 9, 2, 3, C0698cb.f2570l, 6, 11, 8, 12};
    public static byte[] DSbox_A = {10, 4, 5, 6, 8, 1, 3, 7, C0698cb.f2569k, 12, C0698cb.f2570l, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, C0698cb.f2569k, 11, 9, 1, 7, 6, 3, 12, C0698cb.f2570l, 10, 8, 7, 15, 12, C0698cb.f2570l, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, C0698cb.f2569k, 4, 10, 7, 12, 0, 15, 2, 8, C0698cb.f2570l, 1, 6, 5, C0698cb.f2569k, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, C0698cb.f2570l, 15, C0698cb.f2569k, 3, 5, 7, 6, 2, 4, C0698cb.f2569k, 9, 15, 0, 10, 1, 5, 11, 8, C0698cb.f2570l, 12, 3, C0698cb.f2569k, C0698cb.f2570l, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, C0698cb.f2570l, C0698cb.f2569k, 0, 2, 12};
    public static Hashtable sBoxes = new Hashtable();
    public int[] workingKey = null;

    /* JADX INFO: renamed from: S */
    public byte[] f81024S = Sbox_Default;

    static {
        addSBox("Default", Sbox_Default);
        addSBox("E-TEST", ESbox_Test);
        addSBox("E-A", ESbox_A);
        addSBox("E-B", ESbox_B);
        addSBox("E-C", ESbox_C);
        addSBox("E-D", ESbox_D);
        addSBox("Param-Z", Param_Z);
        addSBox("D-TEST", DSbox_Test);
        addSBox("D-A", DSbox_A);
    }

    public GOST28147Engine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 178));
    }

    private void GOST28147Func(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3;
        int i4;
        int iBytesToint = bytesToint(bArr, i);
        int iBytesToint2 = bytesToint(bArr, i + 4);
        int i5 = 7;
        if (this.forEncryption) {
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = 0;
                while (i7 < 8) {
                    int iGOST28147_mainStep = iBytesToint2 ^ GOST28147_mainStep(iBytesToint, iArr[i7]);
                    i7++;
                    int i8 = iBytesToint;
                    iBytesToint = iGOST28147_mainStep;
                    iBytesToint2 = i8;
                }
            }
            i4 = iBytesToint2;
            i3 = iBytesToint;
            while (i5 > 0) {
                int iGOST28147_mainStep2 = i4 ^ GOST28147_mainStep(i3, iArr[i5]);
                i5--;
                i4 = i3;
                i3 = iGOST28147_mainStep2;
            }
        } else {
            int i9 = 0;
            while (i9 < 8) {
                int iGOST28147_mainStep3 = iBytesToint2 ^ GOST28147_mainStep(iBytesToint, iArr[i9]);
                i9++;
                int i10 = iBytesToint;
                iBytesToint = iGOST28147_mainStep3;
                iBytesToint2 = i10;
            }
            int i11 = iBytesToint;
            int i12 = iBytesToint2;
            i3 = i11;
            for (int i13 = 0; i13 < 3; i13++) {
                int i14 = 7;
                while (i14 >= 0 && (i13 != 2 || i14 != 0)) {
                    int iGOST28147_mainStep4 = i12 ^ GOST28147_mainStep(i3, iArr[i14]);
                    i14--;
                    i12 = i3;
                    i3 = iGOST28147_mainStep4;
                }
            }
            i4 = i12;
        }
        int iGOST28147_mainStep5 = GOST28147_mainStep(i3, iArr[0]) ^ i4;
        intTobytes(i3, bArr2, i2);
        intTobytes(iGOST28147_mainStep5, bArr2, i2 + 4);
    }

    private int GOST28147_mainStep(int i, int i2) {
        int i3 = i2 + i;
        byte[] bArr = this.f81024S;
        int i4 = bArr[i3 & 15] + (bArr[((i3 >> 4) & 15) + 16] << 4) + (bArr[((i3 >> 8) & 15) + 32] << 8) + (bArr[((i3 >> 12) & 15) + 48] << 12) + (bArr[((i3 >> 16) & 15) + 64] << 16) + (bArr[((i3 >> 20) & 15) + 80] << 20) + (bArr[((i3 >> 24) & 15) + 96] << 24) + (bArr[((i3 >> 28) & 15) + UMErrorCode.E_UM_BE_DEFLATE_FAILED] << ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB);
        return (i4 << 11) | (i4 >>> 21);
    }

    public static void addSBox(String str, byte[] bArr) {
        sBoxes.put(Strings.toUpperCase(str), bArr);
    }

    private int bytesToint(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    private int[] generateWorkingKey(boolean z, byte[] bArr) {
        this.forEncryption = z;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i = 0; i != 8; i++) {
            iArr[i] = bytesToint(bArr, i * 4);
        }
        return iArr;
    }

    public static byte[] getSBox(String str) {
        byte[] bArr = (byte[]) sBoxes.get(Strings.toUpperCase(str));
        if (bArr != null) {
            return Arrays.clone(bArr);
        }
        throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }

    public static String getSBoxName(byte[] bArr) {
        Enumeration enumerationKeys = sBoxes.keys();
        while (enumerationKeys.hasMoreElements()) {
            String str = (String) enumerationKeys.nextElement();
            if (Arrays.areEqual((byte[]) sBoxes.get(str), bArr)) {
                return str;
            }
        }
        throw new IllegalArgumentException("SBOX provided did not map to a known one");
    }

    private void intTobytes(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "GOST28147";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("GOST28147 engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        GOST28147Func(iArr, bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithSBox) {
            ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
            byte[] sBox = parametersWithSBox.getSBox();
            if (sBox.length != Sbox_Default.length) {
                throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
            }
            this.f81024S = Arrays.clone(sBox);
            if (parametersWithSBox.getParameters() != null) {
                this.workingKey = generateWorkingKey(z, ((KeyParameter) parametersWithSBox.getParameters()).getKey());
            }
        } else if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(z, ((KeyParameter) cipherParameters).getKey());
        } else if (cipherParameters != null) {
            throw new IllegalArgumentException(C21545.m48728("invalid parameter passed to GOST28147 init - ", cipherParameters));
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 178, cipherParameters, Utils.getPurpose(z)));
    }
}
