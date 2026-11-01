package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۜᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C8967 extends C16342 {

    /* JADX INFO: renamed from: ܳ */
    public final Method f24295;

    /* JADX INFO: renamed from: ᩻ */
    public final Method f24296;

    public C8967(C2479 c2479, String str, Class cls, Class cls2, String str2) {
        super(c2479, str, cls, cls2, str2);
        this.f24295 = AbstractC6285.m14276(cls, C6988.m16053("get", str, "Bytes"), new Class[0]);
        this.f24296 = AbstractC6285.m14276(cls2, C6988.m16053("set", str, "Bytes"), AbstractC7962.class);
    }

    @Override // p067l.C16342, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ܽ */
    public final Object mo18217(AbstractC6285 abstractC6285) {
        return AbstractC6285.m14275(this.f24295, abstractC6285, new Object[0]);
    }

    @Override // p067l.C16342, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18212(AbstractC21296 abstractC21296, Object obj) {
        if (obj instanceof AbstractC7962) {
            AbstractC6285.m14275(this.f24296, abstractC21296, obj);
        } else {
            super.mo18212(abstractC21296, obj);
        }
    }
}
