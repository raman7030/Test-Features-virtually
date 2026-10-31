package l;

import bin.mt.plus.R;
import java.io.UncheckedIOException;
import java.util.concurrent.CancellationException;
import java.util.function.BooleanSupplier;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: l.֨ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes2.dex */
public final class C1082 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f3950;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f3951;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f3952;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f3953;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f3955;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f3956;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f3957;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public InterfaceC2494 f3959;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f3960;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f3961;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC3905 f3962;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12392 f3963;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14134 f3964;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f3965;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f3966;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public PatternSyntaxException f3967;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f3970;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f3972;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f3973;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C12973 f3975;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C5316 f3976;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f3958 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f3978 = -1;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C12164 f3954 = null;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f3949 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19428 f3977 = new C19428();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f3974 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f3969 = false;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8817 f3968 = C8817.m22786(150);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f3971 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m3684(final boolean z, final boolean z2) {
        C5316 c5316 = this.f3976;
        if (c5316 != null && !c5316.m15239()) {
            c5316.m15234();
        }
        C12164 c12164 = this.f3954;
        if (c12164 == null) {
            this.f3969 = false;
            this.f3978 = -1;
            this.f3974 = -1;
            this.f3953 = null;
            PatternSyntaxException patternSyntaxException = this.f3967;
            if (patternSyntaxException != null) {
                m3673(patternSyntaxException);
            }
            return;
        }
        if (c5316 != null && c5316.f16580 == c12164 && !c5316.f16582) {
            m3683(this.f3954.pattern());
        }
        final C5316 c5317 = new C5316(this);
        this.f3976 = c5317;
        this.f3969 = false;
        this.f3978 = -1;
        c5317.m15235(C1802.f6208.submit(new Runnable() { // from class: l.ܽۧܿ
            @Override // java.lang.Runnable
            public final void run() {
                C1082.m3682(this.f51001, c5317, z, z2);
            }
        }));
    }

    public C1082(AbstractActivityC3346 abstractActivityC3346, C12392 c12392) {
        this.f3951 = abstractActivityC3346;
        this.f3963 = c12392;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3714(InterfaceC2494 interfaceC2494) {
        if (this.f3959 != interfaceC2494) {
            m3707();
        }
        this.f3959 = interfaceC2494;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m3727() {
        return this.f3950;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3724(boolean z) {
        if (this.f3950 != z) {
            m3707();
        }
        this.f3950 = z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m3705(String str) {
        String str2;
        if (!m3694()) {
            return false;
        }
        int i = this.f3958;
        C12392 c12392 = this.f3963;
        return i == c12392.f37227 && (str2 = this.f3961) != null && str2.equals(str) && C11003.equals(this.f3975, c12392.m30518()) && this.f3966 == this.f3965 && this.f3960 == this.f3957 && this.f3970 == this.f3952;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3711(byte b) {
        boolean z = (b & 1) != 0;
        boolean z2 = (b & 2) != 0;
        boolean z3 = (b & 4) != 0;
        m3724((b & 8) != 0);
        boolean z4 = (b & 16) != 0;
        m3728(z);
        m3726(z2);
        m3716(z3);
        this.f3956 = z4;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m3728(boolean z) {
        if (this.f3965 != z) {
            m3717();
        }
        this.f3965 = z;
        InterfaceC3905 interfaceC3905 = this.f3962;
        if (interfaceC3905 != null) {
            interfaceC3905.mo11911(z);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m3726(boolean z) {
        if (this.f3957 != z) {
            m3717();
        }
        this.f3957 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3716(boolean z) {
        if (this.f3952 != z) {
            m3717();
        }
        this.f3952 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3721(boolean z) {
        this.f3956 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m3710() {
        byte b = this.f3965 ? (byte) 1 : (byte) 0;
        if (this.f3957) {
            b = (byte) (b | 2);
        }
        if (this.f3952) {
            b = (byte) (b | 4);
        }
        if (this.f3950) {
            b = (byte) (b | 8);
        }
        return this.f3956 ? (byte) (b | 16) : b;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m3722() {
        return this.f3965;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m3730() {
        return this.f3957;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m3725() {
        return this.f3952;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m3729() {
        return this.f3956;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3718() {
        boolean z = this.f3965;
        boolean z2 = this.f3952;
        boolean z3 = this.f3957;
        int i = z ? 8 : 16;
        if (!z2) {
            i |= 66;
        }
        return z3 ? i | 512 : i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3712(String str) {
        if (this.f3968.m22793() || this.f3963.f37258.mo9770()) {
            return;
        }
        this.f3971 = true;
        if (!m3705(str)) {
            m3672(str, true, false);
        } else {
            m3684(true, false);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3719(String str) {
        if (this.f3968.m22793() || this.f3963.f37258.mo9770()) {
            return;
        }
        this.f3971 = false;
        if (!m3705(str)) {
            m3672(str, false, false);
        } else {
            m3684(false, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3672(String str, boolean z, boolean z2) {
        this.f3969 = false;
        this.f3966 = this.f3965;
        this.f3960 = this.f3957;
        this.f3961 = str;
        C12392 c12392 = this.f3963;
        this.f3975 = c12392.m30518();
        this.f3970 = this.f3952;
        int i = c12392.f37227;
        this.f3978 = i;
        this.f3958 = i;
        this.f3954 = null;
        if (str.isEmpty()) {
            m3707();
            return;
        }
        try {
            C11459 c11459M28259 = C11459.m28259(m3718(), str);
            this.f3967 = null;
            m3683(c11459M28259);
            InterfaceC3905 interfaceC3905 = this.f3962;
            if (interfaceC3905 != null) {
                interfaceC3905.mo11910();
            }
            m3684(z, z2);
        } catch (PatternSyntaxException e) {
            m3673(e);
            this.f3967 = e;
            m3707();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m3723(String str) {
        if (!C11003.equals(this.f3961, str)) {
            m3707();
        }
        C12392 c12392 = this.f3963;
        C6458 c6458 = c12392.f37173;
        if (str.isEmpty()) {
            c6458.m17851();
            c12392.m30423();
        } else {
            try {
                c6458.m17853(c12392.m30436(), C11459.m28259(m3718(), str));
            } catch (PatternSyntaxException unused) {
                c6458.m17858();
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m3717() {
        m3707();
        C14134 c14134 = this.f3964;
        if (c14134 != null) {
            c14134.m33740();
        }
        this.f3963.f37173.m17851();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m3688(C12164 c12164, int i, boolean z) {
        if (C12268.m29802(c12164, i)) {
            return z || c12164.start() != i || c12164.end() != i || C12268.m29803(c12164);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m3696(C1082 c1082, int i) {
        if (c1082.f3977.m44770() == null || c1082.f3954 == null || c1082.f3977.m44770() != c1082.f3954.pattern() || c1082.f3953 == null) {
            return false;
        }
        int i2 = c1082.f3974;
        C12392 c12392 = c1082.f3963;
        return i2 == c12392.f37227 && c1082.f3953 == c12392.m30436() && c1082.f3955 == c1082.f3953.mo26548() && c1082.f3977.m44771() == i && c1082.f3977.m44768() == i && c1082.f3963.m30444() == i && c1082.f3963.m30448() == i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3683(C11459 c11459) {
        InterfaceC7785 interfaceC7785M30436 = this.f3963.m30436();
        this.f3973 = interfaceC7785M30436;
        this.f3972 = interfaceC7785M30436.mo26548();
        this.f3949 = this.f3963.f37227;
        C5316 c5316 = this.f3976;
        C12164 c12164 = this.f3954;
        if (c12164 == null || c12164.pattern() != c11459 || (c5316 != null && c5316.f16580 == this.f3954 && !c5316.f16582)) {
            C12164 c12164Matcher = c11459.matcher("");
            c12164Matcher.m29604();
            this.f3954 = c12164Matcher;
        } else {
            C12164 c12165 = this.f3954;
            c12165.m29615reset((CharSequence) "");
            c12165.m29604();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m3694() {
        InterfaceC7785 interfaceC7785;
        if (this.f3954 == null) {
            return false;
        }
        InterfaceC7785 interfaceC7786 = this.f3973;
        C12392 c12392 = this.f3963;
        return interfaceC7786 == c12392.m30436() && (interfaceC7785 = this.f3973) != null && this.f3972 == interfaceC7785.mo26548() && this.f3949 == c12392.f37227;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m3707() {
        C5316 c5316 = this.f3976;
        this.f3976 = null;
        if (c5316 != null) {
            c5316.m15234();
            c5316.m15236();
        }
        this.f3969 = false;
        this.f3978 = -1;
        this.f3974 = -1;
        this.f3953 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m3698(C5316 c5316) {
        return this.f3976 == c5316 && !c5316.m15237() && this.f3954 == c5316.f16580 && C11003.equals(this.f3961, c5316.f16578) && m3718() == c5316.f16584 && C11003.equals(this.f3963.m30518(), c5316.f16577) && this.f3959 == c5316.f16587 && this.f3950 == c5316.f16575;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m3686(C5316 c5316) {
        if (!m3698(c5316)) {
            return false;
        }
        InterfaceC7785 interfaceC7785 = c5316.f16569;
        C12392 c12392 = this.f3963;
        return interfaceC7785 == c12392.m30436() && c5316.f16588 == c5316.f16569.mo26548() && c5316.f16570 == c12392.f37227;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3682(final C1082 c1082, final C5316 c5316, boolean z, final boolean z2) {
        Runnable runnable;
        final C14501 e;
        final RuntimeException e2;
        RunnableC17310 runnableC17310;
        RunnableC17310 runnableC17311;
        final boolean z3;
        c5316.m15238();
        int i = c5316.f16574;
        C14134 c14134 = c5316.f16573;
        C12164 c12164 = c5316.f16580;
        final C19428 c19428 = new C19428();
        try {
            try {
                c14134.m33742();
                if (c1082.m3686(c5316)) {
                    RunnableC19781 runnableC19781 = new RunnableC19781(0, c14134);
                    C7744 c7744Mo26556 = c5316.f16569.mo26556();
                    try {
                        c7744Mo26556.m20766(runnableC19781);
                        if (c1082.m3686(c5316) && c7744Mo26556.m20767() == c5316.f16588 && c7744Mo26556.length() == i) {
                            c12164.m29599(runnableC19781);
                            c12164.m29615reset((CharSequence) c7744Mo26556);
                            c12164.m29614region(c5316.f16572, c5316.f16581);
                            boolean z4 = false;
                            if (z) {
                                int iRegionStart = c12164.regionStart();
                                int iMax = Math.max(iRegionStart, c5316.f16585);
                                try {
                                    if (m3688(c12164, iMax, c5316.f16571)) {
                                        c19428.m44769(c12164);
                                    } else if (z2 || !c1082.m3687(c5316, true)) {
                                        if (c1082.m3686(c5316) && iMax > iRegionStart && m3688(c12164, iRegionStart, true)) {
                                            c19428.m44769(c12164);
                                        }
                                        z3 = z4;
                                        runnable = new Runnable() { // from class: l.ۜۧܿ
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C1082.m3681(this.f20887, c5316, z3, c19428, z2);
                                            }
                                        };
                                        c7744Mo26556.close();
                                        c12164.m29599((Runnable) null);
                                        c12164.m29615reset((CharSequence) "");
                                        c5316.f16582 = true;
                                        runnableC17310 = new RunnableC17310(0, c5316);
                                    } else {
                                        c7744Mo26556.close();
                                        c12164.m29599((Runnable) null);
                                        c12164.m29615reset((CharSequence) "");
                                        c5316.f16582 = true;
                                        runnableC17311 = new RunnableC17310(0, c5316);
                                    }
                                    c7744Mo26556.close();
                                    c12164.m29599((Runnable) null);
                                    c12164.m29615reset((CharSequence) "");
                                    c5316.f16582 = true;
                                    runnableC17310 = new RunnableC17310(0, c5316);
                                } catch (UncheckedIOException e3) {
                                    e2 = e3;
                                    C4925.m14315(new Runnable() { // from class: l.᩷ۧܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C1082.m3678(this.f67475, c5316, e2);
                                        }
                                    });
                                    c12164.m29599((Runnable) null);
                                    c12164.m29615reset((CharSequence) "");
                                    c5316.f16582 = true;
                                    runnableC17310 = new RunnableC17310(0, c5316);
                                } catch (CancellationException unused) {
                                    c12164.m29599((Runnable) null);
                                    c12164.m29615reset((CharSequence) "");
                                    c5316.f16582 = true;
                                    runnableC17310 = new RunnableC17310(0, c5316);
                                } catch (C3966 e4) {
                                    e2 = e4;
                                    C4925.m14315(new Runnable() { // from class: l.᩷ۧܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C1082.m3678(this.f67475, c5316, e2);
                                        }
                                    });
                                    c12164.m29599((Runnable) null);
                                    c12164.m29615reset((CharSequence) "");
                                    c5316.f16582 = true;
                                    runnableC17310 = new RunnableC17310(0, c5316);
                                } catch (C14501 e5) {
                                    e = e5;
                                    C4925.m14315(new Runnable() { // from class: l.ܳۧܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C1082.m3679(this.f44381, c5316, e);
                                        }
                                    });
                                    c12164.m29599((Runnable) null);
                                    c12164.m29615reset((CharSequence) "");
                                    c5316.f16582 = true;
                                    runnableC17310 = new RunnableC17310(0, c5316);
                                } catch (Throwable unused2) {
                                    C4925.m14315(new Runnable() { // from class: l.᩻ۧܿ
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C1082.m3676(this.f76653, c5316);
                                        }
                                    });
                                    c12164.m29599((Runnable) null);
                                    c12164.m29615reset((CharSequence) "");
                                    c5316.f16582 = true;
                                    runnableC17310 = new RunnableC17310(0, c5316);
                                }
                                z4 = true;
                                z3 = z4;
                                runnable = new Runnable() { // from class: l.ۜۧܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C1082.m3681(this.f20887, c5316, z3, c19428, z2);
                                    }
                                };
                            } else if (m3688(c12164, c12164.regionStart(), true)) {
                                c19428.m44769(c12164);
                                int iStart = c12164.start();
                                int i2 = c5316.f16586;
                                if (iStart < i2) {
                                    i = i2;
                                } else if (!z2 && c1082.m3687(c5316, false)) {
                                    c7744Mo26556.close();
                                    c12164.m29599((Runnable) null);
                                    c12164.m29615reset((CharSequence) "");
                                    c5316.f16582 = true;
                                    runnableC17311 = new RunnableC17310(0, c5316);
                                }
                                while (C12268.m29803(c12164) && c12164.start() < i) {
                                    c19428.m44769(c12164);
                                }
                                z3 = true;
                                runnable = new Runnable() { // from class: l.ۜۧܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C1082.m3681(this.f20887, c5316, z3, c19428, z2);
                                    }
                                };
                                c7744Mo26556.close();
                                c12164.m29599((Runnable) null);
                                c12164.m29615reset((CharSequence) "");
                                c5316.f16582 = true;
                                runnableC17310 = new RunnableC17310(0, c5316);
                            } else if (z2 || !c1082.m3687(c5316, false)) {
                                z3 = false;
                                runnable = new Runnable() { // from class: l.ۜۧܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C1082.m3681(this.f20887, c5316, z3, c19428, z2);
                                    }
                                };
                                c7744Mo26556.close();
                                c12164.m29599((Runnable) null);
                                c12164.m29615reset((CharSequence) "");
                                c5316.f16582 = true;
                                runnableC17310 = new RunnableC17310(0, c5316);
                            } else {
                                c7744Mo26556.close();
                                c12164.m29599((Runnable) null);
                                c12164.m29615reset((CharSequence) "");
                                c5316.f16582 = true;
                                runnableC17311 = new RunnableC17310(0, c5316);
                            }
                            C4925.m14315(runnableC17310);
                            if (runnable != null) {
                                C4925.m14315(runnable);
                            }
                        }
                        c7744Mo26556.close();
                        c12164.m29599((Runnable) null);
                        c12164.m29615reset((CharSequence) "");
                        c5316.f16582 = true;
                        runnableC17311 = new RunnableC17310(0, c5316);
                    } catch (Throwable th) {
                        try {
                            c7744Mo26556.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    c12164.m29599((Runnable) null);
                    c12164.m29615reset((CharSequence) "");
                    c5316.f16582 = true;
                    runnableC17311 = new RunnableC17310(0, c5316);
                }
                C4925.m14315(runnableC17311);
            } catch (Throwable th3) {
                c12164.m29599((Runnable) null);
                c12164.m29615reset((CharSequence) "");
                c5316.f16582 = true;
                C4925.m14315(new RunnableC17310(0, c5316));
                throw th3;
            }
        } catch (UncheckedIOException e6) {
            e = e6;
            e2 = e;
            runnable = null;
            C4925.m14315(new Runnable() { // from class: l.᩷ۧܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C1082.m3678(this.f67475, c5316, e2);
                }
            });
            c12164.m29599((Runnable) null);
            c12164.m29615reset((CharSequence) "");
            c5316.f16582 = true;
            runnableC17310 = new RunnableC17310(0, c5316);
            C4925.m14315(runnableC17310);
            if (runnable != null) {
                C4925.m14315(runnable);
            }
        } catch (CancellationException unused3) {
            runnable = null;
        } catch (C3966 e7) {
            e = e7;
            e2 = e;
            runnable = null;
            C4925.m14315(new Runnable() { // from class: l.᩷ۧܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C1082.m3678(this.f67475, c5316, e2);
                }
            });
            c12164.m29599((Runnable) null);
            c12164.m29615reset((CharSequence) "");
            c5316.f16582 = true;
            runnableC17310 = new RunnableC17310(0, c5316);
            C4925.m14315(runnableC17310);
            if (runnable != null) {
                C4925.m14315(runnable);
            }
        } catch (C14501 e8) {
            e = e8;
            runnable = null;
        } catch (Throwable unused4) {
            runnable = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3681(C1082 c1082, C5316 c5316, boolean z, C19428 c19428, boolean z2) {
        if (c1082.m3686(c5316) && c5316.f16573.m33743()) {
            c1082.f3969 = z;
            int i = c5316.f16570;
            c1082.f3978 = i;
            if (z) {
                c1082.f3977 = c19428;
                c1082.f3974 = i;
                c1082.f3953 = c5316.f16569;
                c1082.f3955 = c5316.f16588;
                c1082.f3963.requestFocus();
                c1082.f3963.mo25922(c19428.m44771(), c19428.m44768());
                c1082.f3963.m30430(false);
                return;
            }
            c1082.m3700(z2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3678(C1082 c1082, C5316 c5316, RuntimeException runtimeException) {
        if (c1082.m3686(c5316) && c5316.f16573.m33743()) {
            c1082.f3963.m30357(c5316.f16569, runtimeException);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3679(C1082 c1082, C5316 c5316, C14501 c14501) {
        if (c1082.m3686(c5316) && c5316.f16573.m33743()) {
            C21374.m48464(c14501.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3676(C1082 c1082, C5316 c5316) {
        if (c1082.m3686(c5316) && c5316.f16573.m33743()) {
            C21374.m48463(R.string.MT_Protector);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ac */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m3687(final C5316 c5316, boolean z) throws Throwable {
        C12164 c12164Matcher;
        InterfaceC2494 interfaceC2494 = c5316.f16587;
        C14134 c14134 = c5316.f16573;
        if (interfaceC2494 == null || !c5316.f16575 || c5316.f16577 != null || !m3686(c5316)) {
            return false;
        }
        int iMo7990 = interfaceC2494.mo7990();
        int iMo7993 = interfaceC2494.mo7993();
        c12164Matcher = c5316.f16580.pattern().matcher((CharSequence) "");
        c12164Matcher.m29604();
        C11003.requireNonNull(c14134);
        c12164Matcher.m29599(new RunnableC19781(0, c14134));
        for (int i = 1; i < iMo7990; i++) {
            try {
                c14134.m33742();
                if (!m3686(c5316)) {
                    break;
                }
                try {
                    final int i2 = ((z ? i : iMo7990 - i) + iMo7993) % iMo7990;
                    final C19428 c19428 = new C19428();
                    try {
                        C7744 c7744Mo7991 = interfaceC2494.mo7991(i2);
                        try {
                            c7744Mo7991.m20766(new RunnableC19781(0, c14134));
                            c12164Matcher.m29615reset((CharSequence) c7744Mo7991);
                            if (m3688(c12164Matcher, 0, true)) {
                                c19428.m44769(c12164Matcher);
                                if (!z) {
                                    while (C12268.m29803(c12164Matcher)) {
                                        c19428.m44769(c12164Matcher);
                                    }
                                }
                                c7744Mo7991.close();
                                c12164Matcher.m29615reset((CharSequence) "");
                                C4925.m14315(new Runnable() { // from class: l.ۢۧܿ
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C1082.m3677(this.f28968, c5316, i2, c19428);
                                    }
                                });
                                c12164Matcher.m29599((Runnable) null);
                                c12164Matcher.m29615reset((CharSequence) "");
                                return true;
                            }
                            c7744Mo7991.close();
                            c12164Matcher.m29615reset((CharSequence) "");
                        } catch (Throwable th) {
                            try {
                                c7744Mo7991.close();
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
            c12164Matcher.m29599((Runnable) null);
            c12164Matcher.m29615reset((CharSequence) "");
            throw th;
        }
        c12164Matcher.m29599((Runnable) null);
        c12164Matcher.m29615reset((CharSequence) "");
        return false;
        c12164Matcher.m29615reset((CharSequence) "");
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3677(C1082 c1082, final C5316 c5316, int i, final C19428 c19428) {
        if (c1082.m3686(c5316) && c5316.f16573.m33743()) {
            c5316.m15236();
            c5316.f16587.mo7992(i, new Runnable() { // from class: l.ۡۧܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C1082.m3680(this.f26928, c5316, c19428);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3680(C1082 c1082, C5316 c5316, C19428 c19428) {
        if (C11003.equals(c1082.f3961, c5316.f16578) && c1082.m3718() == c5316.f16584 && c1082.f3950) {
            c1082.m3683(c5316.f16580.pattern());
            int i = c1082.f3963.f37227;
            c1082.f3978 = i;
            c1082.f3958 = i;
            c1082.f3975 = null;
            c1082.f3977 = c19428;
            c1082.f3969 = true;
            c1082.f3974 = i;
            InterfaceC7785 interfaceC7785M30436 = c1082.f3963.m30436();
            c1082.f3953 = interfaceC7785M30436;
            c1082.f3955 = interfaceC7785M30436.mo26548();
            c1082.f3963.requestFocus();
            c1082.f3963.mo25922(c19428.m44771(), c19428.m44768());
            c1082.f3963.m30430(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3713(String str, String str2) {
        String str3;
        if (this.f3968.m22793()) {
            return;
        }
        C12392 c12392 = this.f3963;
        if (c12392.m30441() || c12392.f37258.mo9770()) {
            return;
        }
        if (!m3694() || this.f3978 != c12392.f37227 || ((this.f3969 && (this.f3953 != this.f3973 || this.f3955 != this.f3972)) || (str3 = this.f3961) == null || !str3.equals(str) || !C11003.equals(this.f3975, c12392.m30518()) || this.f3966 != this.f3965 || this.f3960 != this.f3957 || this.f3970 != this.f3952)) {
            if (m3705(str)) {
                m3684(this.f3971, true);
                return;
            } else {
                m3672(str, this.f3971, true);
                return;
            }
        }
        if (!this.f3969) {
            m3700(true);
            return;
        }
        if (c12392.m30444() != this.f3977.m44771() || c12392.m30448() != this.f3977.m44768()) {
            m3684(this.f3971, true);
            return;
        }
        int iM44771 = this.f3977.m44771();
        int iM44768 = this.f3977.m44768();
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        try {
            if (this.f3965) {
                C7744 c7744Mo26556 = interfaceC7785M30436.mo26556();
                try {
                    if (c7744Mo26556.m20767() != this.f3955) {
                        m3672(str, this.f3971, true);
                        c7744Mo26556.close();
                        return;
                    } else {
                        C19428 c19428 = this.f3977;
                        StringBuilder sb = new StringBuilder();
                        C13574.m32630(new C18722(c19428, c7744Mo26556), sb, str2);
                        str2 = sb.toString();
                        c7744Mo26556.close();
                    }
                } catch (Throwable th) {
                    try {
                        c7744Mo26556.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            InterfaceC3905 interfaceC3905 = this.f3962;
            if (interfaceC3905 != null) {
                interfaceC3905.mo11906();
            }
            interfaceC7785M30436.replace(iM44771, iM44768, str2);
            c12392.m30501(false);
            this.f3958 = -1;
            this.f3978 = c12392.f37227;
            c12392.requestFocus();
            if (this.f3975 != null) {
                this.f3975 = c12392.m30518();
            }
            m3683(this.f3954.pattern());
            if (this.f3956) {
                return;
            }
            m3684(this.f3971, true);
            if (this.f3969) {
                return;
            }
            c12392.mo25919(str2.length() + iM44771);
        } catch (UncheckedIOException e) {
            e = e;
            if (c12392.m30357(interfaceC7785M30436, e)) {
                throw e;
            }
        } catch (PatternSyntaxException e2) {
            m3673(e2);
        } catch (C3966 e3) {
            e = e3;
            if (c12392.m30357(interfaceC7785M30436, e)) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m3720(String str, String str2) {
        if (this.f3964 == null && !this.f3968.m22793()) {
            C12392 c12392 = this.f3963;
            if (c12392.m30441() || c12392.f37258.mo9770()) {
                return;
            }
            this.f3978 = -1;
            this.f3958 = -1;
            if (str.length() == 0) {
                return;
            }
            try {
                C11459 c11459M28259 = C11459.m28259(m3718(), str);
                if (this.f3965) {
                    try {
                        C13574.m32628(c11459M28259, str2);
                    } catch (PatternSyntaxException e) {
                        m3673(e);
                        return;
                    }
                }
                InterfaceC3905 interfaceC3905 = this.f3962;
                if (interfaceC3905 != null) {
                    interfaceC3905.mo11910();
                }
                InterfaceC3905 interfaceC3906 = this.f3962;
                if (interfaceC3906 != null) {
                    interfaceC3906.mo11906();
                }
                InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
                int iMo26548 = interfaceC7785M30436.mo26548();
                final C12973 c12973M30518 = c12392.m30518();
                boolean z = this.f3965;
                m3707();
                C14134 c14134 = new C14134(c12392, this.f3951, R.string.MT_Protector, new BooleanSupplier() { // from class: l.ᩳۧܿ
                    @Override // java.util.function.BooleanSupplier
                    public final boolean getAsBoolean() {
                        return C11003.equals(c12973M30518, this.f56186.f3963.m30518());
                    }
                });
                this.f3964 = c14134;
                new C15898(this, c14134, interfaceC7785M30436, iMo26548, c11459M28259, c12973M30518, str2, z, C7850.toPath(c12392.getContext().getCacheDir()).resolve("replace-output")).m20274();
            } catch (PatternSyntaxException e2) {
                m3673(e2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3715(InterfaceC3905 interfaceC3905) {
        this.f3962 = interfaceC3905;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m3690(C1082 c1082) {
        InterfaceC3905 interfaceC3905 = c1082.f3962;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m3689(C1082 c1082) {
        InterfaceC3905 interfaceC3905 = c1082.f3962;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m3700(boolean z) {
        this.f3962.mo11909(this.f3975 == null && this.f3959 != null && (!this.f3950 || z));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3674(C1082 c1082, int i) {
        InterfaceC3905 interfaceC3905 = c1082.f3962;
        if (interfaceC3905 != null) {
            interfaceC3905.mo11907(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m3673(PatternSyntaxException patternSyntaxException) {
        InterfaceC3905 interfaceC3905 = this.f3962;
        if (interfaceC3905 != null) {
            interfaceC3905.mo11908(patternSyntaxException);
        }
    }
}
