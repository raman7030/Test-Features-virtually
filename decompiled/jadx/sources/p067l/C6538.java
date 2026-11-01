package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۙۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AJZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6538 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C5197 f16886;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6538(C5197 c5197, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f16886 = c5197;
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
            int i = Integer.parseInt(strTrim);
            if (i < 0) {
                throw new NumberFormatException();
            }
            C5197 c5197 = this.f16886;
            c5197.m13265().edit().putInt(c5197.m9037(), i).apply();
            m33348();
        } catch (NumberFormatException unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
