package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1C0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2601 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC8245 f8220;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f8221;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m8227(C17417 c17417, long j) {
        AbstractC8245 abstractC8245 = c17417.f53266;
        ArrayList arrayList = c17417.f53269;
        if (abstractC8245 instanceof C9657) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC11068 interfaceC11068 = (InterfaceC11068) arrayList.get(i);
            if (interfaceC11068 instanceof C17417) {
                C17417 c17418 = (C17417) interfaceC11068;
                if (c17418.f53266 != abstractC8245) {
                    jMax = Math.max(jMax, m8227(c17418, ((long) c17418.f53272) + j));
                }
            }
        }
        C17417 c17419 = abstractC8245.f25382;
        C17417 c174110 = abstractC8245.f25379;
        if (c17417 != c17419) {
            return jMax;
        }
        long jMo6245 = abstractC8245.mo6245() + j;
        return Math.max(Math.max(jMax, m8227(c174110, jMo6245)), jMo6245 - ((long) c174110.f53272));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m8226(C17417 c17417, long j) {
        AbstractC8245 abstractC8245 = c17417.f53266;
        ArrayList arrayList = c17417.f53269;
        if (abstractC8245 instanceof C9657) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC11068 interfaceC11068 = (InterfaceC11068) arrayList.get(i);
            if (interfaceC11068 instanceof C17417) {
                C17417 c17418 = (C17417) interfaceC11068;
                if (c17418.f53266 != abstractC8245) {
                    jMin = Math.min(jMin, m8226(c17418, ((long) c17418.f53272) + j));
                }
            }
        }
        C17417 c17419 = abstractC8245.f25379;
        C17417 c174110 = abstractC8245.f25382;
        if (c17417 != c17419) {
            return jMin;
        }
        long jMo6245 = j - abstractC8245.mo6245();
        return Math.min(Math.min(jMin, m8226(c174110, jMo6245)), jMo6245 - ((long) c174110.f53272));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m8228(C21446 c21446, int i) {
        long j;
        AbstractC8245 abstractC8245 = this.f8220;
        if (!(abstractC8245 instanceof C1895) ? i != 0 ? (abstractC8245 instanceof C18829) : (abstractC8245 instanceof C16005) : ((C1895) abstractC8245).f25378 == i) {
            return 0L;
        }
        C17417 c17417 = (i == 0 ? c21446.f46156 : c21446.f46140).f25382;
        C17417 c17418 = (i == 0 ? c21446.f46156 : c21446.f46140).f25379;
        C17417 c17419 = abstractC8245.f25382;
        C17417 c174110 = abstractC8245.f25382;
        C17417 c174111 = abstractC8245.f25379;
        boolean zContains = c17419.f53275.contains(c17417);
        boolean zContains2 = c174111.f53275.contains(c17418);
        long jMo6245 = abstractC8245.mo6245();
        if (!zContains || !zContains2) {
            if (zContains) {
                return Math.max(m8227(c174110, c174110.f53272), ((long) c174110.f53272) + jMo6245);
            }
            if (zContains2) {
                return Math.max(-m8226(c174111, c174111.f53272), ((long) (-c174111.f53272)) + jMo6245);
            }
            return (abstractC8245.mo6245() + ((long) c174110.f53272)) - ((long) c174111.f53272);
        }
        long jM8227 = m8227(c174110, 0L);
        long jM8226 = m8226(c174111, 0L);
        long j2 = jM8227 - jMo6245;
        int i2 = c174111.f53272;
        if (j2 >= (-i2)) {
            j2 += (long) i2;
        }
        long j3 = c174110.f53272;
        long j4 = ((-jM8226) - jMo6245) - j3;
        if (j4 >= j3) {
            j4 -= j3;
        }
        float fM35708 = abstractC8245.f25376.m35708(i);
        if (fM35708 > 0.0f) {
            j = (long) ((j2 / (1.0f - fM35708)) + (j4 / fM35708));
        } else {
            j = 0;
        }
        float f = j;
        return (((long) c174110.f53272) + ((((long) ((f * fM35708) + 0.5f)) + jMo6245) + ((long) C20382.m46695(1.0f, fM35708, f, 0.5f)))) - ((long) c174111.f53272);
    }
}
