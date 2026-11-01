package p067l;

import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.֡᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3075 extends C9008 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C21852 f5565;

    public C3075(C21852 c21852) {
        this.f5565 = c21852;
    }

    @Override // p067l.C9008, p067l.InterfaceC23760
    /* JADX INFO: renamed from: ֫ */
    public final void mo5188(InterfaceC5655 interfaceC5655, AbstractC2555 abstractC2555) {
        if (interfaceC5655.length() > 0) {
            interfaceC5655.mo12597();
            float fMo21794 = this.f5565.mo21794(abstractC2555);
            C19304 c19304Builder = interfaceC5655.builder();
            int length = interfaceC5655.length();
            c19304Builder.setSpan(new RelativeSizeSpan(fMo21794), length - 1, length, 33);
        }
    }
}
