package l;

/* JADX INFO: renamed from: l.ܿۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68QN */
/* JADX INFO: loaded from: classes5.dex */
public final class C17306 extends AbstractC13509 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object f53013 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f53014;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f53015;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17306 m40617(C11197 c11197) {
        return new C17306(new C14483(c11197), C20369.f65748, f53013);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17306 m40616(AbstractC4846 abstractC4846, Object obj, Object obj2) {
        return new C17306(abstractC4846, obj, obj2);
    }

    public C17306(AbstractC4846 abstractC4846, Object obj, Object obj2) {
        super(abstractC4846);
        this.f53015 = obj;
        this.f53014 = obj2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17306 m40618(AbstractC4846 abstractC4846) {
        return new C17306(abstractC4846, this.f53015, this.f53014);
    }

    @Override // l.AbstractC13509, l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final C20369 mo14103(int i, C20369 c20369, long j) {
        this.f40320.mo14103(i, c20369, j);
        if (C11003.equals(c20369.f65761, this.f53015)) {
            c20369.f65761 = C20369.f65748;
        }
        return c20369;
    }

    @Override // l.AbstractC13509, l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final C22485 mo14104(int i, C22485 c22485, boolean z) {
        this.f40320.mo14104(i, c22485, z);
        if (C11003.equals(c22485.f72802, this.f53014) && z) {
            c22485.f72802 = f53013;
        }
        return c22485;
    }

    @Override // l.AbstractC13509, l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final int mo14098(Object obj) {
        Object obj2;
        if (f53013.equals(obj) && (obj2 = this.f53014) != null) {
            obj = obj2;
        }
        return this.f40320.mo14098(obj);
    }

    @Override // l.AbstractC13509, l.AbstractC4846
    /* JADX INFO: renamed from: ֫ */
    public final Object mo14102(int i) {
        Object objMo14102 = this.f40320.mo14102(i);
        return C11003.equals(objMo14102, this.f53014) ? f53013 : objMo14102;
    }
}
