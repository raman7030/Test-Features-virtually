package p067l;

import android.view.View;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.᩵᩹ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 164Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C21146 extends AbstractViewOnClickListenerC3510 {

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC4321 f66449;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C18402 f66450;

    @Override // p067l.AbstractC13374
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461() {
        return 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21146(C18402 c18402, Main main, InterfaceC4321 interfaceC4321) {
        super(main);
        this.f66450 = c18402;
        this.f66449 = interfaceC4321;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f66450.f40549.m12191() || AbstractViewOnClickListenerC3510.f7107.m24763()) {
            return;
        }
        this.f66449.mo8866(this.f37526);
    }
}
