package org.bouncycastle.math.p080ec.endo;

import java.math.BigInteger;
import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECPointMap;
import org.bouncycastle.math.p080ec.ScaleYNegateXPointMap;

/* JADX INFO: loaded from: classes2.dex */
public class GLVTypeAEndomorphism implements GLVEndomorphism {
    public final GLVTypeAParameters parameters;
    public final ECPointMap pointMap;

    public GLVTypeAEndomorphism(ECCurve eCCurve, GLVTypeAParameters gLVTypeAParameters) {
        this.parameters = gLVTypeAParameters;
        this.pointMap = new ScaleYNegateXPointMap(eCCurve.fromBigInteger(gLVTypeAParameters.getI()));
    }

    @Override // org.bouncycastle.math.p080ec.endo.GLVEndomorphism
    public BigInteger[] decomposeScalar(BigInteger bigInteger) {
        return EndoUtil.decomposeScalar(this.parameters.getSplitParams(), bigInteger);
    }

    @Override // org.bouncycastle.math.p080ec.endo.ECEndomorphism
    public ECPointMap getPointMap() {
        return this.pointMap;
    }

    @Override // org.bouncycastle.math.p080ec.endo.ECEndomorphism
    public boolean hasEfficientPointMap() {
        return true;
    }
}
