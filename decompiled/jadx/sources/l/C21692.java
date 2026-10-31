package l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes.dex */
public final class C21692 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f69574;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f69575;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13224 f69576;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21692(C4758 c4758, OutputStream outputStream, InterfaceC13224 interfaceC13224, OutputStream outputStream2) {
        super(outputStream);
        this.f69576 = interfaceC13224;
        this.f69574 = outputStream2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0059 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x005a  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IOException e;
        boolean z;
        OutputStream outputStream = this.f69574;
        InterfaceC13224 interfaceC13224 = this.f69576;
        if (this.f69575) {
            return;
        }
        try {
            super.close();
            e = null;
            if (!interfaceC13224.m32089()) {
                interfaceC13224.mo26245();
                throw null;
            }
            if (outputStream instanceof C11109) {
                try {
                    ((C11109) outputStream).m27544();
                    z = true;
                } catch (IOException e2) {
                    e = e2;
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                int i = C4758.f15106;
                C13019.m31601(interfaceC13224);
            }
            if (e == null) {
                throw e;
            }
        } catch (IOException e3) {
            if (outputStream instanceof C11109) {
                try {
                    ((C11109) outputStream).m27544();
                } catch (IOException e4) {
                    e3.addSuppressed(e4);
                }
            }
            e = e3;
        } finally {
            if (outputStream instanceof C11109) {
                try {
                    ((C11109) outputStream).m27544();
                } catch (IOException unused) {
                }
            }
            int i2 = C4758.f15106;
            C13019.m31599(interfaceC13224);
            this.f69575 = true;
        }
        int i3 = C4758.f15106;
        C13019.m31599(interfaceC13224);
        if (e == null) {
            throw e;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
