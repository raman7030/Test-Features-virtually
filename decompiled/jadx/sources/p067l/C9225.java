package p067l;

import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C9225 extends C12991 {

    /* JADX INFO: renamed from: ۜ */
    public Method f24957;

    /* JADX INFO: renamed from: ۢ */
    public final Method f24958;

    /* JADX INFO: renamed from: ܳ */
    public Method f24959;

    /* JADX INFO: renamed from: ܽ */
    public Method f24960;

    /* JADX INFO: renamed from: ܿ */
    public Method f24961;

    /* JADX INFO: renamed from: ᩳ */
    public final C11198 f24962;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f24963;

    /* JADX INFO: renamed from: ᩻ */
    public final Method f24964;

    public C9225(C2479 c2479, String str, Class cls, Class cls2) {
        super(cls, cls2, str);
        this.f24962 = c2479.m3528();
        this.f24958 = AbstractC6285.m14276(this.f36548, "valueOf", C4492.class);
        this.f24964 = AbstractC6285.m14276(this.f36548, "getValueDescriptor", new Class[0]);
        boolean zM3536 = c2479.m3536();
        this.f24963 = !zM3536;
        if (zM3536) {
            return;
        }
        String strM16053 = C6988.m16053("get", str, "Value");
        Class cls3 = Integer.TYPE;
        this.f24961 = AbstractC6285.m14276(cls, strM16053, cls3);
        this.f24959 = AbstractC6285.m14276(cls2, C6988.m16053("get", str, "Value"), cls3);
        this.f24957 = AbstractC6285.m14276(cls2, C6988.m16053("set", str, "Value"), cls3, cls3);
        this.f24960 = AbstractC6285.m14276(cls2, C6988.m16053("add", str, "Value"), cls3);
    }

    @Override // p067l.C12991, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18207(AbstractC6285 abstractC6285) {
        ArrayList arrayList = new ArrayList();
        int iM8687 = this.f36547.m8687(abstractC6285);
        for (int i = 0; i < iM8687; i++) {
            arrayList.add(mo18206(i, abstractC6285));
        }
        return C21562.unmodifiableList(arrayList);
    }

    @Override // p067l.C12991, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final Object mo18213(AbstractC21296 abstractC21296) {
        ArrayList arrayList = new ArrayList();
        int iM8689 = this.f36547.m8689(abstractC21296);
        for (int i = 0; i < iM8689; i++) {
            arrayList.add(mo18214(abstractC21296, i));
        }
        return C21562.unmodifiableList(arrayList);
    }

    @Override // p067l.C12991, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18206(int i, AbstractC6285 abstractC6285) {
        if (!this.f24963) {
            return AbstractC6285.m14275(this.f24964, this.f36547.m8681(i, abstractC6285), new Object[0]);
        }
        return this.f24962.m25862(((Integer) AbstractC6285.m14275(this.f24961, abstractC6285, Integer.valueOf(i))).intValue());
    }

    @Override // p067l.C12991, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final Object mo18214(AbstractC21296 abstractC21296, int i) {
        if (!this.f24963) {
            return AbstractC6285.m14275(this.f24964, this.f36547.m8683(abstractC21296, i), new Object[0]);
        }
        return this.f24962.m25862(((Integer) AbstractC6285.m14275(this.f24959, abstractC21296, Integer.valueOf(i))).intValue());
    }

    @Override // p067l.C12991, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ֫ */
    public final void mo18211(AbstractC21296 abstractC21296, int i, Object obj) {
        if (this.f24963) {
            AbstractC6285.m14275(this.f24957, abstractC21296, Integer.valueOf(i), Integer.valueOf(((C4492) obj).getNumber()));
        } else {
            super.mo18211(abstractC21296, i, AbstractC6285.m14275(this.f24958, (Object) null, obj));
        }
    }

    @Override // p067l.C12991, p067l.InterfaceC7884
    /* JADX INFO: renamed from: ۧ */
    public final void mo18215(AbstractC21296 abstractC21296, Object obj) {
        if (this.f24963) {
            AbstractC6285.m14275(this.f24960, abstractC21296, Integer.valueOf(((C4492) obj).getNumber()));
        } else {
            super.mo18215(abstractC21296, AbstractC6285.m14275(this.f24958, (Object) null, obj));
        }
    }
}
