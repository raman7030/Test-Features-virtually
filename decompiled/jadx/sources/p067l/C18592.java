package p067l;

/* JADX INFO: renamed from: l.ܿۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18592 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f55509;

    /* JADX INFO: renamed from: ۖ */
    public C8243 f55510;

    /* JADX INFO: renamed from: ۘ */
    public final AbstractC7593 f55511;

    /* JADX INFO: renamed from: ۜ */
    public boolean f55512;

    /* JADX INFO: renamed from: ۡ */
    public long f55513;

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC19537[] f55514;

    /* JADX INFO: renamed from: ۧ */
    public boolean f55515;

    /* JADX INFO: renamed from: ܳ */
    public final C5182 f55516;

    /* JADX INFO: renamed from: ܺ */
    public final InterfaceC20314[] f55517;

    /* JADX INFO: renamed from: ܽ */
    public C15909 f55518;

    /* JADX INFO: renamed from: ܿ */
    public final Object f55519;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean[] f55520;

    /* JADX INFO: renamed from: ᩴ */
    public C3569 f55521;

    /* JADX INFO: renamed from: ᩵ */
    public final Object f55522;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f55523;

    /* JADX INFO: renamed from: ᩻ */
    public C18592 f55524;

    public C18592(InterfaceC19537[] interfaceC19537Arr, long j, AbstractC7593 abstractC7593, InterfaceC23016 interfaceC23016, C5182 c5182, C15909 c15909, C3569 c3569) {
        this.f55514 = interfaceC19537Arr;
        this.f55513 = j;
        this.f55511 = abstractC7593;
        this.f55516 = c5182;
        C17474 c17474 = c15909.f46022;
        this.f55522 = c17474.f52252;
        this.f55518 = c15909;
        this.f55510 = C8243.f21835;
        this.f55521 = c3569;
        this.f55517 = new InterfaceC20314[interfaceC19537Arr.length];
        this.f55520 = new boolean[interfaceC19537Arr.length];
        long j2 = c15909.f46019;
        long j3 = c15909.f46020;
        boolean z = c15909.f46018;
        InterfaceC11441 interfaceC11441M11108 = c5182.m11108(c17474, interfaceC23016, j2);
        this.f55519 = j3 != -9223372036854775807L ? new C5820(interfaceC11441M11108, !z, 0L, j3) : interfaceC11441M11108;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m42316() {
        return this.f55513;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m42317(long j) {
        return j - this.f55513;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m42320(long j) {
        return j + this.f55513;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42314(long j) {
        this.f55513 = j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m42319() {
        return this.f55518.f46019 + this.f55513;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ᩻ */
    public final boolean m42322() {
        if (this.f55523) {
            return !this.f55515 || this.f55519.mo4633() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m42310() {
        if (this.f55523) {
            return m42322() || m42303() - this.f55518.f46019 >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ֫ */
    public final long m42303() {
        if (!this.f55523) {
            return this.f55518.f46019;
        }
        long jMo4633 = this.f55515 ? this.f55519.mo4633() : Long.MIN_VALUE;
        return jMo4633 == Long.MIN_VALUE ? this.f55518.f46017 : jMo4633;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ֫ */
    public final void m42306(float f, AbstractC6974 abstractC6974, boolean z) {
        this.f55523 = true;
        this.f55510 = this.f55519.mo13102();
        C3569 c3569M42312 = m42312(f, abstractC6974, z);
        C15909 c15909 = this.f55518;
        long jMax = c15909.f46019;
        long j = c15909.f46017;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM42304 = m42304(c3569M42312, jMax);
        long j2 = this.f55513;
        C15909 c159010 = this.f55518;
        this.f55513 = (c159010.f46019 - jM42304) + j2;
        this.f55518 = c159010.m36025(jM42304);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m42304(C3569 c3569, long j) {
        return m42305(c3569, j, false, new boolean[this.f55514.length]);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ֫ */
    public final long m42305(C3569 c3569, long j, boolean z, boolean[] zArr) {
        InterfaceC19537[] interfaceC19537Arr;
        InterfaceC20314[] interfaceC20314Arr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c3569.f7245) {
                break;
            }
            if (z || !c3569.m6564(this.f55521, i)) {
                z2 = false;
            }
            this.f55520[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            interfaceC19537Arr = this.f55514;
            int length = interfaceC19537Arr.length;
            interfaceC20314Arr = this.f55517;
            if (i2 >= length) {
                break;
            }
            if (((AbstractC7054) interfaceC19537Arr[i2]).mo8290() == -2) {
                interfaceC20314Arr[i2] = null;
            }
            i2++;
        }
        m42301();
        this.f55521 = c3569;
        m42302();
        long jMo13092 = this.f55519.mo13092(c3569.f7248, this.f55520, this.f55517, zArr, j);
        for (int i3 = 0; i3 < interfaceC19537Arr.length; i3++) {
            if (((AbstractC7054) interfaceC19537Arr[i3]).mo8290() == -2 && this.f55521.m6563(i3)) {
                interfaceC20314Arr[i3] = new C11419();
            }
        }
        this.f55515 = false;
        for (int i4 = 0; i4 < interfaceC20314Arr.length; i4++) {
            if (interfaceC20314Arr[i4] != null) {
                C23877.m52960(c3569.m6563(i4));
                if (((AbstractC7054) interfaceC19537Arr[i4]).mo8290() != -2) {
                    this.f55515 = true;
                }
            } else {
                C23877.m52960(c3569.f7248[i4] == null);
            }
        }
        return jMo13092;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ᩷ */
    public final void m42321() {
        m42301();
        ?? r0 = this.f55519;
        try {
            boolean z = r0 instanceof C5820;
            C5182 c5182 = this.f55516;
            if (z) {
                c5182.m11110(((C5820) r0).f14286);
            } else {
                c5182.m11110((InterfaceC11441) r0);
            }
        } catch (RuntimeException e) {
            C21334.m48348("Period release failed.", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42309(C18592 c18592) {
        if (c18592 == this.f55524) {
            return;
        }
        m42301();
        this.f55524 = c18592;
        m42302();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C18592 m42313() {
        return this.f55524;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C3569 m42312(float f, AbstractC6974 abstractC6974, boolean z) {
        InterfaceC11617[] interfaceC11617Arr;
        C8243 c8243 = this.f55510;
        C17474 c17474 = this.f55518.f46022;
        AbstractC7593 abstractC7593 = this.f55511;
        InterfaceC19537[] interfaceC19537Arr = this.f55514;
        C3569 c3569Mo14189 = abstractC7593.mo14189(interfaceC19537Arr, c8243, c17474, abstractC6974);
        int i = 0;
        while (true) {
            int i2 = c3569Mo14189.f7245;
            interfaceC11617Arr = c3569Mo14189.f7248;
            if (i >= i2) {
                break;
            }
            boolean z2 = true;
            if (c3569Mo14189.m6563(i)) {
                if (interfaceC11617Arr[i] == null && ((AbstractC7054) interfaceC19537Arr[i]).mo8290() != -2) {
                    z2 = false;
                }
                C23877.m52960(z2);
            } else {
                C23877.m52960(interfaceC11617Arr[i] == null);
            }
            i++;
        }
        for (InterfaceC11617 interfaceC11617 : interfaceC11617Arr) {
            if (interfaceC11617 != null) {
                interfaceC11617.mo4749(f);
                interfaceC11617.mo4750(z);
            }
        }
        return c3569Mo14189;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C8243 m42318() {
        return this.f55510;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C3569 m42315() {
        return this.f55521;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m42311() {
        Object obj = this.f55519;
        if (obj instanceof C5820) {
            long j = this.f55518.f46020;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((C5820) obj).m13099(j);
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private void m42301() {
        if (this.f55524 != null) {
            return;
        }
        int i = 0;
        while (true) {
            C3569 c3569 = this.f55521;
            if (i >= c3569.f7245) {
                return;
            }
            boolean zM6563 = c3569.m6563(i);
            InterfaceC11617 interfaceC11617 = this.f55521.f7248[i];
            if (zM6563 && interfaceC11617 != null) {
                interfaceC11617.mo4760();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    private void m42302() {
        if (this.f55524 != null) {
            return;
        }
        int i = 0;
        while (true) {
            C3569 c3569 = this.f55521;
            if (i >= c3569.f7245) {
                return;
            }
            boolean zM6563 = c3569.m6563(i);
            InterfaceC11617 interfaceC11617 = this.f55521.f7248[i];
            if (zM6563 && interfaceC11617 != null) {
                interfaceC11617.mo4757();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ֫ */
    public final void m42307(long j) {
        C23877.m52960(this.f55524 == null);
        if (this.f55523) {
            this.f55519.mo4635(j - this.f55513);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ֫ */
    public final void m42308(C13268 c13268) {
        C23877.m52960(this.f55524 == null);
        this.f55519.mo4632(c13268);
    }
}
