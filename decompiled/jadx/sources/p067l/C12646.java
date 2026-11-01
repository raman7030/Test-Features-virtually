package p067l;

/* JADX INFO: renamed from: l.ۧۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 056O */
/* JADX INFO: loaded from: classes4.dex */
public final class C12646 extends AbstractC11897 {

    /* JADX INFO: renamed from: ۨ */
    public static final C12646 f35506 = new C12646();

    /* JADX INFO: renamed from: ۗ */
    public final transient Object[] f35507;

    /* JADX INFO: renamed from: ۛ */
    public final transient int f35508;

    /* JADX INFO: renamed from: ۤ */
    public final transient int f35509;

    /* JADX INFO: renamed from: ۫ */
    public final transient Object f35510;

    /* JADX INFO: renamed from: ۬ */
    public final transient C12646 f35511;

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo20047() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f35508;
    }

    @Override // p067l.InterfaceC4560
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC4560 mo9635() {
        return this.f35511;
    }

    @Override // p067l.AbstractC11897, p067l.InterfaceC4560
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC11897 mo9635() {
        return this.f35511;
    }

    @Override // p067l.AbstractC11500, java.util.Map
    public final Object get(Object obj) {
        Object objM20041 = C8622.m20041(this.f35510, this.f35507, this.f35508, this.f35509, obj);
        if (objM20041 == null) {
            return null;
        }
        return objM20041;
    }

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC8146 mo20044() {
        return new C18680(this, this.f35507, this.f35509, this.f35508);
    }

    @Override // p067l.AbstractC11500
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC8146 mo20045() {
        return new C15997(this, new C24715(this.f35509, this.f35508, this.f35507));
    }

    @Override // p067l.AbstractC11897, p067l.AbstractC11500
    public Object writeReplace() {
        return super.writeReplace();
    }

    public C12646() {
        this.f35510 = null;
        this.f35507 = new Object[0];
        this.f35509 = 0;
        this.f35508 = 0;
        this.f35511 = this;
    }

    public C12646(int i, Object[] objArr) {
        this.f35507 = objArr;
        this.f35508 = i;
        this.f35509 = 0;
        int iM18917 = i >= 2 ? AbstractC8146.m18917(i) : 0;
        this.f35510 = C8622.m20043(i, iM18917, 0, objArr);
        this.f35511 = new C12646(C8622.m20043(i, iM18917, 1, objArr), objArr, i, this);
    }

    public C12646(Object obj, Object[] objArr, int i, C12646 c12646) {
        this.f35510 = obj;
        this.f35507 = objArr;
        this.f35509 = 1;
        this.f35508 = i;
        this.f35511 = c12646;
    }
}
