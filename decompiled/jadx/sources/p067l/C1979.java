package p067l;

/* JADX INFO: renamed from: l.᩺ۤ */
/* JADX INFO: compiled from: R5O3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1979 extends C1419 {

    /* JADX INFO: renamed from: ܽ */
    public final Object f76612;

    public C1979(int i) {
        super(i);
        this.f76612 = new Object();
    }

    @Override // p067l.C1419, p067l.InterfaceC1139
    /* JADX INFO: renamed from: ֫ */
    public final Object mo18732() {
        Object objMo18732;
        synchronized (this.f76612) {
            objMo18732 = super.mo18732();
        }
        return objMo18732;
    }

    @Override // p067l.C1419, p067l.InterfaceC1139
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18733(Object obj) {
        boolean zMo18733;
        C13045.m29867(obj, AbstractC18164.MATCH_INSTANCE_STR);
        synchronized (this.f76612) {
            zMo18733 = super.mo18733(obj);
        }
        return zMo18733;
    }
}
