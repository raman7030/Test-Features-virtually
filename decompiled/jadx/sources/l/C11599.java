package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C11599 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC13714 f34581;

    public C11599(ViewOnClickListenerC13714 viewOnClickListenerC13714) {
        this.f34581 = viewOnClickListenerC13714;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f34581.f40922, R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() throws C1637 {
        C16742 c16742 = this.f34581.f40919;
        C1926.m6339();
        C18237 c18237M42480 = C18237.m42480(4168);
        c18237M42480.m42490(c16742.f51388);
        C23881 c23881M42496 = c18237M42480.m42496();
        if (!c23881M42496.m52607()) {
            throw new C1637(C1575.m5392(c23881M42496, R.string.MT_Protector));
        }
        c16742.f51392 = 0;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        ViewOnClickListenerC13714 viewOnClickListenerC13714 = this.f34581;
        ActivityC7365 activityC7365 = viewOnClickListenerC13714.f40922;
        new RunnableC19361(activityC7365);
        ActivityC7365.m19799(activityC7365, viewOnClickListenerC13714.f40919, viewOnClickListenerC13714.f40920);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f34581.f40922.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
