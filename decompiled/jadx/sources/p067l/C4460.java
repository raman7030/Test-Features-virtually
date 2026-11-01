package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z17V */
/* JADX INFO: loaded from: classes2.dex */
public final class C4460 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C5801 f10015;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4460(C5801 c5801, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f10015 = c5801;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        try {
            boolean[] zArrM29226 = C12710.m29226(Integer.parseInt(m33346(), 8));
            int i = 0;
            while (true) {
                C5801 c5801 = this.f10015;
                if (i < 12) {
                    c5801.f14255[i] = zArrM29226[i];
                    c5801.f14256[i].setChecked(zArrM29226[i]);
                    i++;
                } else {
                    c5801.m13054();
                    m33348();
                    return;
                }
            }
        } catch (NumberFormatException unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
