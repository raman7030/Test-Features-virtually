package p067l;

/* JADX INFO: renamed from: l.ۖܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4NK */
/* JADX INFO: loaded from: classes2.dex */
public class C4821 extends RuntimeException {

    /* JADX INFO: renamed from: ۗ */
    public final AbstractC20244 f10959;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC2808 f10960;

    /* JADX INFO: renamed from: ᩶ */
    public int f10961;

    /* JADX INFO: renamed from: ᩸ */
    public final C10856 f10962;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC16219 f10963;

    public C4821(AbstractC20244 abstractC20244, InterfaceC16219 interfaceC16219, C10856 c10856) {
        this.f10961 = -1;
        this.f10959 = abstractC20244;
        this.f10963 = interfaceC16219;
        this.f10962 = c10856;
        if (abstractC20244 != null) {
            this.f10961 = abstractC20244.m45731();
        }
    }

    public C4821(String str, AbstractC11527 abstractC11527, InterfaceC16219 interfaceC16219, C10856 c10856) {
        super(str);
        this.f10961 = -1;
        this.f10959 = abstractC11527;
        this.f10963 = interfaceC16219;
        this.f10962 = c10856;
        if (abstractC11527 != null) {
            this.f10961 = abstractC11527.m45731();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10222(int i) {
        this.f10961 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C25117 m10221() {
        AbstractC20244 abstractC20244 = this.f10959;
        if (abstractC20244 != null) {
            return abstractC20244.mo3738().m51241(this.f10961, this.f10962);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC16219 m10224() {
        return this.f10963;
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC2808 m10225() {
        return this.f10960;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10223(InterfaceC2808 interfaceC2808) {
        this.f10960 = interfaceC2808;
    }
}
