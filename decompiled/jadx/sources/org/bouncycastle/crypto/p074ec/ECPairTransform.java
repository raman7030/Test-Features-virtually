package org.bouncycastle.crypto.p074ec;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes.dex */
public interface ECPairTransform {
    void init(CipherParameters cipherParameters);

    ECPair transform(ECPair eCPair);
}
