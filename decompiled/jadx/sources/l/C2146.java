package l;

import android.view.View;

/* JADX INFO: renamed from: l.֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 45OX */
/* JADX INFO: loaded from: classes3.dex */
public final class C2146 extends C1080 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17668 f7112;

    public C2146(C17668 c17668) {
        this.f7112 = c17668;
    }

    @Override // l.InterfaceC21882
    public final void onAnimationEnd() {
        View view;
        C17668 c17668 = this.f7112;
        if (c17668.f54052 && (view = c17668.f54054) != null) {
            view.setTranslationY(0.0f);
            c17668.f54048.setTranslationY(0.0f);
        }
        c17668.f54048.setVisibility(8);
        c17668.f54048.m36549(false);
        c17668.f54044 = null;
        InterfaceC4968 interfaceC4968 = c17668.f54046;
        if (interfaceC4968 != null) {
            ((C18102) interfaceC4968).mo14423(c17668.f54047);
            c17668.f54047 = null;
            c17668.f54046 = null;
        }
        C10530 c10530 = c17668.f54039;
        if (c10530 != null) {
            C17648.m41339(c10530);
        }
    }
}
