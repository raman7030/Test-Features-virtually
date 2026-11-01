package p067l;

import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: l.ܺۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC17301 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C5232 f51602;

    public ViewOnClickListenerC17301(C5232 c5232) {
        this.f51602 = c5232;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuItem menuItem;
        C5232 c5232 = this.f51602;
        if (c5232.f12326 == null) {
            return;
        }
        Object tag = view.getTag();
        if ((tag instanceof C23337) && (menuItem = (MenuItem) c5232.f12330.get((C23337) tag)) != null) {
            ((MenuItemOnMenuItemClickListenerC12371) c5232.f12326).onMenuItemClick(menuItem);
        }
    }
}
