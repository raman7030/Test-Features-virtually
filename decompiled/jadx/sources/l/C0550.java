package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֡ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes2.dex */
public final class C0550 extends AbstractC15366 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f2224;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f2225;

    public C0550(Object obj, Method method) {
        this.f2224 = method;
        this.f2225 = obj;
    }

    @Override // l.AbstractC15366
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2296(Class cls) {
        String strM46638 = C20328.m46638(cls);
        if (strM46638 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM46638));
        }
        return this.f2224.invoke(this.f2225, cls);
    }
}
