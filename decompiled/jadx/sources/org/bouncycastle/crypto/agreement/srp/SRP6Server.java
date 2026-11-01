package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* JADX INFO: loaded from: classes.dex */
public class SRP6Server {

    /* JADX INFO: renamed from: A */
    public BigInteger f80777A;

    /* JADX INFO: renamed from: B */
    public BigInteger f80778B;
    public BigInteger Key;

    /* JADX INFO: renamed from: M1 */
    public BigInteger f80779M1;

    /* JADX INFO: renamed from: M2 */
    public BigInteger f80780M2;

    /* JADX INFO: renamed from: N */
    public BigInteger f80781N;

    /* JADX INFO: renamed from: S */
    public BigInteger f80782S;

    /* JADX INFO: renamed from: b */
    public BigInteger f80783b;
    public Digest digest;

    /* JADX INFO: renamed from: g */
    public BigInteger f80784g;
    public SecureRandom random;

    /* JADX INFO: renamed from: u */
    public BigInteger f80785u;

    /* JADX INFO: renamed from: v */
    public BigInteger f80786v;

    private BigInteger calculateS() {
        return this.f80786v.modPow(this.f80785u, this.f80781N).multiply(this.f80777A).mod(this.f80781N).modPow(this.f80783b, this.f80781N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger bigIntegerValidatePublicValue = SRP6Util.validatePublicValue(this.f80781N, bigInteger);
        this.f80777A = bigIntegerValidatePublicValue;
        this.f80785u = SRP6Util.calculateU(this.digest, this.f80781N, bigIntegerValidatePublicValue, this.f80778B);
        BigInteger bigIntegerCalculateS = calculateS();
        this.f80782S = bigIntegerCalculateS;
        return bigIntegerCalculateS;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f80777A;
        if (bigInteger3 == null || (bigInteger = this.f80779M1) == null || (bigInteger2 = this.f80782S) == null) {
            throw new CryptoException("Impossible to compute M2: some data are missing from the previous operations (A,M1,S)");
        }
        BigInteger bigIntegerCalculateM2 = SRP6Util.calculateM2(this.digest, this.f80781N, bigInteger3, bigInteger, bigInteger2);
        this.f80780M2 = bigIntegerCalculateM2;
        return bigIntegerCalculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f80782S;
        if (bigInteger == null || this.f80779M1 == null || this.f80780M2 == null) {
            throw new CryptoException("Impossible to compute Key: some data are missing from the previous operations (S,M1,M2)");
        }
        BigInteger bigIntegerCalculateKey = SRP6Util.calculateKey(this.digest, this.f80781N, bigInteger);
        this.Key = bigIntegerCalculateKey;
        return bigIntegerCalculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger bigIntegerCalculateK = SRP6Util.calculateK(this.digest, this.f80781N, this.f80784g);
        this.f80783b = selectPrivateValue();
        BigInteger bigIntegerMod = bigIntegerCalculateK.multiply(this.f80786v).mod(this.f80781N).add(this.f80784g.modPow(this.f80783b, this.f80781N)).mod(this.f80781N);
        this.f80778B = bigIntegerMod;
        return bigIntegerMod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f80781N = bigInteger;
        this.f80784g = bigInteger2;
        this.f80786v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f80781N, this.f80784g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f80777A;
        if (bigInteger4 == null || (bigInteger2 = this.f80778B) == null || (bigInteger3 = this.f80782S) == null) {
            throw new CryptoException("Impossible to compute and verify M1: some data are missing from the previous operations (A,B,S)");
        }
        if (!SRP6Util.calculateM1(this.digest, this.f80781N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f80779M1 = bigInteger;
        return true;
    }
}
