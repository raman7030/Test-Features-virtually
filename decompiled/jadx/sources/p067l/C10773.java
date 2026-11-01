package p067l;

import android.app.Activity;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes4.dex */
public final class C10773 extends AbstractC18408 implements InterfaceC4387 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ClassLoader f29850;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10773(ClassLoader classLoader) {
        super(0);
        this.f29850 = classLoader;
    }

    @Override // p067l.InterfaceC4387
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6293() throws NoSuchMethodException, ClassNotFoundException {
        C6079.f15287.getClass();
        Class<?> clsLoadClass = this.f29850.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        boolean z = false;
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        C13045.m29865(method, "addListenerMethod");
        if (Modifier.isPublic(method.getModifiers())) {
            C13045.m29865(method2, "removeListenerMethod");
            if (Modifier.isPublic(method2.getModifiers())) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
