package org.bouncycastle.util;

/* JADX INFO: loaded from: classes2.dex */
public class StoreException extends RuntimeException {

    /* JADX INFO: renamed from: _e */
    public Throwable f81796_e;

    public StoreException(String str, Throwable th) {
        super(str);
        this.f81796_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f81796_e;
    }
}
