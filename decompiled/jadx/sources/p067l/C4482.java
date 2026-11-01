package p067l;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۖ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W73L */
/* JADX INFO: loaded from: classes2.dex */
public final class C4482 {
    /* JADX INFO: renamed from: ᩳ */
    public static InterfaceC5823 m9489() {
        return C17221.f51260;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C20576 m9488() {
        return C10517.f29091;
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC5823 m9486() {
        try {
            return new C19905((WebViewProviderFactoryBoundaryInterface) C17680.m40207(WebViewProviderFactoryBoundaryInterface.class, m9487()));
        } catch (ClassNotFoundException unused) {
            return new C3811();
        } catch (IllegalAccessException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static InvocationHandler m9487() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = C24081.m53349();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }
}
