package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩻ᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X93U */
/* JADX INFO: loaded from: classes.dex */
public final class C23876 extends C14703 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Method f77205;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Method f77206;

    public C23876(C0117 c0117, String str, Class cls, Class cls2, String str2) {
        super(c0117, str, cls, cls2, str2);
        this.f77206 = AbstractC4121.m12387(this.f44908, "newBuilder", new Class[0]);
        this.f77205 = AbstractC4121.m12387(cls2, C4860.m14172("get", str, "Builder"), new Class[0]);
    }

    @Override // l.C14703, l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final void mo16287(AbstractC19916 abstractC19916, Object obj) {
        if (!this.f44908.isInstance(obj)) {
            obj = ((InterfaceC14165) AbstractC4121.m12386(this.f77206, (Object) null, new Object[0])).mergeFrom((InterfaceC23338) obj).buildPartial();
        }
        super.mo16287(abstractC19916, obj);
    }

    @Override // l.C14703, l.InterfaceC5804
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14165 mo16283() {
        return (InterfaceC14165) AbstractC4121.m12386(this.f77206, (Object) null, new Object[0]);
    }

    @Override // l.C14703, l.InterfaceC5804
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC14165 mo16296(AbstractC19916 abstractC19916) {
        return (InterfaceC14165) AbstractC4121.m12386(this.f77205, abstractC19916, new Object[0]);
    }
}
