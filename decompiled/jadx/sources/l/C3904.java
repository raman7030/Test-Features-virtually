package l;

import android.os.Build;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۘۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3904 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C3904 f12479 = new C3904();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17230 f12480 = C14407.m34431(C2493.f7944);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m11904(C3904 c3904, ClassLoader classLoader) {
        c3904.getClass();
        return Build.VERSION.SDK_INT >= 24 && m11903(new C15897(classLoader)) && m11903(new C9549(classLoader)) && m11903(new C8843(classLoader)) && m11903(new C20838(classLoader));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m11905(C3904 c3904, Method method, C6356 c6356) {
        c3904.getClass();
        Class clsMo17650 = c6356.mo17650();
        C11233.m27800((Object) clsMo17650, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(clsMo17650);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static WindowLayoutComponent m11902() {
        return (WindowLayoutComponent) f12480.getValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11903(InterfaceC2123 interfaceC2123) {
        try {
            return ((Boolean) interfaceC2123.mo4049()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }
}
