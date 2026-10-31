package l;

/* JADX INFO: renamed from: l.᩺ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22919 extends C11631 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f73882;

    public C22919(int i) {
        super(i);
        this.f73882 = new Object();
    }

    @Override // l.C11631, l.InterfaceC5986
    /* JADX INFO: renamed from: ֫ */
    public final Object mo16806() {
        Object objMo16806;
        synchronized (this.f73882) {
            objMo16806 = super.mo16806();
        }
        return objMo16806;
    }

    @Override // l.C11631, l.InterfaceC5986
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16807(Object obj) {
        boolean zMo16807;
        C11233.m27805(obj, AbstractC16620.MATCH_INSTANCE_STR);
        synchronized (this.f73882) {
            zMo16807 = super.mo16807(obj);
        }
        return zMo16807;
    }
}
