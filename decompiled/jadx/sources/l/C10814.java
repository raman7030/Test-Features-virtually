package l;

/* JADX INFO: renamed from: l.ۧۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 056O */
/* JADX INFO: loaded from: classes4.dex */
public final class C10814 extends AbstractC10026 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C10814 f32530 = new C10814();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final transient Object[] f32531;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final transient int f32532;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final transient int f32533;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient Object f32534;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final transient C10814 f32535;

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo18096() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f32532;
    }

    @Override // l.InterfaceC2306
    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC2306 mo7567() {
        return this.f32535;
    }

    @Override // l.AbstractC10026, l.InterfaceC2306
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC10026 mo7567() {
        return this.f32535;
    }

    @Override // l.AbstractC9608, java.util.Map
    public final Object get(Object obj) {
        Object objM18090 = C6580.m18090(this.f32534, this.f32531, this.f32532, this.f32533, obj);
        if (objM18090 == null) {
            return null;
        }
        return objM18090;
    }

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6079 mo18093() {
        return new C17163(this, this.f32531, this.f32533, this.f32532);
    }

    @Override // l.AbstractC9608
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6079 mo18094() {
        return new C14340(this, new C23513(this.f32533, this.f32532, this.f32531));
    }

    @Override // l.AbstractC10026, l.AbstractC9608
    public Object writeReplace() {
        return super.writeReplace();
    }

    public C10814() {
        this.f32534 = null;
        this.f32531 = new Object[0];
        this.f32533 = 0;
        this.f32532 = 0;
        this.f32535 = this;
    }

    public C10814(int i, Object[] objArr) {
        this.f32531 = objArr;
        this.f32532 = i;
        this.f32533 = 0;
        int iM16986 = i >= 2 ? AbstractC6079.m16986(i) : 0;
        this.f32534 = C6580.m18092(i, iM16986, 0, objArr);
        this.f32535 = new C10814(C6580.m18092(i, iM16986, 1, objArr), objArr, i, this);
    }

    public C10814(Object obj, Object[] objArr, int i, C10814 c10814) {
        this.f32534 = obj;
        this.f32531 = objArr;
        this.f32533 = 1;
        this.f32532 = i;
        this.f32535 = c10814;
    }
}
