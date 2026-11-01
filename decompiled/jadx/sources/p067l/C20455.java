package p067l;

import android.content.Intent;
import android.view.View;
import bin.p000mt.plus.Main;

/* JADX INFO: renamed from: l.ᩴ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94PF */
/* JADX INFO: loaded from: classes5.dex */
public final class C20455 extends AbstractViewOnClickListenerC3510 {

    /* JADX INFO: renamed from: ۗ */
    public final String f63177;

    /* JADX INFO: renamed from: ۙ */
    public final String f63178;

    /* JADX INFO: renamed from: ۫ */
    public final String f63179;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ C3019 f63180;

    /* JADX INFO: renamed from: ᩶ */
    public final C13596 f63181;

    @Override // p067l.AbstractC13374
    /* JADX INFO: renamed from: ۧ */
    public final int mo8461() {
        return 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20455(C3019 c3019, Main main, AbstractC17043 abstractC17043) {
        super(main);
        this.f63180 = c3019;
        this.f63181 = C21265.f66815.f66884;
        this.f63179 = abstractC17043.getName();
        String strMo25505 = abstractC17043.mo25505();
        this.f63178 = strMo25505;
        int iIndexOf = strMo25505.indexOf("Android/data/");
        if (iIndexOf == -1) {
            this.f63177 = strMo25505;
        } else {
            this.f63177 = strMo25505.substring(iIndexOf);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3019 c3019 = this.f63180;
        if (c3019.f40549.m12191() || AbstractViewOnClickListenerC3510.f7107.m24763()) {
            return;
        }
        AbstractC17043 abstractC17043M42109 = C18524.m42109(this.f63178, new String[0]);
        if (abstractC17043M42109.mo25094()) {
            String strMo25505 = abstractC17043M42109.mo25505();
            int i = ActivityC18686.f55776;
            Main main = this.f37526;
            Intent intent = new Intent(main, (Class<?>) ActivityC18686.class);
            intent.putExtra("projectPath", strMo25505);
            main.startActivity(intent);
            return;
        }
        c3019.m5114();
    }
}
