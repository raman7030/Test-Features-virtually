package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: l.֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K4O7 */
/* JADX INFO: loaded from: classes3.dex */
public final class SubMenuC0651 extends MenuC21114 implements SubMenu {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceSubMenuC7478 f2500;

    public SubMenuC0651(Context context, InterfaceSubMenuC7478 interfaceSubMenuC7478) {
        super(context, interfaceSubMenuC7478);
        this.f2500 = interfaceSubMenuC7478;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.f2500.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f2500.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.f2500.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f2500.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f2500.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f2500.clearHeader();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f2500.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f2500.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return m37161(this.f2500.getItem());
    }
}
