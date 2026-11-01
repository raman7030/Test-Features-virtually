package p067l;

import android.content.Context;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۖ */
/* JADX INFO: compiled from: 95GJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C1898 {

    /* JADX INFO: renamed from: ֫ */
    public final View f71324;

    /* JADX INFO: renamed from: ۧ */
    public final C0994 f71325;

    /* JADX INFO: renamed from: ܽ */
    public InterfaceC1583 f71326;

    /* JADX INFO: renamed from: ܿ */
    public final C1749 f71327;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC1233 f71328;

    public C1898(Context context, View view, int i) {
        this(context, view, i, R.attr.MT_Protector);
    }

    public C1898(Context context, View view, int i, int i2) {
        this.f71324 = view;
        C0994 c0994 = new C0994(context);
        this.f71325 = c0994;
        c0994.setCallback(new C1093(this));
        C1749 c1749 = new C1749(context, c0994, view, false, i2, 0);
        this.f71327 = c1749;
        c1749.m44890(i);
        c1749.m44892(new C0883(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50634(int i) {
        this.f71327.m44890(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m50637() {
        return this.f71327.m44896();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C0994 m50638() {
        return this.f71325;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m50639() {
        if (!this.f71327.m44900()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50633() {
        this.f71327.m44889();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50636(InterfaceC1583 interfaceC1583) {
        this.f71326 = interfaceC1583;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50635(InterfaceC1233 interfaceC1233) {
        this.f71328 = interfaceC1233;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m50640() {
        this.f71327.m44894(true);
    }
}
