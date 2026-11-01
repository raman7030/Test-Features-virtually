package org.bouncycastle.math.p080ec.endo;

import org.bouncycastle.math.p080ec.ECPointMap;

/* JADX INFO: loaded from: classes2.dex */
public interface ECEndomorphism {
    ECPointMap getPointMap();

    boolean hasEfficientPointMap();
}
