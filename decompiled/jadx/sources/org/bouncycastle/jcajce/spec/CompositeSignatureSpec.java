package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class CompositeSignatureSpec implements AlgorithmParameterSpec {
    public final boolean isPrehashMode;
    public final AlgorithmParameterSpec secondaryParameterSpec;

    public CompositeSignatureSpec(boolean z) {
        this(z, null);
    }

    public CompositeSignatureSpec(boolean z, AlgorithmParameterSpec algorithmParameterSpec) {
        this.isPrehashMode = z;
        this.secondaryParameterSpec = algorithmParameterSpec;
    }

    public AlgorithmParameterSpec getSecondarySpec() {
        return this.secondaryParameterSpec;
    }

    public boolean isPrehashMode() {
        return this.isPrehashMode;
    }
}
