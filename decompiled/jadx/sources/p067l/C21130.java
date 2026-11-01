package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩵᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes5.dex */
public final class C21130 implements InterfaceC8998 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f66403 = true;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f66404;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ CharSequence f66405;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean f66406;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ AbstractC17043 f66407;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ String f66408;

    public C21130(CharSequence charSequence, String str, int i, boolean z, AbstractC17043 abstractC17043) {
        this.f66405 = charSequence;
        this.f66408 = str;
        this.f66404 = i;
        this.f66406 = z;
        this.f66407 = abstractC17043;
    }

    @Override // p067l.InterfaceC8998
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4912(IOException iOException) {
        return this.f66403;
    }

    @Override // p067l.InterfaceC8998
    /* JADX INFO: renamed from: ֫ */
    public final void mo4911(AbstractC17043 abstractC17043, int i) throws IOException {
        OutputStream outputStreamMo25506 = abstractC17043.mo25506(false);
        try {
            this.f66403 = false;
            C3694.m7124(new C24111(outputStreamMo25506), this.f66405, this.f66408, this.f66404);
            if (outputStreamMo25506 != null) {
                outputStreamMo25506.close();
            }
            if (i == 0 && this.f66406) {
                C18524.m42125(this.f66407);
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
}
