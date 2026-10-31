package l;

import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: l.ܺۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC15712 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3013 f48464;

    public ViewOnClickListenerC15712(C3013 c3013) {
        this.f48464 = c3013;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MenuItem menuItem;
        C3013 c3013 = this.f48464;
        if (c3013.f9528 == null) {
            return;
        }
        Object tag = view.getTag();
        if ((tag instanceof C22063) && (menuItem = (MenuItem) c3013.f9532.get((C22063) tag)) != null) {
            ((MenuItemOnMenuItemClickListenerC10524) c3013.f9528).onMenuItemClick(menuItem);
        }
    }
}
