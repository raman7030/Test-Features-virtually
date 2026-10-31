package l;

/* JADX INFO: renamed from: l.ܺ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16154 extends AbstractC16860 {
    /* JADX INFO: renamed from: ۫֫ */
    public abstract AbstractC4308 mo8503();

    /* JADX INFO: renamed from: ܽ */
    public abstract C23420 mo8504(C23420 c23420);

    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[Catch: all -> 0x0082, ۬ۛ֨ -> 0x0085, TryCatch #0 {all -> 0x0082, blocks: (B:10:0x002c, B:12:0x0034, B:15:0x003e, B:17:0x0049, B:19:0x0051, B:22:0x0063, B:24:0x0070, B:25:0x0076, B:36:0x008b, B:37:0x0097), top: B:44:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[Catch: all -> 0x0082, ۬ۛ֨ -> 0x0085, TryCatch #0 {all -> 0x0082, blocks: (B:10:0x002c, B:12:0x0034, B:15:0x003e, B:17:0x0049, B:19:0x0051, B:22:0x0063, B:24:0x0070, B:25:0x0076, B:36:0x008b, B:37:0x0097), top: B:44:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[PHI: r11
      0x007e: PHI (r11v3 l.ۙ֨֨) = (r11v2 l.ۙ֨֨), (r11v5 l.ۙ֨֨) binds: [B:26:0x007c, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0083: MOVE (r6 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:29:0x0083 */
    @Override // l.AbstractC16860
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC4308 mo18876(C23420 c23420) throws Throwable {
        AbstractC4308 abstractC4308Mo13581;
        C2609 c2609;
        AbstractC4308 abstractC4308Mo12923;
        AbstractC4308 abstractC4308Mo8503 = mo8503();
        C23420 c23420Mo8504 = mo8504(c23420);
        if (abstractC4308Mo8503 != null && abstractC4308Mo8503.m12913(EnumC9454.METHOD) && abstractC4308Mo8503.mo12940()) {
            C17318 c17318 = (C17318) abstractC4308Mo8503;
            C1755 c1755 = c17318.f53033;
            C1386 c1386 = c17318.f53032;
            C6735 c6735 = c17318.f53030;
            C0384 c0384 = c17318.f53031;
            C2609 c26010 = null;
            C1386 c1387 = new C1386(null);
            try {
                try {
                    C2609 c2609M1874 = c0384.m1874();
                    try {
                        boolean zM4872 = c1386.m4872(EnumC20347.UNCHECKED);
                        if (!zM4872) {
                            boolean zM18342 = c6735.m18342(c17318.f32060, c23420Mo8504, c0384);
                            InterfaceC3953 interfaceC3953 = c23420Mo8504.f75215;
                            C0384 c0384M1855 = zM18342 ? c0384.m1855(C6735.m18333(c6735, c17318), false, c1386) : c0384;
                            abstractC4308Mo13581 = c6735.m18347(c1755.f6074, c23420Mo8504, c17318, c0384M1855);
                            if (zM18342) {
                                c0384M1855.m1861(interfaceC3953.mo3857(), interfaceC3953.mo3860().m18377());
                                if (c2609M1874 != null) {
                                    c0384.m1870(c2609M1874);
                                }
                            } else {
                                c0384.m1862(c1387);
                                abstractC4308Mo12923 = c0384.m1859(c17318).mo12923();
                                if (zM4872) {
                                    abstractC4308Mo12923 = c6735.f20923.m17519(abstractC4308Mo12923);
                                }
                                abstractC4308Mo13581 = c23420Mo8504.mo13581(c1755.f6074, abstractC4308Mo12923);
                                if (c2609M1874 != null) {
                                    c0384.m1870(c2609M1874);
                                }
                            }
                        } else {
                            c0384.m1862(c1387);
                            abstractC4308Mo12923 = c0384.m1859(c17318).mo12923();
                            if (zM4872) {
                                abstractC4308Mo12923 = c6735.f20923.m17519(abstractC4308Mo12923);
                            }
                            abstractC4308Mo13581 = c23420Mo8504.mo13581(c1755.f6074, abstractC4308Mo12923);
                            if (c2609M1874 != null) {
                                c0384.m1870(c2609M1874);
                            }
                        }
                    } catch (C12919 e) {
                        e = e;
                        c23420Mo8504.f75215.mo1084(null, e.mo31425());
                        C12171.m29636();
                        throw null;
                    }
                } catch (Throwable th) {
                    th = th;
                    c26010 = c2609;
                    if (c26010 != null) {
                        c0384.m1870(c26010);
                    }
                    throw th;
                }
            } catch (C12919 e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
                if (c26010 != null) {
                    c0384.m1870(c26010);
                }
                throw th;
            }
        } else {
            AbstractC12612 abstractC12612 = this.f4048;
            abstractC12612.getClass();
            abstractC4308Mo13581 = c23420Mo8504.mo13581(abstractC12612, this.f51738.f16086);
        }
        this.f51739.put(c23420Mo8504, abstractC4308Mo13581);
        return abstractC4308Mo13581;
    }
}
