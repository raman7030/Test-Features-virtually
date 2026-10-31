package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAlgorithmParameterGeneratorSpi extends AlgorithmParameterGeneratorSpi {
    public final JcaJceHelper helper = new BCJcaJceHelper();

    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.createAlgorithmParameters(str);
    }
}
