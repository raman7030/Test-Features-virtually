package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHPSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUHRSSParameterSet;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class NTRUOWCPA {
    public final NTRUParameterSet params;
    public final NTRUSampling sampling;

    public NTRUOWCPA(NTRUParameterSet nTRUParameterSet) {
        this.params = nTRUParameterSet;
        this.sampling = new NTRUSampling(nTRUParameterSet);
    }

    private int checkCiphertext(byte[] bArr) {
        return (((~((short) (bArr[this.params.ntruCiphertextBytes() - 1] & (255 << (8 - ((this.params.packDegree() * this.params.logQ()) & 7)))))) + 1) >>> 15) & 1;
    }

    private int checkM(HPSPolynomial hPSPolynomial) {
        short s = 0;
        short s2 = 0;
        for (int i = 0; i < this.params.m55436n() - 1; i++) {
            short s3 = hPSPolynomial.coeffs[i];
            s = (short) (s + (s3 & 1));
            s2 = (short) (s2 + (s3 & 2));
        }
        return (((~(((s2 >>> 1) ^ s) | (((NTRUHPSParameterSet) this.params).weight() ^ s2))) + 1) >>> 31) & 1;
    }

    private int checkR(Polynomial polynomial) {
        int iM55437q = 0;
        for (int i = 0; i < this.params.m55436n() - 1; i++) {
            short s = polynomial.coeffs[i];
            iM55437q = iM55437q | ((s + 1) & (this.params.m55437q() - 4)) | ((s + 2) & 4);
        }
        return (((~(polynomial.coeffs[this.params.m55436n() - 1] | iM55437q)) + 1) >>> 31) & 1;
    }

    public OWCPADecryptResult decrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.params.owcpaMsgBytes()];
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial3 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial4 = this.params.createPolynomial();
        polynomialCreatePolynomial.rqSumZeroFromBytes(bArr);
        polynomialCreatePolynomial2.s3FromBytes(bArr2);
        polynomialCreatePolynomial2.z3ToZq();
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial, polynomialCreatePolynomial2);
        polynomialCreatePolynomial2.rqToS3(polynomialCreatePolynomial3);
        polynomialCreatePolynomial3.s3FromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes(), bArr2.length));
        polynomialCreatePolynomial4.s3Mul(polynomialCreatePolynomial2, polynomialCreatePolynomial3);
        polynomialCreatePolynomial4.s3ToBytes(bArr3, this.params.packTrinaryBytes());
        int iCheckCiphertext = checkCiphertext(bArr);
        if (this.params instanceof NTRUHPSParameterSet) {
            iCheckCiphertext |= checkM((HPSPolynomial) polynomialCreatePolynomial4);
        }
        polynomialCreatePolynomial2.lift(polynomialCreatePolynomial4);
        for (int i = 0; i < this.params.m55436n(); i++) {
            short[] sArr = polynomialCreatePolynomial.coeffs;
            sArr[i] = (short) (sArr[i] - polynomialCreatePolynomial2.coeffs[i]);
        }
        polynomialCreatePolynomial3.sqFromBytes(Arrays.copyOfRange(bArr2, this.params.packTrinaryBytes() * 2, bArr2.length));
        polynomialCreatePolynomial4.sqMul(polynomialCreatePolynomial, polynomialCreatePolynomial3);
        int iCheckR = iCheckCiphertext | checkR(polynomialCreatePolynomial4);
        polynomialCreatePolynomial4.trinaryZqToZ3();
        polynomialCreatePolynomial4.s3ToBytes(bArr3, 0);
        return new OWCPADecryptResult(bArr3, iCheckR);
    }

    public byte[] encrypt(Polynomial polynomial, Polynomial polynomial2, byte[] bArr) {
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        polynomialCreatePolynomial.rqSumZeroFromBytes(bArr);
        polynomialCreatePolynomial2.rqMul(polynomial, polynomialCreatePolynomial);
        polynomialCreatePolynomial.lift(polynomial2);
        for (int i = 0; i < this.params.m55436n(); i++) {
            short[] sArr = polynomialCreatePolynomial2.coeffs;
            sArr[i] = (short) (sArr[i] + polynomialCreatePolynomial.coeffs[i]);
        }
        return polynomialCreatePolynomial2.rqSumZeroToBytes(this.params.ntruCiphertextBytes());
    }

    public OWCPAKeyPair keypair(byte[] bArr) {
        int iOwcpaSecretKeyBytes = this.params.owcpaSecretKeyBytes();
        byte[] bArr2 = new byte[iOwcpaSecretKeyBytes];
        int iM55436n = this.params.m55436n();
        this.params.m55437q();
        Polynomial polynomialCreatePolynomial = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial2 = this.params.createPolynomial();
        Polynomial polynomialCreatePolynomial3 = this.params.createPolynomial();
        PolynomialPair polynomialPairSampleFg = this.sampling.sampleFg(bArr);
        Polynomial polynomialM55423f = polynomialPairSampleFg.m55423f();
        Polynomial polynomialM55424g = polynomialPairSampleFg.m55424g();
        polynomialCreatePolynomial.s3Inv(polynomialM55423f);
        polynomialM55423f.s3ToBytes(bArr2, 0);
        polynomialCreatePolynomial.s3ToBytes(bArr2, this.params.packTrinaryBytes());
        polynomialM55423f.z3ToZq();
        polynomialM55424g.z3ToZq();
        if (this.params instanceof NTRUHRSSParameterSet) {
            while (true) {
                iM55436n--;
                if (iM55436n <= 0) {
                    break;
                }
                short[] sArr = polynomialM55424g.coeffs;
                sArr[iM55436n] = (short) ((sArr[iM55436n - 1] - sArr[iM55436n]) * 3);
            }
            short[] sArr2 = polynomialM55424g.coeffs;
            sArr2[0] = (short) (-(sArr2[0] * 3));
        } else {
            for (int i = 0; i < iM55436n; i++) {
                short[] sArr3 = polynomialM55424g.coeffs;
                sArr3[i] = (short) (sArr3[i] * 3);
            }
        }
        polynomialCreatePolynomial.rqMul(polynomialM55424g, polynomialM55423f);
        polynomialCreatePolynomial2.rqInv(polynomialCreatePolynomial);
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial2, polynomialM55423f);
        polynomialCreatePolynomial.sqMul(polynomialCreatePolynomial3, polynomialM55423f);
        byte[] bArrSqToBytes = polynomialCreatePolynomial.sqToBytes(iOwcpaSecretKeyBytes - (this.params.packTrinaryBytes() * 2));
        System.arraycopy(bArrSqToBytes, 0, bArr2, this.params.packTrinaryBytes() * 2, bArrSqToBytes.length);
        polynomialCreatePolynomial3.rqMul(polynomialCreatePolynomial2, polynomialM55424g);
        polynomialCreatePolynomial.rqMul(polynomialCreatePolynomial3, polynomialM55424g);
        return new OWCPAKeyPair(polynomialCreatePolynomial.rqSumZeroToBytes(this.params.owcpaPublicKeyBytes()), bArr2);
    }
}
