package org.bouncycastle.pqc.crypto.mayo;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class MayoKeyGenerationParameters extends KeyGenerationParameters {
    public final MayoParameters params;

    public MayoKeyGenerationParameters(SecureRandom secureRandom, MayoParameters mayoParameters) {
        super(secureRandom, 256);
        this.params = mayoParameters;
    }

    public MayoParameters getParameters() {
        return this.params;
    }
}
