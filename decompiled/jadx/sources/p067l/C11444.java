package p067l;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.ۢۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes4.dex */
public final class C11444 extends AbstractC18408 implements InterfaceC4387 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ClassLoader f31911;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11444(ClassLoader classLoader) {
        super(0);
        this.f31911 = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003a  */
    @Override // p067l.InterfaceC4387
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6293() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        C6079.f15287.getClass();
        ClassLoader classLoader = this.f31911;
        Method method = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", null);
        Class<?> clsLoadClass = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C13045.m29865(method, "getWindowLayoutComponentMethod");
        if (Modifier.isPublic(method.getModifiers())) {
            C13045.m29865(clsLoadClass, "windowLayoutComponentClass");
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
