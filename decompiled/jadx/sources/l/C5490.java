package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۚܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A87D */
/* JADX INFO: loaded from: classes3.dex */
public final class C5490 extends AbstractC15366 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17035;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Method f17036;

    public C5490(Method method, int i) {
        this.f17036 = method;
        this.f17035 = i;
    }

    @Override // l.AbstractC15366
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2296(Class cls) {
        String strM46638 = C20328.m46638(cls);
        if (strM46638 == null) {
            return this.f17036.invoke(null, cls, Integer.valueOf(this.f17035));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM46638));
    }
}
