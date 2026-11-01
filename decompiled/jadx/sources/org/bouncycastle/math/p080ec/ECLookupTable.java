package org.bouncycastle.math.p080ec;

/* JADX INFO: loaded from: classes2.dex */
public interface ECLookupTable {
    int getSize();

    ECPoint lookup(int i);

    ECPoint lookupVar(int i);
}
