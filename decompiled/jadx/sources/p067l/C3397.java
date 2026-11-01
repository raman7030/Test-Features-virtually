package p067l;

import bin.p000mt.plus.R;
import java.p066io.UncheckedIOException;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.֨ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3397 {

    /* JADX INFO: renamed from: ֨ */
    public boolean f6721;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractActivityC5549 f6722;

    /* JADX INFO: renamed from: ۖ */
    public boolean f6723;

    /* JADX INFO: renamed from: ۗ */
    public InterfaceC9768 f6724;

    /* JADX INFO: renamed from: ۙ */
    public int f6726;

    /* JADX INFO: renamed from: ۚ */
    public boolean f6727;

    /* JADX INFO: renamed from: ۛ */
    public boolean f6728;

    /* JADX INFO: renamed from: ۠ */
    public InterfaceC4739 f6730;

    /* JADX INFO: renamed from: ۡ */
    public boolean f6731;

    /* JADX INFO: renamed from: ۢ */
    public String f6732;

    /* JADX INFO: renamed from: ۤ */
    public InterfaceC6080 f6733;

    /* JADX INFO: renamed from: ۧ */
    public final C14146 f6734;

    /* JADX INFO: renamed from: ۫ */
    public C15802 f6735;

    /* JADX INFO: renamed from: ۬ */
    public boolean f6736;

    /* JADX INFO: renamed from: ܳ */
    public boolean f6737;

    /* JADX INFO: renamed from: ܶ */
    public PatternSyntaxException f6738;

    /* JADX INFO: renamed from: ܿ */
    public boolean f6741;

    /* JADX INFO: renamed from: ᩴ */
    public int f6743;

    /* JADX INFO: renamed from: ᩵ */
    public InterfaceC9768 f6744;

    /* JADX INFO: renamed from: ᩷ */
    public C14698 f6746;

    /* JADX INFO: renamed from: ᩸ */
    public volatile C7421 f6747;

    /* JADX INFO: renamed from: ۜ */
    public int f6729 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public int f6749 = -1;

    /* JADX INFO: renamed from: ۘ */
    public C13929 f6725 = null;

    /* JADX INFO: renamed from: ֡ */
    public int f6720 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public C20833 f6748 = new C20833();

    /* JADX INFO: renamed from: ᩶ */
    public volatile int f6745 = -1;

    /* JADX INFO: renamed from: ܽ */
    public boolean f6740 = false;

    /* JADX INFO: renamed from: ܺ */
    public C10748 f6739 = C10748.m24756(150);

    /* JADX INFO: renamed from: ᩳ */
    public boolean f6742 = true;

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m5955(final boolean z, final boolean z2) {
        C7421 c7421 = this.f6747;
        if (c7421 != null && !c7421.m17145()) {
            c7421.m17140();
        }
        C13929 c13929 = this.f6725;
        if (c13929 == null) {
            this.f6740 = false;
            this.f6749 = -1;
            this.f6745 = -1;
            this.f6724 = null;
            PatternSyntaxException patternSyntaxException = this.f6738;
            if (patternSyntaxException != null) {
                m5944(patternSyntaxException);
            }
            return;
        }
        if (c7421 != null && c7421.f19417 == c13929 && !c7421.f19419) {
            m5954(this.f6725.pattern());
        }
        final C7421 c7422 = new C7421(this);
        this.f6747 = c7422;
        this.f6740 = false;
        this.f6749 = -1;
        c7422.m17141(C4081.f8987.submit(new Runnable() { // from class: l.ܽۧܿ
            @Override // java.lang.Runnable
            public final void run() {
                C3397.m5953(this.f54178, c7422, z, z2);
            }
        }));
    }

    public C3397(AbstractActivityC5549 abstractActivityC5549, C14146 c14146) {
        this.f6722 = abstractActivityC5549;
        this.f6734 = c14146;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5985(InterfaceC4739 interfaceC4739) {
        if (this.f6730 != interfaceC4739) {
            m5978();
        }
        this.f6730 = interfaceC4739;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m5998() {
        return this.f6721;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m5995(boolean z) {
        if (this.f6721 != z) {
            m5978();
        }
        this.f6721 = z;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m5976(String str) {
        String str2;
        if (!m5965()) {
            return false;
        }
        int i = this.f6729;
        C14146 c14146 = this.f6734;
        return i == c14146.f40244 && (str2 = this.f6732) != null && str2.equals(str) && C12826.equals(this.f6746, c14146.m32582()) && this.f6737 == this.f6736 && this.f6731 == this.f6728 && this.f6741 == this.f6723;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5982(byte b) {
        boolean z = (b & 1) != 0;
        boolean z2 = (b & 2) != 0;
        boolean z3 = (b & 4) != 0;
        m5995((b & 8) != 0);
        boolean z4 = (b & 16) != 0;
        m5999(z);
        m5997(z2);
        m5987(z3);
        this.f6727 = z4;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m5999(boolean z) {
        if (this.f6736 != z) {
            m5988();
        }
        this.f6736 = z;
        InterfaceC6080 interfaceC6080 = this.f6733;
        if (interfaceC6080 != null) {
            interfaceC6080.mo13847(z);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m5997(boolean z) {
        if (this.f6728 != z) {
            m5988();
        }
        this.f6728 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5987(boolean z) {
        if (this.f6723 != z) {
            m5988();
        }
        this.f6723 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5992(boolean z) {
        this.f6727 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte m5981() {
        byte b = this.f6736 ? (byte) 1 : (byte) 0;
        if (this.f6728) {
            b = (byte) (b | 2);
        }
        if (this.f6723) {
            b = (byte) (b | 4);
        }
        if (this.f6721) {
            b = (byte) (b | 8);
        }
        return this.f6727 ? (byte) (b | 16) : b;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m5993() {
        return this.f6736;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m6001() {
        return this.f6728;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m5996() {
        return this.f6723;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m6000() {
        return this.f6727;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m5989() {
        boolean z = this.f6736;
        boolean z2 = this.f6723;
        boolean z3 = this.f6728;
        int i = z ? 8 : 16;
        if (!z2) {
            i |= 66;
        }
        return z3 ? i | 512 : i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5983(String str) {
        if (this.f6739.m24763() || this.f6734.f40275.mo11814()) {
            return;
        }
        this.f6742 = true;
        if (!m5976(str)) {
            m5943(str, true, false);
        } else {
            m5955(true, false);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5990(String str) {
        if (this.f6739.m24763() || this.f6734.f40275.mo11814()) {
            return;
        }
        this.f6742 = false;
        if (!m5976(str)) {
            m5943(str, false, false);
        } else {
            m5955(false, false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5943(String str, boolean z, boolean z2) {
        this.f6740 = false;
        this.f6737 = this.f6736;
        this.f6731 = this.f6728;
        this.f6732 = str;
        C14146 c14146 = this.f6734;
        this.f6746 = c14146.m32582();
        this.f6741 = this.f6723;
        int i = c14146.f40244;
        this.f6749 = i;
        this.f6729 = i;
        this.f6725 = null;
        if (str.isEmpty()) {
            m5978();
            return;
        }
        try {
            C13259 c13259M30303 = C13259.m30303(m5989(), str);
            this.f6738 = null;
            m5954(c13259M30303);
            InterfaceC6080 interfaceC6080 = this.f6733;
            if (interfaceC6080 != null) {
                interfaceC6080.mo13846();
            }
            m5955(z, z2);
        } catch (PatternSyntaxException e) {
            m5944(e);
            this.f6738 = e;
            m5978();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m5994(String str) {
        if (!C12826.equals(this.f6732, str)) {
            m5978();
        }
        C14146 c14146 = this.f6734;
        C8506 c8506 = c14146.f40190;
        if (str.isEmpty()) {
            c8506.m19798();
            c14146.m32487();
        } else {
            try {
                c8506.m19800(c14146.m32500(), C13259.m30303(m5989(), str));
            } catch (PatternSyntaxException unused) {
                c8506.m19805();
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m5988() {
        m5978();
        C15802 c15802 = this.f6735;
        if (c15802 != null) {
            c15802.m35872();
        }
        this.f6734.f40190.m19798();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m5959(C13929 c13929, int i, boolean z) {
        if (C14028.m31864(c13929, i)) {
            return z || c13929.start() != i || c13929.end() != i || C14028.m31865(c13929);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m5967(C3397 c3397, int i) {
        if (c3397.f6748.m47064() == null || c3397.f6725 == null || c3397.f6748.m47064() != c3397.f6725.pattern() || c3397.f6724 == null) {
            return false;
        }
        int i2 = c3397.f6745;
        C14146 c14146 = c3397.f6734;
        return i2 == c14146.f40244 && c3397.f6724 == c14146.m32500() && c3397.f6726 == c3397.f6724.mo28581() && c3397.f6748.m47065() == i && c3397.f6748.m47062() == i && c3397.f6734.m32508() == i && c3397.f6734.m32512() == i;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5954(C13259 c13259) {
        InterfaceC9768 interfaceC9768M32500 = this.f6734.m32500();
        this.f6744 = interfaceC9768M32500;
        this.f6743 = interfaceC9768M32500.mo28581();
        this.f6720 = this.f6734.f40244;
        C7421 c7421 = this.f6747;
        C13929 c13929 = this.f6725;
        if (c13929 == null || c13929.pattern() != c13259 || (c7421 != null && c7421.f19417 == this.f6725 && !c7421.f19419)) {
            C13929 c13929Matcher = c13259.matcher("");
            c13929Matcher.m31669();
            this.f6725 = c13929Matcher;
        } else {
            C13929 c139210 = this.f6725;
            c139210.m56473reset((CharSequence) "");
            c139210.m31669();
        }
    }

    /* JADX INFO: renamed from: ۢ */
    private boolean m5965() {
        InterfaceC9768 interfaceC9768;
        if (this.f6725 == null) {
            return false;
        }
        InterfaceC9768 interfaceC9769 = this.f6744;
        C14146 c14146 = this.f6734;
        return interfaceC9769 == c14146.m32500() && (interfaceC9768 = this.f6744) != null && this.f6743 == interfaceC9768.mo28581() && this.f6720 == c14146.f40244;
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m5978() {
        C7421 c7421 = this.f6747;
        this.f6747 = null;
        if (c7421 != null) {
            c7421.m17140();
            c7421.m17142();
        }
        this.f6740 = false;
        this.f6749 = -1;
        this.f6745 = -1;
        this.f6724 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public boolean m5969(C7421 c7421) {
        return this.f6747 == c7421 && !c7421.m17143() && this.f6725 == c7421.f19417 && C12826.equals(this.f6732, c7421.f19415) && m5989() == c7421.f19421 && C12826.equals(this.f6734.m32582(), c7421.f19414) && this.f6730 == c7421.f19424 && this.f6721 == c7421.f19412;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m5957(C7421 c7421) {
        if (!m5969(c7421)) {
            return false;
        }
        InterfaceC9768 interfaceC9768 = c7421.f19406;
        C14146 c14146 = this.f6734;
        return interfaceC9768 == c14146.m32500() && c7421.f19425 == c7421.f19406.mo28581() && c7421.f19407 == c14146.f40244;
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01be  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5953(final C3397 c3397, final C7421 c7421, boolean z, final boolean z2) {
        Runnable runnable;
        final C16150 e;
        final RuntimeException e2;
        RunnableC18820 runnableC18820;
        RunnableC18820 runnableC18821;
        final boolean z3;
        c7421.m17144();
        int i = c7421.f19411;
        C15802 c15802 = c7421.f19410;
        C13929 c13929 = c7421.f19417;
        final C20833 c20833 = new C20833();
        try {
            try {
                c15802.m35874();
                if (c3397.m5957(c7421)) {
                    RunnableC21169 runnableC21169 = new RunnableC21169(0, c15802);
                    C9729 c9729Mo28589 = c7421.f19406.mo28589();
                    try {
                        c9729Mo28589.m22746(runnableC21169);
                        if (c3397.m5957(c7421) && c9729Mo28589.m22747() == c7421.f19425 && c9729Mo28589.length() == i) {
                            c13929.m31664(runnableC21169);
                            c13929.m56473reset((CharSequence) c9729Mo28589);
                            c13929.m56472region(c7421.f19409, c7421.f19418);
                            boolean z4 = false;
                            if (z) {
                                int iRegionStart = c13929.regionStart();
                                int iMax = Math.max(iRegionStart, c7421.f19422);
                                try {
                                    if (m5959(c13929, iMax, c7421.f19408)) {
                                        c20833.m47063(c13929);
                                    } else if (z2 || !c3397.m5958(c7421, true)) {
                                        if (c3397.m5957(c7421) && iMax > iRegionStart && m5959(c13929, iRegionStart, true)) {
                                            c20833.m47063(c13929);
                                        }
                                        z3 = z4;
                                        runnable = new Runnable() { // from class: l.ۜۧܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C3397.m5952(this.f23761, c7421, z3, c20833, z2);
                                            }
                                        };
                                        c9729Mo28589.close();
                                        c13929.m31664((Runnable) null);
                                        c13929.m56473reset((CharSequence) "");
                                        c7421.f19419 = true;
                                        runnableC18820 = new RunnableC18820(0, c7421);
                                    } else {
                                        c9729Mo28589.close();
                                        c13929.m31664((Runnable) null);
                                        c13929.m56473reset((CharSequence) "");
                                        c7421.f19419 = true;
                                        runnableC18821 = new RunnableC18820(0, c7421);
                                    }
                                    c9729Mo28589.close();
                                    c13929.m31664((Runnable) null);
                                    c13929.m56473reset((CharSequence) "");
                                    c7421.f19419 = true;
                                    runnableC18820 = new RunnableC18820(0, c7421);
                                } catch (UncheckedIOException e3) {
                                    e2 = e3;
                                    C7050.m16212(new Runnable() { // from class: l.᩷ۧܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C3397.m5949(this.f70158, c7421, e2);
                                        }
                                    });
                                    c13929.m31664((Runnable) null);
                                    c13929.m56473reset((CharSequence) "");
                                    c7421.f19419 = true;
                                    runnableC18820 = new RunnableC18820(0, c7421);
                                } catch (CancellationException unused) {
                                    c13929.m31664((Runnable) null);
                                    c13929.m56473reset((CharSequence) "");
                                    c7421.f19419 = true;
                                    runnableC18820 = new RunnableC18820(0, c7421);
                                } catch (C6138 e4) {
                                    e2 = e4;
                                    C7050.m16212(new Runnable() { // from class: l.᩷ۧܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C3397.m5949(this.f70158, c7421, e2);
                                        }
                                    });
                                    c13929.m31664((Runnable) null);
                                    c13929.m56473reset((CharSequence) "");
                                    c7421.f19419 = true;
                                    runnableC18820 = new RunnableC18820(0, c7421);
                                } catch (C16150 e5) {
                                    e = e5;
                                    C7050.m16212(new Runnable() { // from class: l.ܳۧܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C3397.m5950(this.f47482, c7421, e);
                                        }
                                    });
                                    c13929.m31664((Runnable) null);
                                    c13929.m56473reset((CharSequence) "");
                                    c7421.f19419 = true;
                                    runnableC18820 = new RunnableC18820(0, c7421);
                                } catch (Throwable unused2) {
                                    C7050.m16212(new Runnable() { // from class: l.᩻ۧܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C3397.m5947(this.f79399, c7421);
                                        }
                                    });
                                    c13929.m31664((Runnable) null);
                                    c13929.m56473reset((CharSequence) "");
                                    c7421.f19419 = true;
                                    runnableC18820 = new RunnableC18820(0, c7421);
                                }
                                z4 = true;
                                z3 = z4;
                                runnable = new Runnable() { // from class: l.ۜۧܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C3397.m5952(this.f23761, c7421, z3, c20833, z2);
                                    }
                                };
                            } else if (m5959(c13929, c13929.regionStart(), true)) {
                                c20833.m47063(c13929);
                                int iStart = c13929.start();
                                int i2 = c7421.f19423;
                                if (iStart < i2) {
                                    i = i2;
                                } else if (!z2 && c3397.m5958(c7421, false)) {
                                    c9729Mo28589.close();
                                    c13929.m31664((Runnable) null);
                                    c13929.m56473reset((CharSequence) "");
                                    c7421.f19419 = true;
                                    runnableC18821 = new RunnableC18820(0, c7421);
                                }
                                while (C14028.m31865(c13929) && c13929.start() < i) {
                                    c20833.m47063(c13929);
                                }
                                z3 = true;
                                runnable = new Runnable() { // from class: l.ۜۧܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C3397.m5952(this.f23761, c7421, z3, c20833, z2);
                                    }
                                };
                                c9729Mo28589.close();
                                c13929.m31664((Runnable) null);
                                c13929.m56473reset((CharSequence) "");
                                c7421.f19419 = true;
                                runnableC18820 = new RunnableC18820(0, c7421);
                            } else if (z2 || !c3397.m5958(c7421, false)) {
                                z3 = false;
                                runnable = new Runnable() { // from class: l.ۜۧܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C3397.m5952(this.f23761, c7421, z3, c20833, z2);
                                    }
                                };
                                c9729Mo28589.close();
                                c13929.m31664((Runnable) null);
                                c13929.m56473reset((CharSequence) "");
                                c7421.f19419 = true;
                                runnableC18820 = new RunnableC18820(0, c7421);
                            } else {
                                c9729Mo28589.close();
                                c13929.m31664((Runnable) null);
                                c13929.m56473reset((CharSequence) "");
                                c7421.f19419 = true;
                                runnableC18821 = new RunnableC18820(0, c7421);
                            }
                            C7050.m16212(runnableC18820);
                            if (runnable != null) {
                                C7050.m16212(runnable);
                            }
                        }
                        c9729Mo28589.close();
                        c13929.m31664((Runnable) null);
                        c13929.m56473reset((CharSequence) "");
                        c7421.f19419 = true;
                        runnableC18821 = new RunnableC18820(0, c7421);
                    } catch (Throwable th) {
                        try {
                            c9729Mo28589.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    c13929.m31664((Runnable) null);
                    c13929.m56473reset((CharSequence) "");
                    c7421.f19419 = true;
                    runnableC18821 = new RunnableC18820(0, c7421);
                }
                C7050.m16212(runnableC18821);
            } catch (Throwable th3) {
                c13929.m31664((Runnable) null);
                c13929.m56473reset((CharSequence) "");
                c7421.f19419 = true;
                C7050.m16212(new RunnableC18820(0, c7421));
                throw th3;
            }
        } catch (UncheckedIOException e6) {
            e = e6;
            e2 = e;
            runnable = null;
            C7050.m16212(new Runnable() { // from class: l.᩷ۧܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C3397.m5949(this.f70158, c7421, e2);
                }
            });
            c13929.m31664((Runnable) null);
            c13929.m56473reset((CharSequence) "");
            c7421.f19419 = true;
            runnableC18820 = new RunnableC18820(0, c7421);
            C7050.m16212(runnableC18820);
            if (runnable != null) {
                C7050.m16212(runnable);
            }
        } catch (CancellationException unused3) {
            runnable = null;
        } catch (C6138 e7) {
            e = e7;
            e2 = e;
            runnable = null;
            C7050.m16212(new Runnable() { // from class: l.᩷ۧܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C3397.m5949(this.f70158, c7421, e2);
                }
            });
            c13929.m31664((Runnable) null);
            c13929.m56473reset((CharSequence) "");
            c7421.f19419 = true;
            runnableC18820 = new RunnableC18820(0, c7421);
            C7050.m16212(runnableC18820);
            if (runnable != null) {
                C7050.m16212(runnable);
            }
        } catch (C16150 e8) {
            e = e8;
            runnable = null;
        } catch (Throwable unused4) {
            runnable = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5952(C3397 c3397, C7421 c7421, boolean z, C20833 c20833, boolean z2) {
        if (c3397.m5957(c7421) && c7421.f19410.m35875()) {
            c3397.f6740 = z;
            int i = c7421.f19407;
            c3397.f6749 = i;
            if (z) {
                c3397.f6748 = c20833;
                c3397.f6745 = i;
                c3397.f6724 = c7421.f19406;
                c3397.f6726 = c7421.f19425;
                c3397.f6734.requestFocus();
                c3397.f6734.mo27944(c20833.m47065(), c20833.m47062());
                c3397.f6734.m32494(false);
                return;
            }
            c3397.m5971(z2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5949(C3397 c3397, C7421 c7421, RuntimeException runtimeException) {
        if (c3397.m5957(c7421) && c7421.f19410.m35875()) {
            c3397.f6734.m32421(c7421.f19406, runtimeException);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5950(C3397 c3397, C7421 c7421, C16150 c16150) {
        if (c3397.m5957(c7421) && c7421.f19410.m35875()) {
            C22682.m50800(c16150.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5947(C3397 c3397, C7421 c7421) {
        if (c3397.m5957(c7421) && c7421.f19410.m35875()) {
            C22682.m50799(R.string.MT_Protector);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ac */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m5958(final C7421 c7421, boolean z) throws Throwable {
        C13929 c13929Matcher;
        InterfaceC4739 interfaceC4739 = c7421.f19424;
        C15802 c15802 = c7421.f19410;
        if (interfaceC4739 == null || !c7421.f19412 || c7421.f19414 != null || !m5957(c7421)) {
            return false;
        }
        int iMo10038 = interfaceC4739.mo10038();
        int iMo10041 = interfaceC4739.mo10041();
        c13929Matcher = c7421.f19417.pattern().matcher((CharSequence) "");
        c13929Matcher.m31669();
        C12826.requireNonNull(c15802);
        c13929Matcher.m31664(new RunnableC21169(0, c15802));
        for (int i = 1; i < iMo10038; i++) {
            try {
                c15802.m35874();
                if (!m5957(c7421)) {
                    break;
                }
                try {
                    final int i2 = ((z ? i : iMo10038 - i) + iMo10041) % iMo10038;
                    final C20833 c20833 = new C20833();
                    try {
                        C9729 c9729Mo10039 = interfaceC4739.mo10039(i2);
                        try {
                            c9729Mo10039.m22746(new RunnableC21169(0, c15802));
                            c13929Matcher.m56473reset((CharSequence) c9729Mo10039);
                            if (m5959(c13929Matcher, 0, true)) {
                                c20833.m47063(c13929Matcher);
                                if (!z) {
                                    while (C14028.m31865(c13929Matcher)) {
                                        c20833.m47063(c13929Matcher);
                                    }
                                }
                                c9729Mo10039.close();
                                c13929Matcher.m56473reset((CharSequence) "");
                                C7050.m16212(new Runnable() { // from class: l.ۢۧܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C3397.m5948(this.f31914, c7421, i2, c20833);
                                    }
                                });
                                c13929Matcher.m31664((Runnable) null);
                                c13929Matcher.m56473reset((CharSequence) "");
                                return true;
                            }
                            c9729Mo10039.close();
                            c13929Matcher.m56473reset((CharSequence) "");
                        } catch (Throwable th) {
                            try {
                                c9729Mo10039.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
            c13929Matcher.m31664((Runnable) null);
            c13929Matcher.m56473reset((CharSequence) "");
            throw th;
        }
        c13929Matcher.m31664((Runnable) null);
        c13929Matcher.m56473reset((CharSequence) "");
        return false;
        c13929Matcher.m56473reset((CharSequence) "");
        throw th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۡۧܿ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5948(C3397 c3397, final C7421 c7421, int i, final C20833 c20833) {
        if (c3397.m5957(c7421) && c7421.f19410.m35875()) {
            c7421.m17142();
            c7421.f19424.mo10040(i, new Runnable() { // from class: l.ۡۧܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C3397.m5951(this.f29852, c7421, c20833);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5951(C3397 c3397, C7421 c7421, C20833 c20833) {
        if (C12826.equals(c3397.f6732, c7421.f19415) && c3397.m5989() == c7421.f19421 && c3397.f6721) {
            c3397.m5954(c7421.f19417.pattern());
            int i = c3397.f6734.f40244;
            c3397.f6749 = i;
            c3397.f6729 = i;
            c3397.f6746 = null;
            c3397.f6748 = c20833;
            c3397.f6740 = true;
            c3397.f6745 = i;
            InterfaceC9768 interfaceC9768M32500 = c3397.f6734.m32500();
            c3397.f6724 = interfaceC9768M32500;
            c3397.f6726 = interfaceC9768M32500.mo28581();
            c3397.f6734.requestFocus();
            c3397.f6734.mo27944(c20833.m47065(), c20833.m47062());
            c3397.f6734.m32494(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m5984(String str, String str2) {
        String str3;
        if (this.f6739.m24763()) {
            return;
        }
        C14146 c14146 = this.f6734;
        if (c14146.m32505() || c14146.f40275.mo11814()) {
            return;
        }
        if (!m5965() || this.f6749 != c14146.f40244 || ((this.f6740 && (this.f6724 != this.f6744 || this.f6726 != this.f6743)) || (str3 = this.f6732) == null || !str3.equals(str) || !C12826.equals(this.f6746, c14146.m32582()) || this.f6737 != this.f6736 || this.f6731 != this.f6728 || this.f6741 != this.f6723)) {
            if (m5976(str)) {
                m5955(this.f6742, true);
                return;
            } else {
                m5943(str, this.f6742, true);
                return;
            }
        }
        if (!this.f6740) {
            m5971(true);
            return;
        }
        if (c14146.m32508() != this.f6748.m47065() || c14146.m32512() != this.f6748.m47062()) {
            m5955(this.f6742, true);
            return;
        }
        int iM47065 = this.f6748.m47065();
        int iM47062 = this.f6748.m47062();
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        try {
            if (this.f6736) {
                C9729 c9729Mo28589 = interfaceC9768M32500.mo28589();
                try {
                    if (c9729Mo28589.m22747() != this.f6726) {
                        m5943(str, this.f6742, true);
                        c9729Mo28589.close();
                        return;
                    } else {
                        C20833 c20833 = this.f6748;
                        StringBuilder sb = new StringBuilder();
                        C15269.m34742(new C20162(c20833, c9729Mo28589), sb, str2);
                        str2 = sb.toString();
                        c9729Mo28589.close();
                    }
                } catch (Throwable th) {
                    try {
                        c9729Mo28589.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            InterfaceC6080 interfaceC6080 = this.f6733;
            if (interfaceC6080 != null) {
                interfaceC6080.mo13842();
            }
            interfaceC9768M32500.replace(iM47065, iM47062, str2);
            c14146.m32565(false);
            this.f6729 = -1;
            this.f6749 = c14146.f40244;
            c14146.requestFocus();
            if (this.f6746 != null) {
                this.f6746 = c14146.m32582();
            }
            m5954(this.f6725.pattern());
            if (this.f6727) {
                return;
            }
            m5955(this.f6742, true);
            if (this.f6740) {
                return;
            }
            c14146.mo27941(str2.length() + iM47065);
        } catch (UncheckedIOException e) {
            e = e;
            if (c14146.m32421(interfaceC9768M32500, e)) {
                throw e;
            }
        } catch (PatternSyntaxException e2) {
            m5944(e2);
        } catch (C6138 e3) {
            e = e3;
            if (c14146.m32421(interfaceC9768M32500, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m5991(String str, String str2) {
        if (this.f6735 == null && !this.f6739.m24763()) {
            C14146 c14146 = this.f6734;
            if (c14146.m32505() || c14146.f40275.mo11814()) {
                return;
            }
            this.f6749 = -1;
            this.f6729 = -1;
            if (str.length() == 0) {
                return;
            }
            try {
                C13259 c13259M30303 = C13259.m30303(m5989(), str);
                if (this.f6736) {
                    try {
                        C15269.m34740(c13259M30303, str2);
                    } catch (PatternSyntaxException e) {
                        m5944(e);
                        return;
                    }
                }
                InterfaceC6080 interfaceC6080 = this.f6733;
                if (interfaceC6080 != null) {
                    interfaceC6080.mo13846();
                }
                InterfaceC6080 interfaceC6081 = this.f6733;
                if (interfaceC6081 != null) {
                    interfaceC6081.mo13842();
                }
                InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
                int iMo28581 = interfaceC9768M32500.mo28581();
                final C14698 c14698M32582 = c14146.m32582();
                boolean z = this.f6736;
                m5978();
                C15802 c15802 = new C15802(c14146, this.f6722, R.string.MT_Protector, new BooleanSupplier() { // from class: l.ᩳۧܿ
                    @Override // java.util.function.BooleanSupplier
                    public final boolean getAsBoolean() {
                        return C12826.equals(c14698M32582, this.f59383.f6734.m32582());
                    }
                });
                this.f6735 = c15802;
                new C17478(this, c15802, interfaceC9768M32500, iMo28581, c13259M30303, c14698M32582, str2, z, C9829.toPath(c14146.getContext().getCacheDir()).resolve("replace-output")).m22250();
            } catch (PatternSyntaxException e2) {
                m5944(e2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5986(InterfaceC6080 interfaceC6080) {
        this.f6733 = interfaceC6080;
    }

    /* JADX INFO: renamed from: ۘ */
    public static void m5961(C3397 c3397) {
        InterfaceC6080 interfaceC6080 = c3397.f6733;
    }

    /* JADX INFO: renamed from: ۖ */
    public static void m5960(C3397 c3397) {
        InterfaceC6080 interfaceC6080 = c3397.f6733;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m5971(boolean z) {
        this.f6733.mo13845(this.f6746 == null && this.f6730 != null && (!this.f6721 || z));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5945(C3397 c3397, int i) {
        InterfaceC6080 interfaceC6080 = c3397.f6733;
        if (interfaceC6080 != null) {
            interfaceC6080.mo13843(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m5944(PatternSyntaxException patternSyntaxException) {
        InterfaceC6080 interfaceC6080 = this.f6733;
        if (interfaceC6080 != null) {
            interfaceC6080.mo13844(patternSyntaxException);
        }
    }
}
