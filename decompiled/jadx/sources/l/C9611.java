package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46TC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9611 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f29153;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f29154;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15713 f29155;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15713 f29156;

    public C9611() {
        this(new C15713(), new C15713(), 1L, false);
    }

    public C9611(C15713 c15713, C15713 c15714, long j, boolean z) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid next history identity");
        }
        this.f29156 = c15713;
        this.f29155 = c15714;
        this.f29154 = j;
        this.f29153 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24543() {
        return !this.f29156.isEmpty();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8905 m24544() {
        if (m24543()) {
            return (C8905) this.f29156.last();
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9611 m24542(C23224 c23224, long j) {
        if (!this.f29153 && m24543()) {
            C15713 c15713 = this.f29156;
            C8905 c8905 = (C8905) c15713.last();
            EnumC14051 enumC14051 = EnumC14051.USER;
            C15713 c15714 = c8905.f27081;
            if (c8905.f27084 == enumC14051) {
                long j2 = c8905.f27083;
                long j3 = j >= j2 ? j - j2 : j2 - j;
                if (j3 >= 0 && j3 < 250 && (c15714.m37046() <= 1 || !((C23224) c15714.last()).m51531())) {
                    C8905 c8906 = (C8905) c15713.last();
                    C15713 c15715 = c8906.f27081;
                    C23224 c23225 = (C23224) c15715.last();
                    long j4 = c23225.f74637;
                    C11999 c11999 = c23225.f74636;
                    long jM29347 = j4 + ((long) c11999.m29347());
                    boolean zM51531 = c23224.m51531();
                    C5089 c5089 = c23224.f74643;
                    C23224 c23226 = (!zM51531 && c23225.f74638 == c23224.f74640 && ((long) c23224.f74637) == jM29347 && ((long) c5089.m14642()) == jM29347 && ((long) c5089.m14640()) == jM29347 && c23224.f74639.m29347() == 0) ? new C23224(c23225.f74637, c23225.f74640, c23224.f74638, c23225.f74643, c23225.f74639, c11999.m29346(c23224.f74636)) : null;
                    return new C9611(c15713.m37047(new C8905(c8906.f27082, j, c8906.f27084, c23226 == null ? c15715.m37044(c23224) : c15715.m37047(c23226))), new C15713(), this.f29154, false);
                }
            }
        }
        return m24539(new C15713().m37044(c23224), j, EnumC14051.USER);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9611 m24541(C15713 c15713, long j) {
        return m24539(c15713, j, EnumC14051.BATCH);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9611 m24539(C15713 c15713, long j, EnumC14051 enumC14051) {
        if (c15713.isEmpty()) {
            return this;
        }
        long j2 = this.f29154;
        if (j2 == C13132.FOREVER_NS) {
            throw new IllegalStateException("History identity exhausted");
        }
        return new C9611(this.f29156.m37044(new C8905(j2, j, enumC14051, c15713)), new C15713(), this.f29154 + 1, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9611 m24540(C14302 c14302, long j, boolean z) {
        C8905 c8905;
        long jM24538 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("Invalid history budget");
        }
        C15713 c15713 = this.f29156;
        C15713 c15714 = this.f29155;
        c14302.m34129(c15713, c15714);
        boolean z2 = z && j > 0;
        if (z2 && c14302.m34128() > j) {
            jM24538 = m24538(c15713) + m24538(c15714);
        }
        C15713 c15713RemoveFirst = c15713;
        C15713 c15713RemoveFirst2 = c15714;
        while (c14302.m34128() > j && (!z2 || (jM24538 != 1 && ((long) c15713RemoveFirst.m37046()) + ((long) c15713RemoveFirst2.m37046()) != 1))) {
            if (!c15713RemoveFirst.isEmpty()) {
                c8905 = (C8905) c15713RemoveFirst.get(0);
                c15713RemoveFirst = c15713RemoveFirst.removeFirst();
            } else if (!c15713RemoveFirst2.isEmpty()) {
                c8905 = (C8905) c15713RemoveFirst2.get(0);
                c15713RemoveFirst2 = c15713RemoveFirst2.removeFirst();
            } else {
                throw new IllegalStateException("Nonempty budget without history roots");
            }
            if (z2) {
                Iterator it = c8905.f27081.iterator();
                while (true) {
                    C20654 c20654 = (C20654) it;
                    if (!c20654.hasNext()) {
                        break;
                    }
                    if (!((C23224) c20654.next()).m51531()) {
                        jM24538--;
                        break;
                    }
                }
            }
            c14302.m34129(c15713RemoveFirst, c15713RemoveFirst2);
        }
        return (c15713RemoveFirst == c15713 && c15713RemoveFirst2 == c15714) ? this : new C9611(c15713RemoveFirst, c15713RemoveFirst2, this.f29154, this.f29153);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m24538(C15713 c15713) {
        Iterator it = c15713.iterator();
        long j = 0;
        while (true) {
            C20654 c20654 = (C20654) it;
            if (!c20654.hasNext()) {
                return j;
            }
            Iterator it2 = ((C8905) c20654.next()).f27081.iterator();
            while (true) {
                C20654 c20655 = (C20654) it2;
                if (!c20655.hasNext()) {
                    break;
                }
                if (!((C23224) c20655.next()).m51531()) {
                    j++;
                    break;
                }
            }
        }
    }
}
