package p067l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰᩳ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 195F */
/* JADX INFO: loaded from: classes3.dex */
public final class C15667 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC17043 f44796;

    /* JADX INFO: renamed from: ۧ */
    public final String f44797;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC17043 f44798;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C9633 f44799;

    public C15667(C9633 c9633, AbstractC17043 abstractC17043, String str) {
        this.f44799 = c9633;
        this.f44798 = abstractC17043;
        this.f44797 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final OutputStream m35592(int i, int i2) {
        String strM22421 = C9633.m22421(i, i2, this.f44797);
        this.f44799.mo13456(strM22421);
        AbstractC17043 abstractC17043M38682 = this.f44798.m38682(strM22421);
        this.f44796 = abstractC17043M38682;
        return abstractC17043M38682.mo25506(false);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35594() {
        AbstractC17043 abstractC17043 = this.f44796;
        if (abstractC17043 != null) {
            this.f44799.f26522.add(abstractC17043.getName());
            this.f44796 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35593() {
        AbstractC17043 abstractC17043 = this.f44796;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
            this.f44796 = null;
        }
    }
}
