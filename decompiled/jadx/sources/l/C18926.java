package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩴᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: MBG3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18926 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4772 f59636;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9733 f59637;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C4109 f59638;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23116 f59639;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3361 f59640;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C0580 f59641;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m43676(C18926 c18926, String str) {
        c18926.m43673(str);
        throw null;
    }

    public C18926(C0580 c0580, C3361 c3361, C9733 c9733) {
        if (c9733 == null) {
            throw new NullPointerException("dexOptions == null");
        }
        this.f59641 = c0580;
        this.f59636 = c3361.m10270();
        this.f59640 = c3361;
        this.f59639 = c3361.m10272();
        this.f59638 = new C4109(this);
        this.f59637 = c9733;
        if (!c3361.m10268() || c9733.m24724(24)) {
            return;
        }
        m43679(String.format("defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s", c3361.m10263() ? "static" : "default", 24, Integer.valueOf(c9733.f29484), c3361.mo10267().mo2463(), c3361.mo10264().mo2463()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43681(C0538 c0538, C12533 c12533) {
        int iM2271 = c0538.m2271();
        C4109 c4109 = this.f59638;
        c4109.m12335(c12533);
        try {
            int iM2273 = c0538.m2273();
            while (iM2273 < iM2271) {
                int iM13940 = this.f59636.m13940(iM2273, c4109);
                c4109.m12334(iM2273);
                iM2273 += iM13940;
            }
        } catch (C2698 e) {
            c12533.m30747(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2698 m43670() {
        return new C2698("stack mismatch: illegal top-of-stack for opcode", null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7573 m43671(C7573 c7573, C7573 c7574) {
        C7573 c7575;
        C7573 c7576 = C7573.f23417;
        if (c7574 == c7576) {
            return c7573.m20311() ? c7576 : c7573.m20307();
        }
        if (c7573 == C7573.f23412 && c7574.m20301() && c7574.m20310().m20311()) {
            return c7574;
        }
        return (c7573 == C7573.f23423 && c7574 == (c7575 = C7573.f23395)) ? c7575 : c7573.m20307();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43677(C18926 c18926, AbstractC13717 abstractC13717) {
        C9733 c9733 = c18926.f59637;
        if (c9733.m24724(28)) {
            return;
        }
        c18926.m43673(String.format("invalid constant type %s requires --min-sdk-version >= %d (currently %d)", abstractC13717.mo8292(), 28, Integer.valueOf(c9733.f29484)));
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43674(C18926 c18926, int i) {
        C9733 c9733 = c18926.f59637;
        if (c9733.m24724(26)) {
            return;
        }
        c18926.m43673(String.format("invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)", Integer.valueOf(i), 26, Integer.valueOf(c9733.f29484)));
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43675(C18926 c18926, int i, C22390 c22390) {
        C9733 c9733 = c18926.f59637;
        if (i == 185 || c9733.m24724(24)) {
            return;
        }
        boolean zM24724 = c9733.f29482;
        if (i == 184) {
            zM24724 &= c9733.m24724(21);
        }
        String str = i == 184 ? "static" : "default";
        if (zM24724) {
            c18926.m43679(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (experimental at current API level %d)", str, c22390.m36363().mo2463(), c22390.m36364().mo2463(), 24, Integer.valueOf(c9733.f29484)));
        } else {
            c18926.m43673(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)", str, c22390.m36363().mo2463(), c22390.m36364().mo2463(), 24, Integer.valueOf(c9733.f29484)));
            throw null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m43680(C18926 c18926, int i) {
        C9733 c9733 = c18926.f59637;
        if (!c9733.m24724(26)) {
            c18926.m43673(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", 26, Integer.valueOf(c9733.f29484)));
            throw null;
        }
        if (i == 182) {
            return;
        }
        c18926.m43673("Unsupported signature polymorphic invocation (" + C15354.m36391(i) + MotionUtils.EASING_TYPE_FORMAT_END);
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43673(String str) {
        C3361 c3361 = this.f59640;
        StringBuilder sbM10501 = C3435.m10501("ERROR in ", c3361.mo10267().mo2463(), ".", c3361.mo10264().mo2463(), ": ");
        sbM10501.append(str);
        throw new C2698(sbM10501.toString(), null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m43679(String str) {
        C3361 c3361 = this.f59640;
        StringBuilder sbM10501 = C3435.m10501("WARNING in ", c3361.mo10267().mo2463(), ".", c3361.mo10264().mo2463(), ": ");
        sbM10501.append(str);
        this.f59637.f29483.println(sbM10501.toString());
    }
}
