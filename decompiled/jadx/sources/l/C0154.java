package l;

import android.os.Build;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0154 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Method f1314;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Method f1315;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Method f1316;

    public C0154() {
        this.f1315 = null;
        this.f1314 = null;
        this.f1316 = null;
        m1253();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            this.f1315 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            this.f1314 = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f1316 = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1256(AutoCompleteTextView autoCompleteTextView) {
        m1253();
        Method method = this.f1315;
        if (method != null) {
            try {
                method.invoke(autoCompleteTextView, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1254(AutoCompleteTextView autoCompleteTextView) {
        m1253();
        Method method = this.f1314;
        if (method != null) {
            try {
                method.invoke(autoCompleteTextView, null);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1255(C14971 c14971) {
        m1253();
        Method method = this.f1316;
        if (method != null) {
            try {
                method.invoke(c14971, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1253() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
