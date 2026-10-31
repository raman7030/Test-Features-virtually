package l;

import android.text.style.RelativeSizeSpan;

/* JADX INFO: renamed from: l.֡᩻ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A924 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0743 extends C6986 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20500 f2792;

    public C0743(C20500 c20500) {
        this.f2792 = c20500;
    }

    @Override // l.C6986, l.InterfaceC22508
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2859(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
        if (interfaceC3458.length() > 0) {
            interfaceC3458.mo10589();
            float fMo19821 = this.f2792.mo19821(abstractC0197);
            C17820 c17820Builder = interfaceC3458.builder();
            int length = interfaceC3458.length();
            c17820Builder.setSpan(new RelativeSizeSpan(fMo19821), length - 1, length, 33);
        }
    }
}
