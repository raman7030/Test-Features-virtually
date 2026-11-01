package org.bouncycastle.crypto.p074ec;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public interface ECDecryptor {
    ECPoint decrypt(ECPair eCPair);

    void init(CipherParameters cipherParameters);
}
