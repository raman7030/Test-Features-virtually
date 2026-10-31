package org.bouncycastle.crypto;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes.dex */
public class AsymmetricCipherKeyPair {
    public AsymmetricKeyParameter privateParam;
    public AsymmetricKeyParameter publicParam;

    @Deprecated
    public AsymmetricCipherKeyPair(CipherParameters cipherParameters, CipherParameters cipherParameters2) {
        this.publicParam = (AsymmetricKeyParameter) cipherParameters;
        this.privateParam = (AsymmetricKeyParameter) cipherParameters2;
    }

    public AsymmetricCipherKeyPair(AsymmetricKeyParameter asymmetricKeyParameter, AsymmetricKeyParameter asymmetricKeyParameter2) {
        this.publicParam = asymmetricKeyParameter;
        this.privateParam = asymmetricKeyParameter2;
    }

    public AsymmetricKeyParameter getPrivate() {
        return this.privateParam;
    }

    public AsymmetricKeyParameter getPublic() {
        return this.publicParam;
    }
}
