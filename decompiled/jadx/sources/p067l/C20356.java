package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩴᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBG3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20356 {

    /* JADX INFO: renamed from: ֫ */
    public final C6904 f62867;

    /* JADX INFO: renamed from: ۧ */
    public final C11619 f62868;

    /* JADX INFO: renamed from: ܳ */
    public final C6274 f62869;

    /* JADX INFO: renamed from: ܽ */
    public final C24338 f62870;

    /* JADX INFO: renamed from: ܿ */
    public C5563 f62871;

    /* JADX INFO: renamed from: ᩳ */
    public final C2920 f62872;

    /* JADX INFO: renamed from: ֫ */
    public static /* bridge */ /* synthetic */ void m45942(C20356 c20356, String str) {
        c20356.m45939(str);
        throw null;
    }

    public C20356(C2920 c2920, C5563 c5563, C11619 c11619) {
        if (c11619 == null) {
            throw new NullPointerException("dexOptions == null");
        }
        this.f62872 = c2920;
        this.f62867 = c5563.m12307();
        this.f62871 = c5563;
        this.f62870 = c5563.m12309();
        this.f62869 = new C6274(this);
        this.f62868 = c11619;
        if (!c5563.m12305() || c11619.m26738(24)) {
            return;
        }
        m45945(String.format("defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s", c5563.m12300() ? "static" : "default", 24, Integer.valueOf(c11619.f32434), c5563.mo12304().mo4819(), c5563.mo12301().mo4819()));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45947(C2880 c2880, C14280 c14280) {
        int iM4638 = c2880.m4638();
        C6274 c6274 = this.f62869;
        c6274.m14240(c14280);
        try {
            int iM4640 = c2880.m4640();
            while (iM4640 < iM4638) {
                int iM15820 = this.f62867.m15820(iM4640, c6274);
                c6274.m14239(iM4640);
                iM4640 += iM15820;
            }
        } catch (C4933 e) {
            c14280.m32819(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4933 m45936() {
        return new C4933("stack mismatch: illegal top-of-stack for opcode", null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9566 m45937(C9566 c9566, C9566 c9567) {
        C9566 c9568;
        C9566 c9569 = C9566.f26329;
        if (c9567 == c9569) {
            return c9566.m22288() ? c9569 : c9566.m22284();
        }
        if (c9566 == C9566.f26324 && c9567.m22278() && c9567.m22287().m22288()) {
            return c9567;
        }
        return (c9566 == C9566.f26335 && c9567 == (c9568 = C9566.f26307)) ? c9568 : c9566.m22284();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45943(C20356 c20356, AbstractC15405 abstractC15405) {
        C11619 c11619 = c20356.f62868;
        if (c11619.m26738(28)) {
            return;
        }
        c20356.m45939(String.format("invalid constant type %s requires --min-sdk-version >= %d (currently %d)", abstractC15405.mo10336(), 28, Integer.valueOf(c11619.f32434)));
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45940(C20356 c20356, int i) {
        C11619 c11619 = c20356.f62868;
        if (c11619.m26738(26)) {
            return;
        }
        c20356.m45939(String.format("invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)", Integer.valueOf(i), 26, Integer.valueOf(c11619.f32434)));
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45941(C20356 c20356, int i, C23648 c23648) {
        C11619 c11619 = c20356.f62868;
        if (i == 185 || c11619.m26738(24)) {
            return;
        }
        boolean zM26738 = c11619.f32432;
        if (i == 184) {
            zM26738 &= c11619.m26738(21);
        }
        String str = i == 184 ? "static" : "default";
        if (zM26738) {
            c20356.m45945(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (experimental at current API level %d)", str, c23648.m38521().mo4819(), c23648.m38522().mo4819(), 24, Integer.valueOf(c11619.f32434)));
        } else {
            c20356.m45939(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)", str, c23648.m38521().mo4819(), c23648.m38522().mo4819(), 24, Integer.valueOf(c11619.f32434)));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m45946(C20356 c20356, int i) {
        C11619 c11619 = c20356.f62868;
        if (!c11619.m26738(26)) {
            c20356.m45939(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", 26, Integer.valueOf(c11619.f32434)));
            throw null;
        }
        if (i == 182) {
            return;
        }
        c20356.m45939("Unsupported signature polymorphic invocation (" + C16961.m38549(i) + MotionUtils.EASING_TYPE_FORMAT_END);
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45939(String str) {
        C5563 c5563 = this.f62871;
        StringBuilder sbM12525 = C5633.m12525("ERROR in ", c5563.mo12304().mo4819(), ".", c5563.mo12301().mo4819(), ": ");
        sbM12525.append(str);
        throw new C4933(sbM12525.toString(), null);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m45945(String str) {
        C5563 c5563 = this.f62871;
        StringBuilder sbM12525 = C5633.m12525("WARNING in ", c5563.mo12304().mo4819(), ".", c5563.mo12301().mo4819(), ": ");
        sbM12525.append(str);
        this.f62868.f32433.println(sbM12525.toString());
    }
}
