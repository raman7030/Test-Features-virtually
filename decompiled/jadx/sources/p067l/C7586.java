package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۚܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes3.dex */
public final class C7586 extends AbstractC16972 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f19875;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ Method f19876;

    public C7586(Method method, int i) {
        this.f19876 = method;
        this.f19875 = i;
    }

    @Override // p067l.AbstractC16972
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4664(Class cls) {
        String strM48961 = C21688.m48961(cls);
        if (strM48961 == null) {
            return this.f19876.invoke(null, cls, Integer.valueOf(this.f19875));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM48961));
    }
}
