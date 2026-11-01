package p067l;

/* JADX INFO: renamed from: l.֫ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5OQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3870 extends C3924 {

    /* JADX INFO: renamed from: ᩸ */
    public C17951 f8377;

    @Override // p067l.C3924, java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    @Override // p067l.C3924, java.lang.Throwable
    public final /* bridge */ /* synthetic */ C3924 initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C3870(String str, int i, int i2) {
        super(str);
        C17951 c17951 = new C17951();
        this.f8377 = c17951;
        c17951.m40846(i);
        c17951.m40843(i2);
        c17951.m40852(i);
        c17951.m40848(i2);
    }

    public C3870(String str, C9196 c9196) {
        super(str);
        C17951 c17951 = new C17951();
        this.f8377 = c17951;
        c17951.m40845(c9196);
        c17951.m40844(c9196);
    }

    public C3870(String str, C17951 c17951) {
        super(str);
        this.f8377 = c17951;
    }

    public C3870(String str, AbstractC10576 abstractC10576) {
        this(str, abstractC10576.m24373(), abstractC10576.m24370());
    }

    public C3870(String str, C19964 c19964) {
        this(str, c19964.m45306(), c19964.m45305());
    }

    @Override // p067l.C3924, java.lang.Throwable
    public final String toString() {
        return super.toString() + " " + this.f8377;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17951 m7629() {
        return this.f8377;
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }
}
