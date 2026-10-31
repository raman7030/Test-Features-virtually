package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class ECCSIPrivateKeyParameters extends AsymmetricKeyParameter {
    public final ECCSIPublicKeyParameters pub;
    public final BigInteger ssk;

    public ECCSIPrivateKeyParameters(BigInteger bigInteger, ECCSIPublicKeyParameters eCCSIPublicKeyParameters) {
        super(true);
        this.ssk = bigInteger;
        this.pub = eCCSIPublicKeyParameters;
    }

    public ECCSIPublicKeyParameters getPublicKeyParameters() {
        return this.pub;
    }

    public BigInteger getSSK() {
        return this.ssk;
    }
}
