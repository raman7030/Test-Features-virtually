package l;

import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C7215 extends C11177 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Method f22072;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Method f22073;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Method f22074;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Method f22075;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Method f22076;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9291 f22077;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f22078;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f22079;

    public C7215(C0117 c0117, String str, Class cls, Class cls2) {
        super(cls, cls2, str);
        this.f22077 = c0117.m1127();
        this.f22073 = AbstractC4121.m12387(this.f33547, "valueOf", C2235.class);
        this.f22079 = AbstractC4121.m12387(this.f33547, "getValueDescriptor", new Class[0]);
        boolean zM1135 = c0117.m1135();
        this.f22078 = !zM1135;
        if (zM1135) {
            return;
        }
        String strM14172 = C4860.m14172("get", str, "Value");
        Class cls3 = Integer.TYPE;
        this.f22076 = AbstractC4121.m12387(cls, strM14172, cls3);
        this.f22074 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "Value"), cls3);
        this.f22072 = AbstractC4121.m12387(cls2, C4860.m14172("set", str, "Value"), cls3, cls3);
        this.f22075 = AbstractC4121.m12387(cls2, C4860.m14172("add", str, "Value"), cls3);
    }

    @Override // l.C11177, l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16282(AbstractC4121 abstractC4121) {
        ArrayList arrayList = new ArrayList();
        int iM6545 = this.f33546.m6545(abstractC4121);
        for (int i = 0; i < iM6545; i++) {
            arrayList.add(mo16281(i, abstractC4121));
        }
        return C20195.unmodifiableList(arrayList);
    }

    @Override // l.C11177, l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final Object mo16288(AbstractC19916 abstractC19916) {
        ArrayList arrayList = new ArrayList();
        int iM6547 = this.f33546.m6547(abstractC19916);
        for (int i = 0; i < iM6547; i++) {
            arrayList.add(mo16289(abstractC19916, i));
        }
        return C20195.unmodifiableList(arrayList);
    }

    @Override // l.C11177, l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16281(int i, AbstractC4121 abstractC4121) {
        if (!this.f22078) {
            return AbstractC4121.m12386(this.f22079, this.f33546.m6539(i, abstractC4121), new Object[0]);
        }
        return this.f22077.m23853(((Integer) AbstractC4121.m12386(this.f22076, abstractC4121, Integer.valueOf(i))).intValue());
    }

    @Override // l.C11177, l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final Object mo16289(AbstractC19916 abstractC19916, int i) {
        if (!this.f22078) {
            return AbstractC4121.m12386(this.f22079, this.f33546.m6541(abstractC19916, i), new Object[0]);
        }
        return this.f22077.m23853(((Integer) AbstractC4121.m12386(this.f22074, abstractC19916, Integer.valueOf(i))).intValue());
    }

    @Override // l.C11177, l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final void mo16286(AbstractC19916 abstractC19916, int i, Object obj) {
        if (this.f22078) {
            AbstractC4121.m12386(this.f22072, abstractC19916, Integer.valueOf(i), Integer.valueOf(((C2235) obj).getNumber()));
        } else {
            super.mo16286(abstractC19916, i, AbstractC4121.m12386(this.f22073, (Object) null, obj));
        }
    }

    @Override // l.C11177, l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final void mo16290(AbstractC19916 abstractC19916, Object obj) {
        if (this.f22078) {
            AbstractC4121.m12386(this.f22075, abstractC19916, Integer.valueOf(((C2235) obj).getNumber()));
        } else {
            super.mo16290(abstractC19916, AbstractC4121.m12386(this.f22073, (Object) null, obj));
        }
    }
}
