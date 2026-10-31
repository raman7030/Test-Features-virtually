package l;

import android.util.Pair;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8RI */
/* JADX INFO: loaded from: classes2.dex */
public final class C6488 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f20022;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19477 f20023;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C17071 f20024;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C17071 f20025;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f20027;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C17071 f20029;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f20030;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f20031;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f20033;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18524 f20034;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C17071 f20035;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17071 f20036;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f20037;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Object f20039;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2751 f20028 = C2751.f8557;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22485 f20038 = new C22485();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20369 f20026 = new C20369();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f20032 = new ArrayList();

    public C6488(InterfaceC19477 interfaceC19477, InterfaceC19251 interfaceC19251, C18524 c18524) {
        this.f20023 = interfaceC19477;
        this.f20030 = interfaceC19251;
        this.f20034 = c18524;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17894(AbstractC4846 abstractC4846, int i) {
        this.f20037 = i;
        return m17883(abstractC4846);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17896(AbstractC4846 abstractC4846, boolean z) {
        this.f20022 = z;
        return m17883(abstractC4846);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17905(AbstractC4846 abstractC4846, C2751 c2751) {
        this.f20028 = c2751;
        this.f20028.getClass();
        m17907();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m17910(InterfaceC9546 interfaceC9546) {
        C17071 c17071 = this.f20035;
        return c17071 != null && c17071.f52337 == interfaceC9546;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m17914(InterfaceC9546 interfaceC9546) {
        C17071 c17071 = this.f20024;
        return c17071 != null && c17071.f52337 == interfaceC9546;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17904(long j) {
        C17071 c17071 = this.f20035;
        if (c17071 != null) {
            c17071.m40062(j);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m17912() {
        C17071 c17071 = this.f20035;
        if (c17071 != null) {
            return !c17071.f52336.f42932 && c17071.m40077() && this.f20035.f52336.f42925 != -9223372036854775807L && this.f20033 < 100;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14248 m17898(long j, C12838 c12838) {
        C17071 c17071 = this.f20035;
        if (c17071 != null) {
            return m17888(c12838.f38560, c17071, j);
        }
        return m17887(c12838.f38560, c12838.f38574, c12838.f38564, c12838.f38563);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17071 m17903(C14248 c14248) {
        C17071 c17071M45927;
        C17071 c17071 = this.f20035;
        long jM40071 = c17071 == null ? BasicLabelFormatter.TRILLION : (c17071.m40071() + this.f20035.f52336.f42925) - c14248.f42927;
        int i = 0;
        while (true) {
            if (i >= this.f20032.size()) {
                c17071M45927 = null;
                break;
            }
            C14248 c14249 = ((C17071) this.f20032.get(i)).f52336;
            long j = c14249.f42925;
            long j2 = c14248.f42925;
            if ((j == -9223372036854775807L || j == j2) && c14249.f42927 == c14248.f42927 && c14249.f42930.equals(c14248.f42930)) {
                c17071M45927 = (C17071) this.f20032.remove(i);
                break;
            }
            i++;
        }
        if (c17071M45927 == null) {
            c17071M45927 = C19936.m45927(this.f20034.f57399, c14248, jM40071);
        } else {
            c17071M45927.f52336 = c14248;
            c17071M45927.m40069(jM40071);
        }
        C17071 c17072 = this.f20035;
        if (c17072 != null) {
            c17072.m40064(c17071M45927);
        } else {
            this.f20029 = c17071M45927;
            this.f20036 = c17071M45927;
            this.f20025 = c17071M45927;
        }
        this.f20039 = null;
        this.f20035 = c17071M45927;
        this.f20033++;
        m17893();
        return c17071M45927;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m17907() {
        if (this.f20032.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f20032.size(); i++) {
            ((C17071) this.f20032.get(i)).m40076();
        }
        this.f20032 = arrayList;
        this.f20024 = null;
        m17908();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17071 m17915() {
        return this.f20035;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17071 m17918() {
        return this.f20024;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17071 m17911() {
        return this.f20029;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17071 m17917() {
        return this.f20036;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17071 m17906() {
        return this.f20025;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17071 m17913() {
        C17071 c17071 = this.f20025;
        C17071 c17072 = this.f20036;
        if (c17071 == c17072) {
            C22632.m50632(c17072);
            this.f20025 = c17072.m40068();
        }
        C17071 c17073 = this.f20036;
        C22632.m50632(c17073);
        this.f20036 = c17073.m40068();
        m17893();
        C17071 c17074 = this.f20036;
        C22632.m50632(c17074);
        return c17074;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17909() {
        C17071 c17071 = this.f20025;
        C22632.m50632(c17071);
        this.f20025 = c17071.m40068();
        m17893();
        C22632.m50632(this.f20025);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17071 m17901() {
        C17071 c17071 = this.f20029;
        if (c17071 == null) {
            return null;
        }
        if (c17071 == this.f20036) {
            this.f20036 = c17071.m40068();
        }
        C17071 c17072 = this.f20029;
        if (c17072 == this.f20025) {
            this.f20025 = c17072.m40068();
        }
        this.f20029.m40076();
        int i = this.f20033 - 1;
        this.f20033 = i;
        if (i == 0) {
            this.f20035 = null;
            C17071 c17073 = this.f20029;
            this.f20039 = c17073.f52340;
            this.f20027 = c17073.f52336.f42930.f49111;
        }
        this.f20029 = this.f20029.m40068();
        m17893();
        return this.f20029;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17897(C17071 c17071) {
        C22632.m50632(c17071);
        int i = 0;
        if (c17071.equals(this.f20035)) {
            return 0;
        }
        this.f20035 = c17071;
        while (c17071.m40068() != null) {
            c17071 = c17071.m40068();
            c17071.getClass();
            if (c17071 == this.f20036) {
                C17071 c17072 = this.f20029;
                this.f20036 = c17072;
                this.f20025 = c17072;
                i = 3;
            }
            if (c17071 == this.f20025) {
                this.f20025 = this.f20036;
                i |= 2;
            }
            c17071.m40076();
            this.f20033--;
        }
        C17071 c17073 = this.f20035;
        c17073.getClass();
        c17073.m40064((C17071) null);
        m17893();
        return i;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m17908() {
        C17071 c17071 = this.f20024;
        if (c17071 == null || c17071.m40065()) {
            this.f20024 = null;
            for (int i = 0; i < this.f20032.size(); i++) {
                C17071 c17072 = (C17071) this.f20032.get(i);
                if (!c17072.m40065()) {
                    this.f20024 = c17072;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17071 m17902(InterfaceC9546 interfaceC9546) {
        for (int i = 0; i < this.f20032.size(); i++) {
            C17071 c17071 = (C17071) this.f20032.get(i);
            if (c17071.f52337 == interfaceC9546) {
                return c17071;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m17916() {
        if (this.f20033 == 0) {
            return;
        }
        C17071 c17071M40068 = this.f20029;
        C22632.m50632(c17071M40068);
        this.f20039 = c17071M40068.f52340;
        this.f20027 = c17071M40068.f52336.f42930.f49111;
        while (c17071M40068 != null) {
            c17071M40068.m40076();
            c17071M40068 = c17071M40068.m40068();
        }
        this.f20029 = null;
        this.f20035 = null;
        this.f20036 = null;
        this.f20025 = null;
        this.f20033 = 0;
        m17893();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17895(AbstractC4846 abstractC4846, long j, long j2, long j3) {
        C14248 c14248M17899;
        boolean z;
        C17071 c17071M40068 = this.f20029;
        C17071 c17071 = null;
        while (true) {
            int i = 0;
            if (c17071M40068 == null) {
                return 0;
            }
            C14248 c14248 = c17071M40068.f52336;
            if (c17071 == null) {
                c14248M17899 = m17899(abstractC4846, c14248);
            } else {
                C14248 c14248M17888 = m17888(abstractC4846, c17071, j);
                if (c14248M17888 == null || c14248.f42927 != c14248M17888.f42927 || !c14248.f42930.equals(c14248M17888.f42930)) {
                    return m17897(c17071);
                }
                c14248M17899 = c14248M17888;
            }
            long j4 = c14248M17899.f42925;
            long j5 = c14248.f42933;
            long j6 = c14248.f42925;
            c17071M40068.f52336 = c14248M17899.m33892(j5);
            if (j6 != j4) {
                c17071M40068.m40066();
                long jM40075 = j4 == -9223372036854775807L ? C13132.FOREVER_NS : c17071M40068.m40075(j4);
                boolean z2 = c17071M40068 == this.f20036 && !c17071M40068.f52336.f42931 && (j2 == Long.MIN_VALUE || j2 >= jM40075);
                boolean z3 = c17071M40068 == this.f20025 && (j3 == Long.MIN_VALUE || j3 >= jM40075);
                int iM17897 = m17897(c17071M40068);
                if (iM17897 != 0) {
                    return iM17897;
                }
                if (j6 == -9223372036854775807L && c14248.f42928 == Long.MIN_VALUE) {
                    long j7 = c14248M17899.f42928;
                    if (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (z2 && (j6 != -9223372036854775807L || z)) {
                    i = 1;
                }
                return z3 ? i | 2 : i;
            }
            c17071 = c17071M40068;
            c17071M40068 = c17071M40068.m40068();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14248 m17899(AbstractC4846 abstractC4846, C14248 c14248) {
        long j;
        long jM50434;
        C15894 c15894 = c14248.f42930;
        boolean zM37669 = c15894.m37669();
        int i = c15894.f49110;
        boolean z = !zM37669 && i == -1;
        int i2 = c15894.f49108;
        boolean zM17891 = m17891(abstractC4846, c15894);
        boolean zM17892 = m17892(abstractC4846, c15894, z);
        Object obj = c15894.f49112;
        C22485 c22485 = this.f20038;
        abstractC4846.mo14105(obj, c22485);
        if (c15894.m37669() || i == -1) {
            j = -9223372036854775807L;
        } else {
            c22485.m50433(i);
            j = 0;
        }
        if (c15894.m37669()) {
            jM50434 = c22485.m50434(i2, c15894.f49109);
        } else {
            jM50434 = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? c22485.f72801 : j;
        }
        if (c15894.m37669()) {
            c22485.m50439(i2);
        } else if (i != -1) {
            c22485.m50439(i);
        }
        return new C14248(c15894, c14248.f42927, c14248.f42933, j, jM50434, c14248.f42926, false, z, zM17891, zM17892);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15894 m17889(AbstractC4846 abstractC4846, Object obj, long j, long j2, C20369 c20369, C22485 c22485) {
        abstractC4846.mo14105(obj, c22485);
        abstractC4846.m14106(c22485.f72806, c20369);
        abstractC4846.mo14098(obj);
        int i = c22485.f72800.f22070;
        if (i != 0) {
            if (i == 1) {
                c22485.m50438(0);
            }
            c22485.f72800.getClass();
            c22485.m50439(0);
        }
        abstractC4846.mo14105(obj, c22485);
        int iM50437 = c22485.m50437(j);
        if (iM50437 == -1) {
            return new C15894(c22485.m50432(j), j2, obj);
        }
        return new C15894(obj, iM50437, c22485.m50436(iM50437), j2);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m17893() {
        int i = AbstractC14545.f44556;
        final C1846 c1846 = new C1846();
        for (C17071 c17071M40068 = this.f20029; c17071M40068 != null; c17071M40068 = c17071M40068.m40068()) {
            c1846.m16264(c17071M40068.f52336.f42930);
        }
        C17071 c17071 = this.f20036;
        final C15894 c15894 = c17071 == null ? null : c17071.f52336.f42930;
        this.f20030.mo17760(new Runnable() { // from class: l.᩻ۗ֫
            @Override // java.lang.Runnable
            public final void run() {
                this.f75221.f20023.mo44878(c1846.m6131(), c15894);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15894 m17900(AbstractC4846 abstractC4846, Object obj, long j) {
        long jM17884;
        int iMo14098;
        Object obj2 = obj;
        C22485 c22485 = this.f20038;
        int i = abstractC4846.mo14105(obj2, c22485).f72806;
        Object obj3 = this.f20039;
        if (obj3 != null && (iMo14098 = abstractC4846.mo14098(obj3)) != -1 && abstractC4846.mo14104(iMo14098, c22485, false).f72806 == i) {
            jM17884 = this.f20027;
        } else {
            C17071 c17071M40068 = this.f20029;
            while (true) {
                if (c17071M40068 != null) {
                    if (c17071M40068.f52340.equals(obj2)) {
                        jM17884 = c17071M40068.f52336.f42930.f49111;
                        break;
                    }
                    c17071M40068 = c17071M40068.m40068();
                } else {
                    C17071 c17071M40069 = this.f20029;
                    while (true) {
                        if (c17071M40069 != null) {
                            int iMo14099 = abstractC4846.mo14098(c17071M40069.f52340);
                            if (iMo14099 != -1 && abstractC4846.mo14104(iMo14099, c22485, false).f72806 == i) {
                                jM17884 = c17071M40069.f52336.f42930.f49111;
                                break;
                            }
                            c17071M40069 = c17071M40069.m40068();
                        } else {
                            jM17884 = m17884(obj2);
                            if (jM17884 != -1) {
                                break;
                            }
                            jM17884 = this.f20031;
                            this.f20031 = 1 + jM17884;
                            if (this.f20029 != null) {
                                break;
                            }
                            this.f20039 = obj2;
                            this.f20027 = jM17884;
                            break;
                        }
                    }
                }
            }
        }
        long j2 = jM17884;
        abstractC4846.mo14105(obj2, c22485);
        int i2 = c22485.f72806;
        C20369 c20369 = this.f20026;
        abstractC4846.m14106(i2, c20369);
        boolean z = false;
        for (int iMo140910 = abstractC4846.mo14098(obj); iMo140910 >= c20369.f65760; iMo140910--) {
            abstractC4846.mo14104(iMo140910, c22485, true);
            boolean z2 = c22485.f72800.f22070 > 0;
            z |= z2;
            if (c22485.m50437(c22485.f72801) != -1) {
                obj2 = c22485.f72802;
                obj2.getClass();
            }
            if (z && (!z2 || c22485.f72801 != 0)) {
                break;
            }
        }
        return m17889(abstractC4846, obj2, j, j2, this.f20026, this.f20038);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m17884(Object obj) {
        for (int i = 0; i < this.f20032.size(); i++) {
            C17071 c17071 = (C17071) this.f20032.get(i);
            if (c17071.f52340.equals(obj)) {
                return c17071.f52336.f42930.f49111;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m17883(AbstractC4846 abstractC4846) {
        C17071 c17071M40068 = this.f20029;
        if (c17071M40068 == null) {
            return 0;
        }
        int iMo14098 = abstractC4846.mo14098(c17071M40068.f52340);
        while (true) {
            iMo14098 = abstractC4846.m14097(iMo14098, this.f20038, this.f20026, this.f20037, this.f20022);
            while (true) {
                c17071M40068.getClass();
                if (c17071M40068.m40068() == null || c17071M40068.f52336.f42929) {
                    break;
                }
                c17071M40068 = c17071M40068.m40068();
            }
            C17071 c17071M40069 = c17071M40068.m40068();
            if (iMo14098 == -1 || c17071M40069 == null || abstractC4846.mo14098(c17071M40069.f52340) != iMo14098) {
                break;
            }
            c17071M40068 = c17071M40069;
        }
        int iM17897 = m17897(c17071M40068);
        c17071M40068.f52336 = m17899(abstractC4846, c17071M40068.f52336);
        return iM17897;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14248 m17888(AbstractC4846 abstractC4846, C17071 c17071, long j) {
        long j2;
        long j3;
        long jM17884;
        C14248 c14248 = c17071.f52336;
        long jM40071 = (c17071.m40071() + c14248.f42925) - j;
        if (c14248.f42929) {
            C14248 c14249 = c17071.f52336;
            C15894 c15894 = c14249.f42930;
            long j4 = c14249.f42933;
            int iM14097 = abstractC4846.m14097(abstractC4846.mo14098(c15894.f49112), this.f20038, this.f20026, this.f20037, this.f20022);
            if (iM14097 != -1) {
                C22485 c22485 = this.f20038;
                int i = abstractC4846.mo14104(iM14097, c22485, true).f72806;
                Object obj = c22485.f72802;
                obj.getClass();
                long j5 = c15894.f49111;
                if (abstractC4846.mo14103(i, this.f20026, 0L).f65760 == iM14097) {
                    Pair pairM14101 = abstractC4846.m14101(this.f20026, this.f20038, i, -9223372036854775807L, Math.max(0L, jM40071));
                    if (pairM14101 != null) {
                        obj = pairM14101.first;
                        long jLongValue = ((Long) pairM14101.second).longValue();
                        C17071 c17071M40068 = c17071.m40068();
                        if (c17071M40068 != null && c17071M40068.f52340.equals(obj)) {
                            jM17884 = c17071M40068.f52336.f42930.f49111;
                        } else {
                            jM17884 = m17884(obj);
                            if (jM17884 == -1) {
                                jM17884 = this.f20031;
                                this.f20031 = 1 + jM17884;
                            }
                        }
                        j3 = jLongValue;
                        j2 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                    j3 = 0;
                    jM17884 = j5;
                }
                C15894 c15894M17889 = m17889(abstractC4846, obj, j3, jM17884, this.f20026, this.f20038);
                if (j2 != -9223372036854775807L && j4 != -9223372036854775807L) {
                    int i2 = abstractC4846.mo14105(c15894.f49112, c22485).f72800.f22070;
                    c22485.f72800.getClass();
                    if (i2 > 0) {
                        c22485.m50439(0);
                    }
                }
                return m17887(abstractC4846, c15894M17889, j2, j3);
            }
            return null;
        }
        C14248 c142410 = c17071.f52336;
        C15894 c15895 = c142410.f42930;
        Object obj2 = c15895.f49112;
        int i3 = c15895.f49110;
        C22485 c22486 = this.f20038;
        abstractC4846.mo14105(obj2, c22486);
        boolean z = c142410.f42931;
        if (c15895.m37669()) {
            int i4 = c15895.f49108;
            int i5 = c22486.f72800.m19298(i4).f40471;
            if (i5 == -1) {
                return null;
            }
            int iM32606 = c22486.f72800.m19298(i4).m32606(c15895.f49109);
            if (iM32606 < i5) {
                return m17885(abstractC4846, c15895.f49112, i4, iM32606, c142410.f42933, c15895.f49111, z);
            }
            long jLongValue2 = c142410.f42933;
            if (jLongValue2 == -9223372036854775807L) {
                Pair pairM14102 = abstractC4846.m14101(this.f20026, c22486, c22486.f72806, -9223372036854775807L, Math.max(0L, jM40071));
                if (pairM14102 == null) {
                    return null;
                }
                jLongValue2 = ((Long) pairM14102.second).longValue();
            }
            int i6 = c15895.f49108;
            abstractC4846.mo14105(obj2, c22486);
            c22486.m50433(i6);
            c22486.f72800.m19298(i6).getClass();
            return m17886(abstractC4846, c15895.f49112, Math.max(0L, jLongValue2), c142410.f42933, c15895.f49111, z);
        }
        if (i3 != -1) {
            c22486.m50438(i3);
        }
        int iM50436 = c22486.m50436(i3);
        c22486.m50439(i3);
        if (iM50436 != c22486.f72800.m19298(i3).f40471) {
            return m17885(abstractC4846, c15895.f49112, c15895.f49110, iM50436, c142410.f42925, c15895.f49111, z);
        }
        abstractC4846.mo14105(obj2, c22486);
        c22486.m50433(i3);
        c22486.f72800.m19298(i3).getClass();
        return m17886(abstractC4846, c15895.f49112, 0L, c142410.f42925, c15895.f49111, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14248 m17887(AbstractC4846 abstractC4846, C15894 c15894, long j, long j2) {
        abstractC4846.mo14105(c15894.f49112, this.f20038);
        if (c15894.m37669()) {
            return m17885(abstractC4846, c15894.f49112, c15894.f49108, c15894.f49109, j, c15894.f49111, false);
        }
        return m17886(abstractC4846, c15894.f49112, j2, j, c15894.f49111, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14248 m17885(AbstractC4846 abstractC4846, Object obj, int i, int i2, long j, long j2, boolean z) {
        C15894 c15894 = new C15894(obj, i, i2, j2);
        C22485 c22485 = this.f20038;
        long jM50434 = abstractC4846.mo14105(obj, c22485).m50434(i, i2);
        if (i2 == c22485.m50436(i)) {
            c22485.f72800.getClass();
        }
        c22485.m50439(i);
        long jMax = 0;
        if (jM50434 != -9223372036854775807L && 0 >= jM50434) {
            jMax = Math.max(0L, jM50434 - 1);
        }
        return new C14248(c15894, jMax, j, -9223372036854775807L, jM50434, z, false, false, false, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14248 m17886(AbstractC4846 abstractC4846, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        C22485 c22485 = this.f20038;
        abstractC4846.mo14105(obj, c22485);
        int iM50432 = c22485.m50432(j);
        boolean z2 = false;
        if (iM50432 == -1) {
            if (c22485.f72800.f22070 > 0) {
                c22485.m50439(0);
            }
        } else {
            c22485.m50439(iM50432);
        }
        C15894 c15894 = new C15894(iM50432, j3, obj);
        if (!c15894.m37669() && iM50432 == -1) {
            z2 = true;
        }
        boolean zM17891 = m17891(abstractC4846, c15894);
        boolean zM17892 = m17892(abstractC4846, c15894, z2);
        if (iM50432 != -1) {
            c22485.m50439(iM50432);
        }
        if (iM50432 != -1) {
            c22485.m50438(iM50432);
        }
        if (iM50432 != -1) {
            c22485.m50433(iM50432);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? c22485.f72801 : j4;
        return new C14248(c15894, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - ((long) 1)), j2, j4, j5, z, false, z2, zM17891, zM17892);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m17891(AbstractC4846 abstractC4846, C15894 c15894) {
        boolean z = !c15894.m37669() && c15894.f49110 == -1;
        Object obj = c15894.f49112;
        if (z) {
            if (abstractC4846.mo14103(abstractC4846.mo14105(obj, this.f20038).f72806, this.f20026, 0L).f65752 == abstractC4846.mo14098(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m17892(AbstractC4846 abstractC4846, C15894 c15894, boolean z) {
        int iMo14098 = abstractC4846.mo14098(c15894.f49112);
        if (!abstractC4846.mo14103(abstractC4846.mo14104(iMo14098, this.f20038, false).f72806, this.f20026, 0L).f65759) {
            if (abstractC4846.m14097(iMo14098, this.f20038, this.f20026, this.f20037, this.f20022) == -1 && z) {
                return true;
            }
        }
        return false;
    }
}
