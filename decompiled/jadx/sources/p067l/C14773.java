package p067l;

/* JADX INFO: renamed from: l.۬ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7TC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14773 extends AbstractC3726 {
    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ֫ */
    public final long mo7175(Object obj) {
        return ((C6177) obj).m13992();
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ֫ */
    public final void mo7178(long j, Object obj) {
        ((C6177) obj).m13993(j);
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ۧ */
    public final String mo7179(Object obj) {
        C6177 c6177 = (C6177) obj;
        String strM14002 = c6177.m14002();
        return (strM14002.endsWith("/") || !c6177.m13996()) ? strM14002 : strM14002.concat("/");
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ۧ */
    public final void mo7181(long j, Object obj) {
        ((C6177) obj).m13998(j);
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ܽ */
    public final long mo7182(Object obj) {
        return ((C6177) obj).m13994();
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ܽ */
    public final void mo7184(long j, Object obj) {
        ((C6177) obj).m14001(j);
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ᩳ */
    public final long mo7185(Object obj) {
        return ((C6177) obj).m14004();
    }

    @Override // p067l.AbstractC3726
    /* JADX INFO: renamed from: ܽ */
    public final Object mo7183(String str) {
        if (!C5235.m11298(str, "/", false)) {
            throw new RuntimeException();
        }
        C5738 c5738 = new C5738(str);
        String strM12791 = c5738.m12791();
        int i = C14387.f41116;
        String parent = c5738.getParent();
        String strConcat = parent != null ? "/".concat(parent) : "/";
        C13045.m29861((Object) strM12791);
        C13045.m29861((Object) strConcat);
        return new C6177(-1, str, strM12791, strConcat, true, false, -1L, -1L, 0L, 0, null);
    }
}
