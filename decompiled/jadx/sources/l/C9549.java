package l;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.ۢۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes4.dex */
public final class C9549 extends AbstractC16876 implements InterfaceC2123 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f28965;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9549(ClassLoader classLoader) {
        super(0);
        this.f28965 = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003a  */
    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4049() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        C3904.f12479.getClass();
        ClassLoader classLoader = this.f28965;
        Method method = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
        Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C11233.m27803(method, "getWindowLayoutComponentMethod");
        if (Modifier.isPublic(method.getModifiers())) {
            C11233.m27803(clsLoadClass, "windowLayoutComponentClass");
            if (method.getReturnType().equals(clsLoadClass)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
