package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46TC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11503 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f32100;

    /* JADX INFO: renamed from: ۧ */
    public final long f32101;

    /* JADX INFO: renamed from: ܽ */
    public final C17302 f32102;

    /* JADX INFO: renamed from: ᩳ */
    public final C17302 f32103;

    public C11503() {
        this(new C17302(), new C17302(), 1L, false);
    }

    public C11503(C17302 c17302, C17302 c17303, long j, boolean z) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid next history identity");
        }
        this.f32103 = c17302;
        this.f32102 = c17303;
        this.f32101 = j;
        this.f32100 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m26556() {
        return !this.f32103.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C10832 m26557() {
        if (m26556()) {
            return (C10832) this.f32103.last();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11503 m26555(C24441 c24441, long j) {
        if (!this.f32100 && m26556()) {
            C17302 c17302 = this.f32103;
            C10832 c10832 = (C10832) c17302.last();
            EnumC15723 enumC15723 = EnumC15723.USER;
            C17302 c17303 = c10832.f30004;
            if (c10832.f30007 == enumC15723) {
                long j2 = c10832.f30006;
                long j3 = j >= j2 ? j - j2 : j2 - j;
                if (j3 >= 0 && j3 < 250 && (c17303.m39213() <= 1 || !((C24441) c17303.last()).m53928())) {
                    C10832 c10833 = (C10832) c17302.last();
                    C17302 c17304 = c10833.f30004;
                    C24441 c24442 = (C24441) c17304.last();
                    long j4 = c24442.f77380;
                    C13773 c13773 = c24442.f77379;
                    long jM31402 = j4 + ((long) c13773.m31402());
                    boolean zM53928 = c24441.m53928();
                    C7205 c7205 = c24441.f77386;
                    C24441 c24443 = (!zM53928 && c24442.f77381 == c24441.f77383 && ((long) c24441.f77380) == jM31402 && ((long) c7205.m16550()) == jM31402 && ((long) c7205.m16548()) == jM31402 && c24441.f77382.m31402() == 0) ? new C24441(c24442.f77380, c24442.f77383, c24441.f77381, c24442.f77386, c24442.f77382, c13773.m31401(c24441.f77379)) : null;
                    return new C11503(c17302.m39214(new C10832(c10833.f30005, j, c10833.f30007, c24443 == null ? c17304.m39211(c24441) : c17304.m39214(c24443))), new C17302(), this.f32101, false);
                }
            }
        }
        return m26552(new C17302().m39211(c24441), j, EnumC15723.USER);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11503 m26554(C17302 c17302, long j) {
        return m26552(c17302, j, EnumC15723.BATCH);
    }

    /* JADX INFO: renamed from: ֫ */
    private C11503 m26552(C17302 c17302, long j, EnumC15723 enumC15723) {
        if (c17302.isEmpty()) {
            return this;
        }
        long j2 = this.f32101;
        if (j2 == C14849.FOREVER_NS) {
            throw new IllegalStateException("History identity exhausted");
        }
        return new C11503(this.f32103.m39211(new C10832(j2, j, enumC15723, c17302)), new C17302(), this.f32101 + 1, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11503 m26553(C15961 c15961, long j, boolean z) {
        C10832 c10832;
        long jM26551 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("Invalid history budget");
        }
        C17302 c17302 = this.f32103;
        C17302 c17303 = this.f32102;
        c15961.m36262(c17302, c17303);
        boolean z2 = z && j > 0;
        if (z2 && c15961.m36261() > j) {
            jM26551 = m26551(c17302) + m26551(c17303);
        }
        C17302 c17302RemoveFirst = c17302;
        C17302 c17302RemoveFirst2 = c17303;
        while (c15961.m36261() > j && (!z2 || (jM26551 != 1 && ((long) c17302RemoveFirst.m39213()) + ((long) c17302RemoveFirst2.m39213()) != 1))) {
            if (!c17302RemoveFirst.isEmpty()) {
                c10832 = (C10832) c17302RemoveFirst.get(0);
                c17302RemoveFirst = c17302RemoveFirst.removeFirst();
            } else if (!c17302RemoveFirst2.isEmpty()) {
                c10832 = (C10832) c17302RemoveFirst2.get(0);
                c17302RemoveFirst2 = c17302RemoveFirst2.removeFirst();
            } else {
                throw new IllegalStateException("Nonempty budget without history roots");
            }
            if (z2) {
                Iterator it = c10832.f30004.iterator();
                while (true) {
                    C21998 c21998 = (C21998) it;
                    if (!c21998.hasNext()) {
                        break;
                    }
                    if (!((C24441) c21998.next()).m53928()) {
                        jM26551--;
                        break;
                    }
                }
            }
            c15961.m36262(c17302RemoveFirst, c17302RemoveFirst2);
        }
        return (c17302RemoveFirst == c17302 && c17302RemoveFirst2 == c17303) ? this : new C11503(c17302RemoveFirst, c17302RemoveFirst2, this.f32101, this.f32100);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m26551(C17302 c17302) {
        Iterator it = c17302.iterator();
        long j = 0;
        while (true) {
            C21998 c21998 = (C21998) it;
            if (!c21998.hasNext()) {
                return j;
            }
            Iterator it2 = ((C10832) c21998.next()).f30004.iterator();
            while (true) {
                C21998 c21999 = (C21998) it2;
                if (!c21999.hasNext()) {
                    break;
                }
                if (!((C24441) c21999.next()).m53928()) {
                    j++;
                    break;
                }
            }
        }
    }
}
