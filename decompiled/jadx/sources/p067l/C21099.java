package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7Y5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21099 {

    /* JADX INFO: renamed from: ֫ */
    public InputStream f66297;

    /* JADX INFO: renamed from: ۧ */
    public OutputStream f66298;

    /* JADX INFO: renamed from: ֫ */
    public final void m47706(OutputStream outputStream) {
        this.f66298 = outputStream;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47705(InputStream inputStream) {
        this.f66297 = inputStream;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m47707() {
        return this.f66297.read();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47704(int i, int i2, byte[] bArr) throws IOException {
        do {
            int i3 = this.f66297.read(bArr, i, i2);
            if (i3 < 0) {
                throw new IOException("End of IO Stream Read");
            }
            i += i3;
            i2 -= i3;
        } while (i2 > 0);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47708() {
        try {
            OutputStream outputStream = this.f66298;
            if (outputStream != null) {
                outputStream.close();
            }
            this.f66298 = null;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47703() {
        try {
            InputStream inputStream = this.f66297;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f66297 = null;
        } catch (Exception unused) {
        }
        m47708();
    }
}
