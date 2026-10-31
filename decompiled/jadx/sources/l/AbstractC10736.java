package l;

/* JADX INFO: renamed from: l.ۧۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10736 extends C18059 implements InterfaceC11791, InterfaceC11442 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC14801 f32350;

    @Override // l.InterfaceC11791
    /* JADX INFO: renamed from: ֫ */
    public final void mo8683(Object obj) {
        Throwable thM11584 = C3825.m11584(obj);
        if (thM11584 != null) {
            obj = new C18497(thM11584, false);
        }
        Object objM42128 = m42128(obj);
        if (objM42128 == C17353.f53155) {
            return;
        }
        mo3352(objM42128);
    }

    @Override // l.C18059
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo26920() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public AbstractC10736(InterfaceC14801 interfaceC14801, boolean z) {
        super(z);
        m42126((InterfaceC10318) interfaceC14801.mo9082(C12434.f37427));
        this.f32350 = interfaceC14801.mo13851(this);
    }

    @Override // l.InterfaceC11791
    public final InterfaceC14801 getContext() {
        return this.f32350;
    }

    @Override // l.C18059
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26921(C5091 c5091) {
        C5797.m16273(c5091, this.f32350);
    }
}
