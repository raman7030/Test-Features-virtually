package p067l;

import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: l.۠۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9DK */
/* JADX INFO: loaded from: classes3.dex */
public final class C10154 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m23664(C17972 c17972) {
        try {
            Class<?> cls = Class.forName("android.view.ViewTreeObserver$OnComputeInternalInsetsListener");
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C3448(c17972));
        } catch (Exception unused) {
            return null;
        }
    }
}
