package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: l.᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: S5UF */
/* JADX INFO: loaded from: classes5.dex */
public class MenuC21114 extends AbstractC15759 implements Menu {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceMenuC23000 f68103;

    public MenuC21114(Context context, InterfaceMenuC23000 interfaceMenuC23000) {
        super(context);
        if (interfaceMenuC23000 == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f68103 = interfaceMenuC23000;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return m37161(this.f68103.add(charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return m37161(this.f68103.add(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m37161(this.f68103.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return m37161(this.f68103.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return m37162(this.f68103.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return m37162(this.f68103.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m37162(this.f68103.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m37162(this.f68103.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f68103.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m37161(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        m37164(i);
        this.f68103.removeItem(i);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        m37163(i);
        this.f68103.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void clear() {
        m37165();
        this.f68103.clear();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f68103.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f68103.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f68103.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f68103.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return m37161(this.f68103.findItem(i));
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f68103.size();
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return m37161(this.f68103.getItem(i));
    }

    @Override // android.view.Menu
    public final void close() {
        this.f68103.close();
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f68103.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f68103.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f68103.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f68103.setQwertyMode(z);
    }
}
