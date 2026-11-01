package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes.dex */
public class SRP6Client {

    /* JADX INFO: renamed from: A */
    public BigInteger f80767A;

    /* JADX INFO: renamed from: B */
    public BigInteger f80768B;
    public BigInteger Key;

    /* JADX INFO: renamed from: M1 */
    public BigInteger f80769M1;

    /* JADX INFO: renamed from: M2 */
    public BigInteger f80770M2;

    /* JADX INFO: renamed from: N */
    public BigInteger f80771N;

    /* JADX INFO: renamed from: S */
    public BigInteger f80772S;

    /* JADX INFO: renamed from: a */
    public BigInteger f80773a;
    public Digest digest;

    /* JADX INFO: renamed from: g */
    public BigInteger f80774g;
    public SecureRandom random;

    /* JADX INFO: renamed from: u */
    public BigInteger f80775u;

    /* JADX INFO: renamed from: x */
    public BigInteger f80776x;

    private BigInteger calculateS() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f80771N, this.f80774g);
        return this.f80768B.subtract(this.f80774g.modPow(this.f80776x, this.f80771N).multiply(bigIntegerCalculateK).mod(this.f80771N)).mod(this.f80771N).modPow(this.f80775u.multiply(this.f80776x).add(this.f80773a), this.f80771N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f80767A;
        if (bigInteger3 == null || (bigInteger = this.f80768B) == null || (bigInteger2 = this.f80772S) == null) {
            throw new CryptoException("Impossible to compute M1: some data are missing from the previous operations (A,B,S)");
        }
        BigInteger bigIntegerCalculateM1 = SRP6Util.calculateM1(this.digest, this.f80771N, bigInteger3, bigInteger, bigInteger2);
        this.f80769M1 = bigIntegerCalculateM1;
        return bigIntegerCalculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f80771N, bigInteger);
        this.f80768B = bigIntegerValidatePublicValue;
        this.f80775u = SRP6Util.calculateU(this.digest, this.f80771N, this.f80767A, bigIntegerValidatePublicValue);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f80772S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f80772S;
        if (bigInteger == null || this.f80769M1 == null || this.f80770M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f80771N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f80776x = SRP6Util.calculateX(this.digest, this.f80771N, bArr, bArr2, bArr3);
        BigInteger bigIntegerSelectPrivateValue = selectPrivateValue();
        this.f80773a = bigIntegerSelectPrivateValue;
        BigInteger bigIntegerModPow = this.f80774g.modPow(bigIntegerSelectPrivateValue, this.f80771N);
        this.f80767A = bigIntegerModPow;
        return bigIntegerModPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f80771N = bigInteger;
        this.f80774g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f80771N, this.f80774g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f80767A;
        if (bigInteger4 == null || (bigInteger2 = this.f80769M1) == null || (bigInteger3 = this.f80772S) == null) {
            throw new CryptoException("Impossible to compute and verify M2: some data are missing from the previous operations (A,M1,S)");
        }
        if (!SRP6Util.calculateM2(this.digest, this.f80771N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f80770M2 = bigInteger;
        return true;
    }
}
