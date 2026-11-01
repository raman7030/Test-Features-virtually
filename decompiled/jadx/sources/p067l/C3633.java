package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3633 implements InterfaceC8998 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f7558 = true;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC17043 f7559;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ int f7560;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ byte[] f7561;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ int f7562;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ boolean f7563;

    @Override // p067l.InterfaceC8998
    /* JADX INFO: renamed from: ֫ */
    public final void mo4911(AbstractC17043 abstractC17043, int i) throws IOException {
        OutputStream outputStreamMo25506 = abstractC17043.mo25506(false);
        try {
            this.f7558 = false;
            outputStreamMo25506.write(this.f7561, this.f7562, this.f7560);
            outputStreamMo25506.close();
            if (i == 0 && this.f7563) {
                C18524.m42125(this.f7559);
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

    public C3633(AbstractC17043 abstractC17043, byte[] bArr, int i, int i2, boolean z) {
        this.f7559 = abstractC17043;
        this.f7561 = bArr;
        this.f7562 = i;
        this.f7560 = i2;
        this.f7563 = z;
    }

    @Override // p067l.InterfaceC8998
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4912(IOException iOException) {
        return this.f7558;
    }
}
