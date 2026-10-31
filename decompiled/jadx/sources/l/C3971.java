package l;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3971 extends C1148 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static Class f12597;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static Field f12598;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static Method f12599;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f12600;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Field f12601;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21610 f12602;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11007[] f12603;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11007 f12604;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final WindowInsets f12605;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11007 f12606;

    public C3971(C21610 c21610, WindowInsets windowInsets) {
        super(c21610);
        this.f12606 = null;
        this.f12605 = windowInsets;
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ۡ */
    public boolean mo3938() {
        return this.f12605.isRound();
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ֫ */
    public C11007 mo3932(int i) {
        return m12013(i, false);
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ۧ */
    public C11007 mo3940(int i) {
        return m12013(i, true);
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ܽ */
    public boolean mo3944(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0 && !m12018(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C11007 m12013(int i, boolean z) {
        C11007 c11007M27343 = C11007.f33107;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c11007M27343 = C11007.m27343(c11007M27343, m12016(i2, z));
            }
        }
        return c11007M27343;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11007 m12016(int i, boolean z) {
        C11007 c11007M48832;
        int i2;
        C5157 c5157Mo3945;
        if (i == 1) {
            if (z) {
                return C11007.m27341(0, Math.max(m12015().f33111, mo3937().f33111), 0, 0);
            }
            return C11007.m27341(0, mo3937().f33111, 0, 0);
        }
        if (i == 2) {
            if (z) {
                C11007 c11007M12015 = m12015();
                C11007 c11007Mo3942 = mo3942();
                return C11007.m27341(Math.max(c11007M12015.f33109, c11007Mo3942.f33109), 0, Math.max(c11007M12015.f33110, c11007Mo3942.f33110), Math.max(c11007M12015.f33108, c11007Mo3942.f33108));
            }
            C11007 c11007Mo3937 = mo3937();
            C21610 c21610 = this.f12602;
            c11007M48832 = c21610 != null ? c21610.m48832() : null;
            int iMin = c11007Mo3937.f33108;
            if (c11007M48832 != null) {
                iMin = Math.min(iMin, c11007M48832.f33108);
            }
            return C11007.m27341(c11007Mo3937.f33109, 0, c11007Mo3937.f33110, iMin);
        }
        C11007 c11007 = C11007.f33107;
        if (i == 8) {
            C11007[] c11007Arr = this.f12603;
            c11007M48832 = c11007Arr != null ? c11007Arr[C8204.m21701(8)] : null;
            if (c11007M48832 != null) {
                return c11007M48832;
            }
            C11007 c11007Mo3938 = mo3937();
            C11007 c11007M12016 = m12015();
            int i3 = c11007Mo3938.f33108;
            if (i3 > c11007M12016.f33108) {
                return C11007.m27341(0, 0, 0, i3);
            }
            C11007 c11008 = this.f12604;
            return (c11008 == null || c11008.equals(c11007) || (i2 = this.f12604.f33108) <= c11007M12016.f33108) ? c11007 : C11007.m27341(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo2001();
        }
        if (i == 32) {
            return mo1999();
        }
        if (i == 64) {
            return mo2000();
        }
        if (i != 128) {
            return c11007;
        }
        C21610 c21611 = this.f12602;
        if (c21611 != null) {
            c5157Mo3945 = c21611.m48833();
        } else {
            c5157Mo3945 = mo3945();
        }
        return c5157Mo3945 != null ? C11007.m27341(c5157Mo3945.m14742(), c5157Mo3945.m14744(), c5157Mo3945.m14743(), c5157Mo3945.m14741()) : c11007;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m12018(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m12016(i, false).equals(C11007.f33107);
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ۜ */
    public final C11007 mo3937() {
        if (this.f12606 == null) {
            WindowInsets windowInsets = this.f12605;
            this.f12606 = C11007.m27341(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f12606;
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ֫ */
    public C21610 mo1997(int i, int i2, int i3, int i4) {
        C23726 c23726 = new C23726(C21610.m48814(null, this.f12605));
        c23726.m52376(C21610.m48813(mo3937(), i, i2, i3, i4));
        c23726.m52375(C21610.m48813(mo3942(), i, i2, i3, i4));
        return c23726.m52373();
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ֫ */
    public void mo3935(C21610 c21610) {
        this.f12602 = c21610;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m12017(C11007 c11007) {
        this.f12604 = c11007;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private C11007 m12015() {
        C21610 c21610 = this.f12602;
        if (c21610 != null) {
            return c21610.m48832();
        }
        return C11007.f33107;
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ֫ */
    public void mo3934(View view) {
        C11007 c11007M12014 = m12014(view);
        if (c11007M12014 == null) {
            c11007M12014 = C11007.f33107;
        }
        m12017(c11007M12014);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C11007 m12014(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f12600) {
            m12012();
        }
        Method method = f12599;
        if (method != null && f12597 != null && f12598 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) f12598.get(f12601.get(objInvoke));
                    if (rect != null) {
                        return C11007.m27341(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ֫ */
    public void mo3936(C11007[] c11007Arr) {
        this.f12603 = c11007Arr;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m12012() {
        try {
            f12599 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f12597 = cls;
            f12598 = cls.getDeclaredField("mVisibleInsets");
            f12601 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f12598.setAccessible(true);
            f12601.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        f12600 = true;
    }

    @Override // l.C1148
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return C11003.equals(this.f12604, ((C3971) obj).f12604);
        }
        return false;
    }
}
