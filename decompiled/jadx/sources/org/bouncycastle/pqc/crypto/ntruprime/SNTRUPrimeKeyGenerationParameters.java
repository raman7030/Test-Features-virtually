package org.bouncycastle.pqc.crypto.ntruprime;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class SNTRUPrimeKeyGenerationParameters extends KeyGenerationParameters {
    public final SNTRUPrimeParameters sntrupParams;

    public SNTRUPrimeKeyGenerationParameters(SecureRandom secureRandom, SNTRUPrimeParameters sNTRUPrimeParameters) {
        super(secureRandom == null ? CryptoServicesRegistrar.getSecureRandom() : secureRandom, 256);
        this.sntrupParams = sNTRUPrimeParameters;
    }

    public SNTRUPrimeParameters getSntrupParams() {
        return this.sntrupParams;
    }
}
