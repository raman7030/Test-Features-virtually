package org.bouncycastle.jcajce.spec;

import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.p073x9.X9ObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class KEMGenerateSpec extends KEMKDFSpec implements AlgorithmParameterSpec {
    public final PublicKey publicKey;
    public static final byte[] EMPTY_OTHER_INFO = new byte[0];
    public static AlgorithmIdentifier DefKdf = new AlgorithmIdentifier(X9ObjectIdentifiers.id_kdf_kdf3, new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256));

    public final class Builder {
        public final String algorithmName;
        public final int keySizeInBits;
        public final PublicKey publicKey;
        public AlgorithmIdentifier kdfAlgorithm = new AlgorithmIdentifier(X9ObjectIdentifiers.id_kdf_kdf3, new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256));
        public byte[] otherInfo = KEMGenerateSpec.EMPTY_OTHER_INFO;

        public Builder(PublicKey publicKey, String str, int i) {
            this.publicKey = publicKey;
            this.algorithmName = str;
            this.keySizeInBits = i;
        }

        public KEMGenerateSpec build() {
            return new KEMGenerateSpec(this.publicKey, this.algorithmName, this.keySizeInBits, this.kdfAlgorithm, this.otherInfo);
        }

        public Builder withKdfAlgorithm(AlgorithmIdentifier algorithmIdentifier) {
            this.kdfAlgorithm = algorithmIdentifier;
            return this;
        }

        public Builder withNoKdf() {
            this.kdfAlgorithm = null;
            return this;
        }

        public Builder withOtherInfo(byte[] bArr) {
            this.otherInfo = bArr == null ? KEMGenerateSpec.EMPTY_OTHER_INFO : Arrays.clone(bArr);
            return this;
        }
    }

    public KEMGenerateSpec(PublicKey publicKey, String str) {
        this(publicKey, str, 256, DefKdf, EMPTY_OTHER_INFO);
    }

    public KEMGenerateSpec(PublicKey publicKey, String str, int i) {
        this(publicKey, str, i, DefKdf, EMPTY_OTHER_INFO);
    }

    public KEMGenerateSpec(PublicKey publicKey, String str, int i, AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        super(algorithmIdentifier, bArr, str, i);
        this.publicKey = publicKey;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }
}
