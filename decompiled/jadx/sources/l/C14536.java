package l;

/* JADX INFO: renamed from: l.ܳ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C14536 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f44533;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1837 f44536;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1837 f44537;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f44534 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f44538 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f44535 = false;

    public C14536(InterfaceC1837 interfaceC1837, InterfaceC1837 interfaceC1838, int i) {
        this.f44536 = interfaceC1837;
        this.f44533 = i;
        this.f44537 = interfaceC1838;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m34723() {
        return this.f44537 != null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m34718() {
        int i;
        C22632.m50634(!m34716());
        if (m34687(this.f44536)) {
            i = 3;
        } else {
            InterfaceC1837 interfaceC1837 = this.f44537;
            i = (interfaceC1837 == null || interfaceC1837.getState() == 0) ? 2 : 4;
        }
        this.f44534 = i;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m34716() {
        int i = this.f44534;
        return i == 2 || i == 4 || i == 3;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m34722(C17071 c17071) {
        int i = this.f44534;
        return ((i == 2 || i == 4) && m34689(c17071) == this.f44536) || (this.f44534 == 3 && m34689(c17071) == this.f44537);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m34711() {
        boolean zM34687 = m34687(this.f44536);
        InterfaceC1837 interfaceC1837 = this.f44537;
        return (zM34687 ? 1 : 0) + ((interfaceC1837 == null || !m34687(interfaceC1837)) ? 0 : 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34693(float f) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (interfaceC1837.mo6092() != 1) {
            return;
        }
        interfaceC1837.mo13450(2, Float.valueOf(f));
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 != null) {
            interfaceC1838.mo13450(2, Float.valueOf(f));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34696(Object obj) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (interfaceC1837.mo6092() != 2) {
            return;
        }
        int i = this.f44534;
        if (i == 4 || i == 1) {
            InterfaceC1837 interfaceC1838 = this.f44537;
            interfaceC1838.getClass();
            interfaceC1838.mo13450(1, obj);
            return;
        }
        interfaceC1837.mo13450(1, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34705(InterfaceC22618 interfaceC22618) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (interfaceC1837.mo6092() != 2) {
            return;
        }
        interfaceC1837.mo13450(7, interfaceC22618);
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 != null) {
            interfaceC1838.mo13450(7, interfaceC22618);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m34719() {
        return this.f44536.mo6092();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m34712(C17071 c17071) {
        InterfaceC1837 interfaceC1837M34689 = m34689(c17071);
        C11003.requireNonNull(interfaceC1837M34689);
        return interfaceC1837M34689.mo6083();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m34724(C17071 c17071) {
        InterfaceC1837 interfaceC1837M34689 = m34689(c17071);
        interfaceC1837M34689.getClass();
        return interfaceC1837M34689.mo6104();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34715(C17071 c17071, long j) {
        InterfaceC1837 interfaceC1837M34689 = m34689(c17071);
        interfaceC1837M34689.getClass();
        m34684(interfaceC1837M34689, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34698(C1263 c1263, C1263 c1264, long j) {
        int i;
        int i2 = this.f44533;
        boolean zM4319 = c1263.m4319(i2);
        boolean zM43110 = c1264.m4319(i2);
        InterfaceC1837 interfaceC1837 = this.f44536;
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 == null || (i = this.f44534) == 3 || (i == 0 && m34687(interfaceC1837))) {
            interfaceC1838 = interfaceC1837;
        }
        if (!zM4319 || interfaceC1838.mo6100()) {
            return;
        }
        boolean z = interfaceC1837.mo6092() == -2;
        C17359 c17359 = c1263.f4476[i2];
        C17359 c173510 = c1264.f4476[i2];
        if (!zM43110 || !C11003.equals(c173510, c17359) || z || m34716()) {
            m34684(interfaceC1838, j);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34695(long j) {
        int i;
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (m34687(interfaceC1837) && (i = this.f44534) != 4 && i != 2) {
            m34684(interfaceC1837, j);
        }
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 == null || interfaceC1838.getState() == 0 || this.f44534 == 3) {
            return;
        }
        m34684(interfaceC1838, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34684(InterfaceC1837 interfaceC1837, long j) {
        interfaceC1837.mo6103();
        if (interfaceC1837 instanceof C16100) {
            ((C16100) interfaceC1837).m37992(j);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m34691(long j, long j2) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        long jMo6097 = m34687(interfaceC1837) ? interfaceC1837.mo6097(j, j2) : C13132.FOREVER_NS;
        InterfaceC1837 interfaceC1838 = this.f44537;
        return (interfaceC1838 == null || interfaceC1838.getState() == 0) ? jMo6097 : Math.min(jMo6097, interfaceC1838.mo6097(j, j2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34692() {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (m34687(interfaceC1837)) {
            interfaceC1837.mo6095();
            return;
        }
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 == null || !m34687(interfaceC1838)) {
            return;
        }
        interfaceC1838.mo6095();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34694(float f, float f2) {
        this.f44536.mo6085(f, f2);
        InterfaceC1837 interfaceC1837 = this.f44537;
        if (interfaceC1837 != null) {
            interfaceC1837.mo6085(f, f2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34699(AbstractC4846 abstractC4846) {
        this.f44536.mo6089(abstractC4846);
        InterfaceC1837 interfaceC1837 = this.f44537;
        if (interfaceC1837 != null) {
            interfaceC1837.mo6089(abstractC4846);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m34721() {
        InterfaceC1837 interfaceC1837 = this.f44536;
        boolean zMo6098 = m34687(interfaceC1837) ? interfaceC1837.mo6098() : true;
        InterfaceC1837 interfaceC1838 = this.f44537;
        return (interfaceC1838 == null || interfaceC1838.getState() == 0) ? zMo6098 : zMo6098 & interfaceC1838.mo6098();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m34717(C17071 c17071) {
        return m34689(c17071) != null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m34720(C17071 c17071) {
        return m34688(c17071, this.f44536) && m34688(c17071, this.f44537);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m34688(C17071 c17071, InterfaceC1837 interfaceC1837) {
        C17071 c17071M40068;
        if (interfaceC1837 != null) {
            InterfaceC18882[] interfaceC18882Arr = c17071.f52335;
            int i = this.f44533;
            InterfaceC18882 interfaceC18882 = interfaceC18882Arr[i];
            if (interfaceC1837.mo6099() != null) {
                if (interfaceC1837.mo6099() == interfaceC18882) {
                    if (interfaceC18882 != null && !interfaceC1837.mo6104()) {
                        C17071 c17071M40069 = c17071.m40068();
                        if (!c17071.f52336.f42931 || c17071M40069 == null || !c17071M40069.f52341 || (!(interfaceC1837 instanceof C16100) && !(interfaceC1837 instanceof C5906) && interfaceC1837.mo6083() < c17071M40069.m40074())) {
                            c17071M40068 = c17071.m40068();
                            return c17071M40068 != null ? false : false;
                        }
                    }
                } else {
                    c17071M40068 = c17071.m40068();
                    if (c17071M40068 != null || c17071M40068.f52335[i] != interfaceC1837.mo6099()) {
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34713(long j, long j2) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (m34687(interfaceC1837)) {
            interfaceC1837.mo6088(j, j2);
        }
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 == null || !m34687(interfaceC1838)) {
            return;
        }
        interfaceC1838.mo6088(j, j2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34706(C17071 c17071) {
        InterfaceC1837 interfaceC1837M34689 = m34689(c17071);
        return interfaceC1837M34689 == null || interfaceC1837M34689.mo6104() || interfaceC1837M34689.mo6101() || interfaceC1837M34689.mo6098();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34726(C17071 c17071) {
        InterfaceC1837 interfaceC1837M34689 = m34689(c17071);
        interfaceC1837M34689.getClass();
        interfaceC1837M34689.mo6096();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m34709() {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (interfaceC1837.getState() == 1 && this.f44534 != 4) {
            interfaceC1837.start();
            return;
        }
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 == null || interfaceC1838.getState() != 1 || this.f44534 == 3) {
            return;
        }
        interfaceC1838.start();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m34707() {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (m34687(interfaceC1837) && interfaceC1837.getState() == 2) {
            interfaceC1837.stop();
        }
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 == null || interfaceC1838.getState() == 0 || interfaceC1838.getState() != 2) {
            return;
        }
        interfaceC1838.stop();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34697(Object obj, C17071 c17071) {
        InterfaceC1837 interfaceC1837M34689 = m34689(c17071);
        interfaceC1837M34689.getClass();
        interfaceC1837M34689.mo13450(11, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34704(C20888 c20888) {
        this.f44536.mo13450(18, c20888);
        InterfaceC1837 interfaceC1837 = this.f44537;
        if (interfaceC1837 != null) {
            interfaceC1837.mo13450(18, c20888);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34700(C14101 c14101) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        m34685(interfaceC1837, c14101);
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 != null) {
            boolean z = (interfaceC1838.getState() == 0 || this.f44534 == 3) ? false : true;
            m34685(interfaceC1838, c14101);
            m34686(false);
            if (z) {
                interfaceC1838.getClass();
                interfaceC1838.mo13450(17, interfaceC1837);
            }
        }
        this.f44534 = 0;
    }

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
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m34708() {
        int i = this.f44534;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.f44534 = 0;
                return;
            }
            return;
        }
        boolean z = i == 4;
        InterfaceC1837 interfaceC1837 = this.f44536;
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (z) {
            interfaceC1838.getClass();
            interfaceC1838.mo13450(17, interfaceC1837);
        } else {
            interfaceC1838.getClass();
            interfaceC1837.mo13450(17, interfaceC1838);
        }
        this.f44534 = this.f44534 != 4 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34714(C14101 c14101) {
        InterfaceC1837 interfaceC1837;
        if (m34716()) {
            int i = this.f44534;
            boolean z = i == 4 || i == 2;
            int i2 = i != 4 ? 0 : 1;
            if (!z) {
                interfaceC1837 = this.f44537;
                interfaceC1837.getClass();
            } else {
                interfaceC1837 = this.f44536;
            }
            m34685(interfaceC1837, c14101);
            m34686(z);
            this.f44534 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34703(InterfaceC18882 interfaceC18882, C14101 c14101, long j, boolean z) {
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (m34687(interfaceC1837)) {
            if (interfaceC18882 != interfaceC1837.mo6099()) {
                m34685(interfaceC1837, c14101);
            } else if (z) {
                interfaceC1837.mo6087(j);
            }
        }
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 == null || !m34687(interfaceC1838)) {
            return;
        }
        if (interfaceC18882 != interfaceC1838.mo6099()) {
            m34685(interfaceC1838, c14101);
        } else if (z) {
            interfaceC1838.mo6087(j);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34685(InterfaceC1837 interfaceC1837, C14101 c14101) {
        C22632.m50634(this.f44536 == interfaceC1837 || this.f44537 == interfaceC1837);
        if (m34687(interfaceC1837)) {
            c14101.m33716(interfaceC1837);
            if (interfaceC1837.getState() == 2) {
                interfaceC1837.stop();
            }
            interfaceC1837.mo6102();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34701(C17071 c17071, long j) {
        InterfaceC1837 interfaceC1837M34689 = m34689(c17071);
        if (interfaceC1837M34689 != null) {
            interfaceC1837M34689.mo6087(j);
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m34710() {
        if (!m34687(this.f44536)) {
            m34686(true);
        }
        InterfaceC1837 interfaceC1837 = this.f44537;
        if (interfaceC1837 == null || interfaceC1837.getState() != 0) {
            return;
        }
        m34686(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34686(boolean z) {
        if (z) {
            if (this.f44538) {
                this.f44536.reset();
                this.f44538 = false;
                return;
            }
            return;
        }
        if (this.f44535) {
            InterfaceC1837 interfaceC1837 = this.f44537;
            interfaceC1837.getClass();
            interfaceC1837.reset();
            this.f44535 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34690(C17071 c17071, C1263 c1263, C14101 c14101) {
        int iM34683 = m34683(this.f44536, c17071, c1263, c14101);
        return iM34683 == 1 ? m34683(this.f44537, c17071, c1263, c14101) : iM34683;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m34683(InterfaceC1837 interfaceC1837, C17071 c17071, C1263 c1263, C14101 c14101) {
        InterfaceC1837 interfaceC1838;
        int i;
        InterfaceC18882[] interfaceC18882Arr = c17071.f52335;
        if (interfaceC1837 == null || interfaceC1837.getState() == 0 || (interfaceC1837 == (interfaceC1838 = this.f44536) && ((i = this.f44534) == 2 || i == 4))) {
            return 1;
        }
        if (interfaceC1837 == this.f44537 && this.f44534 == 3) {
            return 1;
        }
        InterfaceC18882 interfaceC18882Mo6099 = interfaceC1837.mo6099();
        int i2 = this.f44533;
        boolean z = interfaceC18882Mo6099 != interfaceC18882Arr[i2];
        boolean zM4319 = c1263.m4319(i2);
        if (!zM4319 || z) {
            if (!interfaceC1837.mo6100()) {
                InterfaceC9731 interfaceC9731 = c1263.f4478[i2];
                int length = interfaceC9731 != null ? interfaceC9731.length() : 0;
                C8353[] c8353Arr = new C8353[length];
                for (int i3 = 0; i3 < length; i3++) {
                    interfaceC9731.getClass();
                    c8353Arr[i3] = interfaceC9731.mo2377(i3);
                }
                InterfaceC18882 interfaceC18882 = interfaceC18882Arr[i2];
                interfaceC18882.getClass();
                interfaceC1837.mo6091(c8353Arr, interfaceC18882, c17071.m40074(), c17071.m40071(), c17071.f52336.f42930);
                return 3;
            }
            if (!interfaceC1837.mo6098()) {
                return 0;
            }
            m34685(interfaceC1837, c14101);
            if (!zM4319 || m34716()) {
                m34686(interfaceC1837 == interfaceC1838);
                return 1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34702(C17359 c17359, InterfaceC9731 interfaceC9731, InterfaceC18882 interfaceC18882, long j, boolean z, boolean z2, long j2, long j3, C15894 c15894, C14101 c14101) {
        int length = interfaceC9731 != null ? interfaceC9731.length() : 0;
        C8353[] c8353Arr = new C8353[length];
        for (int i = 0; i < length; i++) {
            interfaceC9731.getClass();
            c8353Arr[i] = interfaceC9731.mo2377(i);
        }
        int i2 = this.f44534;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            this.f44538 = true;
            this.f44536.mo6090(c17359, c8353Arr, interfaceC18882, z, z2, j2, j3, c15894);
            c14101.m33718(this.f44536);
        } else {
            this.f44535 = true;
            InterfaceC1837 interfaceC1837 = this.f44537;
            interfaceC1837.getClass();
            interfaceC1837.mo6090(c17359, c8353Arr, interfaceC18882, z, z2, j2, j3, c15894);
            c14101.m33718(interfaceC1837);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34725() {
        this.f44536.mo6084();
        this.f44538 = false;
        InterfaceC1837 interfaceC1837 = this.f44537;
        if (interfaceC1837 != null) {
            interfaceC1837.mo6084();
            this.f44535 = false;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m34727() {
        int i = this.f44534;
        if (i != 0 && i != 2 && i != 4) {
            InterfaceC1837 interfaceC1837 = this.f44537;
            interfaceC1837.getClass();
            return interfaceC1837.getState() != 0;
        }
        return m34687(this.f44536);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34687(InterfaceC1837 interfaceC1837) {
        return interfaceC1837.getState() != 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private InterfaceC1837 m34689(C17071 c17071) {
        if (c17071 == null) {
            return null;
        }
        InterfaceC18882[] interfaceC18882Arr = c17071.f52335;
        int i = this.f44533;
        if (interfaceC18882Arr[i] == null) {
            return null;
        }
        InterfaceC1837 interfaceC1837 = this.f44536;
        if (interfaceC1837.mo6099() == interfaceC18882Arr[i]) {
            return interfaceC1837;
        }
        InterfaceC1837 interfaceC1838 = this.f44537;
        if (interfaceC1838 == null || interfaceC1838.mo6099() != interfaceC18882Arr[i]) {
            return null;
        }
        return interfaceC1838;
    }
}
