package l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O20A */
/* JADX INFO: loaded from: classes5.dex */
public final class C19577 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static Field f63266;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int f63267;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Field f63268;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Field f63269;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ActivityC23809 f63270;

    public C19577(ActivityC23809 activityC23809) {
        this.f63270 = activityC23809;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 != EnumC22901.ON_DESTROY) {
            return;
        }
        if (f63267 == 0) {
            try {
                f63267 = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f63266 = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f63268 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f63269 = declaredField3;
                declaredField3.setAccessible(true);
                f63267 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f63267 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f63270.getSystemService("input_method");
            try {
                Object obj = f63269.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f63266.get(inputMethodManager);
                            if (view != null) {
                                if (!view.isAttachedToWindow()) {
                                    try {
                                        f63268.set(inputMethodManager, null);
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
