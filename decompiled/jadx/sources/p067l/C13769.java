package p067l;

import android.view.View;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۨ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C13769 extends AbstractViewOnLongClickListenerC16250 {

    /* JADX INFO: renamed from: ۛ */
    public final View f38925;

    /* JADX INFO: renamed from: ۤ */
    public C21146 f38926;

    /* JADX INFO: renamed from: ۨ */
    public boolean f38927;

    /* JADX INFO: renamed from: ᩺ */
    public final C18402 f38928;

    public C13769(Main main, View view, C18402 c18402) {
        super(main, view);
        this.f38925 = view.findViewById(R.id.details);
        this.f38928 = c18402;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo31385() {
        return this.f38927;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo31386(AbstractC5462 abstractC5462) {
        C13769 c13769 = (C13769) abstractC5462;
        if (!c13769.f38927) {
            return false;
        }
        C18402.m41892(this.f38928, this, c13769);
        return true;
    }

    @Override // p067l.AbstractViewOnLongClickListenerC16250, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C21146 c21146;
        C18402 c18402 = this.f38928;
        if (c18402.f40549.m12191() || (c21146 = this.f38926) == null || c21146.f66449.mo8865() == null) {
            return false;
        }
        InterfaceC4321 interfaceC4321 = this.f38926.f66449;
        C5522 c5522 = c18402.f40549;
        C12826.requireNonNull(c5522);
        C18402.m41890(this.f38928, this.f47808, interfaceC4321, false, (DialogInterfaceC2564) null, (Runnable) new RunnableC17814(1, c5522), (RunnableC23827) null);
        return true;
    }
}
