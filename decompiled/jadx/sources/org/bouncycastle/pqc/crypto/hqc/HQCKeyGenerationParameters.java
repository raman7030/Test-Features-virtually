package org.bouncycastle.pqc.crypto.hqc;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes2.dex */
public class HQCKeyGenerationParameters extends KeyGenerationParameters {
    public final HQCParameters params;

    public HQCKeyGenerationParameters(SecureRandom secureRandom, HQCParameters hQCParameters) {
        super(secureRandom, 256);
        this.params = hQCParameters;
    }

    public HQCParameters getParameters() {
        return this.params;
    }
}
