package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܿᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public final class C19025 {

    /* JADX INFO: renamed from: ֫ */
    public final Method f56715;

    /* JADX INFO: renamed from: ۜ */
    public final Method f56716;

    /* JADX INFO: renamed from: ۧ */
    public final Method f56717;

    /* JADX INFO: renamed from: ܳ */
    public final Method f56718;

    /* JADX INFO: renamed from: ܽ */
    public final Method f56719;

    /* JADX INFO: renamed from: ܿ */
    public final Method f56720;

    /* JADX INFO: renamed from: ᩳ */
    public final Method f56721;

    /* JADX INFO: renamed from: ᩻ */
    public final Method f56722;

    public C19025(String str, Class cls, Class cls2, String str2, boolean z, boolean z2) {
        Method methodM14276 = AbstractC6285.m14276(cls, C21466.m48631("get", str), new Class[0]);
        this.f56721 = methodM14276;
        this.f56720 = AbstractC6285.m14276(cls2, C21466.m48631("get", str), new Class[0]);
        this.f56716 = AbstractC6285.m14276(cls2, C21466.m48631("set", str), methodM14276.getReturnType());
        this.f56718 = z2 ? AbstractC6285.m14276(cls, C21466.m48631("has", str), new Class[0]) : null;
        this.f56722 = z2 ? AbstractC6285.m14276(cls2, C21466.m48631("has", str), new Class[0]) : null;
        this.f56719 = AbstractC6285.m14276(cls2, C21466.m48631("clear", str), new Class[0]);
        this.f56715 = z ? AbstractC6285.m14276(cls, C6988.m16053("get", str2, "Case"), new Class[0]) : null;
        this.f56717 = z ? AbstractC6285.m14276(cls2, C6988.m16053("get", str2, "Case"), new Class[0]) : null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m43221(AbstractC6285 abstractC6285) {
        return AbstractC6285.m14275(this.f56721, abstractC6285, new Object[0]);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m43225(AbstractC21296 abstractC21296) {
        return AbstractC6285.m14275(this.f56720, abstractC21296, new Object[0]);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m43224(AbstractC6285 abstractC6285) {
        return ((InterfaceC5614) AbstractC6285.m14275(this.f56715, abstractC6285, new Object[0])).getNumber();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m43226(AbstractC21296 abstractC21296) {
        return ((InterfaceC5614) AbstractC6285.m14275(this.f56717, abstractC21296, new Object[0])).getNumber();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43223(AbstractC21296 abstractC21296, Object obj) {
        AbstractC6285.m14275(this.f56716, abstractC21296, obj);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m43227(AbstractC6285 abstractC6285) {
        return ((Boolean) AbstractC6285.m14275(this.f56718, abstractC6285, new Object[0])).booleanValue();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m43228(AbstractC21296 abstractC21296) {
        return ((Boolean) AbstractC6285.m14275(this.f56722, abstractC21296, new Object[0])).booleanValue();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43222(AbstractC21296 abstractC21296) {
        AbstractC6285.m14275(this.f56719, abstractC21296, new Object[0]);
    }
}
