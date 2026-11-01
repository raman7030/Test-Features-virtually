package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.᩻᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBGV */
/* JADX INFO: loaded from: classes.dex */
public final class C25129 {

    /* JADX INFO: renamed from: ֫ */
    public final C3948 f80415;

    /* JADX INFO: renamed from: ۧ */
    public final C19705 f80416;

    public C25129(C3948 c3948, C19705 c19705) {
        if (c3948 == null) {
            throw new NullPointerException("file == null");
        }
        this.f80415 = c3948;
        this.f80416 = c19705;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55186(AbstractC15405 abstractC15405) {
        int iM55183 = m55183(abstractC15405);
        C19705 c19705 = this.f80416;
        if (iM55183 != 0 && iM55183 != 6 && iM55183 != 2) {
            if (iM55183 == 3) {
                C21274.m48066(c19705, iM55183, ((AbstractC3531) abstractC15405).mo4594());
                return;
            }
            if (iM55183 != 4) {
                if (iM55183 == 16) {
                    C21274.m48063(c19705, iM55183, ((C17612) abstractC15405).mo4594() << 32);
                    return;
                }
                if (iM55183 == 17) {
                    C21274.m48063(c19705, iM55183, ((C22308) abstractC15405).mo4594());
                    return;
                }
                C3948 c3948 = this.f80415;
                switch (iM55183) {
                    case 21:
                        C21274.m48066(c19705, iM55183, c3948.m7848().m27430(((C6884) abstractC15405).m15778()));
                        return;
                    case 22:
                        C21274.m48066(c19705, iM55183, c3948.m7852().m23289((C22978) abstractC15405));
                        return;
                    case 23:
                        C21274.m48066(c19705, iM55183, c3948.m7861().m8956((C14930) abstractC15405));
                        return;
                    case 24:
                        C21274.m48066(c19705, iM55183, c3948.m7862().m41989((C14260) abstractC15405));
                        return;
                    case 25:
                        C21274.m48066(c19705, iM55183, c3948.m7856().m20054((C10908) abstractC15405));
                        return;
                    case 26:
                        C21274.m48066(c19705, iM55183, c3948.m7857().m50874((AbstractC18283) abstractC15405));
                        return;
                    case 27:
                        C21274.m48066(c19705, iM55183, c3948.m7856().m20054(((C11579) abstractC15405).m26649()));
                        return;
                    case 28:
                        c19705.m44776(iM55183);
                        m55185((C12920) abstractC15405, false);
                        return;
                    case 29:
                        c19705.m44776(iM55183);
                        m55184(((C9371) abstractC15405).m21784(), false);
                        return;
                    case 30:
                        c19705.m44776(iM55183);
                        return;
                    case 31:
                        c19705.m44776((((C19625) abstractC15405).mo4598() << 5) | iM55183);
                        return;
                    default:
                        throw new RuntimeException("Shouldn't happen");
                }
            }
        }
        long jMo4594 = ((AbstractC3531) abstractC15405).mo4594();
        int iNumberOfLeadingZeros = (72 - Long.numberOfLeadingZeros((jMo4594 >> 63) ^ jMo4594)) >> 3;
        c19705.m44776(iM55183 | ((iNumberOfLeadingZeros - 1) << 5));
        while (iNumberOfLeadingZeros > 0) {
            c19705.m44776((byte) jMo4594);
            jMo4594 >>= 8;
            iNumberOfLeadingZeros--;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m55183(AbstractC15405 abstractC15405) {
        if (abstractC15405 instanceof C18954) {
            return 0;
        }
        if (abstractC15405 instanceof C5543) {
            return 2;
        }
        if (abstractC15405 instanceof C8896) {
            return 3;
        }
        if (abstractC15405 instanceof C4873) {
            return 4;
        }
        if (abstractC15405 instanceof C10237) {
            return 6;
        }
        if (abstractC15405 instanceof C17612) {
            return 16;
        }
        if (abstractC15405 instanceof C22308) {
            return 17;
        }
        if (abstractC15405 instanceof C6884) {
            return 21;
        }
        if (abstractC15405 instanceof C22978) {
            return 22;
        }
        if (abstractC15405 instanceof C14930) {
            return 23;
        }
        if (abstractC15405 instanceof C14260) {
            return 24;
        }
        if (abstractC15405 instanceof C10908) {
            return 25;
        }
        if (abstractC15405 instanceof C23648) {
            return 26;
        }
        if (abstractC15405 instanceof C11579) {
            return 27;
        }
        if (abstractC15405 instanceof C12920) {
            return 28;
        }
        if (abstractC15405 instanceof C9371) {
            return 29;
        }
        if (abstractC15405 instanceof C20967) {
            return 30;
        }
        if (abstractC15405 instanceof C19625) {
            return 31;
        }
        throw new RuntimeException("Shouldn't happen");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55185(C12920 c12920, boolean z) {
        C19705 c19705 = this.f80416;
        boolean z2 = z && c19705.m44765();
        C4202 c4202M29596 = c12920.m29596();
        int size = c4202M29596.size();
        if (z2) {
            c19705.m44762("  size: ".concat(C16351.m37155(size)));
        }
        c19705.m44766(size);
        for (int i = 0; i < size; i++) {
            AbstractC15405 abstractC15405M56519get = c4202M29596.m56519get(i);
            if (z2) {
                c19705.m44762("  [" + Integer.toHexString(i) + "] " + m55182(abstractC15405M56519get));
            }
            m55186(abstractC15405M56519get);
        }
        if (z2) {
            c19705.m44767();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55184(C8050 c8050, boolean z) {
        C19705 c19705 = this.f80416;
        boolean z2 = z && c19705.m44765();
        C3948 c3948 = this.f80415;
        C4342 c4342M7861 = c3948.m7861();
        C18423 c18423M7862 = c3948.m7862();
        C14260 type = c8050.getType();
        int iM41989 = c18423M7862.m41989(type);
        if (z2) {
            c19705.m44762("  type_idx: " + C16351.m37155(iM41989) + " // " + type.mo4819());
        }
        c19705.m44766(c18423M7862.m41989(c8050.getType()));
        Collection<C9391> collectionM18703 = c8050.m18703();
        int size = collectionM18703.size();
        if (z2) {
            c19705.m44762("  size: ".concat(C16351.m37155(size)));
        }
        c19705.m44766(size);
        int i = 0;
        for (C9391 c9391 : collectionM18703) {
            C14930 name = c9391.getName();
            int iM8956 = c4342M7861.m8956(name);
            AbstractC15405 value = c9391.getValue();
            if (z2) {
                c19705.m44760(0, "  elements[" + i + "]:");
                i++;
                c19705.m44762("    name_idx: " + C16351.m37155(iM8956) + " // " + name.mo4819());
            }
            c19705.m44766(iM8956);
            if (z2) {
                c19705.m44762("    value: " + m55182(value));
            }
            m55186(value);
        }
        if (z2) {
            c19705.m44767();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m55182(AbstractC15405 abstractC15405) {
        if (m55183(abstractC15405) == 30) {
            return "null";
        }
        return abstractC15405.mo10336() + ' ' + abstractC15405.mo4819();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55180(C3948 c3948, C8050 c8050) {
        C18423 c18423M7862 = c3948.m7862();
        C4342 c4342M7861 = c3948.m7861();
        c18423M7862.m41991(c8050.getType());
        for (C9391 c9391 : c8050.m18703()) {
            c4342M7861.m8958(c9391.getName());
            m55181(c3948, c9391.getValue());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55181(C3948 c3948, AbstractC15405 abstractC15405) {
        if (abstractC15405 instanceof C9371) {
            m55180(c3948, ((C9371) abstractC15405).m21784());
            return;
        }
        if (abstractC15405 instanceof C12920) {
            C4202 c4202M29596 = ((C12920) abstractC15405).m29596();
            int size = c4202M29596.size();
            for (int i = 0; i < size; i++) {
                m55181(c3948, c4202M29596.m56519get(i));
            }
            return;
        }
        c3948.m7855(abstractC15405);
    }
}
