package p067l;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۘܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1039 extends C0899 {

    /* JADX INFO: renamed from: ۜ */
    public static Class f15408;

    /* JADX INFO: renamed from: ۡ */
    public static Field f15409;

    /* JADX INFO: renamed from: ۢ */
    public static Method f15410;

    /* JADX INFO: renamed from: ܺ */
    public static boolean f15411;

    /* JADX INFO: renamed from: ᩷ */
    public static Field f15412;

    /* JADX INFO: renamed from: ܳ */
    public C1914 f15413;

    /* JADX INFO: renamed from: ܽ */
    public C1388[] f15414;

    /* JADX INFO: renamed from: ܿ */
    public C1388 f15415;

    /* JADX INFO: renamed from: ᩳ */
    public final WindowInsets f15416;

    /* JADX INFO: renamed from: ᩻ */
    public C1388 f15417;

    public C1039(C1914 c1914, WindowInsets windowInsets) {
        super(c1914);
        this.f15417 = null;
        this.f15416 = windowInsets;
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ۡ */
    public boolean mo6179() {
        return this.f15416.isRound();
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public C1388 mo6173(int i) {
        return m13937(i, false);
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ۧ */
    public C1388 mo6181(int i) {
        return m13937(i, true);
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ܽ */
    public boolean mo6185(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0 && !m13942(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    private C1388 m13937(int i, boolean z) {
        C1388 c1388M29405 = C1388.f36101;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c1388M29405 = C1388.m29405(c1388M29405, m13940(i2, z));
            }
        }
        return c1388M29405;
    }

    /* JADX INFO: renamed from: ֫ */
    public C1388 m13940(int i, boolean z) {
        C1388 c1388M51180;
        int i2;
        C1098 c1098Mo6186;
        if (i == 1) {
            if (z) {
                return C1388.m29403(0, Math.max(m13939().f36105, mo6178().f36105), 0, 0);
            }
            return C1388.m29403(0, mo6178().f36105, 0, 0);
        }
        if (i == 2) {
            if (z) {
                C1388 c1388M13939 = m13939();
                C1388 c1388Mo6183 = mo6183();
                return C1388.m29403(Math.max(c1388M13939.f36103, c1388Mo6183.f36103), 0, Math.max(c1388M13939.f36104, c1388Mo6183.f36104), Math.max(c1388M13939.f36102, c1388Mo6183.f36102));
            }
            C1388 c1388Mo6178 = mo6178();
            C1914 c1914 = this.f15413;
            c1388M51180 = c1914 != null ? c1914.m51180() : null;
            int iMin = c1388Mo6178.f36102;
            if (c1388M51180 != null) {
                iMin = Math.min(iMin, c1388M51180.f36102);
            }
            return C1388.m29403(c1388Mo6178.f36103, 0, c1388Mo6178.f36104, iMin);
        }
        C1388 c1388 = C1388.f36101;
        if (i == 8) {
            C1388[] c1388Arr = this.f15414;
            c1388M51180 = c1388Arr != null ? c1388Arr[C1249.m23670(8)] : null;
            if (c1388M51180 != null) {
                return c1388M51180;
            }
            C1388 c1388Mo6179 = mo6178();
            C1388 c1388M139310 = m13939();
            int i3 = c1388Mo6179.f36102;
            if (i3 > c1388M139310.f36102) {
                return C1388.m29403(0, 0, 0, i3);
            }
            C1388 c1389 = this.f15415;
            return (c1389 == null || c1389.equals(c1388) || (i2 = this.f15415.f36102) <= c1388M139310.f36102) ? c1388 : C1388.m29403(0, 0, 0, i2);
        }
        if (i == 16) {
            return mo4377();
        }
        if (i == 32) {
            return mo4375();
        }
        if (i == 64) {
            return mo4376();
        }
        if (i != 128) {
            return c1388;
        }
        C1914 c1915 = this.f15413;
        if (c1915 != null) {
            c1098Mo6186 = c1915.m51181();
        } else {
            c1098Mo6186 = mo6186();
        }
        return c1098Mo6186 != null ? C1388.m29403(c1098Mo6186.m16650(), c1098Mo6186.m16652(), c1098Mo6186.m16651(), c1098Mo6186.m16649()) : c1388;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean m13942(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m13940(i, false).equals(C1388.f36101);
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ۜ */
    public final C1388 mo6178() {
        if (this.f15417 == null) {
            WindowInsets windowInsets = this.f15416;
            this.f15417 = C1388.m29403(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f15417;
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public C1914 mo4373(int i, int i2, int i3, int i4) {
        C2019 c2019 = new C2019(C1914.m51162(null, this.f15416));
        c2019.m54783(C1914.m51161(mo6178(), i, i2, i3, i4));
        c2019.m54782(C1914.m51161(mo6183(), i, i2, i3, i4));
        return c2019.m54780();
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public void mo6176(C1914 c1914) {
        this.f15413 = c1914;
    }

    /* JADX INFO: renamed from: ۧ */
    public void m13941(C1388 c1388) {
        this.f15415 = c1388;
    }

    /* JADX INFO: renamed from: ܺ */
    private C1388 m13939() {
        C1914 c1914 = this.f15413;
        if (c1914 != null) {
            return c1914.m51180();
        }
        return C1388.f36101;
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public void mo6175(View view) {
        C1388 c1388M13938 = m13938(view);
        if (c1388M13938 == null) {
            c1388M13938 = C1388.f36101;
        }
        m13941(c1388M13938);
    }

    /* JADX INFO: renamed from: ۧ */
    private C1388 m13938(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f15411) {
            m13936();
        }
        Method method = f15410;
        if (method != null && f15408 != null && f15409 != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke != null) {
                    Rect rect = (Rect) f15409.get(f15412.get(objInvoke));
                    if (rect != null) {
                        return C1388.m29403(rect.left, rect.top, rect.right, rect.bottom);
                    }
                }
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    @Override // p067l.C0899
    /* JADX INFO: renamed from: ֫ */
    public void mo6177(C1388[] c1388Arr) {
        this.f15414 = c1388Arr;
    }

    /* JADX INFO: renamed from: ۖ */
    public static void m13936() {
        try {
            f15410 = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f15408 = cls;
            f15409 = cls.getDeclaredField("mVisibleInsets");
            f15412 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f15409.setAccessible(true);
            f15412.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        f15411 = true;
    }

    @Override // p067l.C0899
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return C12826.equals(this.f15415, ((C1039) obj).f15415);
        }
        return false;
    }
}
