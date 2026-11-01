package p067l;

import android.util.Pair;
import com.google.android.material.slider.BasicLabelFormatter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜۗ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O8RI */
/* JADX INFO: loaded from: classes2.dex */
public final class C8534 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f22896;

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20879 f22897;

    /* JADX INFO: renamed from: ۖ */
    public C18592 f22898;

    /* JADX INFO: renamed from: ۘ */
    public C18592 f22899;

    /* JADX INFO: renamed from: ۜ */
    public long f22901;

    /* JADX INFO: renamed from: ۢ */
    public C18592 f22903;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20664 f22904;

    /* JADX INFO: renamed from: ܳ */
    public long f22905;

    /* JADX INFO: renamed from: ܽ */
    public int f22907;

    /* JADX INFO: renamed from: ܿ */
    public final C19973 f22908;

    /* JADX INFO: renamed from: ᩳ */
    public C18592 f22909;

    /* JADX INFO: renamed from: ᩴ */
    public C18592 f22910;

    /* JADX INFO: renamed from: ᩵ */
    public int f22911;

    /* JADX INFO: renamed from: ᩻ */
    public Object f22913;

    /* JADX INFO: renamed from: ۡ */
    public C4983 f22902 = C4983.f11351;

    /* JADX INFO: renamed from: ᩷ */
    public final C23738 f22912 = new C23738();

    /* JADX INFO: renamed from: ۚ */
    public final C21727 f22900 = new C21727();

    /* JADX INFO: renamed from: ܺ */
    public ArrayList f22906 = new ArrayList();

    public C8534(InterfaceC20879 interfaceC20879, InterfaceC20664 interfaceC20664, C19973 c19973) {
        this.f22897 = interfaceC20879;
        this.f22904 = interfaceC20664;
        this.f22908 = c19973;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19842(AbstractC6974 abstractC6974, int i) {
        this.f22911 = i;
        return m19831(abstractC6974);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19844(AbstractC6974 abstractC6974, boolean z) {
        this.f22896 = z;
        return m19831(abstractC6974);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19853(AbstractC6974 abstractC6974, C4983 c4983) {
        this.f22902 = c4983;
        this.f22902.getClass();
        m19855();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m19858(InterfaceC11441 interfaceC11441) {
        C18592 c18592 = this.f22909;
        return c18592 != null && c18592.f55519 == interfaceC11441;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m19862(InterfaceC11441 interfaceC11441) {
        C18592 c18592 = this.f22898;
        return c18592 != null && c18592.f55519 == interfaceC11441;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19852(long j) {
        C18592 c18592 = this.f22909;
        if (c18592 != null) {
            c18592.m42307(j);
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m19860() {
        C18592 c18592 = this.f22909;
        if (c18592 != null) {
            return !c18592.f55518.f46024 && c18592.m42322() && this.f22909.f55518.f46017 != -9223372036854775807L && this.f22907 < 100;
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15909 m19846(long j, C14569 c14569) {
        C18592 c18592 = this.f22909;
        if (c18592 != null) {
            return m19836(c14569.f41602, c18592, j);
        }
        return m19835(c14569.f41602, c14569.f41616, c14569.f41606, c14569.f41605);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18592 m19851(C15909 c15909) {
        C18592 c18592M48240;
        C18592 c18592 = this.f22909;
        long jM42316 = c18592 == null ? BasicLabelFormatter.TRILLION : (c18592.m42316() + this.f22909.f55518.f46017) - c15909.f46019;
        int i = 0;
        while (true) {
            if (i >= this.f22906.size()) {
                c18592M48240 = null;
                break;
            }
            C15909 c159010 = ((C18592) this.f22906.get(i)).f55518;
            long j = c159010.f46017;
            long j2 = c15909.f46017;
            if ((j == -9223372036854775807L || j == j2) && c159010.f46019 == c15909.f46019 && c159010.f46022.equals(c15909.f46022)) {
                c18592M48240 = (C18592) this.f22906.remove(i);
                break;
            }
            i++;
        }
        if (c18592M48240 == null) {
            c18592M48240 = C21315.m48240(this.f22908.f60620, c15909, jM42316);
        } else {
            c18592M48240.f55518 = c15909;
            c18592M48240.m42314(jM42316);
        }
        C18592 c18593 = this.f22909;
        if (c18593 != null) {
            c18593.m42309(c18592M48240);
        } else {
            this.f22903 = c18592M48240;
            this.f22910 = c18592M48240;
            this.f22899 = c18592M48240;
        }
        this.f22913 = null;
        this.f22909 = c18592M48240;
        this.f22907++;
        m19841();
        return c18592M48240;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m19855() {
        if (this.f22906.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f22906.size(); i++) {
            ((C18592) this.f22906.get(i)).m42321();
        }
        this.f22906 = arrayList;
        this.f22898 = null;
        m19856();
    }

    /* JADX INFO: renamed from: ܿ */
    public final C18592 m19863() {
        return this.f22909;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C18592 m19866() {
        return this.f22898;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C18592 m19859() {
        return this.f22903;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final C18592 m19865() {
        return this.f22910;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C18592 m19854() {
        return this.f22899;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C18592 m19861() {
        C18592 c18592 = this.f22899;
        C18592 c18593 = this.f22910;
        if (c18592 == c18593) {
            C23877.m52958(c18593);
            this.f22899 = c18593.m42313();
        }
        C18592 c18594 = this.f22910;
        C23877.m52958(c18594);
        this.f22910 = c18594.m42313();
        m19841();
        C18592 c18595 = this.f22910;
        C23877.m52958(c18595);
        return c18595;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19857() {
        C18592 c18592 = this.f22899;
        C23877.m52958(c18592);
        this.f22899 = c18592.m42313();
        m19841();
        C23877.m52958(this.f22899);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18592 m19849() {
        C18592 c18592 = this.f22903;
        if (c18592 == null) {
            return null;
        }
        if (c18592 == this.f22910) {
            this.f22910 = c18592.m42313();
        }
        C18592 c18593 = this.f22903;
        if (c18593 == this.f22899) {
            this.f22899 = c18593.m42313();
        }
        this.f22903.m42321();
        int i = this.f22907 - 1;
        this.f22907 = i;
        if (i == 0) {
            this.f22909 = null;
            C18592 c18594 = this.f22903;
            this.f22913 = c18594.f55522;
            this.f22901 = c18594.f55518.f46022.f52251;
        }
        this.f22903 = this.f22903.m42313();
        m19841();
        return this.f22903;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19845(C18592 c18592) {
        C23877.m52958(c18592);
        int i = 0;
        if (c18592.equals(this.f22909)) {
            return 0;
        }
        this.f22909 = c18592;
        while (c18592.m42313() != null) {
            c18592 = c18592.m42313();
            c18592.getClass();
            if (c18592 == this.f22910) {
                C18592 c18593 = this.f22903;
                this.f22910 = c18593;
                this.f22899 = c18593;
                i = 3;
            }
            if (c18592 == this.f22899) {
                this.f22899 = this.f22910;
                i |= 2;
            }
            c18592.m42321();
            this.f22907--;
        }
        C18592 c18594 = this.f22909;
        c18594.getClass();
        c18594.m42309((C18592) null);
        m19841();
        return i;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m19856() {
        C18592 c18592 = this.f22898;
        if (c18592 == null || c18592.m42310()) {
            this.f22898 = null;
            for (int i = 0; i < this.f22906.size(); i++) {
                C18592 c18593 = (C18592) this.f22906.get(i);
                if (!c18593.m42310()) {
                    this.f22898 = c18593;
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18592 m19850(InterfaceC11441 interfaceC11441) {
        for (int i = 0; i < this.f22906.size(); i++) {
            C18592 c18592 = (C18592) this.f22906.get(i);
            if (c18592.f55519 == interfaceC11441) {
                return c18592;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m19864() {
        if (this.f22907 == 0) {
            return;
        }
        C18592 c18592M42313 = this.f22903;
        C23877.m52958(c18592M42313);
        this.f22913 = c18592M42313.f55522;
        this.f22901 = c18592M42313.f55518.f46022.f52251;
        while (c18592M42313 != null) {
            c18592M42313.m42321();
            c18592M42313 = c18592M42313.m42313();
        }
        this.f22903 = null;
        this.f22909 = null;
        this.f22910 = null;
        this.f22899 = null;
        this.f22907 = 0;
        m19841();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX INFO: renamed from: ֫ */
    public final int m19843(AbstractC6974 abstractC6974, long j, long j2, long j3) {
        C15909 c15909M19847;
        boolean z;
        C18592 c18592M42313 = this.f22903;
        C18592 c18592 = null;
        while (true) {
            int i = 0;
            if (c18592M42313 == null) {
                return 0;
            }
            C15909 c15909 = c18592M42313.f55518;
            if (c18592 == null) {
                c15909M19847 = m19847(abstractC6974, c15909);
            } else {
                C15909 c15909M19836 = m19836(abstractC6974, c18592, j);
                if (c15909M19836 == null || c15909.f46019 != c15909M19836.f46019 || !c15909.f46022.equals(c15909M19836.f46022)) {
                    return m19845(c18592);
                }
                c15909M19847 = c15909M19836;
            }
            long j4 = c15909M19847.f46017;
            long j5 = c15909.f46025;
            long j6 = c15909.f46017;
            c18592M42313.f55518 = c15909M19847.m36024(j5);
            if (j6 != j4) {
                c18592M42313.m42311();
                long jM42320 = j4 == -9223372036854775807L ? C14849.FOREVER_NS : c18592M42313.m42320(j4);
                boolean z2 = c18592M42313 == this.f22910 && !c18592M42313.f55518.f46023 && (j2 == Long.MIN_VALUE || j2 >= jM42320);
                boolean z3 = c18592M42313 == this.f22899 && (j3 == Long.MIN_VALUE || j3 >= jM42320);
                int iM19845 = m19845(c18592M42313);
                if (iM19845 != 0) {
                    return iM19845;
                }
                if (j6 == -9223372036854775807L && c15909.f46020 == Long.MIN_VALUE) {
                    long j7 = c15909M19847.f46020;
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
            c18592 = c18592M42313;
            c18592M42313 = c18592M42313.m42313();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15909 m19847(AbstractC6974 abstractC6974, C15909 c15909) {
        long j;
        long jM52775;
        C17474 c17474 = c15909.f46022;
        boolean zM39842 = c17474.m39842();
        int i = c17474.f52250;
        boolean z = !zM39842 && i == -1;
        int i2 = c17474.f52248;
        boolean zM19839 = m19839(abstractC6974, c17474);
        boolean zM19840 = m19840(abstractC6974, c17474, z);
        Object obj = c17474.f52252;
        C23738 c23738 = this.f22912;
        abstractC6974.mo15985(obj, c23738);
        if (c17474.m39842() || i == -1) {
            j = -9223372036854775807L;
        } else {
            c23738.m52774(i);
            j = 0;
        }
        if (c17474.m39842()) {
            jM52775 = c23738.m52775(i2, c17474.f52249);
        } else {
            jM52775 = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? c23738.f75527 : j;
        }
        if (c17474.m39842()) {
            c23738.m52780(i2);
        } else if (i != -1) {
            c23738.m52780(i);
        }
        return new C15909(c17474, c15909.f46019, c15909.f46025, j, jM52775, c15909.f46018, false, z, zM19839, zM19840);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17474 m19837(AbstractC6974 abstractC6974, Object obj, long j, long j2, C21727 c21727, C23738 c23738) {
        abstractC6974.mo15985(obj, c23738);
        abstractC6974.m15986(c23738.f75532, c21727);
        abstractC6974.mo15978(obj);
        int i = c23738.f75526.f24955;
        if (i != 0) {
            if (i == 1) {
                c23738.m52779(0);
            }
            c23738.f75526.getClass();
            c23738.m52780(0);
        }
        abstractC6974.mo15985(obj, c23738);
        int iM52778 = c23738.m52778(j);
        if (iM52778 == -1) {
            return new C17474(c23738.m52773(j), j2, obj);
        }
        return new C17474(obj, iM52778, c23738.m52777(iM52778), j2);
    }

    /* JADX INFO: renamed from: ۖ */
    private void m19841() {
        int i = AbstractC16192.f47662;
        final C4123 c4123 = new C4123();
        for (C18592 c18592M42313 = this.f22903; c18592M42313 != null; c18592M42313 = c18592M42313.m42313()) {
            c4123.m18184(c18592M42313.f55518.f46022);
        }
        C18592 c18592 = this.f22910;
        final C17474 c17474 = c18592 == null ? null : c18592.f55518.f46022;
        this.f22904.mo19707(new Runnable() { // from class: l.᩻ۗ֫
            @Override // java.lang.Runnable
            public final void run() {
                this.f77967.f22897.mo47175(c4123.m8329(), c17474);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17474 m19848(AbstractC6974 abstractC6974, Object obj, long j) {
        long jM19832;
        int iMo15978;
        Object obj2 = obj;
        C23738 c23738 = this.f22912;
        int i = abstractC6974.mo15985(obj2, c23738).f75532;
        Object obj3 = this.f22913;
        if (obj3 != null && (iMo15978 = abstractC6974.mo15978(obj3)) != -1 && abstractC6974.mo15984(iMo15978, c23738, false).f75532 == i) {
            jM19832 = this.f22901;
        } else {
            C18592 c18592M42313 = this.f22903;
            while (true) {
                if (c18592M42313 != null) {
                    if (c18592M42313.f55522.equals(obj2)) {
                        jM19832 = c18592M42313.f55518.f46022.f52251;
                        break;
                    }
                    c18592M42313 = c18592M42313.m42313();
                } else {
                    C18592 c18592M42314 = this.f22903;
                    while (true) {
                        if (c18592M42314 != null) {
                            int iMo15979 = abstractC6974.mo15978(c18592M42314.f55522);
                            if (iMo15979 != -1 && abstractC6974.mo15984(iMo15979, c23738, false).f75532 == i) {
                                jM19832 = c18592M42314.f55518.f46022.f52251;
                                break;
                            }
                            c18592M42314 = c18592M42314.m42313();
                        } else {
                            jM19832 = m19832(obj2);
                            if (jM19832 != -1) {
                                break;
                            }
                            jM19832 = this.f22905;
                            this.f22905 = 1 + jM19832;
                            if (this.f22903 != null) {
                                break;
                            }
                            this.f22913 = obj2;
                            this.f22901 = jM19832;
                            break;
                        }
                    }
                }
            }
        }
        long j2 = jM19832;
        abstractC6974.mo15985(obj2, c23738);
        int i2 = c23738.f75532;
        C21727 c21727 = this.f22900;
        abstractC6974.m15986(i2, c21727);
        boolean z = false;
        for (int iMo159710 = abstractC6974.mo15978(obj); iMo159710 >= c21727.f68436; iMo159710--) {
            abstractC6974.mo15984(iMo159710, c23738, true);
            boolean z2 = c23738.f75526.f24955 > 0;
            z |= z2;
            if (c23738.m52778(c23738.f75527) != -1) {
                obj2 = c23738.f75528;
                obj2.getClass();
            }
            if (z && (!z2 || c23738.f75527 != 0)) {
                break;
            }
        }
        return m19837(abstractC6974, obj2, j, j2, this.f22900, this.f22912);
    }

    /* JADX INFO: renamed from: ֫ */
    private long m19832(Object obj) {
        for (int i = 0; i < this.f22906.size(); i++) {
            C18592 c18592 = (C18592) this.f22906.get(i);
            if (c18592.f55522.equals(obj)) {
                return c18592.f55518.f46022.f52251;
            }
        }
        return -1L;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m19831(AbstractC6974 abstractC6974) {
        C18592 c18592M42313 = this.f22903;
        if (c18592M42313 == null) {
            return 0;
        }
        int iMo15978 = abstractC6974.mo15978(c18592M42313.f55522);
        while (true) {
            iMo15978 = abstractC6974.m15977(iMo15978, this.f22912, this.f22900, this.f22911, this.f22896);
            while (true) {
                c18592M42313.getClass();
                if (c18592M42313.m42313() == null || c18592M42313.f55518.f46021) {
                    break;
                }
                c18592M42313 = c18592M42313.m42313();
            }
            C18592 c18592M42314 = c18592M42313.m42313();
            if (iMo15978 == -1 || c18592M42314 == null || abstractC6974.mo15978(c18592M42314.f55522) != iMo15978) {
                break;
            }
            c18592M42313 = c18592M42314;
        }
        int iM19845 = m19845(c18592M42313);
        c18592M42313.f55518 = m19847(abstractC6974, c18592M42313.f55518);
        return iM19845;
    }

    /* JADX INFO: renamed from: ֫ */
    private C15909 m19836(AbstractC6974 abstractC6974, C18592 c18592, long j) {
        long j2;
        long j3;
        long jM19832;
        C15909 c15909 = c18592.f55518;
        long jM42316 = (c18592.m42316() + c15909.f46017) - j;
        if (c15909.f46021) {
            C15909 c159010 = c18592.f55518;
            C17474 c17474 = c159010.f46022;
            long j4 = c159010.f46025;
            int iM15977 = abstractC6974.m15977(abstractC6974.mo15978(c17474.f52252), this.f22912, this.f22900, this.f22911, this.f22896);
            if (iM15977 != -1) {
                C23738 c23738 = this.f22912;
                int i = abstractC6974.mo15984(iM15977, c23738, true).f75532;
                Object obj = c23738.f75528;
                obj.getClass();
                long j5 = c17474.f52251;
                if (abstractC6974.mo15983(i, this.f22900, 0L).f68436 == iM15977) {
                    Pair pairM15981 = abstractC6974.m15981(this.f22900, this.f22912, i, -9223372036854775807L, Math.max(0L, jM42316));
                    if (pairM15981 != null) {
                        obj = pairM15981.first;
                        long jLongValue = ((Long) pairM15981.second).longValue();
                        C18592 c18592M42313 = c18592.m42313();
                        if (c18592M42313 != null && c18592M42313.f55522.equals(obj)) {
                            jM19832 = c18592M42313.f55518.f46022.f52251;
                        } else {
                            jM19832 = m19832(obj);
                            if (jM19832 == -1) {
                                jM19832 = this.f22905;
                                this.f22905 = 1 + jM19832;
                            }
                        }
                        j3 = jLongValue;
                        j2 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                    j3 = 0;
                    jM19832 = j5;
                }
                C17474 c17474M19837 = m19837(abstractC6974, obj, j3, jM19832, this.f22900, this.f22912);
                if (j2 != -9223372036854775807L && j4 != -9223372036854775807L) {
                    int i2 = abstractC6974.mo15985(c17474.f52252, c23738).f75526.f24955;
                    c23738.f75526.getClass();
                    if (i2 > 0) {
                        c23738.m52780(0);
                    }
                }
                return m19835(abstractC6974, c17474M19837, j2, j3);
            }
            return null;
        }
        C15909 c159011 = c18592.f55518;
        C17474 c17475 = c159011.f46022;
        Object obj2 = c17475.f52252;
        int i3 = c17475.f52250;
        C23738 c23739 = this.f22912;
        abstractC6974.mo15985(obj2, c23739);
        boolean z = c159011.f46023;
        if (c17475.m39842()) {
            int i4 = c17475.f52248;
            int i5 = c23739.f75526.m21246(i4).f43549;
            if (i5 == -1) {
                return null;
            }
            int iM34717 = c23739.f75526.m21246(i4).m34717(c17475.f52249);
            if (iM34717 < i5) {
                return m19833(abstractC6974, c17475.f52252, i4, iM34717, c159011.f46025, c17475.f52251, z);
            }
            long jLongValue2 = c159011.f46025;
            if (jLongValue2 == -9223372036854775807L) {
                Pair pairM15982 = abstractC6974.m15981(this.f22900, c23739, c23739.f75532, -9223372036854775807L, Math.max(0L, jM42316));
                if (pairM15982 == null) {
                    return null;
                }
                jLongValue2 = ((Long) pairM15982.second).longValue();
            }
            int i6 = c17475.f52248;
            abstractC6974.mo15985(obj2, c23739);
            c23739.m52774(i6);
            c23739.f75526.m21246(i6).getClass();
            return m19834(abstractC6974, c17475.f52252, Math.max(0L, jLongValue2), c159011.f46025, c17475.f52251, z);
        }
        if (i3 != -1) {
            c23739.m52779(i3);
        }
        int iM52777 = c23739.m52777(i3);
        c23739.m52780(i3);
        if (iM52777 != c23739.f75526.m21246(i3).f43549) {
            return m19833(abstractC6974, c17475.f52252, c17475.f52250, iM52777, c159011.f46017, c17475.f52251, z);
        }
        abstractC6974.mo15985(obj2, c23739);
        c23739.m52774(i3);
        c23739.f75526.m21246(i3).getClass();
        return m19834(abstractC6974, c17475.f52252, 0L, c159011.f46017, c17475.f52251, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private C15909 m19835(AbstractC6974 abstractC6974, C17474 c17474, long j, long j2) {
        abstractC6974.mo15985(c17474.f52252, this.f22912);
        if (c17474.m39842()) {
            return m19833(abstractC6974, c17474.f52252, c17474.f52248, c17474.f52249, j, c17474.f52251, false);
        }
        return m19834(abstractC6974, c17474.f52252, j2, j, c17474.f52251, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private C15909 m19833(AbstractC6974 abstractC6974, Object obj, int i, int i2, long j, long j2, boolean z) {
        C17474 c17474 = new C17474(obj, i, i2, j2);
        C23738 c23738 = this.f22912;
        long jM52775 = abstractC6974.mo15985(obj, c23738).m52775(i, i2);
        if (i2 == c23738.m52777(i)) {
            c23738.f75526.getClass();
        }
        c23738.m52780(i);
        long jMax = 0;
        if (jM52775 != -9223372036854775807L && 0 >= jM52775) {
            jMax = Math.max(0L, jM52775 - 1);
        }
        return new C15909(c17474, jMax, j, -9223372036854775807L, jM52775, z, false, false, false, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private C15909 m19834(AbstractC6974 abstractC6974, Object obj, long j, long j2, long j3, boolean z) {
        long j4;
        C23738 c23738 = this.f22912;
        abstractC6974.mo15985(obj, c23738);
        int iM52773 = c23738.m52773(j);
        boolean z2 = false;
        if (iM52773 == -1) {
            if (c23738.f75526.f24955 > 0) {
                c23738.m52780(0);
            }
        } else {
            c23738.m52780(iM52773);
        }
        C17474 c17474 = new C17474(iM52773, j3, obj);
        if (!c17474.m39842() && iM52773 == -1) {
            z2 = true;
        }
        boolean zM19839 = m19839(abstractC6974, c17474);
        boolean zM19840 = m19840(abstractC6974, c17474, z2);
        if (iM52773 != -1) {
            c23738.m52780(iM52773);
        }
        if (iM52773 != -1) {
            c23738.m52779(iM52773);
        }
        if (iM52773 != -1) {
            c23738.m52774(iM52773);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? c23738.f75527 : j4;
        return new C15909(c17474, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - ((long) 1)), j2, j4, j5, z, false, z2, zM19839, zM19840);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m19839(AbstractC6974 abstractC6974, C17474 c17474) {
        boolean z = !c17474.m39842() && c17474.f52250 == -1;
        Object obj = c17474.f52252;
        if (z) {
            if (abstractC6974.mo15983(abstractC6974.mo15985(obj, this.f22912).f75532, this.f22900, 0L).f68428 == abstractC6974.mo15978(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m19840(AbstractC6974 abstractC6974, C17474 c17474, boolean z) {
        int iMo15978 = abstractC6974.mo15978(c17474.f52252);
        if (!abstractC6974.mo15983(abstractC6974.mo15984(iMo15978, this.f22912, false).f75532, this.f22900, 0L).f68435) {
            if (abstractC6974.m15977(iMo15978, this.f22912, this.f22900, this.f22911, this.f22896) == -1 && z) {
                return true;
            }
        }
        return false;
    }
}
