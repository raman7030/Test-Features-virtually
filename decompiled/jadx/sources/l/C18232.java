package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ᩳᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes5.dex */
public final class C18232 extends C14703 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Method f56653;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f56654;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Method f56655;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9291 f56656;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Method f56657;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Method f56658;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f56659;

    public C18232(C0117 c0117, String str, Class cls, Class cls2, String str2) {
        super(c0117, str, cls, cls2, str2);
        this.f56656 = c0117.m1127();
        this.f56657 = AbstractC4121.m12387(this.f44908, "valueOf", C2235.class);
        this.f56659 = AbstractC4121.m12387(this.f44908, "getValueDescriptor", new Class[0]);
        boolean zM1135 = c0117.m1135();
        this.f56654 = !zM1135;
        if (zM1135) {
            return;
        }
        this.f56653 = AbstractC4121.m12387(cls, C4860.m14172("get", str, "Value"), new Class[0]);
        this.f56658 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "Value"), new Class[0]);
        this.f56655 = AbstractC4121.m12387(cls2, C4860.m14172("set", str, "Value"), Integer.TYPE);
    }

    @Override // l.C14703, l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16282(AbstractC4121 abstractC4121) {
        if (this.f56654) {
            return this.f56656.m23853(((Integer) AbstractC4121.m12386(this.f56653, abstractC4121, new Object[0])).intValue());
        }
        return AbstractC4121.m12386(this.f56659, this.f44907.m40962(abstractC4121), new Object[0]);
    }

    @Override // l.C14703, l.InterfaceC5804
    /* JADX INFO: renamed from: ۧ */
    public final Object mo16288(AbstractC19916 abstractC19916) {
        if (this.f56654) {
            return this.f56656.m23853(((Integer) AbstractC4121.m12386(this.f56658, abstractC19916, new Object[0])).intValue());
        }
        return AbstractC4121.m12386(this.f56659, this.f44907.m40966(abstractC19916), new Object[0]);
    }

    @Override // l.C14703, l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final void mo16287(AbstractC19916 abstractC19916, Object obj) {
        if (this.f56654) {
            AbstractC4121.m12386(this.f56655, abstractC19916, Integer.valueOf(((C2235) obj).getNumber()));
        } else {
            super.mo16287(abstractC19916, AbstractC4121.m12386(this.f56657, (Object) null, obj));
        }
    }
}
