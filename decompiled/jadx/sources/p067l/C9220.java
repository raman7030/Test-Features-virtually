package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۟ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X6MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9220 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C4129 f24949;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9220(C4129 c4129, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f24949 = c4129;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strTrim = m33346().trim();
        if (strTrim.isEmpty()) {
            m33348();
            return;
        }
        try {
            long j = Long.parseLong(strTrim);
            if (j < 100000 || j > 1000000000) {
                m33349(R.string.MT_Protector);
                return;
            }
            C4129 c4129 = this.f24949;
            c4129.m13265().edit().putInt(c4129.m9037(), (int) j).apply();
            m33348();
        } catch (NumberFormatException unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
