package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.۫᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final class C14399 extends AbstractC9542 {

    /* JADX INFO: renamed from: ᩻ۛ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f82180;

    /* JADX INFO: renamed from: ۜ */
    public List f41154;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ String f41155;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ int f41156;

    /* JADX INFO: renamed from: ܳ */
    public boolean f41157;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ AbstractC18422 f41158;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C18107 f41159;

    /* JADX INFO: renamed from: ᩻ */
    public C12744 f41160;

    static {
        ApplicationC14266.m56479(101);
        f82180 = new short[]{481, 3016, 3018, 3031, 3026, 3037, 3035, 3020, 3047, 3037, 3008, 3033, 3035, 3020, 3028, 3009, 3047, 3029, 3033, 3020, 3035, 3024, 3037, 3030, 3033, 3034, 3028, 3037, 3047, 3034, 3025, 3030, 3047, 3035, 3031, 3030, 3022, 3037, 3018, 3020};
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public native void mo3405();

    public C14399(C18107 c18107, AbstractC18422 abstractC18422, String str, int i) {
        this.f41159 = c18107;
        this.f41158 = abstractC18422;
        this.f41155 = str;
        this.f41156 = i;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        if (this.f41158.f55057) {
            this.f41160 = this.f41159.m41218(false, (Runnable) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C12744 c12744 = this.f41160;
        C18107 c18107 = this.f41159;
        if (!(c12744 == null && c18107.m41266()) && this.f41157) {
            AbstractC18422 abstractC18422 = c18107.f54077;
            AbstractC18422 abstractC18423 = this.f41158;
            if (abstractC18422 == abstractC18423 && this.f41155.equals(abstractC18423.m41982())) {
                if (this.f41156 == abstractC18423.f55048.m29888()) {
                    c18107.m41187(this.f41154, true);
                    c18107.f54068.m31983();
                }
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C12744 c12744 = this.f41160;
        if (c12744 != null) {
            c12744.m29269();
        }
    }
}
