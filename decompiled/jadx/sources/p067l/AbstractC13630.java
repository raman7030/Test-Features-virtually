package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.BitSet;

/* JADX INFO: renamed from: l.ۨܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BDR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13630 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m31003(int i) {
        return i == (i & 255);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m31007(int i) {
        return i == (i & 15);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m31010(int i) {
        return i == (65535 & i);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo9224();

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo9225(AbstractC12289 abstractC12289);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo9227(C19705 c19705, AbstractC12289 abstractC12289);

    /* JADX INFO: renamed from: ֫ */
    public boolean mo12133(C7515 c7515) {
        return this instanceof C18502;
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract String mo9228(AbstractC12289 abstractC12289);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo9229(AbstractC6924 abstractC6924);

    /* JADX INFO: renamed from: ֫ */
    public BitSet mo9226(AbstractC6924 abstractC6924) {
        return new BitSet();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m31006(C21442 c21442) {
        int size = c21442.size();
        StringBuilder sb = new StringBuilder((size * 5) + 2);
        sb.append('{');
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c21442.m56524get(i).m50981());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m31009(C21442 c21442) {
        int size = c21442.size();
        StringBuilder sbM34407 = C15033.m34407(30, "{");
        if (size != 0) {
            if (size != 1) {
                C22783 c22783M56524get = c21442.m56524get(size - 1);
                if (c22783M56524get.m50982() == 2) {
                    c22783M56524get = c22783M56524get.m50977(1);
                }
                sbM34407.append(c21442.m56524get(0).m50981());
                sbM34407.append("..");
                sbM34407.append(c22783M56524get.m50981());
            } else {
                sbM34407.append(c21442.m56524get(0).m50981());
            }
        }
        sbM34407.append(C0249l.f1198d);
        return sbM34407.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m30996(AbstractC3531 abstractC3531) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (abstractC3531 instanceof C20967) {
            sb.append("null");
        } else {
            sb.append(abstractC3531.mo10336());
            sb.append(' ');
            sb.append(abstractC3531.mo4819());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m30997(AbstractC3531 abstractC3531, int i) {
        StringBuilder sbM34407 = C15033.m34407(20, "#");
        long jMo4594 = abstractC3531 instanceof AbstractC7555 ? ((AbstractC7555) abstractC3531).mo4594() : abstractC3531.mo4598();
        if (i == 4) {
            sbM34407.append(C16351.m37154((int) jMo4594));
        } else if (i == 8) {
            sbM34407.append(C16351.m37152((int) jMo4594));
        } else if (i == 16) {
            sbM34407.append(C16351.m37153((int) jMo4594));
        } else if (i == 32) {
            sbM34407.append(C16351.m37155((int) jMo4594));
        } else {
            if (i != 64) {
                throw new RuntimeException("shouldn't happen");
            }
            sbM34407.append(C16351.m37151(jMo4594));
        }
        return sbM34407.toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m31011(AbstractC12289 abstractC12289) {
        int iM17407 = ((C7515) abstractC12289).m17407();
        return iM17407 == ((char) iM17407) ? C16351.m37153(iM17407) : C16351.m37155(iM17407);
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m31008(AbstractC12289 abstractC12289) {
        int iM17408 = ((C7515) abstractC12289).m17408();
        if (iM17408 == ((short) iM17408)) {
            char[] cArr = new char[5];
            if (iM17408 < 0) {
                cArr[0] = '-';
                iM17408 = -iM17408;
            } else {
                cArr[0] = '+';
            }
            for (int i = 0; i < 4; i++) {
                cArr[4 - i] = Character.forDigit(iM17408 & 15, 16);
                iM17408 >>= 4;
            }
            return new String(cArr);
        }
        return C16351.m37150(iM17408);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31004(C21442 c21442) {
        int size = c21442.size();
        if (size < 2) {
            return true;
        }
        int iM50989 = c21442.m56524get(0).m50989();
        for (int i = 0; i < size; i++) {
            C22783 c22783M56524get = c21442.m56524get(i);
            if (c22783M56524get.m50989() != iM50989) {
                return false;
            }
            iM50989 += c22783M56524get.m50982();
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static short m31000(AbstractC6924 abstractC6924, int i) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("arg out of range 0..255");
        }
        int iM34270 = abstractC6924.m15874().m34270();
        if ((iM34270 & 255) == iM34270) {
            return (short) (iM34270 | (i << 8));
        }
        throw new IllegalArgumentException("opcode out of range 0..255");
    }

    /* JADX INFO: renamed from: ֫ */
    public static short m30998(int i, int i2) {
        if ((i & 255) != i) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        }
        throw new IllegalArgumentException("high out of range 0..255");
    }

    /* JADX INFO: renamed from: ֫ */
    public static short m30999(int i, int i2, int i3, int i4) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((i2 & 15) != i2) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((i3 & 15) != i3) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((i4 & 15) == i4) {
            return (short) (i | (i2 << 4) | (i3 << 8) | (i4 << 12));
        }
        throw new IllegalArgumentException("n3 out of range 0..15");
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m31005(int i, int i2) {
        if ((i & 15) != i) {
            throw new IllegalArgumentException("low out of range 0..15");
        }
        if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        }
        throw new IllegalArgumentException("high out of range 0..15");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31001(InterfaceC7893 interfaceC7893, short s, short s2) {
        C19705 c19705 = (C19705) interfaceC7893;
        c19705.m44770(s);
        c19705.m44770(s2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31002(C19705 c19705, short s, int i) {
        c19705.m44770(s);
        c19705.m44770((short) i);
        c19705.m44770((short) (i >> 16));
    }
}
