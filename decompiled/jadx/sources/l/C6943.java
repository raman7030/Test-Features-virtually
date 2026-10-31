package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۜᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes3.dex */
public final class C6943 extends C14703 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f21412;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f21413;

    public C6943(C0117 c0117, String str, Class cls, Class cls2, String str2) {
        super(c0117, str, cls, cls2, str2);
        this.f21412 = AbstractC4121.m12387(cls, C4860.m14172("get", str, "Bytes"), new Class[0]);
        this.f21413 = AbstractC4121.m12387(cls2, C4860.m14172("set", str, "Bytes"), AbstractC5886.class);
    }

    @Override // l.C14703, l.InterfaceC5804
    /* JADX INFO: renamed from: ܽ */
    public final Object mo16292(AbstractC4121 abstractC4121) {
        return AbstractC4121.m12386(this.f21412, abstractC4121, new Object[0]);
    }

    @Override // l.C14703, l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final void mo16287(AbstractC19916 abstractC19916, Object obj) {
        if (obj instanceof AbstractC5886) {
            AbstractC4121.m12386(this.f21413, abstractC19916, obj);
        } else {
            super.mo16287(abstractC19916, obj);
        }
    }
}
