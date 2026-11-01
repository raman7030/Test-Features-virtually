package p067l;

/* JADX INFO: renamed from: l.ۜۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public final class C8515 extends Exception {
    public static final long serialVersionUID = 5750205775490483148L;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC24548 f22862;

    public /* synthetic */ C8515(AbstractC3150 abstractC3150, String str, int i) {
        this(abstractC3150, str);
    }

    public C8515(AbstractC3150 abstractC3150, String str) {
        super(abstractC3150.mo3542() + ": " + str);
        abstractC3150.mo3542();
        this.f22862 = abstractC3150.mo3533();
    }

    public C8515(AbstractC3150 abstractC3150, String str, Exception exc) {
        this(abstractC3150, str);
        initCause(exc);
    }

    public C8515(C7174 c7174, String str) {
        super(c7174.getName() + ": " + str);
        c7174.getName();
    }
}
