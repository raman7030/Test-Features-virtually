package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܺۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8VP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15878 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f49060;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15878(ActivityC1748 activityC1748, C12392 c12392) {
        super(activityC1748, -1);
        this.f49060 = c12392;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        C12392 c12392 = this.f49060;
        try {
            if (!c12392.m30457(Integer.parseInt(m31260()) - 1)) {
                m31263(R.string.MT_Protector);
                return;
            }
        } catch (Exception unused) {
        }
        if (!c12392.isFocused()) {
            c12392.requestFocus();
        }
        m31262();
    }
}
