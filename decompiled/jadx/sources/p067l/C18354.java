package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܽᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C18354 extends C12991 {

    /* JADX INFO: renamed from: ܽ */
    public final Method f54802;

    /* JADX INFO: renamed from: ᩳ */
    public final Method f54803;

    public C18354(Class cls, Class cls2, String str) {
        super(cls, cls2, str);
        this.f54803 = AbstractC6285.m14276(this.f36548, "newBuilder", new Class[0]);
        this.f54802 = AbstractC6285.m14276(cls2, C6988.m16053("get", str, "Builder"), Integer.TYPE);
    }

    @Override // p067l.C12991, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18211(AbstractC21296 abstractC21296, int i, Object obj) {
        if (!this.f36548.isInstance(obj)) {
            obj = ((InterfaceC15830) AbstractC6285.m14275(this.f54803, (Object) null, new Object[0])).mergeFrom((InterfaceC24548) obj).build();
        }
        super.mo18211(abstractC21296, i, obj);
    }

    @Override // p067l.C12991, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final void mo18215(AbstractC21296 abstractC21296, Object obj) {
        if (!this.f36548.isInstance(obj)) {
            obj = ((InterfaceC15830) AbstractC6285.m14275(this.f54803, (Object) null, new Object[0])).mergeFrom((InterfaceC24548) obj).build();
        }
        super.mo18215(abstractC21296, obj);
    }

    @Override // p067l.C12991, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15830 mo18208() {
        return (InterfaceC15830) AbstractC6285.m14275(this.f54803, (Object) null, new Object[0]);
    }

    @Override // p067l.C12991, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15830 mo18209(AbstractC21296 abstractC21296, int i) {
        return (InterfaceC15830) AbstractC6285.m14275(this.f54802, abstractC21296, Integer.valueOf(i));
    }
}
