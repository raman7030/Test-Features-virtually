package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֨᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A186 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1330 implements InterfaceC6975 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f4788 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f4789;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4790;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f4791;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4792;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f4793;

    @Override // l.InterfaceC6975
    /* JADX INFO: renamed from: ֫ */
    public final void mo2555(AbstractC15440 abstractC15440, int i) throws IOException {
        OutputStream outputStreamMo23555 = abstractC15440.mo23555(false);
        try {
            this.f4788 = false;
            outputStreamMo23555.write(this.f4791, this.f4792, this.f4790);
            outputStreamMo23555.close();
            if (i == 0 && this.f4793) {
                C16999.m39882(this.f4789);
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

    public C1330(AbstractC15440 abstractC15440, byte[] bArr, int i, int i2, boolean z) {
        this.f4789 = abstractC15440;
        this.f4791 = bArr;
        this.f4792 = i;
        this.f4790 = i2;
        this.f4793 = z;
    }

    @Override // l.InterfaceC6975
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2556(IOException iOException) {
        return this.f4788;
    }
}
