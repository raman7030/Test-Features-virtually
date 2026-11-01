package p067l;

import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۙۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6573 {

    /* JADX INFO: renamed from: ֫ */
    public final View f16966;

    /* JADX INFO: renamed from: ۧ */
    public final ContextThemeWrapper f16967;

    /* JADX INFO: renamed from: ܽ */
    public final int f16968;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C5232 f16969;

    /* JADX INFO: renamed from: ᩳ */
    public final int f16970;

    public C6573(C5232 c5232, ContextThemeWrapper contextThemeWrapper, int i) {
        this.f16969 = c5232;
        this.f16967 = contextThemeWrapper;
        this.f16968 = i;
        int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
        this.f16970 = dimensionPixelSize;
        View viewM11240 = C5232.m11240(c5232, contextThemeWrapper, (MenuItem) null, i);
        viewM11240.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.f16966 = viewM11240;
    }

    /* JADX INFO: renamed from: ֫ */
    public final View m15010(MenuItem menuItem, int i, View view) {
        C12826.requireNonNull(menuItem);
        int i2 = this.f16968;
        C5232 c5232 = this.f16969;
        if (view != null) {
            c5232.m11245(view, menuItem, i2, false);
        } else {
            view = C5232.m11240(c5232, this.f16967, menuItem, i2);
            int i3 = this.f16970;
            view.setPadding(i3, 0, i3, 0);
            view.setOnTouchListener(new ViewOnTouchListenerC12609(c5232));
        }
        view.setMinimumWidth(i);
        return view;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15009(MenuItem menuItem) {
        C5232 c5232 = this.f16969;
        View view = this.f16966;
        c5232.m11245(view, menuItem, this.f16968, false);
        view.measure(0, 0);
        return view.getMeasuredWidth();
    }
}
