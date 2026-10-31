package org.bouncycastle.pqc.crypto.rainbow;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class RainbowKeyGenerationParameters extends KeyGenerationParameters {
    public RainbowParameters params;

    public RainbowKeyGenerationParameters(SecureRandom secureRandom, RainbowParameters rainbowParameters) {
        super(secureRandom, 256);
        this.params = rainbowParameters;
    }

    public RainbowParameters getParameters() {
        return this.params;
    }
}
