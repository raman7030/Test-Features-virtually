package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3562 extends AbstractC16972 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Method f7219;

    public C3562(Method method) {
        this.f7219 = method;
    }

    @Override // p067l.AbstractC16972
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4664(Class cls) {
        String strM48961 = C21688.m48961(cls);
        if (strM48961 == null) {
            return this.f7219.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM48961));
    }
}
