package l;

/* JADX INFO: renamed from: l.֫ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5OQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C1580 extends C1637 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C16396 f5597;

    @Override // l.C1637, java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    @Override // l.C1637, java.lang.Throwable
    public final /* bridge */ /* synthetic */ C1637 initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C1580(String str, int i, int i2) {
        super(str);
        C16396 c16396 = new C16396();
        this.f5597 = c16396;
        c16396.m38629(i);
        c16396.m38626(i2);
        c16396.m38635(i);
        c16396.m38631(i2);
    }

    public C1580(String str, C7184 c7184) {
        super(str);
        C16396 c16396 = new C16396();
        this.f5597 = c16396;
        c16396.m38628(c7184);
        c16396.m38627(c7184);
    }

    public C1580(String str, C16396 c16396) {
        super(str);
        this.f5597 = c16396;
    }

    public C1580(String str, AbstractC8636 abstractC8636) {
        this(str, abstractC8636.m22404(), abstractC8636.m22401());
    }

    public C1580(String str, C18514 c18514) {
        this(str, c18514.m43028(), c18514.m43027());
    }

    @Override // l.C1637, java.lang.Throwable
    public final String toString() {
        return super.toString() + " " + this.f5597;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16396 m5400() {
        return this.f5597;
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }
}
