package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8386 implements InterfaceC6975 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f25718 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f25719;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25720;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f25721;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC5627 f25722;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f25723;

    @Override // l.InterfaceC6975
    /* JADX INFO: renamed from: ֫ */
    public final void mo2555(AbstractC15440 abstractC15440, int i) throws IOException {
        OutputStream outputStreamMo23555 = abstractC15440.mo23555(false);
        try {
            this.f25718 = false;
            C14176.m33825(this.f25721, outputStreamMo23555, this.f25723, this.f25722);
            if (outputStreamMo23555 != null) {
                outputStreamMo23555.close();
            }
            if (i == 0 && this.f25720) {
                C16999.m39882(this.f25719);
            }
        } catch (Throwable th) {
            if (outputStreamMo23555 != null) {
                try {
                    outputStreamMo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C8386(AbstractC15440 abstractC15440, InputStream inputStream, long j, InterfaceC5627 interfaceC5627, boolean z) {
        this.f25719 = abstractC15440;
        this.f25721 = inputStream;
        this.f25723 = j;
        this.f25722 = interfaceC5627;
        this.f25720 = z;
    }

    @Override // l.InterfaceC6975
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2556(IOException iOException) {
        return this.f25718;
    }
}
