package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۛ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O44L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6304 extends AbstractC7715 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC5144 f19489;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9833 f19490;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f19491;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f19492;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C9833 f19493;

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6304 mo17363() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6304(C14439 c14439, int i, C9833 c9833, C9833 c9834) {
        super(c14439, 5);
        this.f19491 = c14439;
        this.f19492 = i;
        this.f19493 = c9833;
        this.f19490 = c9834;
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7715 mo5817() {
        C9833 c9833M4800;
        C9833 c9833M17364 = m17364();
        boolean zM17359 = m17359();
        C14439 c14439 = this.f19491;
        if (zM17359) {
            c9833M4800 = null;
        } else {
            c14439.f44254.m4811(this.f19493);
            c14439.f44254.m4824(4);
            c9833M4800 = c14439.f44254.m4800(167);
        }
        if (c9833M17364 != null) {
            c14439.f44254.m4811(c9833M17364);
            c14439.f44254.m4824(3);
        }
        c14439.f44254.m4811(c9833M4800);
        return c14439.f44255[this.f23845];
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo17361() {
        mo5817().mo17361();
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo17358() {
        mo5817().mo17358();
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo17362(int i) {
        C12171.m29636();
        throw null;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C9833 m17360() {
        AbstractC5144 abstractC5144 = this.f19489;
        int i = this.f19492;
        C9833 c9833 = this.f19493;
        C14439 c14439 = this.f19491;
        if (abstractC5144 == null) {
            return C1365.m4783(c9833, c14439.f44254.m4800(i));
        }
        int iM4816 = c14439.f44254.m4816();
        C9833 c9833M4783 = C1365.m4783(c9833, c14439.f44254.m4800(i));
        C1365 c1365 = c14439.f44254;
        c1365.f4986.m27979(this.f19489, 128, iM4816, c1365.m4816());
        return c9833M4783;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9833 m17364() {
        AbstractC5144 abstractC5144 = this.f19489;
        int i = this.f19492;
        C9833 c9833 = this.f19490;
        C14439 c14439 = this.f19491;
        if (abstractC5144 == null) {
            return C1365.m4783(c9833, c14439.f44254.m4800(C1365.m4787(i)));
        }
        int iM4816 = c14439.f44254.m4816();
        C9833 c9833M4783 = C1365.m4783(c9833, c14439.f44254.m4800(C1365.m4787(i)));
        C1365 c1365 = c14439.f44254;
        c1365.f4986.m27979(this.f19489, 256, iM4816, c1365.m4816());
        return c9833M4783;
    }

    @Override // l.AbstractC7715
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int mo17365() {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m17359() {
        return this.f19493 == null && this.f19492 == 168;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("cond(");
        int i = C1365.f4960;
        return C9045.m23341(sb, C2777.f8654[this.f19492], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
