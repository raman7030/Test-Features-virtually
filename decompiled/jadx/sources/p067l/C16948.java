package p067l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ܶܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16948 extends BufferedInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f50131;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC14937 f50132;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f50131) {
            return;
        }
        this.f50131 = true;
        super.close();
        ExecutorService executorService = C4081.f8987;
        final InterfaceC14937 interfaceC14937 = this.f50132;
        executorService.submit(new Runnable() { // from class: l.۠ܺ᩻
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC14937 interfaceC14938 = interfaceC14937;
                try {
                    int iM34176 = interfaceC14938.m34176();
                    if (iM34176 < 100 || iM34176 >= 300) {
                        interfaceC14938.mo28274();
                        throw null;
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    interfaceC14938.m34170(0L);
                    int i = C6891.f17936;
                    C14742.m33686(interfaceC14938);
                    throw th;
                }
                interfaceC14938.m34170(0L);
                int i2 = C6891.f17936;
                C14742.m33686(interfaceC14938);
            }
        });
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16948(C6891 c6891, InputStream inputStream, InterfaceC14937 interfaceC14937) {
        super(inputStream);
        this.f50132 = interfaceC14937;
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
