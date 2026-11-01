package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֫ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes2.dex */
public final class C4273 {

    /* JADX INFO: renamed from: ֫ */
    public final Method f9487;

    /* JADX INFO: renamed from: ۜ */
    public final Method f9488;

    /* JADX INFO: renamed from: ۧ */
    public final Method f9489;

    /* JADX INFO: renamed from: ܳ */
    public final Method f9490;

    /* JADX INFO: renamed from: ܽ */
    public final Method f9491;

    /* JADX INFO: renamed from: ܿ */
    public final Method f9492;

    /* JADX INFO: renamed from: ᩳ */
    public final Method f9493;

    /* JADX INFO: renamed from: ᩷ */
    public final Method f9494;

    /* JADX INFO: renamed from: ᩻ */
    public final Method f9495;

    public C4273(Class cls, Class cls2, String str) {
        this.f9492 = AbstractC6285.m14276(cls, C6988.m16053("get", str, "List"), new Class[0]);
        this.f9490 = AbstractC6285.m14276(cls2, C6988.m16053("get", str, "List"), new Class[0]);
        String strM48631 = C21466.m48631("get", str);
        Class cls3 = Integer.TYPE;
        Method methodM14276 = AbstractC6285.m14276(cls, strM48631, cls3);
        this.f9495 = methodM14276;
        this.f9488 = AbstractC6285.m14276(cls2, C21466.m48631("get", str), cls3);
        Class<?> returnType = methodM14276.getReturnType();
        this.f9494 = AbstractC6285.m14276(cls2, C21466.m48631("set", str), cls3, returnType);
        this.f9487 = AbstractC6285.m14276(cls2, C21466.m48631("add", str), returnType);
        this.f9491 = AbstractC6285.m14276(cls, C6988.m16053("get", str, "Count"), new Class[0]);
        this.f9493 = AbstractC6285.m14276(cls2, C6988.m16053("get", str, "Count"), new Class[0]);
        this.f9489 = AbstractC6285.m14276(cls2, C21466.m48631("clear", str), new Class[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m8682(AbstractC6285 abstractC6285) {
        return AbstractC6285.m14275(this.f9492, abstractC6285, new Object[0]);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m8688(AbstractC21296 abstractC21296) {
        return AbstractC6285.m14275(this.f9490, abstractC21296, new Object[0]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m8681(int i, AbstractC6285 abstractC6285) {
        return AbstractC6285.m14275(this.f9495, abstractC6285, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m8683(AbstractC21296 abstractC21296, int i) {
        return AbstractC6285.m14275(this.f9488, abstractC21296, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8685(AbstractC21296 abstractC21296, int i, Object obj) {
        AbstractC6285.m14275(this.f9494, abstractC21296, Integer.valueOf(i), obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8686(AbstractC21296 abstractC21296, Object obj) {
        AbstractC6285.m14275(this.f9487, abstractC21296, obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m8687(AbstractC6285 abstractC6285) {
        return ((Integer) AbstractC6285.m14275(this.f9491, abstractC6285, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m8689(AbstractC21296 abstractC21296) {
        return ((Integer) AbstractC6285.m14275(this.f9493, abstractC21296, new Object[0])).intValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8684(AbstractC21296 abstractC21296) {
        AbstractC6285.m14275(this.f9489, abstractC21296, new Object[0]);
    }
}
