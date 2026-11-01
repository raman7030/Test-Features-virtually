package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7657 implements InterfaceC8998 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC7717 f20081;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InputStream f20082;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ long f20083;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ boolean[] f20084;

    @Override // p067l.InterfaceC8998
    /* JADX INFO: renamed from: ֫ */
    public final void mo4911(AbstractC17043 abstractC17043, int i) throws IOException {
        OutputStream outputStreamMo25506 = abstractC17043.mo25506(false);
        try {
            this.f20084[0] = true;
            C15841.m35957(this.f20082, outputStreamMo25506, this.f20083, this.f20081);
            if (outputStreamMo25506 != null) {
                outputStreamMo25506.close();
            }
        } catch (Throwable th) {
            if (outputStreamMo25506 != null) {
                try {
                    outputStreamMo25506.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C7657(boolean[] zArr, InputStream inputStream, long j, InterfaceC7717 interfaceC7717) {
        this.f20084 = zArr;
        this.f20082 = inputStream;
        this.f20083 = j;
        this.f20081 = interfaceC7717;
    }

    @Override // p067l.InterfaceC8998
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4912(IOException iOException) {
        return !this.f20084[0];
    }
}
