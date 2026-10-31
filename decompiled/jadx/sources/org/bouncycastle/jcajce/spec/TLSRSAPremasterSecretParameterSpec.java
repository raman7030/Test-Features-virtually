package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class TLSRSAPremasterSecretParameterSpec implements AlgorithmParameterSpec {
    public final int protocolVersion;

    public TLSRSAPremasterSecretParameterSpec(int i) {
        this.protocolVersion = i;
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }
}
