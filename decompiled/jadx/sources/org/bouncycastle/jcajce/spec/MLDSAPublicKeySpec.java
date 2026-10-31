package org.bouncycastle.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class MLDSAPublicKeySpec implements KeySpec {
    public final MLDSAParameterSpec params;
    public final byte[] publicData;

    public MLDSAPublicKeySpec(MLDSAParameterSpec mLDSAParameterSpec, byte[] bArr) {
        this.params = mLDSAParameterSpec;
        this.publicData = Arrays.clone(bArr);
    }

    public MLDSAParameterSpec getParameterSpec() {
        return this.params;
    }

    public byte[] getPublicData() {
        return Arrays.clone(this.publicData);
    }
}
