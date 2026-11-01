package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: l.᩷᩷ */
/* JADX INFO: compiled from: S5UF */
/* JADX INFO: loaded from: classes5.dex */
public class MenuC1889 extends AbstractC1624 implements Menu {

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceMenuC1983 f70785;

    public MenuC1889(Context context, InterfaceMenuC1983 interfaceMenuC1983) {
        super(context);
        if (interfaceMenuC1983 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f70785 = interfaceMenuC1983;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m39331(this.f70785.add(charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m39331(this.f70785.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m39331(this.f70785.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m39331(this.f70785.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return m39332(this.f70785.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return m39332(this.f70785.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m39332(this.f70785.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m39332(this.f70785.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f70785.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m39331(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        m39334(i);
        this.f70785.removeItem(i);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        m39333(i);
        this.f70785.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void clear() {
        m39335();
        this.f70785.clear();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f70785.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f70785.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f70785.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f70785.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m39331(this.f70785.findItem(i));
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f70785.size();
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m39331(this.f70785.getItem(i));
    }

    @Override // android.view.Menu
    public final void close() {
        this.f70785.close();
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f70785.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f70785.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f70785.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f70785.setQwertyMode(z);
    }
}
