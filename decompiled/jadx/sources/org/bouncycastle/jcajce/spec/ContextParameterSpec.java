package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ContextParameterSpec implements AlgorithmParameterSpec {
    public static ContextParameterSpec EMPTY_CONTEXT_SPEC = new ContextParameterSpec(new byte[0]);
    public final byte[] context;

    public ContextParameterSpec(byte[] bArr) {
        this.context = Arrays.clone(bArr);
    }

    public byte[] getContext() {
        return Arrays.clone(this.context);
    }
}
