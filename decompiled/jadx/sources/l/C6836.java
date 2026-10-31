package l;

/* JADX INFO: renamed from: l.ۜܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C6836 extends AbstractC13374 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f21166;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC4309 = (AbstractC4308) obj;
        if (abstractC4309.m12913(EnumC9454.ERROR) || abstractC4308.m12913(EnumC9454.NONE)) {
            return Boolean.TRUE;
        }
        switch (C11070.f33247[abstractC4308.mo3258().ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Boolean.valueOf(abstractC4309.mo12914());
            case 10:
                return Boolean.valueOf(abstractC4309.m12913(EnumC9454.BOOLEAN));
            case 11:
                return Boolean.FALSE;
            case 12:
            default:
                throw new AssertionError();
            case 13:
                return Boolean.valueOf(this.f21166.m17546(abstractC4308, abstractC4309, true));
        }
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        int i = C11070.f33247[abstractC4308.mo3258().ordinal()];
        C6319 c6319 = this.f21166;
        if (i == 1) {
            if (c6319.m17515(c5138).mo12941() || c6319.m17515(abstractC4308).mo12941()) {
                return Boolean.valueOf(c6319.m17515(c5138).m12913(c6319.m17515(abstractC4308).mo3258()));
            }
            return (Boolean) c6319.m17515(c5138).mo2962(this, c6319.m17515(abstractC4308));
        }
        if (i == 2) {
            return Boolean.valueOf(c6319.m17546((AbstractC4308) c5138, abstractC4308, true));
        }
        if (i != 12) {
            if (i == 13 || i == 16) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (c6319.m17545(abstractC4308, c5138, c6319.f19598)) {
            ((C1386) c6319.f19579.f8240).mo4874(EnumC20347.UNCHECKED);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        int i = C11070.f33247[abstractC4308.mo3258().ordinal()];
        C6319 c6319 = this.f21166;
        if (i != 12) {
            if (i == 13 || i == 16) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(c6319.m17545(c8541.mo12939(), abstractC4308, (C1386) c6319.f19579.f8240));
        }
        if (c6319.m17546((AbstractC4308) c8541, abstractC4308, true)) {
            return Boolean.TRUE;
        }
        if (c6319.m17545(c8541.mo12939(), abstractC4308, c6319.f19598)) {
            ((C1386) c6319.f19579.f8240).mo4874(EnumC20347.UNCHECKED);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo9465(C12193 c12193, Object obj) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        C6319 c6319 = this.f21166;
        return Boolean.valueOf(c6319.m17545(c6319.m17511(c19831), (AbstractC4308) obj, (C1386) c6319.f19579.f8240));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۛ᩸֨] */
    /* JADX WARN: Type inference failed for: r13v0, types: [l.ۙ֨֨, l.᩶ۚ֨] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v6, types: [l.ۙ֨֨] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [l.ۙ֨֨] */
    /* JADX WARN: Type inference failed for: r2v13 */
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
    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        boolean zM18520;
        boolean zM17472;
        boolean zM17473;
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        ?? r0 = this.f21166;
        C1386 c1386 = r0.f19598;
        if (abstractC4308.m12913(EnumC9454.ERROR) || abstractC4308.m12913(EnumC9454.BOT)) {
            return Boolean.TRUE;
        }
        if (abstractC4308.m12913(EnumC9454.TYPEVAR)) {
            if (r0.m17545(c19955, abstractC4308.mo12939(), c1386)) {
                ((C1386) r0.f19579.f8240).mo4874(EnumC20347.UNCHECKED);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (c19955.mo5146() || abstractC4308.mo5146()) {
            if (!c19955.mo5146()) {
                zM18520 = m18520((C19955) abstractC4308, c19955, true);
            } else {
                zM18520 = m18520(c19955, abstractC4308, false);
            }
            return Boolean.valueOf(zM18520);
        }
        EnumC9454 enumC9454 = EnumC9454.CLASS;
        if (abstractC4308.m12913(enumC9454) || abstractC4308.m12913(EnumC9454.ARRAY)) {
            boolean zM17546 = r0.m17546(r0.m17519(c19955), r0.m17519(abstractC4308), true);
            if (zM17546 || r0.m17546(r0.m17519(abstractC4308), r0.m17519(c19955), true)) {
                if (!zM17546 && abstractC4308.m12913(EnumC9454.ARRAY)) {
                    if (!r0.m17477(abstractC4308)) {
                        ((C1386) r0.f19579.f8240).mo4874(EnumC20347.UNCHECKED);
                    }
                    return Boolean.TRUE;
                }
                if (abstractC4308.mo12920()) {
                    return Boolean.TRUE;
                }
                if (c19955.mo12920()) {
                    if (!r0.m17514(abstractC4308)) {
                        ((C1386) r0.f19579.f8240).mo4874(EnumC20347.UNCHECKED);
                    }
                    return Boolean.TRUE;
                }
                ?? r2 = zM17546 ? c19955 : abstractC4308;
                if (zM17546) {
                    c19955 = abstractC4308;
                }
                AbstractC4308 abstractC4308M17455 = C6319.m17455((C6319) r0, (AbstractC4308) r2, true, false);
                AbstractC4308 abstractC4308M17456 = C6319.m17455((C6319) r0, (AbstractC4308) r2, false, false);
                AbstractC4308 abstractC4308M17457 = C6319.m17455((C6319) r0, (AbstractC4308) c19955, true, false);
                AbstractC4308 abstractC4308M17525 = r0.m17525(C6319.m17455((C6319) r0, (AbstractC4308) c19955, false, false), abstractC4308M17456.f13890);
                AbstractC4308 abstractC4308M17526 = abstractC4308M17525 == null ? null : r0.m17525(abstractC4308M17457, abstractC4308M17455.f13890);
                if (abstractC4308M17526 == null) {
                    abstractC4308M17455 = C6319.m17455((C6319) r0, (AbstractC4308) r2, true, true);
                    abstractC4308M17456 = C6319.m17455((C6319) r0, (AbstractC4308) r2, false, true);
                    AbstractC4308 abstractC4308M17458 = C6319.m17455((C6319) r0, (AbstractC4308) c19955, true, true);
                    abstractC4308M17525 = r0.m17525(C6319.m17455((C6319) r0, (AbstractC4308) c19955, false, true), abstractC4308M17456.f13890);
                    abstractC4308M17526 = abstractC4308M17525 == null ? null : r0.m17525(abstractC4308M17458, abstractC4308M17455.f13890);
                }
                if (abstractC4308M17526 != null) {
                    AbstractC19810 abstractC19810 = r2.f13890;
                    if (abstractC19810 != abstractC4308M17526.f13890 || abstractC19810 != abstractC4308M17525.f13890) {
                        C12171.m29640(r2.f13890 + " != " + abstractC4308M17526.f13890 + " != " + abstractC4308M17525.f13890);
                        throw null;
                    }
                    if (!r0.m17544(abstractC4308M17455.mo12934(), abstractC4308M17526.mo12934()) && !r0.m17544(abstractC4308M17455.mo12934(), abstractC4308M17525.mo12934()) && !r0.m17544(abstractC4308M17456.mo12934(), abstractC4308M17526.mo12934()) && !r0.m17544(abstractC4308M17456.mo12934(), abstractC4308M17525.mo12934())) {
                        if (!zM17546 ? r0.m17467(c19955, r2) : r0.m17467(r2, c19955)) {
                            ((C1386) r0.f19579.f8240).mo4874(EnumC20347.UNCHECKED);
                        }
                        return Boolean.TRUE;
                    }
                }
                if (r0.m17477(abstractC4308)) {
                    return Boolean.valueOf(r0.m17551(r2, c19955, c1386));
                }
                return Boolean.valueOf(r0.m17551(r2, c19955, (C1386) r0.f19579.f8240));
            }
            if (abstractC4308.m12913(enumC9454)) {
                if ((abstractC4308.f13890.mo16084() & 512) != 0) {
                    if ((c19955.f13890.mo16084() & 16) == 0) {
                        zM17473 = C6319.m17462((C6319) r0, (C19955) c19955, abstractC4308, (C1386) r0.f19579.f8240);
                    } else {
                        zM17473 = C6319.m17472(r0, c19955, abstractC4308, (C1386) r0.f19579.f8240);
                    }
                    return Boolean.valueOf(zM17473);
                }
                if ((c19955.f13890.mo16084() & 512) != 0) {
                    if ((abstractC4308.f13890.mo16084() & 16) == 0) {
                        zM17472 = C6319.m17462((C6319) r0, (C19955) c19955, abstractC4308, (C1386) r0.f19579.f8240);
                    } else {
                        zM17472 = C6319.m17472(r0, c19955, abstractC4308, (C1386) r0.f19579.f8240);
                    }
                    return Boolean.valueOf(zM17472);
                }
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18520(C19955 c19955, AbstractC4308 abstractC4308, boolean z) {
        C6319 c6319 = this.f21166;
        C1386 c1386 = c6319.f19598;
        for (AbstractC4308 abstractC4309 : c6319.m17565(c19955)) {
            c1386.m4869();
            if (z) {
                if (!c6319.m17545(abstractC4308, abstractC4309, c1386)) {
                    return false;
                }
            } else if (!c6319.m17545(abstractC4309, abstractC4308, c1386)) {
                return false;
            }
        }
        EnumC20347 enumC20347 = EnumC20347.UNCHECKED;
        if (!c1386.m4870(enumC20347)) {
            return true;
        }
        ((C1386) c6319.f19579.f8240).mo4874(enumC20347);
        return true;
    }

    public C6836(C6319 c6319) {
        this.f21166 = c6319;
    }
}
