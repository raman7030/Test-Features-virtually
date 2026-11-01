package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes2.dex */
public final class C2891 extends AbstractC16972 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ Method f4998;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ Object f4999;

    public C2891(Object obj, Method method) {
        this.f4998 = method;
        this.f4999 = obj;
    }

    @Override // p067l.AbstractC16972
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4664(Class cls) {
        String strM48961 = C21688.m48961(cls);
        if (strM48961 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM48961));
        }
        return this.f4998.invoke(this.f4999, cls);
    }
}
