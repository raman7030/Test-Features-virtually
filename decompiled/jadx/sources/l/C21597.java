package l;

import android.view.View;
import android.widget.TextView;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21597 implements InterfaceC1702, InterfaceC16610, InterfaceC12551, InterfaceC5013 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69347;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69348;

    public /* synthetic */ C21597(Object obj, Object obj2) {
        this.f69347 = obj;
        this.f69348 = obj2;
    }

    @Override // l.InterfaceC16610
    public C21610 onApplyWindowInsets(View view, C21610 c21610) {
        ActivityC10227.m25712((ActivityC10227) this.f69347, (C2978) this.f69348, c21610);
        return c21610;
    }

    @Override // l.InterfaceC1702
    /* JADX INFO: renamed from: ֫ */
    public void mo5714(TextView textView) {
        C11277 c11277 = (C11277) this.f69347;
        C11277.m27883((TextView) this.f69348, textView, c11277.f33789.m39044().mo6020(), c11277.f33787);
    }

    @Override // l.InterfaceC12551
    /* JADX INFO: renamed from: ֫ */
    public void mo13973(String str, String str2, boolean z, boolean z2, boolean z3) {
        ViewOnClickListenerC10435.m26275((ViewOnClickListenerC10435) this.f69347, (Set) this.f69348, str, str2, z, z2, z3);
    }

    @Override // l.InterfaceC5013
    /* JADX INFO: renamed from: ֫ */
    public void mo14506(C0779 c0779, EnumC19125 enumC19125, AbstractC4308 abstractC4308, boolean z) {
        C0779 c07710 = (C0779) this.f69347;
        C18837 c18837 = (C18837) this.f69348;
        c07710.getClass();
        C12171.m29642(c0779 == c07710);
        c18837.m43511(new C23069(enumC19125, abstractC4308));
    }

    @Override // l.InterfaceC5013
    /* JADX INFO: renamed from: ֫ */
    public void mo14505(C0779 c0779) {
        C12171.m29636();
        throw null;
    }
}
