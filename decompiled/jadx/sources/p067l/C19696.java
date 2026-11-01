package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ᩳᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C19696 extends C16342 {

    /* JADX INFO: renamed from: ۜ */
    public Method f59872;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f59873;

    /* JADX INFO: renamed from: ۢ */
    public Method f59874;

    /* JADX INFO: renamed from: ܳ */
    public final C11198 f59875;

    /* JADX INFO: renamed from: ܺ */
    public final Method f59876;

    /* JADX INFO: renamed from: ᩷ */
    public Method f59877;

    /* JADX INFO: renamed from: ᩻ */
    public final Method f59878;

    public C19696(C2479 c2479, String str, Class cls, Class cls2, String str2) {
        super(c2479, str, cls, cls2, str2);
        this.f59875 = c2479.m3528();
        this.f59876 = AbstractC6285.m14276(this.f48022, "valueOf", C4492.class);
        this.f59878 = AbstractC6285.m14276(this.f48022, "getValueDescriptor", new Class[0]);
        boolean zM3536 = c2479.m3536();
        this.f59873 = !zM3536;
        if (zM3536) {
            return;
        }
        this.f59872 = AbstractC6285.m14276(cls, C6988.m16053("get", str, "Value"), new Class[0]);
        this.f59877 = AbstractC6285.m14276(cls2, C6988.m16053("get", str, "Value"), new Class[0]);
        this.f59874 = AbstractC6285.m14276(cls2, C6988.m16053("set", str, "Value"), Integer.TYPE);
    }

    @Override // p067l.C16342, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18207(AbstractC6285 abstractC6285) {
        if (this.f59873) {
            return this.f59875.m25862(((Integer) AbstractC6285.m14275(this.f59872, abstractC6285, new Object[0])).intValue());
        }
        return AbstractC6285.m14275(this.f59878, this.f48021.m43221(abstractC6285), new Object[0]);
    }

    @Override // p067l.C16342, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final Object mo18213(AbstractC21296 abstractC21296) {
        if (this.f59873) {
            return this.f59875.m25862(((Integer) AbstractC6285.m14275(this.f59877, abstractC21296, new Object[0])).intValue());
        }
        return AbstractC6285.m14275(this.f59878, this.f48021.m43225(abstractC21296), new Object[0]);
    }

    @Override // p067l.C16342, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18212(AbstractC21296 abstractC21296, Object obj) {
        if (this.f59873) {
            AbstractC6285.m14275(this.f59874, abstractC21296, Integer.valueOf(((C4492) obj).getNumber()));
        } else {
            super.mo18212(abstractC21296, AbstractC6285.m14275(this.f59876, (Object) null, obj));
        }
    }
}
