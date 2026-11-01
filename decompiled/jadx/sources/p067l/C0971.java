package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖܶ */
/* JADX INFO: compiled from: L1C0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0971 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC1251 f11014;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f11015;

    /* JADX INFO: renamed from: ۧ */
    public static long m10268(C1706 c1706, long j) {
        AbstractC1251 abstractC1251 = c1706.f56454;
        ArrayList arrayList = c1706.f56457;
        if (abstractC1251 instanceof C1321) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1391 interfaceC1391 = (InterfaceC1391) arrayList.get(i);
            if (interfaceC1391 instanceof C1706) {
                C1706 c1707 = (C1706) interfaceC1391;
                if (c1707.f56454 != abstractC1251) {
                    jMax = Math.max(jMax, m10268(c1707, ((long) c1707.f56460) + j));
                }
            }
        }
        C1706 c1708 = abstractC1251.f28292;
        C1706 c1709 = abstractC1251.f28289;
        if (c1706 != c1708) {
            return jMax;
        }
        long jMo8447 = abstractC1251.mo8447() + j;
        return Math.max(Math.max(jMax, m10268(c1709, jMo8447)), jMo8447 - ((long) c1709.f56460));
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m10267(C1706 c1706, long j) {
        AbstractC1251 abstractC1251 = c1706.f56454;
        ArrayList arrayList = c1706.f56457;
        if (abstractC1251 instanceof C1321) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1391 interfaceC1391 = (InterfaceC1391) arrayList.get(i);
            if (interfaceC1391 instanceof C1706) {
                C1706 c1707 = (C1706) interfaceC1391;
                if (c1707.f56454 != abstractC1251) {
                    jMin = Math.min(jMin, m10267(c1707, ((long) c1707.f56460) + j));
                }
            }
        }
        C1706 c1708 = abstractC1251.f28289;
        C1706 c1709 = abstractC1251.f28292;
        if (c1706 != c1708) {
            return jMin;
        }
        long jMo8447 = j - abstractC1251.mo8447();
        return Math.min(Math.min(jMin, m10267(c1709, jMo8447)), jMo8447 - ((long) c1709.f56460));
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m10269(C1906 c1906, int i) {
        long j;
        AbstractC1251 abstractC1251 = this.f11014;
        if (!(abstractC1251 instanceof C0936) ? i != 0 ? (abstractC1251 instanceof C1776) : (abstractC1251 instanceof C1636) : ((C0936) abstractC1251).f28288 == i) {
            return 0L;
        }
        C1706 c1706 = (i == 0 ? c1906.f49276 : c1906.f49260).f28292;
        C1706 c1707 = (i == 0 ? c1906.f49276 : c1906.f49260).f28289;
        C1706 c1708 = abstractC1251.f28292;
        C1706 c1709 = abstractC1251.f28292;
        C1706 c17010 = abstractC1251.f28289;
        boolean zContains = c1708.f56463.contains(c1706);
        boolean zContains2 = c17010.f56463.contains(c1707);
        long jMo8447 = abstractC1251.mo8447();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(m10268(c1709, c1709.f56460), ((long) c1709.f56460) + jMo8447);
            }
            if (zContains2) {
                return Math.max(-m10267(c17010, c17010.f56460), ((long) (-c17010.f56460)) + jMo8447);
            }
            return (abstractC1251.mo8447() + ((long) c1709.f56460)) - ((long) c17010.f56460);
        }
        long jM10268 = m10268(c1709, 0L);
        long jM10267 = m10267(c17010, 0L);
        long j2 = jM10268 - jMo8447;
        int i2 = c17010.f56460;
        if (j2 >= (-i2)) {
            j2 += (long) i2;
        }
        long j3 = c1709.f56460;
        long j4 = ((-jM10267) - jMo8447) - j3;
        if (j4 >= j3) {
            j4 -= j3;
        }
        float fM37866 = abstractC1251.f28286.m37866(i);
        if (fM37866 > 0.0f) {
            j = (long) ((j2 / (1.0f - fM37866)) + (j4 / fM37866));
        } else {
            j = 0;
        }
        float f = j;
        return (((long) c1709.f56460) + ((((long) ((f * fM37866) + 0.5f)) + jMo8447) + ((long) C21740.m49018(1.0f, fM37866, f, 0.5f)))) - ((long) c17010.f56460);
    }
}
