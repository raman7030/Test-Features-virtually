package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P86L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6935 extends AbstractC10288 {

    /* JADX INFO: renamed from: ֫ */
    public volatile AbstractC10288 f18037;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C5594 f18038;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C18020 f18039;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C14271 f18040;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ boolean f18041;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ boolean f18042;

    public C6935(C5594 c5594, boolean z, boolean z2, C14271 c14271, C18020 c18020) {
        this.f18038 = c5594;
        this.f18042 = z;
        this.f18041 = z2;
        this.f18040 = c14271;
        this.f18039 = c18020;
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5173(C18691 c18691) throws IOException {
        if (this.f18042) {
            c18691.m42654();
            return null;
        }
        AbstractC10288 abstractC10288M32799 = this.f18037;
        if (abstractC10288M32799 == null) {
            abstractC10288M32799 = this.f18040.m32799(this.f18038, this.f18039);
            this.f18037 = abstractC10288M32799;
        }
        return abstractC10288M32799.mo5173(c18691);
    }

    @Override // p067l.AbstractC10288
    /* JADX INFO: renamed from: ֫ */
    public final void mo5174(C24726 c24726, Object obj) {
        if (this.f18041) {
            c24726.m54383();
            return;
        }
        AbstractC10288 abstractC10288M32799 = this.f18037;
        if (abstractC10288M32799 == null) {
            abstractC10288M32799 = this.f18040.m32799(this.f18038, this.f18039);
            this.f18037 = abstractC10288M32799;
        }
        abstractC10288M32799.mo5174(c24726, obj);
    }
}
