package l;

import android.view.View;
import bin.mt.plus.Main;

/* JADX INFO: renamed from: l.᩹᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4ZV */
/* JADX INFO: loaded from: classes.dex */
public final class C22557 extends AbstractViewOnClickListenerC1201 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f72949;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19883 f72950;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4027 f72951;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f72952;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4918 f72953;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f72954;

    @Override // l.AbstractC11580
    /* JADX INFO: renamed from: ۧ */
    public final int mo6259() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22557(C4918 c4918, Main main, int i, String str, String str2, C19883 c19883) {
        super(main);
        this.f72953 = c4918;
        this.f72952 = C4925.m14327(i);
        this.f72949 = str;
        this.f72951 = null;
        this.f72954 = str2 != null ? str2 : str;
        this.f72950 = c19883;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22557(C4918 c4918, Main main, String str, String str2, C19883 c19883, C4027 c4027) {
        super(main);
        this.f72953 = c4918;
        this.f72952 = str;
        this.f72949 = str2;
        this.f72951 = c4027;
        this.f72954 = str2;
        this.f72950 = c19883;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f72953.f37526.m10155() || AbstractViewOnClickListenerC1201.f4338.m22793()) {
            return;
        }
        Main main = this.f34527;
        main.m127();
        main.m132().m24070().m39033(this.f72949, true);
    }
}
