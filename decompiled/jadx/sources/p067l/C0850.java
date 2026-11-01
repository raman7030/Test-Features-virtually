package p067l;

import android.os.Build;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡ۘ */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0850 {

    /* JADX INFO: renamed from: ֫ */
    public Method f4089;

    /* JADX INFO: renamed from: ۧ */
    public Method f4090;

    /* JADX INFO: renamed from: ܽ */
    public Method f4091;

    public C0850() {
        this.f4090 = null;
        this.f4089 = null;
        this.f4091 = null;
        m3661();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            this.f4090 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            this.f4089 = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f4091 = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m3664(AutoCompleteTextView autoCompleteTextView) {
        m3661();
        Method method = this.f4090;
        if (method != null) {
            try {
                method.invoke(autoCompleteTextView, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3662(AutoCompleteTextView autoCompleteTextView) {
        m3661();
        Method method = this.f4089;
        if (method != null) {
            try {
                method.invoke(autoCompleteTextView, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m3663(C1585 c1585) {
        m3661();
        Method method = this.f4091;
        if (method != null) {
            try {
                method.invoke(c1585, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3661() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
