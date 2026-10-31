package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes2.dex */
public final class C1256 extends AbstractC15366 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f4449;

    public C1256(Method method) {
        this.f4449 = method;
    }

    @Override // l.AbstractC15366
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2296(Class cls) {
        String strM46638 = C20328.m46638(cls);
        if (strM46638 == null) {
            return this.f4449.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM46638));
    }
}
