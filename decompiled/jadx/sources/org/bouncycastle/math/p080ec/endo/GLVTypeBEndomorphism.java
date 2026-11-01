package org.bouncycastle.math.p080ec.endo;

import java.math.BigInteger;
import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECPointMap;
import org.bouncycastle.math.p080ec.ScaleXPointMap;

/* JADX INFO: loaded from: classes2.dex */
public class GLVTypeBEndomorphism implements GLVEndomorphism {
    public final GLVTypeBParameters parameters;
    public final ECPointMap pointMap;

    public GLVTypeBEndomorphism(ECCurve eCCurve, GLVTypeBParameters gLVTypeBParameters) {
        this.parameters = gLVTypeBParameters;
        this.pointMap = new ScaleXPointMap(eCCurve.fromBigInteger(gLVTypeBParameters.getBeta()));
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
