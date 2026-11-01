package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10339 implements InterfaceC8998 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f28631 = true;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC17043 f28632;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ boolean f28633;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InputStream f28634;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ InterfaceC7717 f28635;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ long f28636;

    @Override // p067l.InterfaceC8998
    /* JADX INFO: renamed from: ֫ */
    public final void mo4911(AbstractC17043 abstractC17043, int i) throws IOException {
        OutputStream outputStreamMo25506 = abstractC17043.mo25506(false);
        try {
            this.f28631 = false;
            C15841.m35957(this.f28634, outputStreamMo25506, this.f28636, this.f28635);
            if (outputStreamMo25506 != null) {
                outputStreamMo25506.close();
            }
            if (i == 0 && this.f28633) {
                C18524.m42125(this.f28632);
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

    public C10339(AbstractC17043 abstractC17043, InputStream inputStream, long j, InterfaceC7717 interfaceC7717, boolean z) {
        this.f28632 = abstractC17043;
        this.f28634 = inputStream;
        this.f28636 = j;
        this.f28635 = interfaceC7717;
        this.f28633 = z;
    }

    @Override // p067l.InterfaceC8998
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4912(IOException iOException) {
        return this.f28631;
    }
}
