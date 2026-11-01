package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes.dex */
public class ParametersWithID implements CipherParameters {

    /* JADX INFO: renamed from: id */
    public byte[] f81276id;
    public CipherParameters parameters;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.parameters = cipherParameters;
        this.f81276id = bArr;
    }

    public byte[] getID() {
        return this.f81276id;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
