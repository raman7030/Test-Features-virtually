package l;

import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* JADX INFO: renamed from: l.ۜۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6541 extends ArrayAdapter {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f20189;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6541(C3013 c3013, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, 0);
        this.f20189 = c3013;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C3013 c3013 = this.f20189;
        return c3013.f9533.m13146((MenuItem) getItem(i), c3013.f9511.getWidth(), view);
    }
}
