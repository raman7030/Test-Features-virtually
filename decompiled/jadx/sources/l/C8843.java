package l;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes4.dex */
public final class C8843 extends AbstractC16876 implements InterfaceC2123 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ClassLoader f26926;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8843(ClassLoader classLoader) {
        super(0);
        this.f26926 = classLoader;
    }

    @Override // l.InterfaceC2123
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4049() throws NoSuchMethodException, ClassNotFoundException {
        C3904.f12479.getClass();
        Class<?> clsLoadClass = this.f26926.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        boolean z = false;
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        C11233.m27803(method, "addListenerMethod");
        if (Modifier.isPublic(method.getModifiers())) {
            C11233.m27803(method2, "removeListenerMethod");
            if (Modifier.isPublic(method2.getModifiers())) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
