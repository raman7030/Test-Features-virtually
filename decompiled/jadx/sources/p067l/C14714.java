package p067l;

import android.view.View;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.۬۠ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5NX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14714 extends AbstractViewOnClickListenerC3510 implements InterfaceC12033 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C8009 f41946;

    /* JADX INFO: renamed from: ۙ */
    public final String f41947;

    /* JADX INFO: renamed from: ۫ */
    public final int f41948;

    /* JADX INFO: renamed from: ۬ */
    public final String f41949;

    /* JADX INFO: renamed from: ᩶ */
    public final C13596 f41950;

    @Override // p067l.AbstractC13374
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461() {
        return 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14714(C8009 c8009, Main main, AbstractC18422 abstractC18422) {
        super(main);
        this.f41946 = c8009;
        C14005 c14005Mo8214 = abstractC18422.mo8214();
        this.f41949 = c14005Mo8214.m31806();
        this.f41947 = c14005Mo8214.m31805();
        this.f41950 = c14005Mo8214.m31804().f66884;
        this.f41948 = abstractC18422.m41987();
    }

    @Override // p067l.InterfaceC12033
    /* JADX INFO: renamed from: ֫ */
    public final int mo27546() {
        return this.f41948;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C8009 c8009 = this.f41946;
        if (c8009.f40549.m12191() || AbstractViewOnClickListenerC3510.f7107.m24763()) {
            return;
        }
        Main main = this.f37526;
        main.m125();
        C11245 c11245M130 = main.m130();
        if (c11245M130 == null || c11245M130.m26094(this.f41948)) {
            return;
        }
        c8009.m18593();
    }
}
