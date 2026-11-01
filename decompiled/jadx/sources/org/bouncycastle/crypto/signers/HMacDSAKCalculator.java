package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes.dex */
public class HMacDSAKCalculator implements DSAKCalculator {

    /* JADX INFO: renamed from: K */
    public final byte[] f81318K;

    /* JADX INFO: renamed from: V */
    public final byte[] f81319V;
    public final HMac hMac;

    /* JADX INFO: renamed from: n */
    public BigInteger f81320n;

    public HMacDSAKCalculator(Digest digest) {
        HMac hMac = new HMac(digest);
        this.hMac = hMac;
        int macSize = hMac.getMacSize();
        this.f81319V = new byte[macSize];
        this.f81318K = new byte[macSize];
    }

    private BigInteger bitsToInt(byte[] bArr) {
        int length = bArr.length * 8;
        int iBitLength = this.f81320n.bitLength();
        BigInteger bigIntegerFromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr);
        return length > iBitLength ? bigIntegerFromUnsignedByteArray.shiftRight(length - iBitLength) : bigIntegerFromUnsignedByteArray;
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f81320n = bigInteger;
        BigInteger bigIntegerBitsToInt = bitsToInt(bArr);
        if (bigIntegerBitsToInt.compareTo(bigInteger) >= 0) {
            bigIntegerBitsToInt = bigIntegerBitsToInt.subtract(bigInteger);
        }
        int unsignedByteLength = BigIntegers.getUnsignedByteLength(bigInteger);
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(unsignedByteLength, bigInteger2);
        byte[] bArrAsUnsignedByteArray2 = BigIntegers.asUnsignedByteArray(unsignedByteLength, bigIntegerBitsToInt);
        Arrays.fill(this.f81318K, (byte) 0);
        Arrays.fill(this.f81319V, (byte) 1);
        this.hMac.init(new KeyParameter(this.f81318K));
        HMac hMac = this.hMac;
        byte[] bArr2 = this.f81319V;
        hMac.update(bArr2, 0, bArr2.length);
        this.hMac.update((byte) 0);
        this.hMac.update(bArrAsUnsignedByteArray, 0, bArrAsUnsignedByteArray.length);
        this.hMac.update(bArrAsUnsignedByteArray2, 0, bArrAsUnsignedByteArray2.length);
        initAdditionalInput0(this.hMac);
        this.hMac.doFinal(this.f81318K, 0);
        this.hMac.init(new KeyParameter(this.f81318K));
        HMac hMac2 = this.hMac;
        byte[] bArr3 = this.f81319V;
        hMac2.update(bArr3, 0, bArr3.length);
        this.hMac.doFinal(this.f81319V, 0);
        HMac hMac3 = this.hMac;
        byte[] bArr4 = this.f81319V;
        hMac3.update(bArr4, 0, bArr4.length);
        this.hMac.update((byte) 1);
        this.hMac.update(bArrAsUnsignedByteArray, 0, bArrAsUnsignedByteArray.length);
        this.hMac.update(bArrAsUnsignedByteArray2, 0, bArrAsUnsignedByteArray2.length);
        initAdditionalInput1(this.hMac);
        this.hMac.doFinal(this.f81318K, 0);
        this.hMac.init(new KeyParameter(this.f81318K));
        HMac hMac4 = this.hMac;
        byte[] bArr5 = this.f81319V;
        hMac4.update(bArr5, 0, bArr5.length);
        this.hMac.doFinal(this.f81319V, 0);
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    public void initAdditionalInput0(HMac hMac) {
    }

    public void initAdditionalInput1(HMac hMac) {
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public boolean isDeterministic() {
        return true;
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public BigInteger nextK() {
        int unsignedByteLength = BigIntegers.getUnsignedByteLength(this.f81320n);
        byte[] bArr = new byte[unsignedByteLength];
        while (true) {
            int i = 0;
            while (i < unsignedByteLength) {
                HMac hMac = this.hMac;
                byte[] bArr2 = this.f81319V;
                hMac.update(bArr2, 0, bArr2.length);
                this.hMac.doFinal(this.f81319V, 0);
                int iMin = Math.min(unsignedByteLength - i, this.f81319V.length);
                System.arraycopy(this.f81319V, 0, bArr, i, iMin);
                i += iMin;
            }
            BigInteger bigIntegerBitsToInt = bitsToInt(bArr);
            if (bigIntegerBitsToInt.signum() > 0 && bigIntegerBitsToInt.compareTo(this.f81320n) < 0) {
                return bigIntegerBitsToInt;
            }
            HMac hMac2 = this.hMac;
            byte[] bArr3 = this.f81319V;
            hMac2.update(bArr3, 0, bArr3.length);
            this.hMac.update((byte) 0);
            this.hMac.doFinal(this.f81318K, 0);
            this.hMac.init(new KeyParameter(this.f81318K));
            HMac hMac3 = this.hMac;
            byte[] bArr4 = this.f81319V;
            hMac3.update(bArr4, 0, bArr4.length);
            this.hMac.doFinal(this.f81319V, 0);
        }
    }
}
