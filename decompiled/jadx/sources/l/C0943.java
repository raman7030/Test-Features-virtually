package l;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: renamed from: l.֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84KN */
/* JADX INFO: loaded from: classes2.dex */
public final class C0943 extends ListView implements InterfaceC4471, InterfaceC7002, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int[] f3571 = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C3060 f3572;

    public C0943(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public C0943(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, f3571, i, 0);
        if (c22733M50796.m50802(0)) {
            setBackgroundDrawable(c22733M50796.m50815(0));
        }
        if (c22733M50796.m50802(1)) {
            setDivider(c22733M50796.m50815(1));
        }
        c22733M50796.m50813();
    }

    @Override // l.InterfaceC7002
    public final void initialize(C3060 c3060) {
        this.f3572 = c3060;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // l.InterfaceC4471
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo3362(C5882 c5882) {
        return this.f3572.performItemAction(c5882, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo3362((C5882) getAdapter().getItem(i));
    }
}
