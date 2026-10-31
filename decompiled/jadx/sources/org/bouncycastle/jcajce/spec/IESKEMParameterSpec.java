package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class IESKEMParameterSpec implements AlgorithmParameterSpec {
    public final byte[] recipientInfo;
    public final boolean usePointCompression;

    public IESKEMParameterSpec(byte[] bArr) {
        this(bArr, false);
    }

    public IESKEMParameterSpec(byte[] bArr, boolean z) {
        this.recipientInfo = Arrays.clone(bArr);
        this.usePointCompression = z;
    }

    public byte[] getRecipientInfo() {
        return Arrays.clone(this.recipientInfo);
    }

    public boolean hasUsePointCompression() {
        return this.usePointCompression;
    }
}
