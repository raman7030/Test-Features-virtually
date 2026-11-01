package p067l;

import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: l.ۜۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C8585 extends ArrayAdapter {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5232 f23067;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8585(C5232 c5232, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, 0);
        this.f23067 = c5232;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C5232 c5232 = this.f23067;
        return c5232.f12331.m15010((MenuItem) getItem(i), c5232.f12309.getWidth(), view);
    }
}
