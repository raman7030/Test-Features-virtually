package p067l;

/* JADX INFO: renamed from: l.ܳ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C16183 {

    /* JADX INFO: renamed from: ֫ */
    public final int f47639;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4114 f47642;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC4114 f47643;

    /* JADX INFO: renamed from: ۧ */
    public int f47640 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f47644 = false;

    /* JADX INFO: renamed from: ܳ */
    public boolean f47641 = false;

    public C16183(InterfaceC4114 interfaceC4114, InterfaceC4114 interfaceC4115, int i) {
        this.f47642 = interfaceC4114;
        this.f47639 = i;
        this.f47643 = interfaceC4115;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m36866() {
        return this.f47643 != null;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m36861() {
        int i;
        C23877.m52960(!m36859());
        if (m36830(this.f47642)) {
            i = 3;
        } else {
            InterfaceC4114 interfaceC4114 = this.f47643;
            i = (interfaceC4114 == null || interfaceC4114.getState() == 0) ? 2 : 4;
        }
        this.f47640 = i;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m36859() {
        int i = this.f47640;
        return i == 2 || i == 4 || i == 3;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m36865(C18592 c18592) {
        int i = this.f47640;
        return ((i == 2 || i == 4) && m36832(c18592) == this.f47642) || (this.f47640 == 3 && m36832(c18592) == this.f47643);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m36854() {
        boolean zM36830 = m36830(this.f47642);
        InterfaceC4114 interfaceC4114 = this.f47643;
        return (zM36830 ? 1 : 0) + ((interfaceC4114 == null || !m36830(interfaceC4114)) ? 0 : 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36836(float f) {
        InterfaceC4114 interfaceC4114 = this.f47642;
        if (interfaceC4114.mo8290() != 1) {
            return;
        }
        interfaceC4114.mo15338(2, Float.valueOf(f));
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 != null) {
            interfaceC4115.mo15338(2, Float.valueOf(f));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36839(Object obj) {
        InterfaceC4114 interfaceC4114 = this.f47642;
        if (interfaceC4114.mo8290() != 2) {
            return;
        }
        int i = this.f47640;
        if (i == 4 || i == 1) {
            InterfaceC4114 interfaceC4115 = this.f47643;
            interfaceC4115.getClass();
            interfaceC4115.mo15338(1, obj);
            return;
        }
        interfaceC4114.mo15338(1, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36848(InterfaceC23865 interfaceC23865) {
        InterfaceC4114 interfaceC4114 = this.f47642;
        if (interfaceC4114.mo8290() != 2) {
            return;
        }
        interfaceC4114.mo15338(7, interfaceC23865);
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 != null) {
            interfaceC4115.mo15338(7, interfaceC23865);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m36862() {
        return this.f47642.mo8290();
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m36855(C18592 c18592) {
        InterfaceC4114 interfaceC4114M36832 = m36832(c18592);
        C12826.requireNonNull(interfaceC4114M36832);
        return interfaceC4114M36832.mo8281();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m36867(C18592 c18592) {
        InterfaceC4114 interfaceC4114M36832 = m36832(c18592);
        interfaceC4114M36832.getClass();
        return interfaceC4114M36832.mo8302();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36858(C18592 c18592, long j) {
        InterfaceC4114 interfaceC4114M36832 = m36832(c18592);
        interfaceC4114M36832.getClass();
        m36827(interfaceC4114M36832, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36841(C3569 c3569, C3569 c35610, long j) {
        int i;
        int i2 = this.f47639;
        boolean zM6563 = c3569.m6563(i2);
        boolean zM6564 = c35610.m6563(i2);
        InterfaceC4114 interfaceC4114 = this.f47642;
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 == null || (i = this.f47640) == 3 || (i == 0 && m36830(interfaceC4114))) {
            interfaceC4115 = interfaceC4114;
        }
        if (!zM6563 || interfaceC4115.mo8298()) {
            return;
        }
        boolean z = interfaceC4114.mo8290() == -2;
        C18866 c18866 = c3569.f7246[i2];
        C18866 c18867 = c35610.f7246[i2];
        if (!zM6564 || !C12826.equals(c18867, c18866) || z || m36859()) {
            m36827(interfaceC4115, j);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36838(long j) {
        int i;
        InterfaceC4114 interfaceC4114 = this.f47642;
        if (m36830(interfaceC4114) && (i = this.f47640) != 4 && i != 2) {
            m36827(interfaceC4114, j);
        }
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 == null || interfaceC4115.getState() == 0 || this.f47640 == 3) {
            return;
        }
        m36827(interfaceC4115, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36827(InterfaceC4114 interfaceC4114, long j) {
        interfaceC4114.mo8301();
        if (interfaceC4114 instanceof C17670) {
            ((C17670) interfaceC4114).m40183(j);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m36834(long j, long j2) {
        InterfaceC4114 interfaceC4114 = this.f47642;
        long jMo8295 = m36830(interfaceC4114) ? interfaceC4114.mo8295(j, j2) : C14849.FOREVER_NS;
        InterfaceC4114 interfaceC4115 = this.f47643;
        return (interfaceC4115 == null || interfaceC4115.getState() == 0) ? jMo8295 : Math.min(jMo8295, interfaceC4115.mo8295(j, j2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36835() {
        InterfaceC4114 interfaceC4114 = this.f47642;
        if (m36830(interfaceC4114)) {
            interfaceC4114.mo8293();
            return;
        }
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 == null || !m36830(interfaceC4115)) {
            return;
        }
        interfaceC4115.mo8293();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36837(float f, float f2) {
        this.f47642.mo8283(f, f2);
        InterfaceC4114 interfaceC4114 = this.f47643;
        if (interfaceC4114 != null) {
            interfaceC4114.mo8283(f, f2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36842(AbstractC6974 abstractC6974) {
        this.f47642.mo8287(abstractC6974);
        InterfaceC4114 interfaceC4114 = this.f47643;
        if (interfaceC4114 != null) {
            interfaceC4114.mo8287(abstractC6974);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m36864() {
        InterfaceC4114 interfaceC4114 = this.f47642;
        boolean zMo8296 = m36830(interfaceC4114) ? interfaceC4114.mo8296() : true;
        InterfaceC4114 interfaceC4115 = this.f47643;
        return (interfaceC4115 == null || interfaceC4115.getState() == 0) ? zMo8296 : zMo8296 & interfaceC4115.mo8296();
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m36860(C18592 c18592) {
        return m36832(c18592) != null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m36863(C18592 c18592) {
        return m36831(c18592, this.f47642) && m36831(c18592, this.f47643);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX INFO: renamed from: ֫ */
    private boolean m36831(C18592 c18592, InterfaceC4114 interfaceC4114) {
        C18592 c18592M42313;
        if (interfaceC4114 != null) {
            InterfaceC20314[] interfaceC20314Arr = c18592.f55517;
            int i = this.f47639;
            InterfaceC20314 interfaceC20314 = interfaceC20314Arr[i];
            if (interfaceC4114.mo8297() != null) {
                if (interfaceC4114.mo8297() == interfaceC20314) {
                    if (interfaceC20314 != null && !interfaceC4114.mo8302()) {
                        C18592 c18592M42314 = c18592.m42313();
                        if (!c18592.f55518.f46023 || c18592M42314 == null || !c18592M42314.f55523 || (!(interfaceC4114 instanceof C17670) && !(interfaceC4114 instanceof C7981) && interfaceC4114.mo8281() < c18592M42314.m42319())) {
                            c18592M42313 = c18592.m42313();
                            return c18592M42313 != null ? false : false;
                        }
                    }
                } else {
                    c18592M42313 = c18592.m42313();
                    if (c18592M42313 != null || c18592M42313.f55517[i] != interfaceC4114.mo8297()) {
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36856(long j, long j2) {
        InterfaceC4114 interfaceC4114 = this.f47642;
        if (m36830(interfaceC4114)) {
            interfaceC4114.mo8286(j, j2);
        }
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 == null || !m36830(interfaceC4115)) {
            return;
        }
        interfaceC4115.mo8286(j, j2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36849(C18592 c18592) {
        InterfaceC4114 interfaceC4114M36832 = m36832(c18592);
        return interfaceC4114M36832 == null || interfaceC4114M36832.mo8302() || interfaceC4114M36832.mo8299() || interfaceC4114M36832.mo8296();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m36869(C18592 c18592) {
        InterfaceC4114 interfaceC4114M36832 = m36832(c18592);
        interfaceC4114M36832.getClass();
        interfaceC4114M36832.mo8294();
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m36852() {
        InterfaceC4114 interfaceC4114 = this.f47642;
        if (interfaceC4114.getState() == 1 && this.f47640 != 4) {
            interfaceC4114.start();
            return;
        }
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 == null || interfaceC4115.getState() != 1 || this.f47640 == 3) {
            return;
        }
        interfaceC4115.start();
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m36850() {
        InterfaceC4114 interfaceC4114 = this.f47642;
        if (m36830(interfaceC4114) && interfaceC4114.getState() == 2) {
            interfaceC4114.stop();
        }
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 == null || interfaceC4115.getState() == 0 || interfaceC4115.getState() != 2) {
            return;
        }
        interfaceC4115.stop();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36840(Object obj, C18592 c18592) {
        InterfaceC4114 interfaceC4114M36832 = m36832(c18592);
        interfaceC4114M36832.getClass();
        interfaceC4114M36832.mo15338(11, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36847(C22220 c22220) {
        this.f47642.mo15338(18, c22220);
        InterfaceC4114 interfaceC4114 = this.f47643;
        if (interfaceC4114 != null) {
            interfaceC4114.mo15338(18, c22220);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36843(C15770 c15770) {
        InterfaceC4114 interfaceC4114 = this.f47642;
        m36828(interfaceC4114, c15770);
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 != null) {
            boolean z = (interfaceC4115.getState() == 0 || this.f47640 == 3) ? false : true;
            m36828(interfaceC4115, c15770);
            m36829(false);
            if (z) {
                interfaceC4115.getClass();
                interfaceC4115.mo15338(17, interfaceC4114);
            }
        }
        this.f47640 = 0;
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
    /* JADX INFO: renamed from: ۜ */
    public final void m36851() {
        int i = this.f47640;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.f47640 = 0;
                return;
            }
            return;
        }
        boolean z = i == 4;
        InterfaceC4114 interfaceC4114 = this.f47642;
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (z) {
            interfaceC4115.getClass();
            interfaceC4115.mo15338(17, interfaceC4114);
        } else {
            interfaceC4115.getClass();
            interfaceC4114.mo15338(17, interfaceC4115);
        }
        this.f47640 = this.f47640 != 4 ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36857(C15770 c15770) {
        InterfaceC4114 interfaceC4114;
        if (m36859()) {
            int i = this.f47640;
            boolean z = i == 4 || i == 2;
            int i2 = i != 4 ? 0 : 1;
            if (!z) {
                interfaceC4114 = this.f47643;
                interfaceC4114.getClass();
            } else {
                interfaceC4114 = this.f47642;
            }
            m36828(interfaceC4114, c15770);
            m36829(z);
            this.f47640 = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36846(InterfaceC20314 interfaceC20314, C15770 c15770, long j, boolean z) {
        InterfaceC4114 interfaceC4114 = this.f47642;
        if (m36830(interfaceC4114)) {
            if (interfaceC20314 != interfaceC4114.mo8297()) {
                m36828(interfaceC4114, c15770);
            } else if (z) {
                interfaceC4114.mo8285(j);
            }
        }
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 == null || !m36830(interfaceC4115)) {
            return;
        }
        if (interfaceC20314 != interfaceC4115.mo8297()) {
            m36828(interfaceC4115, c15770);
        } else if (z) {
            interfaceC4115.mo8285(j);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36828(InterfaceC4114 interfaceC4114, C15770 c15770) {
        C23877.m52960(this.f47642 == interfaceC4114 || this.f47643 == interfaceC4114);
        if (m36830(interfaceC4114)) {
            c15770.m35842(interfaceC4114);
            if (interfaceC4114.getState() == 2) {
                interfaceC4114.stop();
            }
            interfaceC4114.mo8300();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36844(C18592 c18592, long j) {
        InterfaceC4114 interfaceC4114M36832 = m36832(c18592);
        if (interfaceC4114M36832 != null) {
            interfaceC4114M36832.mo8285(j);
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m36853() {
        if (!m36830(this.f47642)) {
            m36829(true);
        }
        InterfaceC4114 interfaceC4114 = this.f47643;
        if (interfaceC4114 == null || interfaceC4114.getState() != 0) {
            return;
        }
        m36829(false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36829(boolean z) {
        if (z) {
            if (this.f47644) {
                this.f47642.reset();
                this.f47644 = false;
                return;
            }
            return;
        }
        if (this.f47641) {
            InterfaceC4114 interfaceC4114 = this.f47643;
            interfaceC4114.getClass();
            interfaceC4114.reset();
            this.f47641 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m36833(C18592 c18592, C3569 c3569, C15770 c15770) {
        int iM36826 = m36826(this.f47642, c18592, c3569, c15770);
        return iM36826 == 1 ? m36826(this.f47643, c18592, c3569, c15770) : iM36826;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m36826(InterfaceC4114 interfaceC4114, C18592 c18592, C3569 c3569, C15770 c15770) {
        InterfaceC4114 interfaceC4115;
        int i;
        InterfaceC20314[] interfaceC20314Arr = c18592.f55517;
        if (interfaceC4114 == null || interfaceC4114.getState() == 0 || (interfaceC4114 == (interfaceC4115 = this.f47642) && ((i = this.f47640) == 2 || i == 4))) {
            return 1;
        }
        if (interfaceC4114 == this.f47643 && this.f47640 == 3) {
            return 1;
        }
        InterfaceC20314 interfaceC20314Mo8297 = interfaceC4114.mo8297();
        int i2 = this.f47639;
        boolean z = interfaceC20314Mo8297 != interfaceC20314Arr[i2];
        boolean zM6563 = c3569.m6563(i2);
        if (!zM6563 || z) {
            if (!interfaceC4114.mo8298()) {
                InterfaceC11617 interfaceC11617 = c3569.f7248[i2];
                int length = interfaceC11617 != null ? interfaceC11617.length() : 0;
                C10307[] c10307Arr = new C10307[length];
                for (int i3 = 0; i3 < length; i3++) {
                    interfaceC11617.getClass();
                    c10307Arr[i3] = interfaceC11617.mo4748(i3);
                }
                InterfaceC20314 interfaceC20314 = interfaceC20314Arr[i2];
                interfaceC20314.getClass();
                interfaceC4114.mo8289(c10307Arr, interfaceC20314, c18592.m42319(), c18592.m42316(), c18592.f55518.f46022);
                return 3;
            }
            if (!interfaceC4114.mo8296()) {
                return 0;
            }
            m36828(interfaceC4114, c15770);
            if (!zM6563 || m36859()) {
                m36829(interfaceC4114 == interfaceC4115);
                return 1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36845(C18866 c18866, InterfaceC11617 interfaceC11617, InterfaceC20314 interfaceC20314, long j, boolean z, boolean z2, long j2, long j3, C17474 c17474, C15770 c15770) {
        int length = interfaceC11617 != null ? interfaceC11617.length() : 0;
        C10307[] c10307Arr = new C10307[length];
        for (int i = 0; i < length; i++) {
            interfaceC11617.getClass();
            c10307Arr[i] = interfaceC11617.mo4748(i);
        }
        int i2 = this.f47640;
        if (i2 == 0 || i2 == 2 || i2 == 4) {
            this.f47644 = true;
            this.f47642.mo8288(c18866, c10307Arr, interfaceC20314, z, z2, j2, j3, c17474);
            c15770.m35844(this.f47642);
        } else {
            this.f47641 = true;
            InterfaceC4114 interfaceC4114 = this.f47643;
            interfaceC4114.getClass();
            interfaceC4114.mo8288(c18866, c10307Arr, interfaceC20314, z, z2, j2, j3, c17474);
            c15770.m35844(interfaceC4114);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m36868() {
        this.f47642.mo8282();
        this.f47644 = false;
        InterfaceC4114 interfaceC4114 = this.f47643;
        if (interfaceC4114 != null) {
            interfaceC4114.mo8282();
            this.f47641 = false;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m36870() {
        int i = this.f47640;
        if (i != 0 && i != 2 && i != 4) {
            InterfaceC4114 interfaceC4114 = this.f47643;
            interfaceC4114.getClass();
            return interfaceC4114.getState() != 0;
        }
        return m36830(this.f47642);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m36830(InterfaceC4114 interfaceC4114) {
        return interfaceC4114.getState() != 0;
    }

    /* JADX INFO: renamed from: ۜ */
    private InterfaceC4114 m36832(C18592 c18592) {
        if (c18592 == null) {
            return null;
        }
        InterfaceC20314[] interfaceC20314Arr = c18592.f55517;
        int i = this.f47639;
        if (interfaceC20314Arr[i] == null) {
            return null;
        }
        InterfaceC4114 interfaceC4114 = this.f47642;
        if (interfaceC4114.mo8297() == interfaceC20314Arr[i]) {
            return interfaceC4114;
        }
        InterfaceC4114 interfaceC4115 = this.f47643;
        if (interfaceC4115 == null || interfaceC4115.mo8297() != interfaceC20314Arr[i]) {
            return null;
        }
        return interfaceC4115;
    }
}
