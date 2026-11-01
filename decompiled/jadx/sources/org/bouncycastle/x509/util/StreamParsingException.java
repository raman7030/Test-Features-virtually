package org.bouncycastle.x509.util;

/* JADX INFO: loaded from: classes2.dex */
public class StreamParsingException extends Exception {

    /* JADX INFO: renamed from: _e */
    public Throwable f81799_e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.f81799_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f81799_e;
    }
}
