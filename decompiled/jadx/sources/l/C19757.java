package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩵᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C19757 extends AbstractViewOnClickListenerC1201 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2054 f63814;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16870 f63815;

    @Override // l.AbstractC11580
    /* JADX INFO: renamed from: ۧ */
    public final int mo6259() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19757(C16870 c16870, Main main, InterfaceC2054 interfaceC2054) {
        super(main);
        this.f63815 = c16870;
        this.f63814 = interfaceC2054;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f63815.f37526.m10155() || AbstractViewOnClickListenerC1201.f4338.m22793()) {
            return;
        }
        this.f63814.mo6740(this.f34527);
    }
}
