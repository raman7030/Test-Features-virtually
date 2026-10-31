package l;

import java.util.List;

/* JADX INFO: renamed from: l.۫᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final class C12658 extends AbstractC7548 {

    /* JADX INFO: renamed from: ᩻ۛ۬, reason: not valid java name and contains not printable characters */
    private static final short[] f38126;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public List f38127;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f38128;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38129;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f38130;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16891 f38131;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f38132;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C10917 f38133;

    static {
        ApplicationC12518.m30701(101);
        f38126 = new short[]{481, 3016, 3018, 3031, 3026, 3037, 3035, 3020, 3047, 3037, 3008, 3033, 3035, 3020, 3028, 3009, 3047, 3029, 3033, 3020, 3035, 3024, 3037, 3030, 3033, 3034, 3028, 3037, 3047, 3034, 3025, 3030, 3047, 3035, 3031, 3030, 3022, 3037, 3018, 3020};
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public native void mo1009();

    public C12658(C16560 c16560, AbstractC16891 abstractC16891, String str, int i) {
        this.f38132 = c16560;
        this.f38131 = abstractC16891;
        this.f38128 = str;
        this.f38129 = i;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        if (this.f38131.f51877) {
            this.f38133 = this.f38132.m38992(false, (Runnable) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C10917 c10917 = this.f38133;
        C16560 c16560 = this.f38132;
        if (!(c10917 == null && c16560.m39040()) && this.f38130) {
            AbstractC16891 abstractC16891 = c16560.f50900;
            AbstractC16891 abstractC16892 = this.f38131;
            if (abstractC16891 == abstractC16892 && this.f38128.equals(abstractC16892.m39741())) {
                if (this.f38129 == abstractC16892.f51868.m27826()) {
                    c16560.m38961(this.f38127, true);
                    c16560.f50891.m29923();
                }
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        C10917 c10917 = this.f38133;
        if (c10917 != null) {
            c10917.m27224();
        }
    }
}
