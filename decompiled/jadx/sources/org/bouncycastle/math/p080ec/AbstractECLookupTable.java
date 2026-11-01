package org.bouncycastle.math.p080ec;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractECLookupTable implements ECLookupTable {
    @Override // org.bouncycastle.math.p080ec.ECLookupTable
    public ECPoint lookupVar(int i) {
        return lookup(i);
    }
}
