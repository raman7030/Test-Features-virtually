package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes2.dex */
public class MLKEMParameters implements KEMParameters {
    public final int k;
    public final String name;
    public final int sessionKeySize;
    public static final MLKEMParameters ml_kem_512 = new MLKEMParameters("ML-KEM-512", 2, 256);
    public static final MLKEMParameters ml_kem_768 = new MLKEMParameters("ML-KEM-768", 3, 256);
    public static final MLKEMParameters ml_kem_1024 = new MLKEMParameters("ML-KEM-1024", 4, 256);

    public MLKEMParameters(String str, int i, int i2) {
        this.name = str;
        this.k = i;
        this.sessionKeySize = i2;
    }

    public MLKEMEngine getEngine() {
        return new MLKEMEngine(this.k);
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.sessionKeySize;
    }
}
