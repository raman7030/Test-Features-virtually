package l;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۖ֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W73L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2224 {
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC3635 m7406() {
        return C15628.f48121;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C19158 m7405() {
        return C8574.f26175;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC3635 m7403() {
        try {
            return new C18452((WebViewProviderFactoryBoundaryInterface) C16111.m38016(WebViewProviderFactoryBoundaryInterface.class, m7404()));
        } catch (ClassNotFoundException unused) {
            return new C1518();
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InvocationHandler m7404() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = C22846.m50959();
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
