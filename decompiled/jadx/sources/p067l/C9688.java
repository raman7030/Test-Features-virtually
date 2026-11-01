package p067l;

import android.graphics.Rect;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9688 {

    /* JADX INFO: renamed from: ᩷ */
    public static EnumC14619 f26704 = EnumC14619.values()[C7050.f18359.getInt("fmst", EnumC14619.PREFER_SHOW_ICON_ONLY.ordinal())];

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC15722 f26708;

    /* JADX INFO: renamed from: ܽ */
    public C5232 f26709;

    /* JADX INFO: renamed from: ᩳ */
    public C0994 f26711;

    /* JADX INFO: renamed from: ᩻ */
    public View f26712;

    /* JADX INFO: renamed from: ֫ */
    public int f26705 = 3500;

    /* JADX INFO: renamed from: ۧ */
    public Rect f26707 = new Rect();

    /* JADX INFO: renamed from: ۜ */
    public int[] f26706 = new int[2];

    /* JADX INFO: renamed from: ܿ */
    public final C13712 f26710 = new C13712(0);

    public C9688(View view) {
        this.f26712 = view;
        this.f26711 = new C0994(view.getContext()).setDefaultShowAsAction(1);
        C5232 c5232 = new C5232(view.getContext(), view);
        this.f26709 = c5232;
        EnumC14619 enumC14619 = f26704;
        EnumC14619 enumC146110 = EnumC14619.PREFER_SHOW_TITLE_ONLY;
        if (enumC14619 == enumC146110) {
            c5232.m11283(enumC146110, enumC146110);
        } else {
            c5232.m11283(f26704, EnumC14619.PREFER_SHOW_ALL);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22595(int i) {
        this.f26705 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22592(C8072 c8072) {
        C5232 c5232 = this.f26709;
        if (c8072 == null) {
            c5232.m11282((C8347) null);
        } else {
            c5232.m11282(new C8347(this, c8072));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22593(InterfaceC15722 interfaceC15722) {
        this.f26708 = interfaceC15722;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m22597() {
        this.f26711.clear();
        C5232 c5232 = this.f26709;
        c5232.m11278();
        c5232.m11285();
        EnumC14619 enumC14619 = f26704;
        EnumC14619 enumC146110 = EnumC14619.PREFER_SHOW_TITLE_ONLY;
        if (enumC14619 == enumC146110) {
            c5232.m11283(enumC146110, enumC146110);
        } else {
            c5232.m11283(f26704, EnumC14619.PREFER_SHOW_ALL);
        }
        m22589(1.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22585(EnumC14619 enumC14619) {
        f26704 = enumC14619;
        C7050.f18359.edit().mo27875(enumC14619.ordinal(), "fmst").apply();
    }

    /* JADX INFO: renamed from: ܿ */
    public static EnumC14619 m22586() {
        return f26704;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22590(int i) {
        new C14382(this.f26711.add(0, i, 0, i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14382 m22587(C17833 c17833, int i) {
        return new C14382(this.f26711.add(0, 0, i, c17833));
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m22596() {
        return this.f26711.size() == 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m22594() {
        return this.f26709.m11284();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22589(float f) {
        this.f26709.m11279(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22591(int i, int i2) {
        ArrayList arrayListM22583 = m22583(this.f26711);
        C8150.sort(arrayListM22583, this.f26710);
        if (arrayListM22583.isEmpty()) {
            return;
        }
        Rect rect = this.f26707;
        rect.set(i, i2, i, i2);
        View view = this.f26712;
        int[] iArr = this.f26706;
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        MenuItemOnMenuItemClickListenerC12371 menuItemOnMenuItemClickListenerC12371 = new MenuItemOnMenuItemClickListenerC12371(this);
        C5232 c5232 = this.f26709;
        c5232.m11281(arrayListM22583, menuItemOnMenuItemClickListenerC12371, rect);
        int i3 = this.f26705;
        if (i3 > 0) {
            c5232.m11280(i3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22584(C9688 c9688, MenuItem menuItem) {
        InterfaceC15722 interfaceC15722 = c9688.f26708;
        if (interfaceC15722 != null) {
            interfaceC15722.onMenuItemClick(menuItem);
        }
        c9688.f26709.m11278();
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m22583(Menu menu) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; menu != null && i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(m22583(subMenu));
                } else {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22588() {
        this.f26709.m11278();
    }
}
