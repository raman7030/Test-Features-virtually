package p067l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.᩵ܽ */
/* JADX INFO: compiled from: O20A */
/* JADX INFO: loaded from: classes5.dex */
public final class C1813 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ۗ */
    public static Field f65883;

    /* JADX INFO: renamed from: ۙ */
    public static int f65884;

    /* JADX INFO: renamed from: ᩶ */
    public static Field f65885;

    /* JADX INFO: renamed from: ᩹ */
    public static Field f65886;

    /* JADX INFO: renamed from: ᩸ */
    public ActivityC2023 f65887;

    public C1813(ActivityC2023 activityC2023) {
        this.f65887 = activityC2023;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 != EnumC24133.ON_DESTROY) {
            return;
        }
        if (f65884 == 0) {
            try {
                f65884 = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f65883 = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f65885 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f65886 = declaredField3;
                declaredField3.setAccessible(true);
                f65884 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f65884 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f65887.getSystemService("input_method");
            try {
                Object obj = f65886.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f65883.get(inputMethodManager);
                            if (view != null) {
                                if (!view.isAttachedToWindow()) {
                                    try {
                                        f65885.set(inputMethodManager, null);
                                        inputMethodManager.isActive();
                                    } catch (IllegalAccessException unused2) {
                                    }
                                }
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
