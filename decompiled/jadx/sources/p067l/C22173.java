package p067l;

import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.᩷ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANA */
/* JADX INFO: loaded from: classes5.dex */
public final class C22173 extends AbstractC18408 implements InterfaceC4387 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ClassLoader f70156;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22173(ClassLoader classLoader) {
        super(0);
        this.f70156 = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    @Override // p067l.InterfaceC4387
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6293() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        C6079 c6079 = C6079.f15287;
        c6079.getClass();
        Class<?> clsLoadClass = this.f70156.loadClass("androidx.window.extensions.layout.FoldingFeature");
        Method method = clsLoadClass.getMethod("getBounds", null);
        Method method2 = clsLoadClass.getMethod("getType", null);
        Method method3 = clsLoadClass.getMethod("getState", null);
        C13045.m29865(method, "getBoundsMethod");
        if (C6079.m13841(c6079, method, C9021.m20892(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
            C13045.m29865(method2, "getTypeMethod");
            Class cls = Integer.TYPE;
            if (C6079.m13841(c6079, method2, C9021.m20892(cls)) && Modifier.isPublic(method2.getModifiers())) {
                C13045.m29865(method3, "getStateMethod");
                if (C6079.m13841(c6079, method3, C9021.m20892(cls)) && Modifier.isPublic(method3.getModifiers())) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
