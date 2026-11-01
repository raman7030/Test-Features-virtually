package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.᩺ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6S3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24401 implements InterfaceC22232 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC18588 f77257;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC22232 f77258;

    public C24401(InterfaceC22232 interfaceC22232, InterfaceC18588 interfaceC18588) {
        this.f77258 = interfaceC22232;
        this.f77257 = interfaceC18588;
    }

    @Override // p067l.InterfaceC22232
    public final C8820 identity() {
        return this.f77258.identity();
    }

    @Override // p067l.InterfaceC22232
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo15961() {
        InputStream inputStreamMo15961 = ((C6967) this.f77258).mo15961();
        InterfaceC18588 interfaceC18588 = this.f77257;
        return !(interfaceC18588 instanceof C4305) ? inputStreamMo15961 : new C13673(inputStreamMo15961, C4305.m8750(inputStreamMo15961, interfaceC18588));
    }
}
