package p067l;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.ܺۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes5.dex */
public final class C17477 extends AbstractC18408 implements InterfaceC4387 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ClassLoader f52268;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17477(ClassLoader classLoader) {
        super(0);
        this.f52268 = classLoader;
    }

    @Override // p067l.InterfaceC4387
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6293() throws NoSuchMethodException, ClassNotFoundException {
        C6079.f15287.getClass();
        ClassLoader classLoader = this.f52268;
        Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
        Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
        C13045.m29865(declaredMethod, "getWindowExtensionsMethod");
        C13045.m29865(clsLoadClass, "windowExtensionsClass");
        return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass) && Modifier.isPublic(declaredMethod.getModifiers()));
    }
}
