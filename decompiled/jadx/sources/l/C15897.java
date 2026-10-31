package l;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.ܺۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15897 extends AbstractC16876 implements InterfaceC2123 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f49128;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15897(ClassLoader classLoader) {
        super(0);
        this.f49128 = classLoader;
    }

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4049() throws NoSuchMethodException, ClassNotFoundException {
        C3904.f12479.getClass();
        ClassLoader classLoader = this.f49128;
        Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
        Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.WindowExtensions");
        C11233.m27803(declaredMethod, "getWindowExtensionsMethod");
        C11233.m27803(clsLoadClass, "windowExtensionsClass");
        return Boolean.valueOf(declaredMethod.getReturnType().equals(clsLoadClass) && Modifier.isPublic(declaredMethod.getModifiers()));
    }
}
