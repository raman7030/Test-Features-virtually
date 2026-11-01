package p067l;

import android.view.View;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.᩹᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes.dex */
public final class C23807 extends AbstractViewOnClickListenerC3510 {

    /* JADX INFO: renamed from: ۗ */
    public final String f75676;

    /* JADX INFO: renamed from: ۙ */
    public final C21265 f75677;

    /* JADX INFO: renamed from: ۤ */
    public final C6196 f75678;

    /* JADX INFO: renamed from: ۫ */
    public final String f75679;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C7043 f75680;

    /* JADX INFO: renamed from: ᩶ */
    public final String f75681;

    @Override // p067l.AbstractC13374
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23807(C7043 c7043, Main main, int i, String str, String str2, C21265 c21265) {
        super(main);
        this.f75680 = c7043;
        this.f75679 = C7050.m16224(i);
        this.f75676 = str;
        this.f75678 = null;
        this.f75681 = str2 != null ? str2 : str;
        this.f75677 = c21265;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23807(C7043 c7043, Main main, String str, String str2, C21265 c21265, C6196 c6196) {
        super(main);
        this.f75680 = c7043;
        this.f75679 = str;
        this.f75676 = str2;
        this.f75678 = c6196;
        this.f75681 = str2;
        this.f75677 = c21265;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f75680.f40549.m12191() || AbstractViewOnClickListenerC3510.f7107.m24763()) {
            return;
        }
        Main main = this.f37526;
        main.m125();
        main.m130().m26079().m41259(this.f75676, true);
    }
}
