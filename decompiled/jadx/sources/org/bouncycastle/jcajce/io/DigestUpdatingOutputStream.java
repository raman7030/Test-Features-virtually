package org.bouncycastle.jcajce.io;

import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class DigestUpdatingOutputStream extends OutputStream {
    public MessageDigest digest;

    public DigestUpdatingOutputStream(MessageDigest messageDigest) {
        this.digest = messageDigest;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.digest.update((byte) i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.digest.update(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }
}
