package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes4.dex */
public final class C15983 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public IOException f49327;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Error f49328;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C15983(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        try {
            return super.read();
        } catch (IOException e) {
            m37785(e);
            throw e;
        } catch (Error e2) {
            if (this.f49328 == null) {
                this.f49328 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m37785(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            m37785(e);
            throw e;
        } catch (Error e2) {
            if (this.f49328 == null) {
                this.f49328 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m37785(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return super.skip(j);
        } catch (IOException e) {
            m37785(e);
            throw e;
        } catch (Error e2) {
            if (this.f49328 == null) {
                this.f49328 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m37785(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37785(IOException iOException) {
        if (this.f49327 == null) {
            this.f49327 = iOException;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37786(C15983 c15983) throws IOException {
        Error error = c15983.f49328;
        if (error != null) {
            throw error;
        }
        IOException iOException = c15983.f49327;
        if (iOException != null) {
            throw iOException;
        }
    }
}
