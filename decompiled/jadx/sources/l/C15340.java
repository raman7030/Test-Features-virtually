package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ܶܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AG2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15340 extends BufferedInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f47006;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13224 f47007;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f47006) {
            return;
        }
        this.f47006 = true;
        super.close();
        ExecutorService executorService = C1802.f6208;
        final InterfaceC13224 interfaceC13224 = this.f47007;
        executorService.submit(new Runnable() { // from class: l.۠ܺ᩻
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC13224 interfaceC13225 = interfaceC13224;
                try {
                    int iM32078 = interfaceC13225.m32078();
                    if (iM32078 < 100 || iM32078 >= 300) {
                        interfaceC13225.mo26245();
                        throw null;
                    }
                } catch (IOException unused) {
                } catch (Throwable th) {
                    interfaceC13225.m32072(0L);
                    int i = C4758.f15106;
                    C13019.m31601(interfaceC13225);
                    throw th;
                }
                interfaceC13225.m32072(0L);
                int i2 = C4758.f15106;
                C13019.m31601(interfaceC13225);
            }
        });
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15340(C4758 c4758, InputStream inputStream, InterfaceC13224 interfaceC13224) {
        super(inputStream);
        this.f47007 = interfaceC13224;
    }

    public final void finalize() throws Throwable {
        super.finalize();
        close();
    }
}
