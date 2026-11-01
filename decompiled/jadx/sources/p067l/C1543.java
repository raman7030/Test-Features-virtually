package p067l;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: l.ܰ᩻ */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes3.dex */
public final class C1543 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f45742;

    /* JADX INFO: renamed from: ֫ */
    public int f45744;

    /* JADX INFO: renamed from: ۖ */
    public int f45745;

    /* JADX INFO: renamed from: ۗ */
    public CharSequence f45746;

    /* JADX INFO: renamed from: ۘ */
    public int f45747;

    /* JADX INFO: renamed from: ۙ */
    public int f45748;

    /* JADX INFO: renamed from: ۚ */
    public int f45749;

    /* JADX INFO: renamed from: ۛ */
    public Menu f45750;

    /* JADX INFO: renamed from: ۜ */
    public String f45751;

    /* JADX INFO: renamed from: ۡ */
    public int f45753;

    /* JADX INFO: renamed from: ۢ */
    public boolean f45754;

    /* JADX INFO: renamed from: ۤ */
    public boolean f45755;

    /* JADX INFO: renamed from: ۧ */
    public int f45756;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ C1228 f45757;

    /* JADX INFO: renamed from: ۫ */
    public CharSequence f45758;

    /* JADX INFO: renamed from: ۬ */
    public CharSequence f45759;

    /* JADX INFO: renamed from: ܳ */
    public boolean f45760;

    /* JADX INFO: renamed from: ܶ */
    public int f45761;

    /* JADX INFO: renamed from: ܺ */
    public char f45762;

    /* JADX INFO: renamed from: ܽ */
    public boolean f45763;

    /* JADX INFO: renamed from: ܿ */
    public int f45764;

    /* JADX INFO: renamed from: ᩳ */
    public int f45765;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f45766;

    /* JADX INFO: renamed from: ᩵ */
    public CharSequence f45767;

    /* JADX INFO: renamed from: ᩶ */
    public char f45768;

    /* JADX INFO: renamed from: ᩷ */
    public int f45769;

    /* JADX INFO: renamed from: ᩸ */
    public String f45770;

    /* JADX INFO: renamed from: ᩹ */
    public int f45771;

    /* JADX INFO: renamed from: ᩻ */
    public AbstractC1693 f45772;

    /* JADX INFO: renamed from: ֨ */
    public ColorStateList f45743 = null;

    /* JADX INFO: renamed from: ۠ */
    public PorterDuff.Mode f45752 = null;

    public C1543(C1228 c1228, Menu menu) {
        this.f45757 = c1228;
        this.f45750 = menu;
        m35889();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m35889() {
        this.f45765 = 0;
        this.f45744 = 0;
        this.f45764 = 0;
        this.f45756 = 0;
        this.f45760 = true;
        this.f45763 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35885(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = this.f45757.f27000.obtainStyledAttributes(attributeSet, C1010.f13508);
        this.f45765 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.f45744 = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.f45764 = typedArrayObtainStyledAttributes.getInt(4, 0);
        this.f45756 = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f45760 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f45763 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m35887(AttributeSet attributeSet) {
        C1228 c1228 = this.f45757;
        C1970 c1970M53128 = C1970.m53128(c1228.f27000, attributeSet, C1010.f13502);
        this.f45761 = c1970M53128.m53139(2, 0);
        this.f45745 = (c1970M53128.m53142(5, this.f45744) & (-65536)) | (c1970M53128.m53142(6, this.f45764) & 65535);
        this.f45746 = c1970M53128.m53150(7);
        this.f45759 = c1970M53128.m53150(8);
        this.f45749 = c1970M53128.m53139(0, 0);
        String strM53140 = c1970M53128.m53140(9);
        this.f45762 = strM53140 == null ? (char) 0 : strM53140.charAt(0);
        this.f45753 = c1970M53128.m53142(16, 4096);
        String strM53141 = c1970M53128.m53140(10);
        this.f45768 = strM53141 == null ? (char) 0 : strM53141.charAt(0);
        this.f45771 = c1970M53128.m53142(20, 4096);
        if (c1970M53128.m53135(11)) {
            this.f45747 = c1970M53128.m53134(11, false) ? 1 : 0;
        } else {
            this.f45747 = this.f45756;
        }
        this.f45766 = c1970M53128.m53134(3, false);
        this.f45755 = c1970M53128.m53134(4, this.f45760);
        this.f45742 = c1970M53128.m53134(1, this.f45763);
        this.f45748 = c1970M53128.m53142(21, -1);
        this.f45770 = c1970M53128.m53140(12);
        this.f45769 = c1970M53128.m53139(13, 0);
        this.f45751 = c1970M53128.m53140(15);
        String strM53142 = c1970M53128.m53140(14);
        if (strM53142 != null && this.f45769 == 0 && this.f45751 == null) {
            this.f45772 = (AbstractC1693) m35882(strM53142, C1228.f26997, c1228.f26998);
        } else {
            this.f45772 = null;
        }
        this.f45767 = c1970M53128.m53150(17);
        this.f45758 = c1970M53128.m53150(22);
        if (c1970M53128.m53135(19)) {
            this.f45752 = C1602.m38504(c1970M53128.m53142(19, -1), this.f45752);
        } else {
            this.f45752 = null;
        }
        if (c1970M53128.m53135(18)) {
            this.f45743 = c1970M53128.m53137(18);
        } else {
            this.f45743 = null;
        }
        c1970M53128.m53146();
        this.f45754 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m35883(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f45766).setVisible(this.f45755).setEnabled(this.f45742).setCheckable(this.f45747 >= 1).setTitleCondensed(this.f45759).setIcon(this.f45749);
        int i = this.f45748;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f45770;
        C1228 c1228 = this.f45757;
        if (str != null) {
            if (c1228.f27000.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC1998(c1228.m22801(), this.f45770));
        }
        if (this.f45747 >= 2) {
            if (menuItem instanceof C1134) {
                ((C1134) menuItem).m18386(true);
            } else if (menuItem instanceof MenuItemC0944) {
                ((MenuItemC0944) menuItem).m8873();
            }
        }
        String str2 = this.f45751;
        if (str2 != null) {
            menuItem.setActionView((View) m35882(str2, C1228.f26996, c1228.f26999));
            z = true;
        }
        int i2 = this.f45769;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        AbstractC1693 abstractC1693 = this.f45772;
        if (abstractC1693 != null && (menuItem instanceof InterfaceMenuItemC1528)) {
            ((InterfaceMenuItemC1528) menuItem).mo18374(abstractC1693);
        }
        C1133.m18347(menuItem, this.f45767);
        C1133.m18349(menuItem, this.f45758);
        C1133.m18344(menuItem, this.f45762, this.f45753);
        C1133.m18348(menuItem, this.f45768, this.f45771);
        PorterDuff.Mode mode = this.f45752;
        if (mode != null) {
            C1133.m18346(menuItem, mode);
        }
        ColorStateList colorStateList = this.f45743;
        if (colorStateList != null) {
            C1133.m18345(menuItem, colorStateList);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35884() {
        this.f45754 = true;
        m35883(this.f45750.add(this.f45765, this.f45761, this.f45745, this.f45746));
    }

    /* JADX INFO: renamed from: ۧ */
    public final SubMenu m35886() {
        this.f45754 = true;
        SubMenu subMenuAddSubMenu = this.f45750.addSubMenu(this.f45765, this.f45761, this.f45745, this.f45746);
        m35883(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m35888() {
        return this.f45754;
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m35882(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f45757.f27000.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
