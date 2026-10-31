package l;

import java.util.Calendar;

/* JADX INFO: renamed from: l.۫ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: WADD */
/* JADX INFO: loaded from: classes4.dex */
public final class C12314 extends AbstractC17191 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C16477 f36863;

    /* JADX WARN: Illegal instructions before constructor call */
    public C12314(C10384 c10384, String str) {
        int i;
        String strM26193 = c10384.m26193();
        String strM26190 = c10384.m26190();
        long jM26195 = c10384.m26195();
        Calendar calendarM26192 = c10384.m26192();
        super(strM26193, str, strM26190, jM26195, calendarM26192 == null ? 0L : calendarM26192.getTimeInMillis(), c10384.m26189());
        int iM26200 = c10384.m26200();
        if (iM26200 == 0) {
            i = 32768;
        } else if (iM26200 != 1) {
            i = iM26200 != 2 ? 0 : 40960;
        } else {
            i = 16384;
        }
        i = c10384.m26186(0, 0) ? i | 256 : i;
        i = c10384.m26186(0, 1) ? i | 128 : i;
        i = c10384.m26186(0, 2) ? i | 64 : i;
        i = c10384.m26186(1, 0) ? i | 32 : i;
        i = c10384.m26186(1, 1) ? i | 16 : i;
        i = c10384.m26186(1, 2) ? i | 8 : i;
        i = c10384.m26186(2, 0) ? i | 4 : i;
        i = c10384.m26186(2, 1) ? i | 2 : i;
        this.f36863 = new C16477(c10384.m26186(2, 2) ? i | 1 : i, c10384.m26187(), c10384.m26180());
    }

    @Override // l.C15688, l.InterfaceC17889
    /* JADX INFO: renamed from: ֨ۧ */
    public final C16477 mo24428() {
        return this.f36863;
    }

    @Override // l.AbstractC17191
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo29864(C16477 c16477) {
        this.f36863 = c16477;
    }
}
