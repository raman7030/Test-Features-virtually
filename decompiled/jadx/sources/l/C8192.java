package l;

import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: l.۠۬ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9DK */
/* JADX INFO: loaded from: classes3.dex */
public final class C8192 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m21695(C16418 c16418) {
        try {
            Class<?> cls = Class.forName("android.view.ViewTreeObserver$OnComputeInternalInsetsListener");
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C1136(c16418));
        } catch (Exception unused) {
            return null;
        }
    }
}
