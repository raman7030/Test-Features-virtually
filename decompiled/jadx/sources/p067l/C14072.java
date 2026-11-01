package p067l;

import java.util.Calendar;

/* JADX INFO: renamed from: l.۫ۡ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: WADD */
/* JADX INFO: loaded from: classes4.dex */
public final class C14072 extends AbstractC18707 {

    /* JADX INFO: renamed from: ۧ֫ */
    public C18028 f39877;

    /* JADX WARN: Illegal instructions before constructor call */
    public C14072(C12237 c12237, String str) {
        int i;
        String strM28222 = c12237.m28222();
        String strM28219 = c12237.m28219();
        long jM28224 = c12237.m28224();
        Calendar calendarM28221 = c12237.m28221();
        super(strM28222, str, strM28219, jM28224, calendarM28221 == null ? 0L : calendarM28221.getTimeInMillis(), c12237.m28218());
        int iM28229 = c12237.m28229();
        if (iM28229 == 0) {
            i = 32768;
        } else if (iM28229 != 1) {
            i = iM28229 != 2 ? 0 : 40960;
        } else {
            i = 16384;
        }
        i = c12237.m28215(0, 0) ? i | 256 : i;
        i = c12237.m28215(0, 1) ? i | 128 : i;
        i = c12237.m28215(0, 2) ? i | 64 : i;
        i = c12237.m28215(1, 0) ? i | 32 : i;
        i = c12237.m28215(1, 1) ? i | 16 : i;
        i = c12237.m28215(1, 2) ? i | 8 : i;
        i = c12237.m28215(2, 0) ? i | 4 : i;
        i = c12237.m28215(2, 1) ? i | 2 : i;
        this.f39877 = new C18028(c12237.m28215(2, 2) ? i | 1 : i, c12237.m28216(), c12237.m28209());
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ֨ۧ */
    public final C18028 mo26440() {
        return this.f39877;
    }

    @Override // p067l.AbstractC18707
    /* JADX INFO: renamed from: ֫ */
    public final void mo31924(C18028 c18028) {
        this.f39877 = c18028;
    }
}
