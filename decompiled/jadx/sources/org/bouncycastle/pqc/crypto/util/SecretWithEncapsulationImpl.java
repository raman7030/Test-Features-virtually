package org.bouncycastle.pqc.crypto.util;

import java.util.concurrent.atomic.AtomicBoolean;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class SecretWithEncapsulationImpl implements SecretWithEncapsulation {
    public final byte[] cipher_text;
    public final AtomicBoolean hasBeenDestroyed = new AtomicBoolean(false);
    public final byte[] sessionKey;

    public SecretWithEncapsulationImpl(byte[] bArr, byte[] bArr2) {
        this.sessionKey = bArr;
        this.cipher_text = bArr2;
    }

    public void checkDestroyed() {
        if (isDestroyed()) {
            throw new IllegalStateException("data has been destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.hasBeenDestroyed.getAndSet(true)) {
            return;
        }
        Arrays.clear(this.sessionKey);
        Arrays.clear(this.cipher_text);
    }

    @Override // org.bouncycastle.crypto.SecretWithEncapsulation
    public byte[] getEncapsulation() {
        byte[] bArrClone = Arrays.clone(this.cipher_text);
        checkDestroyed();
        return bArrClone;
    }

    @Override // org.bouncycastle.crypto.SecretWithEncapsulation
    public byte[] getSecret() {
        byte[] bArrClone = Arrays.clone(this.sessionKey);
        checkDestroyed();
        return bArrClone;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }
}
