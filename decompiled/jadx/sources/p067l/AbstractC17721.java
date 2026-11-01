package p067l;

/* JADX INFO: renamed from: l.ܺ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17721 extends AbstractC18392 {
    /* JADX INFO: renamed from: ۫֫ */
    public abstract AbstractC6462 mo10550();

    /* JADX INFO: renamed from: ܽ */
    public abstract C24626 mo10551(C24626 c24626);

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[Catch: all -> 0x0082, ۬ۛ֨ -> 0x0085, TryCatch #0 {all -> 0x0082, blocks: (B:10:0x002c, B:12:0x0034, B:15:0x003e, B:17:0x0049, B:19:0x0051, B:22:0x0063, B:24:0x0070, B:25:0x0076, B:36:0x008b, B:37:0x0097), top: B:44:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[Catch: all -> 0x0082, ۬ۛ֨ -> 0x0085, TryCatch #0 {all -> 0x0082, blocks: (B:10:0x002c, B:12:0x0034, B:15:0x003e, B:17:0x0049, B:19:0x0051, B:22:0x0063, B:24:0x0070, B:25:0x0076, B:36:0x008b, B:37:0x0097), top: B:44:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[PHI: r11
      0x007e: PHI (r11v3 l.ۙ֨֨) = (r11v2 l.ۙ֨֨), (r11v5 l.ۙ֨֨) binds: [B:26:0x007c, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0083: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:29:0x0083 */
    @Override // p067l.AbstractC18392
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 mo20830(C24626 c24626) throws Throwable {
        AbstractC6462 abstractC6462Mo15456;
        C4848 c4848;
        AbstractC6462 abstractC6462Mo14787;
        AbstractC6462 abstractC6462Mo10550 = mo10550();
        C24626 c24626Mo10551 = mo10551(c24626);
        if (abstractC6462Mo10550 != null && abstractC6462Mo10550.m14777(EnumC11353.METHOD) && abstractC6462Mo10550.mo14804()) {
            C18827 c18827 = (C18827) abstractC6462Mo10550;
            C4036 c4036 = c18827.f56215;
            C3686 c3686 = c18827.f56214;
            C8769 c8769 = c18827.f56212;
            C2733 c2733 = c18827.f56213;
            C4848 c4849 = null;
            C3686 c3687 = new C3686(null);
            try {
                try {
                    C4848 c4848M4265 = c2733.m4265();
                    try {
                        boolean zM7110 = c3686.m7110(EnumC21706.UNCHECKED);
                        if (!zM7110) {
                            boolean zM20290 = c8769.m20290(c18827.f35031, c24626Mo10551, c2733);
                            InterfaceC6125 interfaceC6125 = c24626Mo10551.f77961;
                            C2733 c2733M4246 = zM20290 ? c2733.m4246(C8769.m20281(c8769, c18827), false, c3686) : c2733;
                            abstractC6462Mo15456 = c8769.m20295(c4036.f8850, c24626Mo10551, c18827, c2733M4246);
                            if (zM20290) {
                                c2733M4246.m4252(interfaceC6125.mo6098(), interfaceC6125.mo6101().m20325());
                                if (c4848M4265 != null) {
                                    c2733.m4261(c4848M4265);
                                }
                            } else {
                                c2733.m4253(c3687);
                                abstractC6462Mo14787 = c2733.m4250(c18827).mo14787();
                                if (zM7110) {
                                    abstractC6462Mo14787 = c8769.f23797.m19459(abstractC6462Mo14787);
                                }
                                abstractC6462Mo15456 = c24626Mo10551.mo15456(c4036.f8850, abstractC6462Mo14787);
                                if (c4848M4265 != null) {
                                    c2733.m4261(c4848M4265);
                                }
                            }
                        } else {
                            c2733.m4253(c3687);
                            abstractC6462Mo14787 = c2733.m4250(c18827).mo14787();
                            if (zM7110) {
                                abstractC6462Mo14787 = c8769.f23797.m19459(abstractC6462Mo14787);
                            }
                            abstractC6462Mo15456 = c24626Mo10551.mo15456(c4036.f8850, abstractC6462Mo14787);
                            if (c4848M4265 != null) {
                                c2733.m4261(c4848M4265);
                            }
                        }
                    } catch (C14646 e) {
                        e = e;
                        c24626Mo10551.f77961.mo3480(null, e.mo33511());
                        C1446.m31698();
                        throw null;
                    }
                } catch (Throwable th) {
                    th = th;
                    c4849 = c4848;
                    if (c4849 != null) {
                        c2733.m4261(c4849);
                    }
                    throw th;
                }
            } catch (C14646 e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                if (c4849 != null) {
                    c2733.m4261(c4849);
                }
                throw th;
            }
        } else {
            AbstractC14355 abstractC14355 = this.f6819;
            abstractC14355.getClass();
            abstractC6462Mo15456 = c24626Mo10551.mo15456(abstractC14355, this.f54918.f18925);
        }
        this.f54919.put(c24626Mo10551, abstractC6462Mo15456);
        return abstractC6462Mo15456;
    }
}
