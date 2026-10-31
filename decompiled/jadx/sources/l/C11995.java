package l;

import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C11995 extends AbstractViewOnLongClickListenerC14606 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final View f35915;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C19757 f35916;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f35917;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C16870 f35918;

    public C11995(Main main, View view, C16870 c16870) {
        super(main, view);
        this.f35915 = view.findViewById(R.id.details);
        this.f35918 = c16870;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo29330() {
        return this.f35917;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo29331(AbstractC3255 abstractC3255) {
        C11995 c11995 = (C11995) abstractC3255;
        if (!c11995.f35917) {
            return false;
        }
        C16870.m39656(this.f35918, this, c11995);
        return true;
    }

    @Override // l.AbstractViewOnLongClickListenerC14606, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C19757 c19757;
        C16870 c16870 = this.f35918;
        if (c16870.f37526.m10155() || (c19757 = this.f35916) == null || c19757.f63814.mo6739() == null) {
            return false;
        }
        InterfaceC2054 interfaceC2054 = this.f35916.f63814;
        C3318 c3318 = c16870.f37526;
        C11003.requireNonNull(c3318);
        C16870.m39654(this.f35918, this.f44702, interfaceC2054, false, (DialogInterfaceC0206) null, (Runnable) new RunnableC16251(1, c3318), (RunnableC22578) null);
        return true;
    }
}
