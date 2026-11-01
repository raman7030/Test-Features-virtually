package p067l;

import android.R;

/* JADX INFO: renamed from: l.ܳ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AY4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15845 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ ViewOnClickListenerC20541 f45905;

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ۘ */
    public final void mo9819() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15845(ViewOnClickListenerC20541 viewOnClickListenerC20541) {
        super(viewOnClickListenerC20541, R.string.paste);
        this.f45905 = viewOnClickListenerC20541;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        String strM33346 = m33346();
        C13045.m29861((Object) strM33346);
        if (!strM33346.startsWith("/")) {
            strM33346 = "/".concat(strM33346);
        }
        C13045.m29861((Object) strM33346);
        this.f45905.m46377(strM33346, (InterfaceC4387) null);
        m33348();
    }
}
