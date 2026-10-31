package l;

/* JADX INFO: renamed from: l.ܿۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 48Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17071 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f52327;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6181 f52328;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC5497 f52329;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f52330;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f52331;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18065[] f52332;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f52333;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2961 f52334;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18882[] f52335;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14248 f52336;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f52337;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f52338;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C1263 f52339;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Object f52340;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f52341;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C17071 f52342;

    public C17071(InterfaceC18065[] interfaceC18065Arr, long j, AbstractC5497 abstractC5497, InterfaceC21725 interfaceC21725, C2961 c2961, C14248 c14248, C1263 c1263) {
        this.f52332 = interfaceC18065Arr;
        this.f52331 = j;
        this.f52329 = abstractC5497;
        this.f52334 = c2961;
        C15894 c15894 = c14248.f42930;
        this.f52340 = c15894.f49112;
        this.f52336 = c14248;
        this.f52328 = C6181.f18976;
        this.f52339 = c1263;
        this.f52335 = new InterfaceC18882[interfaceC18065Arr.length];
        this.f52338 = new boolean[interfaceC18065Arr.length];
        long j2 = c14248.f42927;
        long j3 = c14248.f42928;
        boolean z = c14248.f42926;
        InterfaceC9546 interfaceC9546M9056 = c2961.m9056(c15894, interfaceC21725, j2);
        this.f52337 = j3 != -9223372036854775807L ? new C3632(interfaceC9546M9056, !z, 0L, j3) : interfaceC9546M9056;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m40071() {
        return this.f52331;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m40072(long j) {
        return j - this.f52331;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m40075(long j) {
        return j + this.f52331;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40069(long j) {
        this.f52331 = j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m40074() {
        return this.f52336.f42927 + this.f52331;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m40077() {
        if (this.f52341) {
            return !this.f52333 || this.f52337.mo2266() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m40065() {
        if (this.f52341) {
            return m40077() || m40058() - this.f52336.f42927 >= -9223372036854775807L;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m40058() {
        if (!this.f52341) {
            return this.f52336.f42927;
        }
        long jMo2266 = this.f52333 ? this.f52337.mo2266() : Long.MIN_VALUE;
        return jMo2266 == Long.MIN_VALUE ? this.f52336.f42925 : jMo2266;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40061(float f, AbstractC4846 abstractC4846, boolean z) {
        this.f52341 = true;
        this.f52328 = this.f52337.mo11126();
        C1263 c1263M40067 = m40067(f, abstractC4846, z);
        C14248 c14248 = this.f52336;
        long jMax = c14248.f42927;
        long j = c14248.f42925;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jM40059 = m40059(c1263M40067, jMax);
        long j2 = this.f52331;
        C14248 c14249 = this.f52336;
        this.f52331 = (c14249.f42927 - jM40059) + j2;
        this.f52336 = c14249.m33893(jM40059);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m40059(C1263 c1263, long j) {
        return m40060(c1263, j, false, new boolean[this.f52332.length]);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m40060(C1263 c1263, long j, boolean z, boolean[] zArr) {
        InterfaceC18065[] interfaceC18065Arr;
        InterfaceC18882[] interfaceC18882Arr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= c1263.f4475) {
                break;
            }
            if (z || !c1263.m4320(this.f52339, i)) {
                z2 = false;
            }
            this.f52338[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            interfaceC18065Arr = this.f52332;
            int length = interfaceC18065Arr.length;
            interfaceC18882Arr = this.f52335;
            if (i2 >= length) {
                break;
            }
            if (((AbstractC4930) interfaceC18065Arr[i2]).mo6092() == -2) {
                interfaceC18882Arr[i2] = null;
            }
            i2++;
        }
        m40056();
        this.f52339 = c1263;
        m40057();
        long jMo11116 = this.f52337.mo11116(c1263.f4478, this.f52338, this.f52335, zArr, j);
        for (int i3 = 0; i3 < interfaceC18065Arr.length; i3++) {
            if (((AbstractC4930) interfaceC18065Arr[i3]).mo6092() == -2 && this.f52339.m4319(i3)) {
                interfaceC18882Arr[i3] = new C9523();
            }
        }
        this.f52333 = false;
        for (int i4 = 0; i4 < interfaceC18882Arr.length; i4++) {
            if (interfaceC18882Arr[i4] != null) {
                C22632.m50634(c1263.m4319(i4));
                if (((AbstractC4930) interfaceC18065Arr[i4]).mo6092() != -2) {
                    this.f52333 = true;
                }
            } else {
                C22632.m50634(c1263.f4478[i4] == null);
            }
        }
        return jMo11116;
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40076() {
        m40056();
        ?? r0 = this.f52337;
        try {
            boolean z = r0 instanceof C3632;
            C2961 c2961 = this.f52334;
            if (z) {
                c2961.m9058(((C3632) r0).f11481);
            } else {
                c2961.m9058((InterfaceC9546) r0);
            }
        } catch (RuntimeException e) {
            C19956.m46034("Period release failed.", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40064(C17071 c17071) {
        if (c17071 == this.f52342) {
            return;
        }
        m40056();
        this.f52342 = c17071;
        m40057();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17071 m40068() {
        return this.f52342;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1263 m40067(float f, AbstractC4846 abstractC4846, boolean z) {
        InterfaceC9731[] interfaceC9731Arr;
        C6181 c6181 = this.f52328;
        C15894 c15894 = this.f52336.f42930;
        AbstractC5497 abstractC5497 = this.f52329;
        InterfaceC18065[] interfaceC18065Arr = this.f52332;
        C1263 c1263Mo12284 = abstractC5497.mo12284(interfaceC18065Arr, c6181, c15894, abstractC4846);
        int i = 0;
        while (true) {
            int i2 = c1263Mo12284.f4475;
            interfaceC9731Arr = c1263Mo12284.f4478;
            if (i >= i2) {
                break;
            }
            boolean z2 = true;
            if (c1263Mo12284.m4319(i)) {
                if (interfaceC9731Arr[i] == null && ((AbstractC4930) interfaceC18065Arr[i]).mo6092() != -2) {
                    z2 = false;
                }
                C22632.m50634(z2);
            } else {
                C22632.m50634(interfaceC9731Arr[i] == null);
            }
            i++;
        }
        for (InterfaceC9731 interfaceC9731 : interfaceC9731Arr) {
            if (interfaceC9731 != null) {
                interfaceC9731.mo2378(f);
                interfaceC9731.mo2379(z);
            }
        }
        return c1263Mo12284;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6181 m40073() {
        return this.f52328;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1263 m40070() {
        return this.f52339;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m40066() {
        Object obj = this.f52337;
        if (obj instanceof C3632) {
            long j = this.f52336.f42928;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((C3632) obj).m11123(j);
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m40056() {
        if (this.f52342 != null) {
            return;
        }
        int i = 0;
        while (true) {
            C1263 c1263 = this.f52339;
            if (i >= c1263.f4475) {
                return;
            }
            boolean zM4319 = c1263.m4319(i);
            InterfaceC9731 interfaceC9731 = this.f52339.f4478[i];
            if (zM4319 && interfaceC9731 != null) {
                interfaceC9731.mo2389();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m40057() {
        if (this.f52342 != null) {
            return;
        }
        int i = 0;
        while (true) {
            C1263 c1263 = this.f52339;
            if (i >= c1263.f4475) {
                return;
            }
            boolean zM4319 = c1263.m4319(i);
            InterfaceC9731 interfaceC9731 = this.f52339.f4478[i];
            if (zM4319 && interfaceC9731 != null) {
                interfaceC9731.mo2386();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40062(long j) {
        C22632.m50634(this.f52342 == null);
        if (this.f52341) {
            this.f52337.mo2268(j - this.f52331);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.֡ܽۧ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40063(C11469 c11469) {
        C22632.m50634(this.f52342 == null);
        this.f52337.mo2265(c11469);
    }
}
