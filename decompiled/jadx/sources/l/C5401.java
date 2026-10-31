package l;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes2.dex */
public final class C5401 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f16814;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws C20740 {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e) {
            throw m15415(e);
        } catch (RuntimeException e2) {
            throw m15414(e2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw m15415(e);
        } catch (RuntimeException e2) {
            throw m15414(e2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws C20740, C23561 {
        if (this.f16814 <= 9007199254740991L - ((long) 1)) {
            try {
                ((FilterOutputStream) this).out.write(i);
                this.f16814++;
                return;
            } catch (IOException e) {
                throw m15415(e);
            } catch (RuntimeException e2) {
                throw m15414(e2);
            }
        }
        throw new C23561("Workspace ZIP entry is too large");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C20740, C23561 {
        if (i2 >= 0) {
            long j = i2;
            if (this.f16814 <= 9007199254740991L - j) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                    this.f16814 += j;
                    return;
                } catch (IOException e) {
                    throw m15415(e);
                } catch (RuntimeException e2) {
                    throw m15414(e2);
                }
            }
        }
        throw new C23561("Workspace ZIP entry is too large");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20740 m15415(IOException iOException) {
        if (iOException instanceof C20740) {
            return (C20740) iOException;
        }
        return new C20740(iOException);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static RuntimeException m15414(RuntimeException runtimeException) {
        return ((runtimeException instanceof C9451) || !C15799.m37367(runtimeException)) ? runtimeException : new C9451(runtimeException);
    }
}
