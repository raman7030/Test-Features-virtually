package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes.dex */
public class CramerShoupCiphertext {

    /* JADX INFO: renamed from: e */
    public BigInteger f81006e;

    /* JADX INFO: renamed from: u1 */
    public BigInteger f81007u1;

    /* JADX INFO: renamed from: u2 */
    public BigInteger f81008u2;

    /* JADX INFO: renamed from: v */
    public BigInteger f81009v;

    public CramerShoupCiphertext() {
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f81007u1 = bigInteger;
        this.f81008u2 = bigInteger2;
        this.f81006e = bigInteger3;
        this.f81009v = bigInteger4;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int iBigEndianToInt = Pack.bigEndianToInt(bArr, 0);
        int i = iBigEndianToInt + 4;
        this.f81007u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, i));
        int i2 = iBigEndianToInt + 8;
        int iBigEndianToInt2 = Pack.bigEndianToInt(bArr, i) + i2;
        this.f81008u2 = new BigInteger(Arrays.copyOfRange(bArr, i2, iBigEndianToInt2));
        int iBigEndianToInt3 = Pack.bigEndianToInt(bArr, iBigEndianToInt2);
        int i3 = iBigEndianToInt2 + 4;
        int i4 = iBigEndianToInt3 + i3;
        this.f81006e = new BigInteger(Arrays.copyOfRange(bArr, i3, i4));
        int iBigEndianToInt4 = Pack.bigEndianToInt(bArr, i4);
        int i5 = i4 + 4;
        this.f81009v = new BigInteger(Arrays.copyOfRange(bArr, i5, iBigEndianToInt4 + i5));
    }

    public BigInteger getE() {
        return this.f81006e;
    }

    public BigInteger getU1() {
        return this.f81007u1;
    }

    public BigInteger getU2() {
        return this.f81008u2;
    }

    public BigInteger getV() {
        return this.f81009v;
    }

    public void setE(BigInteger bigInteger) {
        this.f81006e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f81007u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.f81008u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f81009v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f81007u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.f81008u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f81006e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f81009v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        Pack.intToBigEndian(length2, bArr, length + 4);
        int i = length + 8;
        System.arraycopy(byteArray2, 0, bArr, i, length2);
        int i2 = i + length2;
        Pack.intToBigEndian(length3, bArr, i2);
        int i3 = i2 + 4;
        System.arraycopy(byteArray3, 0, bArr, i3, length3);
        int i4 = i3 + length3;
        Pack.intToBigEndian(length4, bArr, i4);
        System.arraycopy(byteArray4, 0, bArr, i4 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("u1: " + this.f81007u1.toString());
        sb.append("\nu2: " + this.f81008u2.toString());
        sb.append("\ne: " + this.f81006e.toString());
        sb.append("\nv: " + this.f81009v.toString());
        return sb.toString();
    }
}
