package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۗۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C3207 extends C23363 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9184 f10095;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10096;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8526 f10097;

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        this.f75051 = c5557;
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        this.f75051 = c14169;
    }

    @Override // l.C23363, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        boolean z = c9938.f30017 == null;
        if (this.f10096 && !z) {
            C9184 c9184 = this.f10095;
            AbstractC12486 abstractC12486 = c9184.f27819.f18880;
            abstractC12486.getClass();
            char[] charArray = "$loc".toCharArray();
            this.f75051 = c9184.f27818.m39902(0L, C2609.of((Object) c9184.f27818.m39923(new C12048(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC12486.mo15927(charArray, charArray.length), c9938.f30017.f16086, this.f10097.f26045), c9938.f30017), (Object) c9184.f27818.m39964((AbstractC12612) null)));
            return;
        }
        this.f75051 = c9938;
    }

    public C3207(C9184 c9184, boolean z, C8526 c8526) {
        this.f10095 = c9184;
        this.f10096 = z;
        this.f10097 = c8526;
    }
}
