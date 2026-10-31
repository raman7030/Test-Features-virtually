package l;

import android.graphics.Rect;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9CL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7701 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC12890 f23791 = EnumC12890.values()[C4925.f15527.getInt("fmst", EnumC12890.PREFER_SHOW_ICON_ONLY.ordinal())];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC14050 f23795;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3013 f23796;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3060 f23798;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public View f23799;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23792 = 3500;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Rect f23794 = new Rect();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f23793 = new int[2];

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11935 f23797 = new C11935(0);

    public C7701(View view) {
        this.f23799 = view;
        this.f23798 = new C3060(view.getContext()).setDefaultShowAsAction(1);
        C3013 c3013 = new C3013(view.getContext(), view);
        this.f23796 = c3013;
        EnumC12890 enumC12890 = f23791;
        EnumC12890 enumC12891 = EnumC12890.PREFER_SHOW_TITLE_ONLY;
        if (enumC12890 == enumC12891) {
            c3013.m9232(enumC12891, enumC12891);
        } else {
            c3013.m9232(f23791, EnumC12890.PREFER_SHOW_ALL);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20615(int i) {
        this.f23792 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20612(C6001 c6001) {
        C3013 c3013 = this.f23796;
        if (c6001 == null) {
            c3013.m9231((C6290) null);
        } else {
            c3013.m9231(new C6290(this, c6001));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20613(InterfaceC14050 interfaceC14050) {
        this.f23795 = interfaceC14050;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20617() {
        this.f23798.clear();
        C3013 c3013 = this.f23796;
        c3013.m9227();
        c3013.m9234();
        EnumC12890 enumC12890 = f23791;
        EnumC12890 enumC12891 = EnumC12890.PREFER_SHOW_TITLE_ONLY;
        if (enumC12890 == enumC12891) {
            c3013.m9232(enumC12891, enumC12891);
        } else {
            c3013.m9232(f23791, EnumC12890.PREFER_SHOW_ALL);
        }
        m20609(1.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20605(EnumC12890 enumC12890) {
        f23791 = enumC12890;
        C4925.f15527.edit().mo25853(enumC12890.ordinal(), "fmst").apply();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static EnumC12890 m20606() {
        return f23791;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20610(int i) {
        new C12640(this.f23798.add(0, i, 0, i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12640 m20607(C16271 c16271, int i) {
        return new C12640(this.f23798.add(0, 0, i, c16271));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m20616() {
        return this.f23798.size() == 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m20614() {
        return this.f23796.m9233();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20609(float f) {
        this.f23796.m9228(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20611(int i, int i2) {
        ArrayList arrayListM20603 = m20603(this.f23798);
        C6083.sort(arrayListM20603, this.f23797);
        if (arrayListM20603.isEmpty()) {
            return;
        }
        Rect rect = this.f23794;
        rect.set(i, i2, i, i2);
        View view = this.f23799;
        int[] iArr = this.f23793;
        view.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        MenuItemOnMenuItemClickListenerC10524 menuItemOnMenuItemClickListenerC10524 = new MenuItemOnMenuItemClickListenerC10524(this);
        C3013 c3013 = this.f23796;
        c3013.m9230(arrayListM20603, menuItemOnMenuItemClickListenerC10524, rect);
        int i3 = this.f23792;
        if (i3 > 0) {
            c3013.m9229(i3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20604(C7701 c7701, MenuItem menuItem) {
        InterfaceC14050 interfaceC14050 = c7701.f23795;
        if (interfaceC14050 != null) {
            interfaceC14050.onMenuItemClick(menuItem);
        }
        c7701.f23796.m9227();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m20603(Menu menu) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; menu != null && i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(m20603(subMenu));
                } else {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20608() {
        this.f23796.m9227();
    }
}
