package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: renamed from: l.ۗۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5416 extends C24572 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C11097 f12902;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean f12903;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C10471 f12904;

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        this.f77797 = c7650;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        this.f77797 = c15834;
    }

    @Override // p067l.C24572, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        boolean z = c11813.f32975 == null;
        if (this.f12903 && !z) {
            C11097 c11097 = this.f12902;
            AbstractC14235 abstractC14235 = c11097.f30758.f21738;
            abstractC14235.getClass();
            char[] charArray = "$loc".toCharArray();
            this.f77797 = c11097.f30757.m42145(0L, C4848.m10277of((Object) c11097.f30757.m42166(new C13818(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC14235.mo17848(charArray, charArray.length), c11813.f32975.f18925, this.f12904.f28960), c11813.f32975), (Object) c11097.f30757.m42207((AbstractC14355) null)));
            return;
        }
        this.f77797 = c11813;
    }

    public C5416(C11097 c11097, boolean z, C10471 c10471) {
        this.f12902 = c11097;
        this.f12903 = z;
        this.f12904 = c10471;
    }
}
