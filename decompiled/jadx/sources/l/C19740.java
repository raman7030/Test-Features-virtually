package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes5.dex */
public final class C19740 implements InterfaceC6975 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f63772 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63773;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CharSequence f63774;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f63775;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f63776;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f63777;

    public C19740(CharSequence charSequence, String str, int i, boolean z, AbstractC15440 abstractC15440) {
        this.f63774 = charSequence;
        this.f63777 = str;
        this.f63773 = i;
        this.f63775 = z;
        this.f63776 = abstractC15440;
    }

    @Override // l.InterfaceC6975
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2556(IOException iOException) {
        return this.f63772;
    }

    @Override // l.InterfaceC6975
    /* JADX INFO: renamed from: ֫ */
    public final void mo2555(AbstractC15440 abstractC15440, int i) throws IOException {
        OutputStream outputStreamMo23555 = abstractC15440.mo23555(false);
        try {
            this.f63772 = false;
            C1394.m4886(new C22878(outputStreamMo23555), this.f63774, this.f63777, this.f63773);
            if (outputStreamMo23555 != null) {
                outputStreamMo23555.close();
            }
            if (i == 0 && this.f63775) {
                C16999.m39882(this.f63776);
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
}
