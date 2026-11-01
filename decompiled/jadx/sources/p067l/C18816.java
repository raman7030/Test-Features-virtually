package p067l;

/* JADX INFO: renamed from: l.ܿۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68QN */
/* JADX INFO: loaded from: classes5.dex */
public final class C18816 extends AbstractC15207 {

    /* JADX INFO: renamed from: ܿ */
    public static final Object f56194 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public final Object f56195;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f56196;

    /* JADX INFO: renamed from: ֫ */
    public static C18816 m42868(C13010 c13010) {
        return new C18816(new C16133(c13010), C21727.f68424, f56194);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18816 m42867(AbstractC6974 abstractC6974, Object obj, Object obj2) {
        return new C18816(abstractC6974, obj, obj2);
    }

    public C18816(AbstractC6974 abstractC6974, Object obj, Object obj2) {
        super(abstractC6974);
        this.f56196 = obj;
        this.f56195 = obj2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18816 m42869(AbstractC6974 abstractC6974) {
        return new C18816(abstractC6974, this.f56196, this.f56195);
    }

    @Override // p067l.AbstractC15207, p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final C21727 mo15983(int i, C21727 c21727, long j) {
        this.f43390.mo15983(i, c21727, j);
        if (C12826.equals(c21727.f68437, this.f56196)) {
            c21727.f68437 = C21727.f68424;
        }
        return c21727;
    }

    @Override // p067l.AbstractC15207, p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final C23738 mo15984(int i, C23738 c23738, boolean z) {
        this.f43390.mo15984(i, c23738, z);
        if (C12826.equals(c23738.f75528, this.f56195) && z) {
            c23738.f75528 = f56194;
        }
        return c23738;
    }

    @Override // p067l.AbstractC15207, p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final int mo15978(Object obj) {
        Object obj2;
        if (f56194.equals(obj) && (obj2 = this.f56195) != null) {
            obj = obj2;
        }
        return this.f43390.mo15978(obj);
    }

    @Override // p067l.AbstractC15207, p067l.AbstractC6974
    /* JADX INFO: renamed from: ֫ */
    public final Object mo15982(int i) {
        Object objMo15982 = this.f43390.mo15982(i);
        return C12826.equals(objMo15982, this.f56195) ? f56194 : objMo15982;
    }
}
