package p067l;

import bin.p000mt.plus.R;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩳۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LU */
/* JADX INFO: loaded from: classes5.dex */
public final class C19278 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C24642 f57608;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19278(C24642 c24642, AbstractActivityC5549 abstractActivityC5549) {
        super(abstractActivityC5549, -1);
        this.f57608 = c24642;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        C24642 c24642 = this.f57608;
        try {
            int iM54296 = C24642.m54296(m33346());
            c24642.m9019((Serializable) Integer.valueOf(iM54296));
            c24642.m13265().edit().putInt(c24642.m9037(), iM54296).apply();
            c24642.m54295(iM54296);
            m33348();
        } catch (ArithmeticException | IllegalArgumentException unused) {
            m33349(R.string.MT_Protector);
        }
    }
}
