package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֫ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes2.dex */
public final class C2004 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f6700;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Method f6701;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Method f6702;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f6703;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Method f6704;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Method f6705;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Method f6706;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Method f6707;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f6708;

    public C2004(Class cls, Class cls2, String str) {
        this.f6705 = AbstractC4121.m12387(cls, C4860.m14172("get", str, "List"), new Class[0]);
        this.f6703 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "List"), new Class[0]);
        String strM46315 = C20094.m46315("get", str);
        Class cls3 = Integer.TYPE;
        Method methodM12387 = AbstractC4121.m12387(cls, strM46315, cls3);
        this.f6708 = methodM12387;
        this.f6701 = AbstractC4121.m12387(cls2, C20094.m46315("get", str), cls3);
        Class<?> returnType = methodM12387.getReturnType();
        this.f6707 = AbstractC4121.m12387(cls2, C20094.m46315("set", str), cls3, returnType);
        this.f6700 = AbstractC4121.m12387(cls2, C20094.m46315("add", str), returnType);
        this.f6704 = AbstractC4121.m12387(cls, C4860.m14172("get", str, "Count"), new Class[0]);
        this.f6706 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "Count"), new Class[0]);
        this.f6702 = AbstractC4121.m12387(cls2, C20094.m46315("clear", str), new Class[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m6540(AbstractC4121 abstractC4121) {
        return AbstractC4121.m12386(this.f6705, abstractC4121, new Object[0]);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m6546(AbstractC19916 abstractC19916) {
        return AbstractC4121.m12386(this.f6703, abstractC19916, new Object[0]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m6539(int i, AbstractC4121 abstractC4121) {
        return AbstractC4121.m12386(this.f6708, abstractC4121, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m6541(AbstractC19916 abstractC19916, int i) {
        return AbstractC4121.m12386(this.f6701, abstractC19916, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6543(AbstractC19916 abstractC19916, int i, Object obj) {
        AbstractC4121.m12386(this.f6707, abstractC19916, Integer.valueOf(i), obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6544(AbstractC19916 abstractC19916, Object obj) {
        AbstractC4121.m12386(this.f6700, abstractC19916, obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m6545(AbstractC4121 abstractC4121) {
        return ((Integer) AbstractC4121.m12386(this.f6704, abstractC4121, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m6547(AbstractC19916 abstractC19916) {
        return ((Integer) AbstractC4121.m12386(this.f6706, abstractC19916, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6542(AbstractC19916 abstractC19916) {
        AbstractC4121.m12386(this.f6702, abstractC19916, new Object[0]);
    }
}
