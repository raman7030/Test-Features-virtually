package org.bouncycastle.pqc.crypto.falcon;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class FalconKeyGenerationParameters extends KeyGenerationParameters {
    public final FalconParameters params;

    public FalconKeyGenerationParameters(SecureRandom secureRandom, FalconParameters falconParameters) {
        super(secureRandom, 320);
        this.params = falconParameters;
    }

    public FalconParameters getParameters() {
        return this.params;
    }
}
