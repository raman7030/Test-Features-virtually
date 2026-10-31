package l;

/* JADX INFO: renamed from: l.ۜۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6468 extends Exception {
    public static final long serialVersionUID = 5750205775490483148L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC23338 f19987;

    public /* synthetic */ C6468(AbstractC0823 abstractC0823, String str, int i) {
        this(abstractC0823, str);
    }

    public C6468(AbstractC0823 abstractC0823, String str) {
        super(abstractC0823.mo1141() + ": " + str);
        abstractC0823.mo1141();
        this.f19987 = abstractC0823.mo1132();
    }

    public C6468(AbstractC0823 abstractC0823, String str, Exception exc) {
        this(abstractC0823, str);
        initCause(exc);
    }

    public C6468(C5057 c5057, String str) {
        super(c5057.getName() + ": " + str);
        c5057.getName();
    }
}
