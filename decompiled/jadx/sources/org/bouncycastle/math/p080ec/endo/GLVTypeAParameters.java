package org.bouncycastle.math.p080ec.endo;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class GLVTypeAParameters {

    /* JADX INFO: renamed from: i */
    public final BigInteger f81504i;
    public final BigInteger lambda;
    public final ScalarSplitParameters splitParams;

    public GLVTypeAParameters(BigInteger bigInteger, BigInteger bigInteger2, ScalarSplitParameters scalarSplitParameters) {
        this.f81504i = bigInteger;
        this.lambda = bigInteger2;
        this.splitParams = scalarSplitParameters;
    }

    public BigInteger getI() {
        return this.f81504i;
    }

    public BigInteger getLambda() {
        return this.lambda;
    }

    public ScalarSplitParameters getSplitParams() {
        return this.splitParams;
    }
}
