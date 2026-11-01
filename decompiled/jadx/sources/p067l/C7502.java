package p067l;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۚܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes2.dex */
public final class C7502 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public long f19652;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws C22080 {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e) {
            throw m17326(e);
        } catch (RuntimeException e2) {
            throw m17325(e2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw m17326(e);
        } catch (RuntimeException e2) {
            throw m17325(e2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws C22080, C24761 {
        if (this.f19652 <= 9007199254740991L - ((long) 1)) {
            try {
                ((FilterOutputStream) this).out.write(i);
                this.f19652++;
                return;
            } catch (IOException e) {
                throw m17326(e);
            } catch (RuntimeException e2) {
                throw m17325(e2);
            }
        }
        throw new C24761("Workspace ZIP entry is too large");
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws C22080, C24761 {
        if (i2 >= 0) {
            long j = i2;
            if (this.f19652 <= 9007199254740991L - j) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                    this.f19652 += j;
                    return;
                } catch (IOException e) {
                    throw m17326(e);
                } catch (RuntimeException e2) {
                    throw m17325(e2);
                }
            }
        }
        throw new C24761("Workspace ZIP entry is too large");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22080 m17326(IOException iOException) {
        if (iOException instanceof C22080) {
            return (C22080) iOException;
        }
        return new C22080(iOException);
    }

    /* JADX INFO: renamed from: ֫ */
    public static RuntimeException m17325(RuntimeException runtimeException) {
        return ((runtimeException instanceof C11351) || !C17384.m39538(runtimeException)) ? runtimeException : new C11351(runtimeException);
    }
}
