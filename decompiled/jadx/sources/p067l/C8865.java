package p067l;

/* JADX INFO: renamed from: l.ۜܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C8865 extends AbstractC15079 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8374 f24045;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6463 = (AbstractC6462) obj;
        if (abstractC6463.m14777(EnumC11353.ERROR) || abstractC6462.m14777(EnumC11353.NONE)) {
            return Boolean.TRUE;
        }
        switch (C12889.f36249[abstractC6462.mo5577().ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Boolean.valueOf(abstractC6463.mo14778());
            case 10:
                return Boolean.valueOf(abstractC6463.m14777(EnumC11353.BOOLEAN));
            case 11:
                return Boolean.FALSE;
            case 12:
            default:
                throw new AssertionError();
            case 13:
                return Boolean.valueOf(this.f24045.m19486(abstractC6462, abstractC6463, true));
        }
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        int i = C12889.f36249[abstractC6462.mo5577().ordinal()];
        C8374 c8374 = this.f24045;
        if (i == 1) {
            if (c8374.m19455(c7251).mo14805() || c8374.m19455(abstractC6462).mo14805()) {
                return Boolean.valueOf(c8374.m19455(c7251).m14777(c8374.m19455(abstractC6462).mo5577()));
            }
            return (Boolean) c8374.m19455(c7251).mo5291(this, c8374.m19455(abstractC6462));
        }
        if (i == 2) {
            return Boolean.valueOf(c8374.m19486((AbstractC6462) c7251, abstractC6462, true));
        }
        if (i != 12) {
            if (i == 13 || i == 16) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (c8374.m19485(abstractC6462, c7251, c8374.f22469)) {
            ((C3686) c8374.f22450.f11034).mo7112(EnumC21706.UNCHECKED);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        int i = C12889.f36249[abstractC6462.mo5577().ordinal()];
        C8374 c8374 = this.f24045;
        if (i != 12) {
            if (i == 13 || i == 16) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(c8374.m19485(c10485.mo14803(), abstractC6462, (C3686) c8374.f22450.f11034));
        }
        if (c8374.m19486((AbstractC6462) c10485, abstractC6462, true)) {
            return Boolean.TRUE;
        }
        if (c8374.m19485(c10485.mo14803(), abstractC6462, c8374.f22469)) {
            ((C3686) c8374.f22450.f11034).mo7112(EnumC21706.UNCHECKED);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo11508(C13956 c13956, Object obj) {
        return Boolean.TRUE;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        C8374 c8374 = this.f24045;
        return Boolean.valueOf(c8374.m19485(c8374.m19451(c21215), (AbstractC6462) obj, (C3686) c8374.f22450.f11034));
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
    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        boolean zM20469;
        boolean zM19412;
        boolean zM19413;
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        ?? r0 = this.f24045;
        C3686 c3686 = r0.f22469;
        if (abstractC6462.m14777(EnumC11353.ERROR) || abstractC6462.m14777(EnumC11353.BOT)) {
            return Boolean.TRUE;
        }
        if (abstractC6462.m14777(EnumC11353.TYPEVAR)) {
            if (r0.m19485(c21333, abstractC6462.mo14803(), c3686)) {
                ((C3686) r0.f22450.f11034).mo7112(EnumC21706.UNCHECKED);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (c21333.mo7388() || abstractC6462.mo7388()) {
            if (!c21333.mo7388()) {
                zM20469 = m20469((C21333) abstractC6462, c21333, true);
            } else {
                zM20469 = m20469(c21333, abstractC6462, false);
            }
            return Boolean.valueOf(zM20469);
        }
        EnumC11353 enumC11353 = EnumC11353.CLASS;
        if (abstractC6462.m14777(enumC11353) || abstractC6462.m14777(EnumC11353.ARRAY)) {
            boolean zM19486 = r0.m19486(r0.m19459(c21333), r0.m19459(abstractC6462), true);
            if (zM19486 || r0.m19486(r0.m19459(abstractC6462), r0.m19459(c21333), true)) {
                if (!zM19486 && abstractC6462.m14777(EnumC11353.ARRAY)) {
                    if (!r0.m19417(abstractC6462)) {
                        ((C3686) r0.f22450.f11034).mo7112(EnumC21706.UNCHECKED);
                    }
                    return Boolean.TRUE;
                }
                if (abstractC6462.mo14784()) {
                    return Boolean.TRUE;
                }
                if (c21333.mo14784()) {
                    if (!r0.m19454(abstractC6462)) {
                        ((C3686) r0.f22450.f11034).mo7112(EnumC21706.UNCHECKED);
                    }
                    return Boolean.TRUE;
                }
                ?? r2 = zM19486 ? c21333 : abstractC6462;
                if (zM19486) {
                    c21333 = abstractC6462;
                }
                AbstractC6462 abstractC6462M19395 = C8374.m19395((C8374) r0, (AbstractC6462) r2, true, false);
                AbstractC6462 abstractC6462M19396 = C8374.m19395((C8374) r0, (AbstractC6462) r2, false, false);
                AbstractC6462 abstractC6462M19397 = C8374.m19395((C8374) r0, (AbstractC6462) c21333, true, false);
                AbstractC6462 abstractC6462M19465 = r0.m19465(C8374.m19395((C8374) r0, (AbstractC6462) c21333, false, false), abstractC6462M19396.f16705);
                AbstractC6462 abstractC6462M19466 = abstractC6462M19465 == null ? null : r0.m19465(abstractC6462M19397, abstractC6462M19395.f16705);
                if (abstractC6462M19466 == null) {
                    abstractC6462M19395 = C8374.m19395((C8374) r0, (AbstractC6462) r2, true, true);
                    abstractC6462M19396 = C8374.m19395((C8374) r0, (AbstractC6462) r2, false, true);
                    AbstractC6462 abstractC6462M19398 = C8374.m19395((C8374) r0, (AbstractC6462) c21333, true, true);
                    abstractC6462M19465 = r0.m19465(C8374.m19395((C8374) r0, (AbstractC6462) c21333, false, true), abstractC6462M19396.f16705);
                    abstractC6462M19466 = abstractC6462M19465 == null ? null : r0.m19465(abstractC6462M19398, abstractC6462M19395.f16705);
                }
                if (abstractC6462M19466 != null) {
                    AbstractC21195 abstractC21195 = r2.f16705;
                    if (abstractC21195 != abstractC6462M19466.f16705 || abstractC21195 != abstractC6462M19465.f16705) {
                        C1446.m31702(r2.f16705 + " != " + abstractC6462M19466.f16705 + " != " + abstractC6462M19465.f16705);
                        throw null;
                    }
                    if (!r0.m19484(abstractC6462M19395.mo14798(), abstractC6462M19466.mo14798()) && !r0.m19484(abstractC6462M19395.mo14798(), abstractC6462M19465.mo14798()) && !r0.m19484(abstractC6462M19396.mo14798(), abstractC6462M19466.mo14798()) && !r0.m19484(abstractC6462M19396.mo14798(), abstractC6462M19465.mo14798())) {
                        if (!zM19486 ? r0.m19407(c21333, r2) : r0.m19407(r2, c21333)) {
                            ((C3686) r0.f22450.f11034).mo7112(EnumC21706.UNCHECKED);
                        }
                        return Boolean.TRUE;
                    }
                }
                if (r0.m19417(abstractC6462)) {
                    return Boolean.valueOf(r0.m19491(r2, c21333, c3686));
                }
                return Boolean.valueOf(r0.m19491(r2, c21333, (C3686) r0.f22450.f11034));
            }
            if (abstractC6462.m14777(enumC11353)) {
                if ((abstractC6462.f16705.mo18003() & 512) != 0) {
                    if ((c21333.f16705.mo18003() & 16) == 0) {
                        zM19413 = C8374.m19402((C8374) r0, (C21333) c21333, abstractC6462, (C3686) r0.f22450.f11034);
                    } else {
                        zM19413 = C8374.m19412(r0, c21333, abstractC6462, (C3686) r0.f22450.f11034);
                    }
                    return Boolean.valueOf(zM19413);
                }
                if ((c21333.f16705.mo18003() & 512) != 0) {
                    if ((abstractC6462.f16705.mo18003() & 16) == 0) {
                        zM19412 = C8374.m19402((C8374) r0, (C21333) c21333, abstractC6462, (C3686) r0.f22450.f11034);
                    } else {
                        zM19412 = C8374.m19412(r0, c21333, abstractC6462, (C3686) r0.f22450.f11034);
                    }
                    return Boolean.valueOf(zM19412);
                }
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20469(C21333 c21333, AbstractC6462 abstractC6462, boolean z) {
        C8374 c8374 = this.f24045;
        C3686 c3686 = c8374.f22469;
        for (AbstractC6462 abstractC6463 : c8374.m19505(c21333)) {
            c3686.m7107();
            if (z) {
                if (!c8374.m19485(abstractC6462, abstractC6463, c3686)) {
                    return false;
                }
            } else if (!c8374.m19485(abstractC6463, abstractC6462, c3686)) {
                return false;
            }
        }
        EnumC21706 enumC21706 = EnumC21706.UNCHECKED;
        if (!c3686.m7108(enumC21706)) {
            return true;
        }
        ((C3686) c8374.f22450.f11034).mo7112(enumC21706);
        return true;
    }

    public C8865(C8374 c8374) {
        this.f24045 = c8374;
    }
}
