package p067l;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩸ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22985 extends BufferedOutputStream {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ OutputStream f72279;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f72280;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC14937 f72281;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22985(C6891 c6891, OutputStream outputStream, InterfaceC14937 interfaceC14937, OutputStream outputStream2) {
        super(outputStream);
        this.f72281 = interfaceC14937;
        this.f72279 = outputStream2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0059 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x005a  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        IOException e;
        boolean z;
        OutputStream outputStream = this.f72279;
        InterfaceC14937 interfaceC14937 = this.f72281;
        if (this.f72280) {
            return;
        }
        try {
            super.close();
            e = null;
            if (!interfaceC14937.m34187()) {
                interfaceC14937.mo28274();
                throw null;
            }
            if (outputStream instanceof C12927) {
                try {
                    ((C12927) outputStream).m29606();
                    z = true;
                } catch (IOException e2) {
                    e = e2;
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                int i = C6891.f17936;
                C14742.m33686(interfaceC14937);
            }
            if (e == null) {
                throw e;
            }
        } catch (IOException e3) {
            if (outputStream instanceof C12927) {
                try {
                    ((C12927) outputStream).m29606();
                } catch (IOException e4) {
                    e3.addSuppressed(e4);
                }
            }
            e = e3;
        } finally {
            if (outputStream instanceof C12927) {
                try {
                    ((C12927) outputStream).m29606();
                } catch (IOException unused) {
                }
            }
            int i2 = C6891.f17936;
            C14742.m33684(interfaceC14937);
            this.f72280 = true;
        }
        int i3 = C6891.f17936;
        C14742.m33684(interfaceC14937);
        if (e == null) {
            throw e;
        }
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
