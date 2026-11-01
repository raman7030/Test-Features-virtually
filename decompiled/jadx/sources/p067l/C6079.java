package p067l;

import android.os.Build;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۘۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes2.dex */
public final class C6079 {

    /* JADX INFO: renamed from: ֫ */
    public static final C6079 f15287 = new C6079();

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC18744 f15288 = C16061.m36565(C4738.f10732);

    /* JADX INFO: renamed from: ֫ */
    public static final boolean m13840(C6079 c6079, ClassLoader classLoader) {
        c6079.getClass();
        return Build.VERSION.SDK_INT >= 24 && m13839(new C17477(classLoader)) && m13839(new C11444(classLoader)) && m13839(new C10773(classLoader)) && m13839(new C22173(classLoader));
    }

    /* JADX INFO: renamed from: ֫ */
    public static final boolean m13841(C6079 c6079, Method method, C8410 c8410) {
        c6079.getClass();
        Class clsMo19593 = c8410.mo19593();
        C13045.m29862((Object) clsMo19593, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(clsMo19593);
    }

    /* JADX INFO: renamed from: ֫ */
    public static WindowLayoutComponent m13838() {
        return (WindowLayoutComponent) f15288.getValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m13839(InterfaceC4387 interfaceC4387) {
        try {
            return ((Boolean) interfaceC4387.mo6293()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }
}
