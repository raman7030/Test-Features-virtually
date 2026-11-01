package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩻ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes.dex */
public final class C25060 extends C16342 {

    /* JADX INFO: renamed from: ܳ */
    public final Method f79957;

    /* JADX INFO: renamed from: ᩻ */
    public final Method f79958;

    public C25060(C2479 c2479, String str, Class cls, Class cls2, String str2) {
        super(c2479, str, cls, cls2, str2);
        this.f79958 = AbstractC6285.m14276(this.f48022, "newBuilder", new Class[0]);
        this.f79957 = AbstractC6285.m14276(cls2, C6988.m16053("get", str, "Builder"), new Class[0]);
    }

    @Override // p067l.C16342, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18212(AbstractC21296 abstractC21296, Object obj) {
        if (!this.f48022.isInstance(obj)) {
            obj = ((InterfaceC15830) AbstractC6285.m14275(this.f79958, (Object) null, new Object[0])).mergeFrom((InterfaceC24548) obj).buildPartial();
        }
        super.mo18212(abstractC21296, obj);
    }

    @Override // p067l.C16342, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15830 mo18208() {
        return (InterfaceC15830) AbstractC6285.m14275(this.f79958, (Object) null, new Object[0]);
    }

    @Override // p067l.C16342, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC15830 mo18221(AbstractC21296 abstractC21296) {
        return (InterfaceC15830) AbstractC6285.m14275(this.f79957, abstractC21296, new Object[0]);
    }
}
