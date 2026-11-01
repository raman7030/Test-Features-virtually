package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܺۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17459 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ۟ */
    public final /* synthetic */ C14146 f52198;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17459(ActivityC4030 activityC4030, C14146 c14146) {
        super(activityC4030, -1);
        this.f52198 = c14146;
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        C14146 c14146 = this.f52198;
        try {
            if (!c14146.m32521(Integer.parseInt(m33346()) - 1)) {
                m33349(R.string.MT_Protector);
                return;
            }
        } catch (Exception unused) {
        }
        if (!c14146.isFocused()) {
            c14146.requestFocus();
        }
        m33348();
    }
}
