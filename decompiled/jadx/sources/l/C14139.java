package l;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: l.ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes3.dex */
public final class C14139 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f42653;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f42655;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42656;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CharSequence f42657;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f42658;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42659;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f42660;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Menu f42661;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f42662;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f42664;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f42665;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f42666;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f42667;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7790 f42668;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharSequence f42669;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f42670;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f42671;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f42672;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char f42673;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f42674;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42675;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f42676;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f42677;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public CharSequence f42678;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char f42679;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f42680;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f42681;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f42682;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC17151 f42683;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ColorStateList f42654 = null;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f42663 = null;

    public C14139(C7790 c7790, Menu menu) {
        this.f42668 = c7790;
        this.f42661 = menu;
        m33756();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m33756() {
        this.f42676 = 0;
        this.f42655 = 0;
        this.f42675 = 0;
        this.f42667 = 0;
        this.f42671 = true;
        this.f42674 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33752(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f42668.f24083.obtainStyledAttributes(attributeSet, C3390.f10701);
        this.f42676 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.f42655 = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.f42675 = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f42667 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f42671 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f42674 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33754(AttributeSet attributeSet) {
        C7790 c7790 = this.f42668;
        C22733 c22733M50795 = C22733.m50795(c7790.f24083, attributeSet, C3390.f10695);
        this.f42672 = c22733M50795.m50806(2, 0);
        this.f42656 = (c22733M50795.m50809(5, this.f42655) & (-65536)) | (c22733M50795.m50809(6, this.f42675) & 65535);
        this.f42657 = c22733M50795.m50817(7);
        this.f42670 = c22733M50795.m50817(8);
        this.f42660 = c22733M50795.m50806(0, 0);
        String strM50807 = c22733M50795.m50807(9);
        this.f42673 = strM50807 == null ? (char) 0 : strM50807.charAt(0);
        this.f42664 = c22733M50795.m50809(16, 4096);
        String strM50808 = c22733M50795.m50807(10);
        this.f42679 = strM50808 == null ? (char) 0 : strM50808.charAt(0);
        this.f42682 = c22733M50795.m50809(20, 4096);
        if (c22733M50795.m50802(11)) {
            this.f42658 = c22733M50795.m50801(11, false) ? 1 : 0;
        } else {
            this.f42658 = this.f42667;
        }
        this.f42677 = c22733M50795.m50801(3, false);
        this.f42666 = c22733M50795.m50801(4, this.f42671);
        this.f42653 = c22733M50795.m50801(1, this.f42674);
        this.f42659 = c22733M50795.m50809(21, -1);
        this.f42681 = c22733M50795.m50807(12);
        this.f42680 = c22733M50795.m50806(13, 0);
        this.f42662 = c22733M50795.m50807(15);
        String strM50809 = c22733M50795.m50807(14);
        if (strM50809 != null && this.f42680 == 0 && this.f42662 == null) {
            this.f42683 = (AbstractC17151) m33749(strM50809, C7790.f24080, c7790.f24081);
        } else {
            this.f42683 = null;
        }
        this.f42678 = c22733M50795.m50817(17);
        this.f42669 = c22733M50795.m50817(22);
        if (c22733M50795.m50802(19)) {
            this.f42663 = C15320.m36346(c22733M50795.m50809(19, -1), this.f42663);
        } else {
            this.f42663 = null;
        }
        if (c22733M50795.m50802(18)) {
            this.f42654 = c22733M50795.m50804(18);
        } else {
            this.f42654 = null;
        }
        c22733M50795.m50813();
        this.f42665 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33750(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f42677).setVisible(this.f42666).setEnabled(this.f42653).setCheckable(this.f42658 >= 1).setTitleCondensed(this.f42670).setIcon(this.f42660);
        int i = this.f42659;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f42681;
        C7790 c7790 = this.f42668;
        if (str != null) {
            if (c7790.f24083.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC23312(c7790.m20820(), this.f42681));
        }
        if (this.f42658 >= 2) {
            if (menuItem instanceof C5882) {
                ((C5882) menuItem).m16460(true);
            } else if (menuItem instanceof MenuItemC2063) {
                ((MenuItemC2063) menuItem).m6747();
            }
        }
        String str2 = this.f42662;
        if (str2 != null) {
            menuItem.setActionView((View) m33749(str2, C7790.f24079, c7790.f24082));
            z = true;
        }
        int i2 = this.f42680;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        AbstractC17151 abstractC17151 = this.f42683;
        if (abstractC17151 != null && (menuItem instanceof InterfaceMenuItemC13827)) {
            ((InterfaceMenuItemC13827) menuItem).mo16448(abstractC17151);
        }
        C5862.m16422(menuItem, this.f42678);
        C5862.m16424(menuItem, this.f42669);
        C5862.m16419(menuItem, this.f42673, this.f42664);
        C5862.m16423(menuItem, this.f42679, this.f42682);
        PorterDuff.Mode mode = this.f42663;
        if (mode != null) {
            C5862.m16421(menuItem, mode);
        }
        ColorStateList colorStateList = this.f42654;
        if (colorStateList != null) {
            C5862.m16420(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33751() {
        this.f42665 = true;
        m33750(this.f42661.add(this.f42676, this.f42672, this.f42656, this.f42657));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SubMenu m33753() {
        this.f42665 = true;
        SubMenu subMenuAddSubMenu = this.f42661.addSubMenu(this.f42676, this.f42672, this.f42656, this.f42657);
        m33750(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m33755() {
        return this.f42665;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m33749(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f42668.f24083.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
