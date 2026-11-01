package org.bouncycastle.util;

/* JADX INFO: loaded from: classes2.dex */
public class StreamParsingException extends Exception {

    /* JADX INFO: renamed from: _e */
    public Throwable f81797_e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.f81797_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f81797_e;
    }
}
