package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܰۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes4.dex */
public final class C15259 implements InterfaceC23977 {

    /* JADX INFO: renamed from: ֫ */
    public final Method f43556;

    /* JADX INFO: renamed from: ۧ */
    public final Method f43557;

    /* JADX INFO: renamed from: ܽ */
    public final Method f43558;

    /* JADX INFO: renamed from: ᩳ */
    public final C19244 f43559;

    public C15259(C19244 c19244, String str, Class cls, Class cls2) {
        this.f43559 = c19244;
        this.f43556 = AbstractC6285.m14276(cls, C6988.m16053("get", str, "Case"), new Class[0]);
        this.f43557 = AbstractC6285.m14276(cls2, C6988.m16053("get", str, "Case"), new Class[0]);
        this.f43558 = AbstractC6285.m14276(cls2, C21466.m48631("clear", str), new Class[0]);
    }

    @Override // p067l.InterfaceC23977
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo34722(AbstractC6285 abstractC6285) {
        return ((InterfaceC5614) AbstractC6285.m14275(this.f43556, abstractC6285, new Object[0])).getNumber() != 0;
    }

    @Override // p067l.InterfaceC23977
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo34723(AbstractC21296 abstractC21296) {
        return ((InterfaceC5614) AbstractC6285.m14275(this.f43557, abstractC21296, new Object[0])).getNumber() != 0;
    }

    @Override // p067l.InterfaceC23977
    /* JADX INFO: renamed from: ֫ */
    public final C2479 mo34719(AbstractC6285 abstractC6285) {
        int number = ((InterfaceC5614) AbstractC6285.m14275(this.f43556, abstractC6285, new Object[0])).getNumber();
        if (number > 0) {
            return this.f43559.m43835(number);
        }
        return null;
    }

    @Override // p067l.InterfaceC23977
    /* JADX INFO: renamed from: ۧ */
    public final C2479 mo34721(AbstractC21296 abstractC21296) {
        int number = ((InterfaceC5614) AbstractC6285.m14275(this.f43557, abstractC21296, new Object[0])).getNumber();
        if (number > 0) {
            return this.f43559.m43835(number);
        }
        return null;
    }

    @Override // p067l.InterfaceC23977
    /* JADX INFO: renamed from: ֫ */
    public final void mo34720(AbstractC21296 abstractC21296) {
        AbstractC6285.m14275(this.f43558, abstractC21296, new Object[0]);
    }
}
