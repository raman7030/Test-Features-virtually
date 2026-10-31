package l;

/* JADX INFO: renamed from: l.ۛܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: YAKC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6138 extends AbstractC3817 {

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f18912 = 0;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final DialogInterfaceC0206 mo10130(AbstractActivityC3346 abstractActivityC3346) {
        final C22933 c22933 = new C22933(abstractActivityC3346);
        c22933.mo49542(new RunnableC8301(4, this));
        if (mo3145()) {
            c22933.mo49541(new ViewOnClickListenerC9135(3, c22933));
        } else {
            m11522(abstractActivityC3346);
        }
        m11532().m1668(c22933.m51050(), new InterfaceC1008() { // from class: l.ۤܶۢ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                AbstractC6138.m17059(this.f31205, c22933);
            }
        });
        c22933.mo49547();
        return c22933.m51050();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17059(AbstractC6138 abstractC6138, C22933 c22933) {
        if (abstractC6138.m11561()) {
            c22933.m51046(abstractC6138.m11557());
        }
        if (abstractC6138.m11547()) {
            c22933.m51040(abstractC6138.m11534());
        }
        c22933.m51045(abstractC6138.m11539());
    }
}
