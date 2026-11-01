package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P77N */
/* JADX INFO: loaded from: classes4.dex */
public final class C17559 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public IOException f52490;

    /* JADX INFO: renamed from: ᩹ */
    public Error f52491;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C17559(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        try {
            return super.read();
        } catch (IOException e) {
            m39970(e);
            throw e;
        } catch (Error e2) {
            if (this.f52491 == null) {
                this.f52491 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m39970(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            m39970(e);
            throw e;
        } catch (Error e2) {
            if (this.f52491 == null) {
                this.f52491 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m39970(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return super.skip(j);
        } catch (IOException e) {
            m39970(e);
            throw e;
        } catch (Error e2) {
            if (this.f52491 == null) {
                this.f52491 = e2;
            }
            throw e2;
        } catch (RuntimeException e3) {
            m39970(new IOException("Workspace entry input failed", e3));
            throw e3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39970(IOException iOException) {
        if (this.f52490 == null) {
            this.f52490 = iOException;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39971(C17559 c17559) throws IOException {
        Error error = c17559.f52491;
        if (error != null) {
            throw error;
        }
        IOException iOException = c17559.f52490;
        if (iOException != null) {
            throw iOException;
        }
    }
}
